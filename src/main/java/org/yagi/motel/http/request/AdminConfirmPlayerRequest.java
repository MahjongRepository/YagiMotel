package org.yagi.motel.http.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@SuppressWarnings("checkstyle:MissingJavadocType")
public class AdminConfirmPlayerRequest {
    @JsonProperty("api_token")
    private String apiToken;

    @JsonProperty("tournament_id")
    private Long tournamentId;

    @JsonProperty("lobby_id")
    private Long lobbyId;

    private String nickname;

    @JsonProperty("friend_id")
    private Long friendId;

    @JsonProperty("telegram_username")
    private String telegramUsername;
}
