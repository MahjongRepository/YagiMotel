package org.yagi.motel.kernel.actor.blocked;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.pekko.actor.AbstractActor;
import org.apache.pekko.actor.Props;
import org.yagi.motel.config.AppConfig;
import org.yagi.motel.handler.MeCommandHandler;
import org.yagi.motel.http.RestClient;
import org.yagi.motel.http.request.ConfirmPlayerRequest;
import org.yagi.motel.http.response.ConfirmPlayerResponse;
import org.yagi.motel.http.response.GetTournamentByConfirmCodeResponse;
import org.yagi.motel.kernel.enums.PlatformType;
import org.yagi.motel.kernel.message.InputCommandMessage;
import org.yagi.motel.kernel.model.container.ResultCommandContainer;
import org.yagi.motel.kernel.model.enums.GamePlatformType;
import org.yagi.motel.utils.GamePlatformUtils;
import org.yagi.motel.utils.UrlHelper;

import java.util.Optional;
import java.util.concurrent.BlockingQueue;

@Slf4j
@SuppressWarnings("checkstyle:MissingJavadocType")
public class MeCommandDispatcherActor extends AbstractActor {

    public static String ACTOR_NAME = "me-command-dispatcher-actor";

    private final BlockingQueue<ResultCommandContainer> commandResultsQueue;
    private final AppConfig config;
    private final ObjectMapper mapper;
    private final String portalConfirmPlayerUrl;

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public MeCommandDispatcherActor(AppConfig config, BlockingQueue<ResultCommandContainer> commandResultsQueue) {
        this.config = config;
        this.commandResultsQueue = commandResultsQueue;
        this.mapper = new ObjectMapper();
        this.portalConfirmPlayerUrl =
                UrlHelper.normalizeUrl(String.format("%s/api/v0/autobot/confirm_player", config.getPortalUrl()));
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Props props(AppConfig config, BlockingQueue<ResultCommandContainer> commandResultsQueue) {
        return Props.create(MeCommandDispatcherActor.class, config, commandResultsQueue);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(InputCommandMessage.class, message -> {
                    if (message.getType() != null) {
                        switch (message.getType()) {
                            case ME:
                                //todo: pass confirm code to portal
                                String codeConfirm = (String) message.getPayload().getContext().get(MeCommandHandler.CONFIRM_CODE_CONTEXT_KEY);
                                //todo: retreive tournament data from portal
                                GetTournamentByConfirmCodeResponse response = new GetTournamentByConfirmCodeResponse();
                                GamePlatformType gamePlatformType = GamePlatformType.fromStringUnsafe(response.getGamePlatformType());
                                //todo: check if tournamentId == tournamentId in config

                                if (response.getTournamentId() != null && gamePlatformType != null) {
                                    ConfirmPlayerRequest request = ConfirmPlayerRequest.builder()
                                            .apiToken(config.getAutobotApiToken())
                                            .tournamentId(response.getTournamentId())
                                            .lobbyId(GamePlatformUtils.getLobbyId(config, gamePlatformType))
                                            .nickname(message.getPayload().getMessageValue())
                                            .telegramUsername(
                                                    message.getPlatformType() == PlatformType.TG
                                                            ? message.getPayload().getUsername()
                                                            : null)
                                            .discordUsername(
                                                    message.getPlatformType() == PlatformType.DISCORD
                                                            ? message.getPayload().getUsername()
                                                            : null)
                                            .lang(message.getRequestedResponseLang())
                                            .build();

                                    Optional<ConfirmPlayerResponse> confirmPlayerResponse = RestClient.sendPost(
                                            mapper,
                                            RestClient.preparePostRequest(portalConfirmPlayerUrl, request, mapper),
                                            ConfirmPlayerResponse.class);

                                    if (confirmPlayerResponse.isPresent()) {
                                        commandResultsQueue.put(ResultCommandContainer.builder()
                                                .uniqueMessageId(message.getMessageUniqueId())
                                                .resultMessage(String.format(
                                                        message.getPlatformType() == PlatformType.TG ? "@%s %s" : "%s %s",
                                                        message.getPayload().getUsername(),
                                                        confirmPlayerResponse.get().getMessage()))
                                                .replyChatId(message.getPayload().getSenderChatId())
                                                .platformType(message.getPlatformType())
                                                .commandType(message.getType())
                                                .build());
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    } else {
                        log.warn("receive untyped message!");
                    }
                })
                .matchAny(o -> log.warn("received unknown message"))
                .build();
    }
}
