package org.yagi.motel;

import org.apache.pekko.actor.ActorRef;
import org.apache.pekko.actor.ActorSystem;
import org.apache.pekko.actor.Props;
import org.apache.pekko.actor.testkit.typed.javadsl.TestKitJunitResource;
import org.apache.pekko.testkit.TestKit;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.yagi.motel.config.AppConfig;
import org.yagi.motel.kernel.actor.CommandDispatcherActor;
import org.yagi.motel.kernel.actor.blocked.LogCommandDispatcherActor;
import org.yagi.motel.kernel.model.container.ResultCommandContainer;
import org.yagi.motel.kernel.model.holder.CommandDispatchersHolder;
import scala.concurrent.duration.FiniteDuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class KernelTest {

    @ClassRule
    public static final TestKitJunitResource testKit = new TestKitJunitResource();

    private static ActorSystem actorSystem;

    @BeforeClass
    public static void setup() {
        actorSystem = ActorSystem.create();
    }

    @Test
    public void testGreeterActorSendingOfGreeting() {
        new TestKit(actorSystem) {
            {
                final BlockingQueue<ResultCommandContainer> commandResultsQueue = new ArrayBlockingQueue<>(1);
                final Props logCommandProps =
                        Props.create(LogCommandDispatcherActor.class, new AppConfig(), commandResultsQueue);
                final ActorRef logCommandDispatcher = actorSystem.actorOf(logCommandProps);
                final CommandDispatchersHolder commandDispatchersHolder = CommandDispatchersHolder.builder()
                        .logCommandDispatcherActor(logCommandDispatcher)
                        .build();
                final Props commandDispatcherProps =
                        Props.create(CommandDispatcherActor.class, commandDispatchersHolder);
                final ActorRef commandDispatcher = actorSystem.actorOf(commandDispatcherProps);

                final TestKit probe = new TestKit(actorSystem);

                within(FiniteDuration.apply(3, TimeUnit.SECONDS), () -> null);
            }
        };
    }
}
