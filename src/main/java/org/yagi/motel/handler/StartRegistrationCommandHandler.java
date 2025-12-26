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
import org.yagi.motel.kernel.model.enums.GamePlatformType;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("checkstyle:MissingJavadocType")
public class StartRegistrationCommandHandler extends BaseHandler implements CommandHandler {

    public static final String GAME_PLATFORM_PREFIX_CONTEXT_KEY = "game_platform";

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public StartRegistrationCommandHandler(
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
            String gamePlatformPrefix = StringUtils.normalizeSpace(commandArgs[1]);
            GamePlatformType gamePlatformType = GamePlatformType.fromStringUnsafe(gamePlatformPrefix);
            if (gamePlatformType == null) {
                sendErrorReply(context, ErrorType.GAME_PLATFORM_INCORRECT);
            } else {
                if (!StringUtils.isEmpty(context.getUsername())) {
                    Map<String, Object> startRegistrationCommandContext = new HashMap<>();
                    startRegistrationCommandContext.put(GAME_PLATFORM_PREFIX_CONTEXT_KEY, gamePlatformType);
                    getCommandDispatcherActor()
                            .tell(
                                    InputCommandMessage.builder()
                                            .messageUniqueId(context.getCommandUniqueId())
                                            .type(getType())
                                            .payload(InputCommandContainer.builder()
                                                    .messageValue("Регистрация открыта!")
                                                    .senderChatId(context.getSenderChatId())
                                                    .context(startRegistrationCommandContext)
                                                    .build())
                                            .platformType(context.getPlatformType())
                                            .requestedResponseLang(context.getRequestedResponseLang())
                                            .build(),
                                    ActorRef.noSender());

                } else {
                    sendErrorReply(context, ErrorType.MISSED_USERNAME);
                }
            }
        }
    }

    @Override
    public boolean checkPermission(CommandContext context) {
        return super.checkPermission(context);
    }

    @Override
    public CommandType getType() {
        return CommandType.START_REGISTRATION;
    }
}
