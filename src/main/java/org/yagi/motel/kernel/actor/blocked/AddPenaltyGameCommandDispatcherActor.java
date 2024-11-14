package org.yagi.motel.kernel.actor.blocked;

import akka.actor.AbstractActor;
import akka.actor.Props;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import lombok.extern.slf4j.Slf4j;
import org.yagi.motel.config.AppConfig;
import org.yagi.motel.http.RestClient;
import org.yagi.motel.http.request.AddPenaltyGameRequest;
import org.yagi.motel.http.response.AddPenaltyGameResponse;
import org.yagi.motel.kernel.message.InputCommandMessage;
import org.yagi.motel.kernel.model.container.ResultCommandContainer;
import org.yagi.motel.utils.UrlHelper;

@Slf4j
@SuppressWarnings("checkstyle:MissingJavadocType")
public class AddPenaltyGameCommandDispatcherActor extends AbstractActor {

  public static String ACTOR_NAME = "add-penalty-game-command-dispatcher-actor";

  private final BlockingQueue<ResultCommandContainer> commandResultsQueue;
  private final AppConfig config;
  private final ObjectMapper mapper;
  private final String portalAddPenaltyGameUrl;

  @SuppressWarnings("checkstyle:MissingJavadocMethod")
  public AddPenaltyGameCommandDispatcherActor(
      AppConfig config, BlockingQueue<ResultCommandContainer> commandResultsQueue) {
    this.config = config;
    this.commandResultsQueue = commandResultsQueue;
    this.mapper = new ObjectMapper();
    this.portalAddPenaltyGameUrl =
        UrlHelper.normalizeUrl(
            String.format("%s/api/v0/autobot/add_penalty_game", config.getPortalUrl()));
  }

  @SuppressWarnings("checkstyle:MissingJavadocMethod")
  public static Props props(
      AppConfig config, BlockingQueue<ResultCommandContainer> commandResultsQueue) {
    return Props.create(AddPenaltyGameCommandDispatcherActor.class, config, commandResultsQueue);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            InputCommandMessage.class,
            message -> {
              if (message.getType() != null) {
                switch (message.getType()) {
                  case ADD_PENALTY_GAME:
                    AddPenaltyGameRequest request =
                        AddPenaltyGameRequest.builder()
                            .apiToken(config.getAutobotApiToken())
                            .tournamentId(config.getTournamentId())
                            .lobbyId(config.getLobbyId())
                            .lang(message.getRequestedResponseLang())
                            .gameId(Long.valueOf(message.getPayload().getMessageValue()))
                            .build();

                    Optional<AddPenaltyGameResponse> addPenaltyGameResponse =
                        RestClient.sendPost(
                            mapper,
                            RestClient.preparePostRequest(
                                    portalAddPenaltyGameUrl, request, mapper),
                            AddPenaltyGameResponse.class);

                    if (addPenaltyGameResponse.isPresent()) {
                      commandResultsQueue.put(
                          ResultCommandContainer.builder()
                              .uniqueMessageId(message.getMessageUniqueId())
                              .resultMessage(addPenaltyGameResponse.get().getMessage())
                              .replyChatId(message.getPayload().getSenderChatId())
                              .platformType(message.getPlatformType())
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
