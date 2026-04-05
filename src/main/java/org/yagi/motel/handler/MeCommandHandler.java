package org.yagi.motel.handler;

import org.apache.commons.lang3.StringUtils;
import org.apache.pekko.actor.ActorRef;
import org.yagi.motel.config.AppConfig;
import org.yagi.motel.handler.context.CommandContext;
import org.yagi.motel.handler.enums.ErrorType;
import org.yagi.motel.handler.holder.PlatformCallbacksHolder;
import org.yagi.motel.kernel.enums.CommandType;
import org.yagi.motel.kernel.message.InputCommandMessage;
import org.yagi.motel.kernel.model.container.InputCommandContainer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("checkstyle:MissingJavadocType")
public class MeCommandHandler extends BaseHandler implements CommandHandler {

    public static final String CONFIRM_CODE_CONTEXT_KEY = "confirm_code";

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public MeCommandHandler(
            AppConfig config,
            ActorRef commandDispatcherActor,
            ActorRef errorCommandDispatcherActor,
            PlatformCallbacksHolder platformCallbacksHolder,
            Set<Long> allowedChatIds) {
        super(config, commandDispatcherActor, errorCommandDispatcherActor, platformCallbacksHolder, allowedChatIds);
    }

    private void processCommand(CommandContext context, Map<String, Object> meCommandContext, String playerUsername) {
        getCommandDispatcherActor()
                .tell(
                        InputCommandMessage.builder()
                                .messageUniqueId(context.getCommandUniqueId())
                                .type(getType())
                                .payload(InputCommandContainer.builder()
                                        .messageValue(playerUsername)
                                        .senderChatId(context.getSenderChatId())
                                        .username(context.getUsername())
                                        .context(meCommandContext)
                                        .build())
                                .platformType(context.getPlatformType())
                                .requestedResponseLang(context.getRequestedResponseLang())
                                .build(),
                        ActorRef.noSender());
    }

    @Override
    public void handleCommand(final CommandContext context) {
        if (StringUtils.isEmpty(context.getUsername())) {
            sendErrorReply(context, ErrorType.MISSED_PLATFORM_USERNAME);
            return;
        }

        String[] commandArgs = context.getCommandArgs();
        Boolean withConfirmCode = Boolean.TRUE.equals(getConfig().getWithConfirmCode());
        int requiredCommandLength = withConfirmCode ? 3 : 2;
        if (commandArgs.length >= requiredCommandLength) {
            String playerUsername = StringUtils.normalizeSpace(commandArgs[1]);
            if (!withConfirmCode) {
                processCommand(context, null, playerUsername);
            } else {
                String confirmCode = StringUtils.normalizeSpace(commandArgs[2]);
                if (!confirmCode.isEmpty()) {
                    Long validConfirmCode = null;
                    try {
                        validConfirmCode = Long.valueOf(confirmCode);
                    } catch (Exception ex) {
                        validConfirmCode = null;
                    }

                    if (validConfirmCode != null) {
                        Map<String, Object> meCommandContext = new HashMap<>();
                        meCommandContext.put(CONFIRM_CODE_CONTEXT_KEY, validConfirmCode);
                        processCommand(context, meCommandContext, playerUsername);
                    } else {
                        sendErrorReply(context, ErrorType.MISSED_CONFIRM_CODE);
                    }
                } else {
                    sendErrorReply(context, ErrorType.MISSED_CONFIRM_CODE);
                }
            }
        } else {
            sendErrorReply(context, ErrorType.MISSED_USERNAME);
        }
    }

    @Override
    public boolean checkPermission(CommandContext context) {
        return super.checkPermission(context);
    }

    @Override
    public void sendErrorReply(CommandContext context, ErrorType errorType) {
        super.sendErrorReply(context, errorType);
    }

    @Override
    public CommandType getType() {
        return CommandType.ME;
    }
}
