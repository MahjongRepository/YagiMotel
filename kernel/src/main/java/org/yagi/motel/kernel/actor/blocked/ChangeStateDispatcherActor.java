package org.yagi.motel.kernel.actor.blocked;

import lombok.extern.slf4j.Slf4j;
import org.apache.pekko.actor.AbstractActor;
import org.apache.pekko.actor.Props;
import org.yagi.motel.kernel.message.InputCommandMessage;
import org.yagi.motel.kernel.model.container.ResultCommandContainer;
import org.yagi.motel.kernel.model.enums.IsProcessedState;
import org.yagi.motel.kernel.repository.StateRepository;

import java.util.concurrent.BlockingQueue;

@Slf4j
@SuppressWarnings("checkstyle:MissingJavadocType")
public class ChangeStateDispatcherActor extends AbstractActor {

    public static String ACTOR_NAME = "change-state-dispatcher-actor";

    private final BlockingQueue<ResultCommandContainer> commandResultsQueue;
    private final StateRepository stateRepository;

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public ChangeStateDispatcherActor(
            StateRepository stateRepository, BlockingQueue<ResultCommandContainer> commandResultsQueue) {
        this.commandResultsQueue = commandResultsQueue;
        this.stateRepository = stateRepository;
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Props props(
            StateRepository stateRepository, BlockingQueue<ResultCommandContainer> commandResultsQueue) {
        return Props.create(ChangeStateDispatcherActor.class, stateRepository, commandResultsQueue);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(InputCommandMessage.class, message -> {
                    if (message.getType() != null) {
                        switch (message.getType()) {
                            case START_SERVE:
                                stateRepository.updateProcessingState(IsProcessedState.ENABLE);
                                commandResultsQueue.put(ResultCommandContainer.builder()
                                        .uniqueMessageId(message.getMessageUniqueId())
                                        .resultMessage(message.getPayload().getMessageValue())
                                        .replyChatId(message.getPayload().getSenderChatId())
                                        .platformType(message.getPlatformType())
                                        .commandType(message.getType())
                                        .build());
                                break;
                            case STOP_SERVE:
                                stateRepository.updateProcessingState(IsProcessedState.DISABLE);
                                commandResultsQueue.put(ResultCommandContainer.builder()
                                        .uniqueMessageId(message.getMessageUniqueId())
                                        .resultMessage(message.getPayload().getMessageValue())
                                        .replyChatId(message.getPayload().getSenderChatId())
                                        .platformType(message.getPlatformType())
                                        .commandType(message.getType())
                                        .build());
                                break;
                            default:
                                break;
                        }
                    }
                })
                .matchAny(o -> log.warn("received unknown message"))
                .build();
    }
}
