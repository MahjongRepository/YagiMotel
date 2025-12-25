package org.yagi.motel.http.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@SuppressWarnings("checkstyle:MissingJavadocType")
public class CheckPlayerResponse {
    @JsonProperty("tournament_id")
    private Long tournamentId;

    @JsonProperty("game_platform_type")
    private String gamePlatformType;

    @JsonProperty("is_error")
    private Boolean isError;
}
