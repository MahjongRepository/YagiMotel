package org.yagi.motel.model

data class PersonsGetPersonalInfoResponseDto(val people: List<PersonExDto>)

data class PersonExDto(
    val id: Long,
    val city: String,
    val tenhouId: String,
    val title: String,
    val country: String,
    val email: String,
    val phone: String,
    val hasAvatar: Boolean,
    val lastUpdate: String,
    val msNickname: String,
    val msAccountId: Long,
    val telegramId: String,
    val notifications: String,
)
