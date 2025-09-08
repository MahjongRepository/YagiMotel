package org.yagi.motel.bot.discord.utils;

import lombok.experimental.UtilityClass;
import org.yagi.motel.config.AppConfig;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@UtilityClass
@SuppressWarnings("checkstyle:MissingJavadocType")
public class DiscordCommandPermissionsProvider {
    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Set<Long> getStatusCommandPermissions(AppConfig config) {
        return getIds(
                config.getDiscord().getRuNotificationTournamentChannelId(),
                config.getDiscord().getEnNotificationTournamentChannelId(),
                config.getDiscord().getDiscordAdminChatId());
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Set<Long> getMeCommandPermissions(AppConfig config) {
        return getIds(
                config.getDiscord().getRuConfirmationTournamentChannelId(),
                config.getDiscord().getEnConfirmationTournamentChannelId());
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Set<Long> getStartServeCommandPermissions(AppConfig config) {
        return getIds(config.getDiscord().getDiscordAdminChatId());
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Set<Long> getStopServeCommandPermissions(AppConfig config) {
        return getIds(config.getDiscord().getDiscordAdminChatId());
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Set<Long> getStartRegistrationCommandPermissions(AppConfig config) {
        return getIds(config.getDiscord().getDiscordAdminChatId());
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Set<Long> getCloseRegistrationCommandPermissions(AppConfig config) {
        return getIds(config.getDiscord().getDiscordAdminChatId());
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Set<Long> getLogCommandPermissions(AppConfig config) {
        return getIds(config.getDiscord().getGameLogsChannelId());
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Set<Long> getAddCommandPermissions(AppConfig config) {
        return getIds(config.getDiscord().getDiscordAdminChatId());
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Set<Long> getUpdateTeamsCommandPermissions(AppConfig config) {
        return getIds(config.getDiscord().getDiscordAdminChatId());
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Set<Long> getAddPenaltyGameCommandPermissions(AppConfig config) {
        return getIds(config.getDiscord().getDiscordAdminChatId());
    }

    private Set<Long> getIds(Long... ids) {
        return new HashSet<>(Arrays.asList(ids));
    }
}
