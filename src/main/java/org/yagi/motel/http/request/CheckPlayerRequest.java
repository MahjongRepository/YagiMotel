package org.yagi.motel.http.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@SuppressWarnings("checkstyle:MissingJavadocType")
public class CheckPlayerRequest {
    @JsonProperty("api_token")
    private String apiToken;

    private String nickname;

    @JsonProperty("confirm_code")
    private Long confirmCode;

    private String lang;
}
