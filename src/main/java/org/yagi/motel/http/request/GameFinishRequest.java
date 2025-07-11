package org.yagi.motel.http.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Data;
import org.yagi.motel.config.AppConfig;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@Builder
@SuppressWarnings("checkstyle:MissingJavadocType")
public class GameFinishRequest {
    @JsonProperty("api_token")
    private String apiToken;

    @JsonProperty("tournament_id")
    private Long tournamentId;

    @JsonProperty("lobby_id")
    private Long lobbyId;

    @JsonProperty("is_error")
    private Boolean isError;

    @JsonProperty("log_id")
    private String logId;

    @JsonProperty("players")
    private List<String> players;

    @JsonProperty("log_content")
    private String logContent;

    @JsonProperty("log_time")
    private Long logTime;

    private String lang;

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Optional<GameFinishRequest> convertFromTensoulMap(
            AppConfig config, ObjectMapper mapper, Map tensoulReplayInfo, String requestedLang) {
        if (validateTensoulMap(tensoulReplayInfo)) {
            try {
                Map logMap = (Map) tensoulReplayInfo.get("log");
                return Optional.of(GameFinishRequest.builder()
                        .apiToken(config.getAutobotApiToken())
                        .tournamentId(config.getTournamentId())
                        .lobbyId(config.getLobbyId())
                        .isError(false)
                        .logId((String) logMap.get("ref"))
                        .logTime((Long) ((List) logMap.get("title")).get(1))
                        .players(extractPlayersNicknames((List) logMap.get("playerMapping")))
                        .logContent(mapper.writeValueAsString(logMap))
                        .lang(requestedLang)
                        .build());
            } catch (Exception er) {
                // todo handle error
            }
        }
        return Optional.empty();
    }

    private static List<String> extractPlayersNicknames(List playerMapping) {
        return (List<String>) playerMapping.stream()
                .map(mapping -> ((Map) mapping).get("nickname"))
                .collect(Collectors.toList());
    }

    private static boolean validateTensoulMap(Map tensoulReplayInfo) {
        if (tensoulReplayInfo == null) {
            return false;
        }

        if (tensoulReplayInfo.containsKey("is_error") && Boolean.TRUE.equals(tensoulReplayInfo.get("is_error"))) {
            return false;
        }

        if (!tensoulReplayInfo.containsKey("log")) {
            return false;
        }

        Map logMap = (Map) tensoulReplayInfo.get("log");

        if (!logMap.containsKey("ref")) {
            return false;
        }

        if (!logMap.containsKey("title")) {
            return false;
        }

        if (!logMap.containsKey("playerMapping")) {
            return false;
        }

        // weak part, need validate over json schema
        if (!logMap.containsKey("log")) {
            return false;
        }

        if (((List<?>) logMap.get("log")).isEmpty()) {
            return false;
        }

        return true;
    }
}
