package org.yagi.motel.kernel.actor.blocked;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.pekko.actor.AbstractActor;
import org.apache.pekko.actor.Props;
import org.yagi.motel.config.AppConfig;
import org.yagi.motel.http.RestClient;
import org.yagi.motel.http.request.OpenRegistrationRequest;
import org.yagi.motel.http.response.BaseResponse;
import org.yagi.motel.kernel.message.InputCommandMessage;
import org.yagi.motel.kernel.model.container.ResultCommandContainer;
import org.yagi.motel.utils.UrlHelper;

import java.util.Optional;
import java.util.concurrent.BlockingQueue;

@Slf4j
@SuppressWarnings("checkstyle:MissingJavadocType")
public class StartRegistrationCommandDispatcherActor extends AbstractActor {

    public static String ACTOR_NAME = "start-registration-command-dispatcher-actor";

    private final BlockingQueue<ResultCommandContainer> commandResultsQueue;
    private final AppConfig config;
    private final ObjectMapper mapper;
    private final String portalOpenRegistrationUrl;

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public StartRegistrationCommandDispatcherActor(
            BlockingQueue<ResultCommandContainer> commandResultsQueue, AppConfig config) {
        this.commandResultsQueue = commandResultsQueue;
        this.config = config;
        this.mapper = new ObjectMapper();
        this.portalOpenRegistrationUrl =
                UrlHelper.normalizeUrl(String.format("%s/api/v0/autobot/open_registration", config.getPortalUrl()));
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Props props(BlockingQueue<ResultCommandContainer> commandResultsQueue, AppConfig config) {
        return Props.create(StartRegistrationCommandDispatcherActor.class, commandResultsQueue, config);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(InputCommandMessage.class, message -> {
                    if (message.getType() != null) {
                        switch (message.getType()) {
                            case START_REGISTRATION:
                                OpenRegistrationRequest request = OpenRegistrationRequest.builder()
                                        .apiToken(config.getAutobotApiToken())
                                        .tournamentId(config.getTournamentId())
                                        .lobbyId(config.getLobbyId())
                                        .build();

                                Optional<BaseResponse> baseResponse = RestClient.sendPost(
                                        mapper,
                                        RestClient.preparePostRequest(portalOpenRegistrationUrl, request, mapper),
                                        BaseResponse.class);

                                if (baseResponse.isPresent()
                                        && Boolean.TRUE.equals(
                                                baseResponse.get().getSuccess())) {
                                    commandResultsQueue.put(ResultCommandContainer.builder()
                                            .uniqueMessageId(message.getMessageUniqueId())
                                            .resultMessage(message.getPayload().getMessageValue())
                                            .replyChatId(message.getPayload().getSenderChatId())
                                            .platformType(message.getPlatformType())
                                            .commandType(message.getType())
                                            .build());
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
