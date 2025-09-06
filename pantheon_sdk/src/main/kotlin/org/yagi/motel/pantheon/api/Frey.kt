package org.yagi.motel.pantheon.api

import com.collectiveidea.twirp.ServiceException
import io.ktor.http.Headers
import kotlin.coroutines.cancellation.CancellationException

interface Frey {
    @Throws(ServiceException::class, CancellationException::class)
    suspend fun requestRegistration(request: org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun approveRegistration(request: org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun authorize(request: org.yagi.motel.pantheon.api.AuthAuthorizePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AuthAuthorizeResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun quickAuthorize(request: org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun me(request: org.yagi.motel.pantheon.api.AuthMePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AuthMeResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun depersonalizeAccount(request: org.yagi.motel.pantheon.api.DepersonalizePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun changePassword(request: org.yagi.motel.pantheon.api.AuthChangePasswordPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AuthChangePasswordResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun requestResetPassword(request: org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun approveResetPassword(request: org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun updatePersonalInfo(request: org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getPersonalInfo(request: org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun findByTenhouIds(request: org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun findByMajsoulAccountId(request: org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun findByTitle(request: org.yagi.motel.pantheon.api.PersonsFindByTitlePayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PersonsFindByTitleResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getEventAdmins(request: org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getEventReferees(request: org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getMajsoulNicknames(request: org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getSuperadminFlag(request: org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getOwnedEventIds(request: org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun addRuleForPerson(request: org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun deleteRuleForPerson(request: org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun createAccount(request: org.yagi.motel.pantheon.api.PersonsCreateAccountPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PersonsCreateAccountResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun getNotificationsSettings(request: org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse, Headers>

    @Throws(ServiceException::class, CancellationException::class)
    suspend fun setNotificationsSettings(request: org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload, requestHeaders: Headers? = null): Pair<org.yagi.motel.pantheon.api.GenericSuccessResponse, Headers>
}
