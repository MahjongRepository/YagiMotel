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
class FreyImpl(val httpClient: HttpClient) : Frey {
    override suspend fun requestRegistration(request: org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/RequestRegistration") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun approveRegistration(request: org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/ApproveRegistration") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun authorize(request: org.yagi.motel.pantheon.api.AuthAuthorizePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AuthAuthorizeResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/Authorize") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AuthAuthorizeResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun quickAuthorize(request: org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/QuickAuthorize") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun me(request: org.yagi.motel.pantheon.api.AuthMePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AuthMeResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/Me") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AuthMeResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun depersonalizeAccount(request: org.yagi.motel.pantheon.api.DepersonalizePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/DepersonalizeAccount") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun changePassword(request: org.yagi.motel.pantheon.api.AuthChangePasswordPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AuthChangePasswordResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/ChangePassword") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AuthChangePasswordResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun requestResetPassword(request: org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/RequestResetPassword") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun approveResetPassword(request: org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/ApproveResetPassword") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun updatePersonalInfo(request: org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/UpdatePersonalInfo") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getPersonalInfo(request: org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/GetPersonalInfo") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun findByTenhouIds(request: org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/FindByTenhouIds") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun findByMajsoulAccountId(request: org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/FindByMajsoulAccountId") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun findByTitle(request: org.yagi.motel.pantheon.api.PersonsFindByTitlePayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PersonsFindByTitleResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/FindByTitle") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PersonsFindByTitleResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getEventAdmins(request: org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/GetEventAdmins") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getEventReferees(request: org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/GetEventReferees") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getMajsoulNicknames(request: org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/GetMajsoulNicknames") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getSuperadminFlag(request: org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/GetSuperadminFlag") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getOwnedEventIds(request: org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/GetOwnedEventIds") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun addRuleForPerson(request: org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/AddRuleForPerson") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun deleteRuleForPerson(request: org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/DeleteRuleForPerson") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun createAccount(request: org.yagi.motel.pantheon.api.PersonsCreateAccountPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PersonsCreateAccountResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/CreateAccount") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PersonsCreateAccountResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun getNotificationsSettings(request: org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/GetNotificationsSettings") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse.decodeFromByteArray(response.body()), response.headers)
    }

    override suspend fun setNotificationsSettings(request: org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload, requestHeaders: Headers?): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers> {
        val response: HttpResponse = httpClient.post("common.Frey/SetNotificationsSettings") {
            requestHeaders?.let { headers.appendAll(it) }
            setBody(request.encodeToByteArray())
        }
        return Pair(org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeFromByteArray(response.body()), response.headers)
    }
}
