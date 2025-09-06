package org.yagi.motel.kernel.model.container;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
@SuppressWarnings("checkstyle:MissingJavadocType")
public class InputCommandContainer {
    private Long senderChatId;
    private String messageValue;
    private String username;
    // todo typed context
    private Map<String, Object> context;
}
