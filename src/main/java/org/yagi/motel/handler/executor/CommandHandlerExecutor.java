package org.yagi.motel.handler.executor;

import org.yagi.motel.handler.CommandHandler;
import org.yagi.motel.handler.context.CommandContext;
import org.yagi.motel.handler.enums.ErrorType;

import java.util.Map;
import java.util.function.Supplier;

public class CommandHandlerExecutor {
    private final Map<String, CommandHandler> handlers;

    public CommandHandlerExecutor(Map<String, CommandHandler> handlers) {
        this.handlers = handlers;
    }

    public boolean tryExecuteHandler(String commandPrefix, Supplier<CommandContext> contextSupplier) {
        if (handlers.containsKey(commandPrefix)) {
            final CommandHandler handler = handlers.get(commandPrefix);
            final CommandContext context = contextSupplier.get();
            if (!handler.checkPermission(context)) {
                handler.sendErrorReply(context, ErrorType.COMMAND_NOT_ALLOWED);
                return false;
            }

            handler.handleCommand(context);
            return true;
        }

        return false;
    }
}
