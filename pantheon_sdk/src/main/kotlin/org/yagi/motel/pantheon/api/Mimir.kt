package org.yagi.motel.pantheon.api

import com.collectiveidea.twirp.ServiceException
import io.ktor.http.Headers
import kotlin.coroutines.cancellation.CancellationException

interface Mimir {
    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getRulesets(request: org.yagi.motel.pantheon.api.EventsGetRulesetsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetRulesetsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getEvents(request: org.yagi.motel.pantheon.api.EventsGetEventsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetEventsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getEventsById(request: org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getMyEvents(request: org.yagi.motel.pantheon.api.PlayersGetMyEventsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getGameConfig(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GameConfig, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getRatingTable(request: org.yagi.motel.pantheon.api.EventsGetRatingTablePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetRatingTableResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getLastGames(request: org.yagi.motel.pantheon.api.EventsGetLastGamesPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetLastGamesResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getGame(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetGameResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getGamesSeries(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getCurrentSessions(request: org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getAllRegisteredPlayers(request: org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getTimerState(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetTimerStateResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getSessionOverview(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getPlayerStats(request: org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun addRound(request: org.yagi.motel.pantheon.api.GamesAddRoundPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GamesAddRoundResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun previewRound(request: org.yagi.motel.pantheon.api.GamesPreviewRoundPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GamesPreviewRoundResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun addOnlineReplay(request: org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getLastResults(request: org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getLastRound(request: org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getAllRounds(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getLastRoundByHash(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getEventForEdit(request: org.yagi.motel.pantheon.api.EventsGetEventForEditPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetEventForEditResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun rebuildScoring(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun createEvent(request: org.yagi.motel.pantheon.api.EventData, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericEventPayload, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun updateEvent(request: org.yagi.motel.pantheon.api.EventsUpdateEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun finishEvent(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun toggleListed(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getTablesState(request: org.yagi.motel.pantheon.api.EventsGetTablesStatePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetTablesStateResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun startTimer(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun registerPlayer(request: org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun unregisterPlayer(request: org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun updatePlayerSeatingFlag(request: org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getAchievements(request: org.yagi.motel.pantheon.api.EventsGetAchievementsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetAchievementsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun toggleHideResults(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun toggleHideAchievements(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun updatePlayersLocalIds(request: org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun updatePlayerReplacement(request: org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun updatePlayersTeams(request: org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun startGame(request: org.yagi.motel.pantheon.api.GamesStartGamePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSessionPayload, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun endGame(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun cancelGame(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun finalizeSession(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun dropLastRound(request: org.yagi.motel.pantheon.api.GamesDropLastRoundPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun definalizeGame(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun addPenalty(request: org.yagi.motel.pantheon.api.GamesAddPenaltyPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun addPenaltyGame(request: org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSessionPayload, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getPlayer(request: org.yagi.motel.pantheon.api.PlayersGetPlayerPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PlayersGetPlayerResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getCurrentSeating(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun makeShuffledSeating(request: org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun makeSwissSeating(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun resetSeating(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun generateSwissSeating(request: org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun makeIntervalSeating(request: org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun makePrescriptedSeating(request: org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getNextPrescriptedSeating(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getPrescriptedEventConfig(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun updatePrescriptedEventConfig(request: org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun initStartingTimer(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getStartingTimer(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun clearStatCache(request: org.yagi.motel.pantheon.api.ClearStatCachePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun forceFinishGame(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun addTypedOnlineReplay(request: org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun notifyPlayersSessionStartsSoon(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun callReferee(request: org.yagi.motel.pantheon.api.CallRefereePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun recalcAchievements(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun recalcPlayerStats(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun listPenalties(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PenaltiesResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun cancelPenalty(request: org.yagi.motel.pantheon.api.CancelPenaltyPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun addExtraTime(request: org.yagi.motel.pantheon.api.AddExtraTimePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun listMyPenalties(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PenaltiesResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun listChombo(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.ChomboResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getCurrentStateForPlayer(request: org.yagi.motel.pantheon.api.GetCurrentStatePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GetCurrentStateResponse, Headers>
}
