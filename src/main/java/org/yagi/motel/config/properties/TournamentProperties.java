package org.yagi.motel.config.properties;

import lombok.Data;

@Data
@SuppressWarnings("checkstyle:MissingJavadocType")
public class TournamentProperties {
    private Long tournamentId;
    private Long lobbyId;
    private String gamePlatform;
}
