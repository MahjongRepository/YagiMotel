package org.yagi.motel.http.response;

import lombok.Data;

@Data
@SuppressWarnings("checkstyle:MissingJavadocType")
public class GetTournamentByConfirmCodeResponse {
    private Long tournamentId;
    private String gamePlatformType;
}
