package org.yagi.motel.pantheon.api

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.HttpResponse
import io.ktor.http.Headers
import pbandk.decodeFromByteArray
import pbandk.encodeToByteArray

/**
 * @param httpClient A pre-configured Twirp-ready HttpClient. Use the
 *   [com.collectiveidea.twirp.installTwirp] helper for easy client creation, e.g.
 *
 *   val client = HttpClient(engine) {
 *      installTwirp(baseUrl)
 *   }
 */
class MimirImpl(val httpClient: HttpClient) : Mimir {
    override suspend fun getRulesets(request: org.yagi.motel.pantheon.api.EventsGetRulesetsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetRulesetsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetRulesets") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetRulesetsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getEvents(request: org.yagi.motel.pantheon.api.EventsGetEventsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetEventsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetEvents") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetEventsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getEventsById(request: org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetEventsById") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getMyEvents(request: org.yagi.motel.pantheon.api.PlayersGetMyEventsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetMyEvents") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getGameConfig(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GameConfig, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetGameConfig") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GameConfig.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getRatingTable(request: org.yagi.motel.pantheon.api.EventsGetRatingTablePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetRatingTableResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetRatingTable") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetRatingTableResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getLastGames(request: org.yagi.motel.pantheon.api.EventsGetLastGamesPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetLastGamesResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetLastGames") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetLastGamesResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getGame(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetGameResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetGame") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetGameResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getGamesSeries(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetGamesSeries") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getCurrentSessions(request: org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetCurrentSessions") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getAllRegisteredPlayers(request: org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetAllRegisteredPlayers") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getTimerState(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetTimerStateResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetTimerState") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetTimerStateResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getSessionOverview(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetSessionOverview") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getPlayerStats(request: org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetPlayerStats") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun addRound(request: org.yagi.motel.pantheon.api.GamesAddRoundPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GamesAddRoundResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/AddRound") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GamesAddRoundResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun previewRound(request: org.yagi.motel.pantheon.api.GamesPreviewRoundPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GamesPreviewRoundResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/PreviewRound") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GamesPreviewRoundResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun addOnlineReplay(request: org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/AddOnlineReplay") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getLastResults(request: org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetLastResults") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getLastRound(request: org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetLastRound") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getAllRounds(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetAllRounds") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getLastRoundByHash(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetLastRoundByHash") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getEventForEdit(request: org.yagi.motel.pantheon.api.EventsGetEventForEditPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetEventForEditResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetEventForEdit") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetEventForEditResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun rebuildScoring(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/RebuildScoring") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun createEvent(request: org.yagi.motel.pantheon.api.EventData, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericEventPayload, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/CreateEvent") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericEventPayload.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun updateEvent(request: org.yagi.motel.pantheon.api.EventsUpdateEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/UpdateEvent") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun finishEvent(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/FinishEvent") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun toggleListed(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/ToggleListed") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getTablesState(request: org.yagi.motel.pantheon.api.EventsGetTablesStatePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetTablesStateResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetTablesState") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetTablesStateResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun startTimer(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/StartTimer") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun registerPlayer(request: org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/RegisterPlayer") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun unregisterPlayer(request: org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/UnregisterPlayer") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun updatePlayerSeatingFlag(request: org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/UpdatePlayerSeatingFlag") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getAchievements(request: org.yagi.motel.pantheon.api.EventsGetAchievementsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetAchievementsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetAchievements") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetAchievementsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun toggleHideResults(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/ToggleHideResults") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun toggleHideAchievements(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/ToggleHideAchievements") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun updatePlayersLocalIds(request: org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/UpdatePlayersLocalIds") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun updatePlayerReplacement(request: org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/UpdatePlayerReplacement") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun updatePlayersTeams(request: org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/UpdatePlayersTeams") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun startGame(request: org.yagi.motel.pantheon.api.GamesStartGamePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSessionPayload, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/StartGame") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSessionPayload.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun endGame(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/EndGame") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun cancelGame(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/CancelGame") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun finalizeSession(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/FinalizeSession") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun dropLastRound(request: org.yagi.motel.pantheon.api.GamesDropLastRoundPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/DropLastRound") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun definalizeGame(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/DefinalizeGame") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun addPenalty(request: org.yagi.motel.pantheon.api.GamesAddPenaltyPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/AddPenalty") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun addPenaltyGame(request: org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSessionPayload, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/AddPenaltyGame") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSessionPayload.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getPlayer(request: org.yagi.motel.pantheon.api.PlayersGetPlayerPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PlayersGetPlayerResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetPlayer") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PlayersGetPlayerResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getCurrentSeating(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetCurrentSeating") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun makeShuffledSeating(request: org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/MakeShuffledSeating") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun makeSwissSeating(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/MakeSwissSeating") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun resetSeating(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/ResetSeating") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun generateSwissSeating(request: org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GenerateSwissSeating") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun makeIntervalSeating(request: org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/MakeIntervalSeating") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun makePrescriptedSeating(request: org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/MakePrescriptedSeating") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getNextPrescriptedSeating(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetNextPrescriptedSeating") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getPrescriptedEventConfig(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetPrescriptedEventConfig") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun updatePrescriptedEventConfig(request: org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/UpdatePrescriptedEventConfig") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun initStartingTimer(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/InitStartingTimer") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getStartingTimer(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetStartingTimer") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun clearStatCache(request: org.yagi.motel.pantheon.api.ClearStatCachePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/ClearStatCache") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun forceFinishGame(request: org.yagi.motel.pantheon.api.GenericSessionPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/ForceFinishGame") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun addTypedOnlineReplay(request: org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/AddTypedOnlineReplay") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun notifyPlayersSessionStartsSoon(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/NotifyPlayersSessionStartsSoon") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun callReferee(request: org.yagi.motel.pantheon.api.CallRefereePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/CallReferee") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun recalcAchievements(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/RecalcAchievements") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun recalcPlayerStats(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/RecalcPlayerStats") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun listPenalties(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PenaltiesResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/ListPenalties") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PenaltiesResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun cancelPenalty(request: org.yagi.motel.pantheon.api.CancelPenaltyPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/CancelPenalty") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun addExtraTime(request: org.yagi.motel.pantheon.api.AddExtraTimePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/AddExtraTime") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun listMyPenalties(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PenaltiesResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/ListMyPenalties") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PenaltiesResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun listChombo(request: org.yagi.motel.pantheon.api.GenericEventPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.ChomboResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/ListChombo") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.ChomboResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getCurrentStateForPlayer(request: org.yagi.motel.pantheon.api.GetCurrentStatePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GetCurrentStateResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Mimir/GetCurrentStateForPlayer") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GetCurrentStateResponse.decodeFromByteArray(response.body()), response.headers)
    }
}
