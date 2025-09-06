package org.yagi.motel.client

import com.collectiveidea.twirp.installTwirp
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache5.Apache5
import kotlinx.coroutines.runBlocking
import org.mapstruct.Mapper
import org.yagi.motel.pantheon.api.Frey
import org.yagi.motel.pantheon.api.FreyImpl
import org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload
import org.yagi.motel.extension.PantheonResponseExtension.Companion.extractResponse
import org.yagi.motel.model.PersonsGetPersonalInfoResponseDto
import org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse

class FreyClient {

    private val PANTHEON_USER_API_URL = "https://userapi.riichimahjong.org/v2/"
    private val client: Frey
    private val personsInfoMapper: PersonsGetPersonalInfoResponseMapper =
        `FreyClient$PersonsGetPersonalInfoResponseMapperImpl`()

    init {
        client = FreyImpl(HttpClient(Apache5) {
            installTwirp(PANTHEON_USER_API_URL)
        })
    }

    @Mapper
    protected interface PersonsGetPersonalInfoResponseMapper {
        fun toDto(personInfo: PersonsGetPersonalInfoResponse): PersonsGetPersonalInfoResponseDto
    }

    fun getPersonalInfo(id: Int): PersonsGetPersonalInfoResponseDto {
        return runBlocking {
            personsInfoMapper.toDto(
                client.getPersonalInfo(PersonsGetPersonalInfoPayload(ids = listOf(id))).extractResponse()
            )
        }
    }
}