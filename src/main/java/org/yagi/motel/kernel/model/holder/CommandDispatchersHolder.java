package org.yagi.motel.kernel.model.holder;

import lombok.Builder;
import lombok.Data;
import org.apache.pekko.actor.ActorRef;

@Data
@Builder
@SuppressWarnings("checkstyle:MissingJavadocType")
public class CommandDispatchersHolder {
    private ActorRef logCommandDispatcherActor;
    private ActorRef startRegistrationCommandDispatcherActor;
    private ActorRef closeRegistrationCommandDispatcherActor;
    private ActorRef meCommandDispatcherActor;
    private ActorRef addCommandDispatcherActor;
    private ActorRef statusCommandDispatcherActor;
    private ActorRef changeStateDispatcherActor;
    private ActorRef updateTeamsCommandDispatcherActor;
    private ActorRef addPenaltyGameCommandDispatcherActor;
}
