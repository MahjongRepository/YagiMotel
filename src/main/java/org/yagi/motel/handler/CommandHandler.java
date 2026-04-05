package org.yagi.motel.handler;

import org.yagi.motel.handler.context.CommandContext;
import org.yagi.motel.handler.enums.ErrorType;
import org.yagi.motel.kernel.enums.CommandType;

@SuppressWarnings("checkstyle:MissingJavadocType")
public interface CommandHandler {
    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    void handleCommand(CommandContext context);

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    boolean checkPermission(CommandContext context);

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    void sendErrorReply(CommandContext context, ErrorType errorType);

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    CommandType getType();
}
