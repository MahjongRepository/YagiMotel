package org.yagi.motel.handler;

import akka.actor.ActorRef;
import java.util.Set;
import org.yagi.motel.config.AppConfig;
import org.yagi.motel.handler.context.CommandContext;
import org.yagi.motel.handler.enums.ErrorType;
import org.yagi.motel.handler.holder.PlatformCallbacksHolder;
import org.yagi.motel.kernel.enums.CommandType;
import org.yagi.motel.kernel.message.InputCommandMessage;
import org.yagi.motel.kernel.model.container.InputCommandContainer;

@SuppressWarnings("checkstyle:MissingJavadocType")
public class AddPenaltyGameCommandHandler extends BaseHandler implements CommandHandler {

  @SuppressWarnings("checkstyle:MissingJavadocMethod")
  public AddPenaltyGameCommandHandler(
      AppConfig config,
      ActorRef commandDispatcherActor,
      ActorRef errorCommandDispatcherActor,
      PlatformCallbacksHolder platformCallbacksHolder,
      Set<Long> allowedChatIds) {
    super(
        config,
        commandDispatcherActor,
        errorCommandDispatcherActor,
        platformCallbacksHolder,
        allowedChatIds);
  }

  @Override
  public void handleCommand(final CommandContext context) {
    if (!checkPermission(context)) {
      sendErrorReply(context, ErrorType.COMMAND_NOT_ALLOWED);
      return;
    }

    String[] commandArgs = context.getCommandArgs();
    if (commandArgs.length >= 2) {
      String commandValue = commandArgs[1].trim();
      getCommandDispatcherActor()
          .tell(
              InputCommandMessage.builder()
                  .messageUniqueId(context.getCommandUniqueId())
                  .type(getType())
                  .payload(
                      InputCommandContainer.builder()
                          .messageValue(commandValue)
                          .senderChatId(context.getSenderChatId())
                          .build())
                  .platformType(context.getPlatformType())
                  .requestedResponseLang(context.getRequestedResponseLang())
                  .build(),
              ActorRef.noSender());
    }
  }

  @Override
  public boolean checkPermission(CommandContext context) {
    return super.checkPermission(context);
  }

  @Override
  public CommandType getType() {
    return CommandType.ADD_PENALTY_GAME;
  }
}
