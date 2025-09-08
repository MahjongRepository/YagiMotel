package org.yagi.motel.handler;

import org.apache.pekko.actor.ActorRef;
import org.yagi.motel.config.AppConfig;
import org.yagi.motel.handler.context.CommandContext;
import org.yagi.motel.handler.enums.ErrorType;
import org.yagi.motel.handler.holder.PlatformCallbacksHolder;
import org.yagi.motel.kernel.enums.CommandType;
import org.yagi.motel.kernel.message.InputCommandMessage;
import org.yagi.motel.kernel.model.container.InputCommandContainer;

import java.util.Set;

@SuppressWarnings("checkstyle:MissingJavadocType")
public class LogCommandHandler extends BaseHandler implements CommandHandler {

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public LogCommandHandler(
            AppConfig config,
            ActorRef commandDispatcherActor,
            ActorRef errorCommandDispatcherActor,
            PlatformCallbacksHolder platformCallbacksHolder,
            Set<Long> allowedChatIds) {
        super(config, commandDispatcherActor, errorCommandDispatcherActor, platformCallbacksHolder, allowedChatIds);
    }

    @Override
    public void handleCommand(final CommandContext context) {
        if (!checkPermission(context)) {
            sendErrorReply(context, ErrorType.COMMAND_NOT_ALLOWED);
            return;
        }

        String[] commandArgs = context.getCommandArgs();
        if (commandArgs.length >= 2) {
            PlatformCallbacksHolder callbacksHolder = getPlatformCallbacksHolder();
            // todo ugly hack
            boolean isTenhouLog = commandArgs[1].contains("tenhou.net");
            if (isTenhouLog
                    || context.getSenderChatId()
                            .equals(callbacksHolder
                                    .getPlatformAdminChatIdSupplier()
                                    .get())) {
                String commandValue = commandArgs[1];
                getCommandDispatcherActor()
                        .tell(
                                InputCommandMessage.builder()
                                        .messageUniqueId(context.getCommandUniqueId())
                                        .type(getType())
                                        .payload(InputCommandContainer.builder()
                                                .messageValue(commandValue)
                                                .senderChatId(context.getSenderChatId())
                                                .build())
                                        .platformType(context.getPlatformType())
                                        .requestedResponseLang(context.getRequestedResponseLang())
                                        .build(),
                                ActorRef.noSender());
            }
        }
    }

    @Override
    public boolean checkPermission(CommandContext context) {
        return super.checkPermission(context);
    }

    @Override
    public CommandType getType() {
        return CommandType.LOG;
    }
}
