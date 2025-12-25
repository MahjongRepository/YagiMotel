package org.yagi.motel.utils;

import lombok.experimental.UtilityClass;
import org.yagi.motel.config.AppConfig;
import org.yagi.motel.kernel.model.enums.GamePlatformType;

@UtilityClass
@SuppressWarnings("checkstyle:MissingJavadocType")
public class GamePlatformUtils {
    public static Long getTournamentId(AppConfig config, GamePlatformType gamePlatformType) {
        Long tournamentId = null;
        switch (gamePlatformType) {
            case TENHOU:
                tournamentId = config.getTournaments().getTenhou().getTournamentId();
                break;
            case MAJSOUL:
                tournamentId = config.getTournaments().getMajsoul().getTournamentId();
                break;
        }
        return tournamentId;
    }

    public static Long getLobbyId(AppConfig config, GamePlatformType gamePlatformType) {
        Long lobbyId = null;
        switch (gamePlatformType) {
            case TENHOU:
                lobbyId = config.getTournaments().getTenhou().getLobbyId();
                break;
            case MAJSOUL:
                lobbyId = config.getTournaments().getMajsoul().getLobbyId();
                break;
        }
        return lobbyId;
    }
}
