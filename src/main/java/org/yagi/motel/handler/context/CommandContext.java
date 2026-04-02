package org.yagi.motel.handler.context;

import lombok.Builder;
import lombok.Getter;
import org.yagi.motel.kernel.enums.PlatformType;

@Getter
@Builder
@SuppressWarnings("checkstyle:MissingJavadocType")
// todo: rename to KernelContext
public class CommandContext {
    private Long commandUniqueId;
    private String[] commandArgs;
    private Long senderChatId;
    private String username;
    private PlatformType platformType;
    private String requestedResponseLang;
}
