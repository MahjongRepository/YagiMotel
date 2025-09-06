@file:OptIn(pbandk.PublicForGeneratedCode::class)

package org.yagi.motel.pantheon.api

@pbandk.Export
public sealed class EventType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is org.yagi.motel.pantheon.api.EventType && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "EventType.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNSPECIFIED : EventType(0, "EVENT_TYPE_UNSPECIFIED")
    public object TOURNAMENT : EventType(1, "EVENT_TYPE_TOURNAMENT")
    public object LOCAL : EventType(2, "EVENT_TYPE_LOCAL")
    public object ONLINE : EventType(3, "EVENT_TYPE_ONLINE")
    public class UNRECOGNIZED(value: Int) : EventType(value)

    public companion object : pbandk.Message.Enum.Companion<org.yagi.motel.pantheon.api.EventType> {
        public val values: List<org.yagi.motel.pantheon.api.EventType> by lazy { listOf(UNSPECIFIED, TOURNAMENT, LOCAL, ONLINE) }
        override fun fromValue(value: Int): org.yagi.motel.pantheon.api.EventType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): org.yagi.motel.pantheon.api.EventType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No EventType with name: $name")
    }
}

@pbandk.Export
public sealed class TournamentGamesStatus(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is org.yagi.motel.pantheon.api.TournamentGamesStatus && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "TournamentGamesStatus.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNSPECIFIED : TournamentGamesStatus(0, "TOURNAMENT_GAMES_STATUS_UNSPECIFIED")
    public object SEATING_READY : TournamentGamesStatus(1, "TOURNAMENT_GAMES_STATUS_SEATING_READY")
    public object STARTED : TournamentGamesStatus(2, "TOURNAMENT_GAMES_STATUS_STARTED")
    public class UNRECOGNIZED(value: Int) : TournamentGamesStatus(value)

    public companion object : pbandk.Message.Enum.Companion<org.yagi.motel.pantheon.api.TournamentGamesStatus> {
        public val values: List<org.yagi.motel.pantheon.api.TournamentGamesStatus> by lazy { listOf(UNSPECIFIED, SEATING_READY, STARTED) }
        override fun fromValue(value: Int): org.yagi.motel.pantheon.api.TournamentGamesStatus = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): org.yagi.motel.pantheon.api.TournamentGamesStatus = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No TournamentGamesStatus with name: $name")
    }
}

@pbandk.Export
public sealed class RoundOutcome(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is org.yagi.motel.pantheon.api.RoundOutcome && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "RoundOutcome.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNSPECIFIED : RoundOutcome(0, "ROUND_OUTCOME_UNSPECIFIED")
    public object RON : RoundOutcome(1, "ROUND_OUTCOME_RON")
    public object TSUMO : RoundOutcome(2, "ROUND_OUTCOME_TSUMO")
    public object DRAW : RoundOutcome(3, "ROUND_OUTCOME_DRAW")
    public object ABORT : RoundOutcome(4, "ROUND_OUTCOME_ABORT")
    public object CHOMBO : RoundOutcome(5, "ROUND_OUTCOME_CHOMBO")
    public object NAGASHI : RoundOutcome(6, "ROUND_OUTCOME_NAGASHI")
    public object MULTIRON : RoundOutcome(7, "ROUND_OUTCOME_MULTIRON")
    public class UNRECOGNIZED(value: Int) : RoundOutcome(value)

    public companion object : pbandk.Message.Enum.Companion<org.yagi.motel.pantheon.api.RoundOutcome> {
        public val values: List<org.yagi.motel.pantheon.api.RoundOutcome> by lazy { listOf(UNSPECIFIED, RON, TSUMO, DRAW, ABORT, CHOMBO, NAGASHI, MULTIRON) }
        override fun fromValue(value: Int): org.yagi.motel.pantheon.api.RoundOutcome = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): org.yagi.motel.pantheon.api.RoundOutcome = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No RoundOutcome with name: $name")
    }
}

@pbandk.Export
public sealed class SessionStatus(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is org.yagi.motel.pantheon.api.SessionStatus && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "SessionStatus.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNSPECIFIED : SessionStatus(0, "SESSION_STATUS_UNSPECIFIED")
    public object INPROGRESS : SessionStatus(1, "SESSION_STATUS_INPROGRESS")
    public object PREFINISHED : SessionStatus(2, "SESSION_STATUS_PREFINISHED")
    public object FINISHED : SessionStatus(3, "SESSION_STATUS_FINISHED")
    public object CANCELLED : SessionStatus(4, "SESSION_STATUS_CANCELLED")
    public object PLANNED : SessionStatus(5, "SESSION_STATUS_PLANNED")
    public class UNRECOGNIZED(value: Int) : SessionStatus(value)

    public companion object : pbandk.Message.Enum.Companion<org.yagi.motel.pantheon.api.SessionStatus> {
        public val values: List<org.yagi.motel.pantheon.api.SessionStatus> by lazy { listOf(UNSPECIFIED, INPROGRESS, PREFINISHED, FINISHED, CANCELLED, PLANNED) }
        override fun fromValue(value: Int): org.yagi.motel.pantheon.api.SessionStatus = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): org.yagi.motel.pantheon.api.SessionStatus = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No SessionStatus with name: $name")
    }
}

@pbandk.Export
public sealed class UmaType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is org.yagi.motel.pantheon.api.UmaType && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "UmaType.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNSPECIFIED : UmaType(0, "UMA_TYPE_UNSPECIFIED")
    public object UMA_SIMPLE : UmaType(1, "UMA_TYPE_UMA_SIMPLE")
    public object UMA_COMPLEX : UmaType(2, "UMA_TYPE_UMA_COMPLEX")
    public class UNRECOGNIZED(value: Int) : UmaType(value)

    public companion object : pbandk.Message.Enum.Companion<org.yagi.motel.pantheon.api.UmaType> {
        public val values: List<org.yagi.motel.pantheon.api.UmaType> by lazy { listOf(UNSPECIFIED, UMA_SIMPLE, UMA_COMPLEX) }
        override fun fromValue(value: Int): org.yagi.motel.pantheon.api.UmaType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): org.yagi.motel.pantheon.api.UmaType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No UmaType with name: $name")
    }
}

@pbandk.Export
public sealed class EndingPolicy(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is org.yagi.motel.pantheon.api.EndingPolicy && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "EndingPolicy.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object EP_UNSPECIFIED : EndingPolicy(0, "ENDING_POLICY_EP_UNSPECIFIED")
    public object EP_ONE_MORE_HAND : EndingPolicy(1, "ENDING_POLICY_EP_ONE_MORE_HAND")
    public object EP_END_AFTER_HAND : EndingPolicy(2, "ENDING_POLICY_EP_END_AFTER_HAND")
    public class UNRECOGNIZED(value: Int) : EndingPolicy(value)

    public companion object : pbandk.Message.Enum.Companion<org.yagi.motel.pantheon.api.EndingPolicy> {
        public val values: List<org.yagi.motel.pantheon.api.EndingPolicy> by lazy { listOf(EP_UNSPECIFIED, EP_ONE_MORE_HAND, EP_END_AFTER_HAND) }
        override fun fromValue(value: Int): org.yagi.motel.pantheon.api.EndingPolicy = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): org.yagi.motel.pantheon.api.EndingPolicy = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No EndingPolicy with name: $name")
    }
}

@pbandk.Export
public sealed class PlatformType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is org.yagi.motel.pantheon.api.PlatformType && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "PlatformType.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNSPECIFIED : PlatformType(0, "PLATFORM_TYPE_UNSPECIFIED")
    public object TENHOUNET : PlatformType(1, "PLATFORM_TYPE_TENHOUNET")
    public object MAHJONGSOUL : PlatformType(2, "PLATFORM_TYPE_MAHJONGSOUL")
    public class UNRECOGNIZED(value: Int) : PlatformType(value)

    public companion object : pbandk.Message.Enum.Companion<org.yagi.motel.pantheon.api.PlatformType> {
        public val values: List<org.yagi.motel.pantheon.api.PlatformType> by lazy { listOf(UNSPECIFIED, TENHOUNET, MAHJONGSOUL) }
        override fun fromValue(value: Int): org.yagi.motel.pantheon.api.PlatformType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): org.yagi.motel.pantheon.api.PlatformType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No PlatformType with name: $name")
    }
}

@pbandk.Export
public data class EventAdmin(
    val ruleId: Int = 0,
    val personId: Int = 0,
    val personName: String = "",
    val hasAvatar: Boolean = false,
    val lastUpdate: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventAdmin = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventAdmin> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventAdmin> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventAdmin by lazy { org.yagi.motel.pantheon.api.EventAdmin() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventAdmin = org.yagi.motel.pantheon.api.EventAdmin.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventAdmin> = pbandk.MessageDescriptor(
            fullName = "common.EventAdmin",
            messageClass = org.yagi.motel.pantheon.api.EventAdmin::class,
            messageCompanion = this,
            fields = buildList(5) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rule_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "ruleId",
                        value = org.yagi.motel.pantheon.api.EventAdmin::ruleId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.EventAdmin::personId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_name",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "personName",
                        value = org.yagi.motel.pantheon.api.EventAdmin::personName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.EventAdmin::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.EventAdmin::lastUpdate
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventReferee(
    val ruleId: Int = 0,
    val personId: Int = 0,
    val personName: String = "",
    val hasAvatar: Boolean = false,
    val lastUpdate: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventReferee = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventReferee> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventReferee> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventReferee by lazy { org.yagi.motel.pantheon.api.EventReferee() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventReferee = org.yagi.motel.pantheon.api.EventReferee.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventReferee> = pbandk.MessageDescriptor(
            fullName = "common.EventReferee",
            messageClass = org.yagi.motel.pantheon.api.EventReferee::class,
            messageCompanion = this,
            fields = buildList(5) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rule_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "ruleId",
                        value = org.yagi.motel.pantheon.api.EventReferee::ruleId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.EventReferee::personId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_name",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "personName",
                        value = org.yagi.motel.pantheon.api.EventReferee::personName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.EventReferee::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.EventReferee::lastUpdate
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Person(
    val id: Int = 0,
    val city: String = "",
    val tenhouId: String = "",
    val title: String = "",
    val hasAvatar: Boolean = false,
    val lastUpdate: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.Person = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Person> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.Person> {
        public val defaultInstance: org.yagi.motel.pantheon.api.Person by lazy { org.yagi.motel.pantheon.api.Person() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.Person = org.yagi.motel.pantheon.api.Person.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Person> = pbandk.MessageDescriptor(
            fullName = "common.Person",
            messageClass = org.yagi.motel.pantheon.api.Person::class,
            messageCompanion = this,
            fields = buildList(6) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.Person::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "city",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "city",
                        value = org.yagi.motel.pantheon.api.Person::city
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenhou_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tenhouId",
                        value = org.yagi.motel.pantheon.api.Person::tenhouId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.Person::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.Person::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.Person::lastUpdate
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonEx(
    val id: Int = 0,
    val city: String = "",
    val tenhouId: String = "",
    val title: String = "",
    val country: String = "",
    val email: String = "",
    val phone: String = "",
    val hasAvatar: Boolean = false,
    val lastUpdate: String = "",
    val msNickname: String = "",
    val msAccountId: Int = 0,
    val telegramId: String = "",
    val notifications: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonEx = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonEx> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonEx> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonEx by lazy { org.yagi.motel.pantheon.api.PersonEx() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonEx = org.yagi.motel.pantheon.api.PersonEx.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonEx> = pbandk.MessageDescriptor(
            fullName = "common.PersonEx",
            messageClass = org.yagi.motel.pantheon.api.PersonEx::class,
            messageCompanion = this,
            fields = buildList(13) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.PersonEx::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "city",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "city",
                        value = org.yagi.motel.pantheon.api.PersonEx::city
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenhou_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tenhouId",
                        value = org.yagi.motel.pantheon.api.PersonEx::tenhouId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.PersonEx::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "country",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "country",
                        value = org.yagi.motel.pantheon.api.PersonEx::country
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = org.yagi.motel.pantheon.api.PersonEx::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "phone",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "phone",
                        value = org.yagi.motel.pantheon.api.PersonEx::phone
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.PersonEx::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.PersonEx::lastUpdate
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ms_nickname",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "msNickname",
                        value = org.yagi.motel.pantheon.api.PersonEx::msNickname
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ms_account_id",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "msAccountId",
                        value = org.yagi.motel.pantheon.api.PersonEx::msAccountId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "telegram_id",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "telegramId",
                        value = org.yagi.motel.pantheon.api.PersonEx::telegramId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "notifications",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "notifications",
                        value = org.yagi.motel.pantheon.api.PersonEx::notifications
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Country(
    val code: String = "",
    val name: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.Country = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Country> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.Country> {
        public val defaultInstance: org.yagi.motel.pantheon.api.Country by lazy { org.yagi.motel.pantheon.api.Country() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.Country = org.yagi.motel.pantheon.api.Country.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Country> = pbandk.MessageDescriptor(
            fullName = "common.Country",
            messageClass = org.yagi.motel.pantheon.api.Country::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "code",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "code",
                        value = org.yagi.motel.pantheon.api.Country::code
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = org.yagi.motel.pantheon.api.Country::name
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Event(
    val id: Int = 0,
    val title: String = "",
    val description: String = "",
    val finished: Boolean = false,
    val isListed: Boolean = false,
    val isRatingShown: Boolean = false,
    val tournamentStarted: Boolean = false,
    val type: org.yagi.motel.pantheon.api.EventType = org.yagi.motel.pantheon.api.EventType.fromValue(0),
    val isPrescripted: Boolean = false,
    val isTeam: Boolean = false,
    val hasSeries: Boolean = false,
    val withChips: Boolean = false,
    val minGamesCount: Int = 0,
    val achievementsShown: Boolean = false,
    val withYakitori: Boolean = false,
    val platformId: org.yagi.motel.pantheon.api.PlatformType = org.yagi.motel.pantheon.api.PlatformType.fromValue(0),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.Event = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Event> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.Event> {
        public val defaultInstance: org.yagi.motel.pantheon.api.Event by lazy { org.yagi.motel.pantheon.api.Event() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.Event = org.yagi.motel.pantheon.api.Event.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Event> = pbandk.MessageDescriptor(
            fullName = "common.Event",
            messageClass = org.yagi.motel.pantheon.api.Event::class,
            messageCompanion = this,
            fields = buildList(16) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.Event::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.Event::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "description",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "description",
                        value = org.yagi.motel.pantheon.api.Event::description
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "finished",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "finished",
                        value = org.yagi.motel.pantheon.api.Event::finished
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_listed",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isListed",
                        value = org.yagi.motel.pantheon.api.Event::isListed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_rating_shown",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isRatingShown",
                        value = org.yagi.motel.pantheon.api.Event::isRatingShown
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tournament_started",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "tournamentStarted",
                        value = org.yagi.motel.pantheon.api.Event::tournamentStarted
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.yagi.motel.pantheon.api.EventType.Companion),
                        jsonName = "type",
                        value = org.yagi.motel.pantheon.api.Event::type
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_prescripted",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isPrescripted",
                        value = org.yagi.motel.pantheon.api.Event::isPrescripted
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_team",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isTeam",
                        value = org.yagi.motel.pantheon.api.Event::isTeam
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_series",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasSeries",
                        value = org.yagi.motel.pantheon.api.Event::hasSeries
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_chips",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withChips",
                        value = org.yagi.motel.pantheon.api.Event::withChips
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_games_count",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "minGamesCount",
                        value = org.yagi.motel.pantheon.api.Event::minGamesCount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "achievements_shown",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "achievementsShown",
                        value = org.yagi.motel.pantheon.api.Event::achievementsShown
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_yakitori",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withYakitori",
                        value = org.yagi.motel.pantheon.api.Event::withYakitori
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "platform_id",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.yagi.motel.pantheon.api.PlatformType.Companion),
                        jsonName = "platformId",
                        value = org.yagi.motel.pantheon.api.Event::platformId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class MyEvent(
    val id: Int = 0,
    val title: String = "",
    val description: String = "",
    val isOnline: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.MyEvent = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.MyEvent> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.MyEvent> {
        public val defaultInstance: org.yagi.motel.pantheon.api.MyEvent by lazy { org.yagi.motel.pantheon.api.MyEvent() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.MyEvent = org.yagi.motel.pantheon.api.MyEvent.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.MyEvent> = pbandk.MessageDescriptor(
            fullName = "common.MyEvent",
            messageClass = org.yagi.motel.pantheon.api.MyEvent::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.MyEvent::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.MyEvent::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "description",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "description",
                        value = org.yagi.motel.pantheon.api.MyEvent::description
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_online",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isOnline",
                        value = org.yagi.motel.pantheon.api.MyEvent::isOnline
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GameConfig(
    val rulesetTitle: String = "",
    val eventTitle: String = "",
    val eventDescription: String = "",
    val eventStatHost: String = "",
    val useTimer: Boolean = false,
    val usePenalty: Boolean = false,
    val gameDuration: Int = 0,
    val timezone: String = "",
    val isOnline: Boolean = false,
    val isTeam: Boolean = false,
    val autoSeating: Boolean = false,
    val syncStart: Boolean = false,
    val syncEnd: Boolean = false,
    val sortByGames: Boolean = false,
    val allowPlayerAppend: Boolean = false,
    val seriesLength: Int = 0,
    val minGamesCount: Int = 0,
    val gamesStatus: org.yagi.motel.pantheon.api.TournamentGamesStatus = org.yagi.motel.pantheon.api.TournamentGamesStatus.fromValue(0),
    val hideResults: Boolean = false,
    val hideAddReplayButton: Boolean = false,
    val isPrescripted: Boolean = false,
    val isFinished: Boolean = false,
    val rulesetConfig: org.yagi.motel.pantheon.api.RulesetConfig? = null,
    val lobbyId: Int = 0,
    val allowViewOtherTables: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GameConfig = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GameConfig> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GameConfig> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GameConfig by lazy { org.yagi.motel.pantheon.api.GameConfig() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GameConfig = org.yagi.motel.pantheon.api.GameConfig.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GameConfig> = pbandk.MessageDescriptor(
            fullName = "common.GameConfig",
            messageClass = org.yagi.motel.pantheon.api.GameConfig::class,
            messageCompanion = this,
            fields = buildList(25) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ruleset_title",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "rulesetTitle",
                        value = org.yagi.motel.pantheon.api.GameConfig::rulesetTitle
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_title",
                        number = 26,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "eventTitle",
                        value = org.yagi.motel.pantheon.api.GameConfig::eventTitle
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_description",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "eventDescription",
                        value = org.yagi.motel.pantheon.api.GameConfig::eventDescription
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_stat_host",
                        number = 28,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "eventStatHost",
                        value = org.yagi.motel.pantheon.api.GameConfig::eventStatHost
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "use_timer",
                        number = 29,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "useTimer",
                        value = org.yagi.motel.pantheon.api.GameConfig::useTimer
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "use_penalty",
                        number = 30,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "usePenalty",
                        value = org.yagi.motel.pantheon.api.GameConfig::usePenalty
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "game_duration",
                        number = 34,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "gameDuration",
                        value = org.yagi.motel.pantheon.api.GameConfig::gameDuration
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timezone",
                        number = 35,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "timezone",
                        value = org.yagi.motel.pantheon.api.GameConfig::timezone
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_online",
                        number = 36,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isOnline",
                        value = org.yagi.motel.pantheon.api.GameConfig::isOnline
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_team",
                        number = 37,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isTeam",
                        value = org.yagi.motel.pantheon.api.GameConfig::isTeam
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "auto_seating",
                        number = 38,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "autoSeating",
                        value = org.yagi.motel.pantheon.api.GameConfig::autoSeating
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sync_start",
                        number = 39,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "syncStart",
                        value = org.yagi.motel.pantheon.api.GameConfig::syncStart
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sync_end",
                        number = 40,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "syncEnd",
                        value = org.yagi.motel.pantheon.api.GameConfig::syncEnd
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sort_by_games",
                        number = 41,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "sortByGames",
                        value = org.yagi.motel.pantheon.api.GameConfig::sortByGames
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "allow_player_append",
                        number = 42,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "allowPlayerAppend",
                        value = org.yagi.motel.pantheon.api.GameConfig::allowPlayerAppend
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "series_length",
                        number = 45,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "seriesLength",
                        value = org.yagi.motel.pantheon.api.GameConfig::seriesLength
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_games_count",
                        number = 46,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "minGamesCount",
                        value = org.yagi.motel.pantheon.api.GameConfig::minGamesCount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "games_status",
                        number = 47,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.yagi.motel.pantheon.api.TournamentGamesStatus.Companion),
                        jsonName = "gamesStatus",
                        value = org.yagi.motel.pantheon.api.GameConfig::gamesStatus
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "hide_results",
                        number = 48,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hideResults",
                        value = org.yagi.motel.pantheon.api.GameConfig::hideResults
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "hide_add_replay_button",
                        number = 49,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hideAddReplayButton",
                        value = org.yagi.motel.pantheon.api.GameConfig::hideAddReplayButton
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_prescripted",
                        number = 50,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isPrescripted",
                        value = org.yagi.motel.pantheon.api.GameConfig::isPrescripted
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_finished",
                        number = 52,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isFinished",
                        value = org.yagi.motel.pantheon.api.GameConfig::isFinished
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ruleset_config",
                        number = 53,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.RulesetConfig.Companion),
                        jsonName = "rulesetConfig",
                        value = org.yagi.motel.pantheon.api.GameConfig::rulesetConfig
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lobby_id",
                        number = 54,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "lobbyId",
                        value = org.yagi.motel.pantheon.api.GameConfig::lobbyId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "allow_view_other_tables",
                        number = 55,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "allowViewOtherTables",
                        value = org.yagi.motel.pantheon.api.GameConfig::allowViewOtherTables
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayerInRating(
    val id: Int = 0,
    val title: String = "",
    val tenhouId: String = "",
    val rating: Float = 0.0F,
    val chips: Int = 0,
    val winnerZone: Boolean = false,
    val avgPlace: Float = 0.0F,
    val avgScore: Float = 0.0F,
    val gamesPlayed: Int = 0,
    val hasAvatar: Boolean = false,
    val lastUpdate: String = "",
    val penaltiesAmount: Float = 0.0F,
    val penaltiesCount: Int = 0,
    val teamName: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayerInRating = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayerInRating> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayerInRating> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayerInRating by lazy { org.yagi.motel.pantheon.api.PlayerInRating() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayerInRating = org.yagi.motel.pantheon.api.PlayerInRating.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayerInRating> = pbandk.MessageDescriptor(
            fullName = "common.PlayerInRating",
            messageClass = org.yagi.motel.pantheon.api.PlayerInRating::class,
            messageCompanion = this,
            fields = buildList(14) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenhou_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tenhouId",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::tenhouId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rating",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "rating",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::rating
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "chips",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "chips",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::chips
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "winner_zone",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "winnerZone",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::winnerZone
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "avg_place",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "avgPlace",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::avgPlace
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "avg_score",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "avgScore",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::avgScore
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "games_played",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "gamesPlayed",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::gamesPlayed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "team_name",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "teamName",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::teamName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::lastUpdate
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "penalties_amount",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "penaltiesAmount",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::penaltiesAmount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "penalties_count",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "penaltiesCount",
                        value = org.yagi.motel.pantheon.api.PlayerInRating::penaltiesCount
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Player(
    val id: Int = 0,
    val title: String = "",
    val tenhouId: String = "",
    val hasAvatar: Boolean = false,
    val lastUpdate: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.Player = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Player> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.Player> {
        public val defaultInstance: org.yagi.motel.pantheon.api.Player by lazy { org.yagi.motel.pantheon.api.Player() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.Player = org.yagi.motel.pantheon.api.Player.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Player> = pbandk.MessageDescriptor(
            fullName = "common.Player",
            messageClass = org.yagi.motel.pantheon.api.Player::class,
            messageCompanion = this,
            fields = buildList(5) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.Player::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.Player::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenhou_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tenhouId",
                        value = org.yagi.motel.pantheon.api.Player::tenhouId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.Player::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.Player::lastUpdate
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class FinalResultOfSession(
    val playerId: Int = 0,
    val score: Int = 0,
    val ratingDelta: Float = 0.0F,
    val place: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.FinalResultOfSession = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.FinalResultOfSession> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.FinalResultOfSession> {
        public val defaultInstance: org.yagi.motel.pantheon.api.FinalResultOfSession by lazy { org.yagi.motel.pantheon.api.FinalResultOfSession() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.FinalResultOfSession = org.yagi.motel.pantheon.api.FinalResultOfSession.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.FinalResultOfSession> = pbandk.MessageDescriptor(
            fullName = "common.FinalResultOfSession",
            messageClass = org.yagi.motel.pantheon.api.FinalResultOfSession::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.FinalResultOfSession::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "score",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "score",
                        value = org.yagi.motel.pantheon.api.FinalResultOfSession::score
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rating_delta",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "ratingDelta",
                        value = org.yagi.motel.pantheon.api.FinalResultOfSession::ratingDelta
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "place",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "place",
                        value = org.yagi.motel.pantheon.api.FinalResultOfSession::place
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Penalty(
    val who: Int = 0,
    val amount: Int = 0,
    val assignedBy: Int = 0,
    val createdAt: String = "",
    val isCancelled: Boolean = false,
    val id: Int = 0,
    val reason: String? = null,
    val cancellationReason: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.Penalty = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Penalty> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.Penalty> {
        public val defaultInstance: org.yagi.motel.pantheon.api.Penalty by lazy { org.yagi.motel.pantheon.api.Penalty() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.Penalty = org.yagi.motel.pantheon.api.Penalty.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Penalty> = pbandk.MessageDescriptor(
            fullName = "common.Penalty",
            messageClass = org.yagi.motel.pantheon.api.Penalty::class,
            messageCompanion = this,
            fields = buildList(8) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "who",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "who",
                        value = org.yagi.motel.pantheon.api.Penalty::who
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "amount",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "amount",
                        value = org.yagi.motel.pantheon.api.Penalty::amount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reason",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "reason",
                        value = org.yagi.motel.pantheon.api.Penalty::reason
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "assigned_by",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "assignedBy",
                        value = org.yagi.motel.pantheon.api.Penalty::assignedBy
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "created_at",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "createdAt",
                        value = org.yagi.motel.pantheon.api.Penalty::createdAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_cancelled",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isCancelled",
                        value = org.yagi.motel.pantheon.api.Penalty::isCancelled
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cancellation_reason",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "cancellationReason",
                        value = org.yagi.motel.pantheon.api.Penalty::cancellationReason
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.Penalty::id
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RonResult(
    val roundIndex: Int = 0,
    val honba: Int = 0,
    val winnerId: Int = 0,
    val loserId: Int = 0,
    val paoPlayerId: Int = 0,
    val han: Int = 0,
    val fu: Int = 0,
    val yaku: List<Int> = emptyList(),
    val riichiBets: List<Int> = emptyList(),
    val dora: Int = 0,
    val uradora: Int = 0,
    val kandora: Int = 0,
    val kanuradora: Int = 0,
    val openHand: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.RonResult = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.RonResult> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.RonResult> {
        public val defaultInstance: org.yagi.motel.pantheon.api.RonResult by lazy { org.yagi.motel.pantheon.api.RonResult() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.RonResult = org.yagi.motel.pantheon.api.RonResult.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.RonResult> = pbandk.MessageDescriptor(
            fullName = "common.RonResult",
            messageClass = org.yagi.motel.pantheon.api.RonResult::class,
            messageCompanion = this,
            fields = buildList(14) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round_index",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "roundIndex",
                        value = org.yagi.motel.pantheon.api.RonResult::roundIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "honba",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "honba",
                        value = org.yagi.motel.pantheon.api.RonResult::honba
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "winner_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "winnerId",
                        value = org.yagi.motel.pantheon.api.RonResult::winnerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "loser_id",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "loserId",
                        value = org.yagi.motel.pantheon.api.RonResult::loserId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "pao_player_id",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "paoPlayerId",
                        value = org.yagi.motel.pantheon.api.RonResult::paoPlayerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "han",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "han",
                        value = org.yagi.motel.pantheon.api.RonResult::han
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fu",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fu",
                        value = org.yagi.motel.pantheon.api.RonResult::fu
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "yaku",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "yaku",
                        value = org.yagi.motel.pantheon.api.RonResult::yaku
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_bets",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "riichiBets",
                        value = org.yagi.motel.pantheon.api.RonResult::riichiBets
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "dora",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "dora",
                        value = org.yagi.motel.pantheon.api.RonResult::dora
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uradora",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "uradora",
                        value = org.yagi.motel.pantheon.api.RonResult::uradora
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "kandora",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "kandora",
                        value = org.yagi.motel.pantheon.api.RonResult::kandora
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "kanuradora",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "kanuradora",
                        value = org.yagi.motel.pantheon.api.RonResult::kanuradora
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "open_hand",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "openHand",
                        value = org.yagi.motel.pantheon.api.RonResult::openHand
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class MultironWin(
    val winnerId: Int = 0,
    val paoPlayerId: Int = 0,
    val han: Int = 0,
    val fu: Int = 0,
    val yaku: List<Int> = emptyList(),
    val dora: Int = 0,
    val uradora: Int = 0,
    val kandora: Int = 0,
    val kanuradora: Int = 0,
    val openHand: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.MultironWin = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.MultironWin> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.MultironWin> {
        public val defaultInstance: org.yagi.motel.pantheon.api.MultironWin by lazy { org.yagi.motel.pantheon.api.MultironWin() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.MultironWin = org.yagi.motel.pantheon.api.MultironWin.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.MultironWin> = pbandk.MessageDescriptor(
            fullName = "common.MultironWin",
            messageClass = org.yagi.motel.pantheon.api.MultironWin::class,
            messageCompanion = this,
            fields = buildList(10) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "winner_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "winnerId",
                        value = org.yagi.motel.pantheon.api.MultironWin::winnerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "pao_player_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "paoPlayerId",
                        value = org.yagi.motel.pantheon.api.MultironWin::paoPlayerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "han",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "han",
                        value = org.yagi.motel.pantheon.api.MultironWin::han
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fu",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fu",
                        value = org.yagi.motel.pantheon.api.MultironWin::fu
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "yaku",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "yaku",
                        value = org.yagi.motel.pantheon.api.MultironWin::yaku
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "dora",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "dora",
                        value = org.yagi.motel.pantheon.api.MultironWin::dora
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uradora",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "uradora",
                        value = org.yagi.motel.pantheon.api.MultironWin::uradora
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "kandora",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "kandora",
                        value = org.yagi.motel.pantheon.api.MultironWin::kandora
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "kanuradora",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "kanuradora",
                        value = org.yagi.motel.pantheon.api.MultironWin::kanuradora
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "open_hand",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "openHand",
                        value = org.yagi.motel.pantheon.api.MultironWin::openHand
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class MultironResult(
    val roundIndex: Int = 0,
    val honba: Int = 0,
    val loserId: Int = 0,
    val multiRon: Int = 0,
    val wins: List<org.yagi.motel.pantheon.api.MultironWin> = emptyList(),
    val riichiBets: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.MultironResult = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.MultironResult> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.MultironResult> {
        public val defaultInstance: org.yagi.motel.pantheon.api.MultironResult by lazy { org.yagi.motel.pantheon.api.MultironResult() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.MultironResult = org.yagi.motel.pantheon.api.MultironResult.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.MultironResult> = pbandk.MessageDescriptor(
            fullName = "common.MultironResult",
            messageClass = org.yagi.motel.pantheon.api.MultironResult::class,
            messageCompanion = this,
            fields = buildList(6) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round_index",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "roundIndex",
                        value = org.yagi.motel.pantheon.api.MultironResult::roundIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "honba",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "honba",
                        value = org.yagi.motel.pantheon.api.MultironResult::honba
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "loser_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "loserId",
                        value = org.yagi.motel.pantheon.api.MultironResult::loserId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "multi_ron",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "multiRon",
                        value = org.yagi.motel.pantheon.api.MultironResult::multiRon
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "wins",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.MultironWin>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.MultironWin.Companion)),
                        jsonName = "wins",
                        value = org.yagi.motel.pantheon.api.MultironResult::wins
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_bets",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "riichiBets",
                        value = org.yagi.motel.pantheon.api.MultironResult::riichiBets
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class TsumoResult(
    val roundIndex: Int = 0,
    val honba: Int = 0,
    val winnerId: Int = 0,
    val paoPlayerId: Int = 0,
    val han: Int = 0,
    val fu: Int = 0,
    val yaku: List<Int> = emptyList(),
    val riichiBets: List<Int> = emptyList(),
    val dora: Int = 0,
    val uradora: Int = 0,
    val kandora: Int = 0,
    val kanuradora: Int = 0,
    val openHand: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.TsumoResult = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.TsumoResult> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.TsumoResult> {
        public val defaultInstance: org.yagi.motel.pantheon.api.TsumoResult by lazy { org.yagi.motel.pantheon.api.TsumoResult() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.TsumoResult = org.yagi.motel.pantheon.api.TsumoResult.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.TsumoResult> = pbandk.MessageDescriptor(
            fullName = "common.TsumoResult",
            messageClass = org.yagi.motel.pantheon.api.TsumoResult::class,
            messageCompanion = this,
            fields = buildList(13) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round_index",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "roundIndex",
                        value = org.yagi.motel.pantheon.api.TsumoResult::roundIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "honba",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "honba",
                        value = org.yagi.motel.pantheon.api.TsumoResult::honba
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "winner_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "winnerId",
                        value = org.yagi.motel.pantheon.api.TsumoResult::winnerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "pao_player_id",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "paoPlayerId",
                        value = org.yagi.motel.pantheon.api.TsumoResult::paoPlayerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "han",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "han",
                        value = org.yagi.motel.pantheon.api.TsumoResult::han
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fu",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fu",
                        value = org.yagi.motel.pantheon.api.TsumoResult::fu
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "yaku",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "yaku",
                        value = org.yagi.motel.pantheon.api.TsumoResult::yaku
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_bets",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "riichiBets",
                        value = org.yagi.motel.pantheon.api.TsumoResult::riichiBets
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "dora",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "dora",
                        value = org.yagi.motel.pantheon.api.TsumoResult::dora
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uradora",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "uradora",
                        value = org.yagi.motel.pantheon.api.TsumoResult::uradora
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "kandora",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "kandora",
                        value = org.yagi.motel.pantheon.api.TsumoResult::kandora
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "kanuradora",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "kanuradora",
                        value = org.yagi.motel.pantheon.api.TsumoResult::kanuradora
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "open_hand",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "openHand",
                        value = org.yagi.motel.pantheon.api.TsumoResult::openHand
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class DrawResult(
    val roundIndex: Int = 0,
    val honba: Int = 0,
    val riichiBets: List<Int> = emptyList(),
    val tempai: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.DrawResult = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.DrawResult> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.DrawResult> {
        public val defaultInstance: org.yagi.motel.pantheon.api.DrawResult by lazy { org.yagi.motel.pantheon.api.DrawResult() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.DrawResult = org.yagi.motel.pantheon.api.DrawResult.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.DrawResult> = pbandk.MessageDescriptor(
            fullName = "common.DrawResult",
            messageClass = org.yagi.motel.pantheon.api.DrawResult::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round_index",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "roundIndex",
                        value = org.yagi.motel.pantheon.api.DrawResult::roundIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "honba",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "honba",
                        value = org.yagi.motel.pantheon.api.DrawResult::honba
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_bets",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "riichiBets",
                        value = org.yagi.motel.pantheon.api.DrawResult::riichiBets
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tempai",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "tempai",
                        value = org.yagi.motel.pantheon.api.DrawResult::tempai
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AbortResult(
    val roundIndex: Int = 0,
    val honba: Int = 0,
    val riichiBets: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AbortResult = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AbortResult> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AbortResult> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AbortResult by lazy { org.yagi.motel.pantheon.api.AbortResult() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AbortResult = org.yagi.motel.pantheon.api.AbortResult.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AbortResult> = pbandk.MessageDescriptor(
            fullName = "common.AbortResult",
            messageClass = org.yagi.motel.pantheon.api.AbortResult::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round_index",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "roundIndex",
                        value = org.yagi.motel.pantheon.api.AbortResult::roundIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "honba",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "honba",
                        value = org.yagi.motel.pantheon.api.AbortResult::honba
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_bets",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "riichiBets",
                        value = org.yagi.motel.pantheon.api.AbortResult::riichiBets
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ChomboResult(
    val roundIndex: Int = 0,
    val honba: Int = 0,
    val loserId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.ChomboResult = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.ChomboResult> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.ChomboResult> {
        public val defaultInstance: org.yagi.motel.pantheon.api.ChomboResult by lazy { org.yagi.motel.pantheon.api.ChomboResult() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.ChomboResult = org.yagi.motel.pantheon.api.ChomboResult.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.ChomboResult> = pbandk.MessageDescriptor(
            fullName = "common.ChomboResult",
            messageClass = org.yagi.motel.pantheon.api.ChomboResult::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round_index",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "roundIndex",
                        value = org.yagi.motel.pantheon.api.ChomboResult::roundIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "honba",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "honba",
                        value = org.yagi.motel.pantheon.api.ChomboResult::honba
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "loser_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "loserId",
                        value = org.yagi.motel.pantheon.api.ChomboResult::loserId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class NagashiResult(
    val roundIndex: Int = 0,
    val honba: Int = 0,
    val riichiBets: List<Int> = emptyList(),
    val tempai: List<Int> = emptyList(),
    val nagashi: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.NagashiResult = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.NagashiResult> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.NagashiResult> {
        public val defaultInstance: org.yagi.motel.pantheon.api.NagashiResult by lazy { org.yagi.motel.pantheon.api.NagashiResult() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.NagashiResult = org.yagi.motel.pantheon.api.NagashiResult.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.NagashiResult> = pbandk.MessageDescriptor(
            fullName = "common.NagashiResult",
            messageClass = org.yagi.motel.pantheon.api.NagashiResult::class,
            messageCompanion = this,
            fields = buildList(5) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round_index",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "roundIndex",
                        value = org.yagi.motel.pantheon.api.NagashiResult::roundIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "honba",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "honba",
                        value = org.yagi.motel.pantheon.api.NagashiResult::honba
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_bets",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "riichiBets",
                        value = org.yagi.motel.pantheon.api.NagashiResult::riichiBets
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tempai",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "tempai",
                        value = org.yagi.motel.pantheon.api.NagashiResult::tempai
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nagashi",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "nagashi",
                        value = org.yagi.motel.pantheon.api.NagashiResult::nagashi
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Round(
    val outcome: Outcome<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Outcome<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Ron(ron: org.yagi.motel.pantheon.api.RonResult) : Outcome<org.yagi.motel.pantheon.api.RonResult>(ron)
        public class Tsumo(tsumo: org.yagi.motel.pantheon.api.TsumoResult) : Outcome<org.yagi.motel.pantheon.api.TsumoResult>(tsumo)
        public class Multiron(multiron: org.yagi.motel.pantheon.api.MultironResult) : Outcome<org.yagi.motel.pantheon.api.MultironResult>(multiron)
        public class Draw(draw: org.yagi.motel.pantheon.api.DrawResult) : Outcome<org.yagi.motel.pantheon.api.DrawResult>(draw)
        public class Abort(abort: org.yagi.motel.pantheon.api.AbortResult) : Outcome<org.yagi.motel.pantheon.api.AbortResult>(abort)
        public class Chombo(chombo: org.yagi.motel.pantheon.api.ChomboResult) : Outcome<org.yagi.motel.pantheon.api.ChomboResult>(chombo)
        public class Nagashi(nagashi: org.yagi.motel.pantheon.api.NagashiResult) : Outcome<org.yagi.motel.pantheon.api.NagashiResult>(nagashi)
    }

    val ron: org.yagi.motel.pantheon.api.RonResult?
        get() = (outcome as? Outcome.Ron)?.value
    val tsumo: org.yagi.motel.pantheon.api.TsumoResult?
        get() = (outcome as? Outcome.Tsumo)?.value
    val multiron: org.yagi.motel.pantheon.api.MultironResult?
        get() = (outcome as? Outcome.Multiron)?.value
    val draw: org.yagi.motel.pantheon.api.DrawResult?
        get() = (outcome as? Outcome.Draw)?.value
    val abort: org.yagi.motel.pantheon.api.AbortResult?
        get() = (outcome as? Outcome.Abort)?.value
    val chombo: org.yagi.motel.pantheon.api.ChomboResult?
        get() = (outcome as? Outcome.Chombo)?.value
    val nagashi: org.yagi.motel.pantheon.api.NagashiResult?
        get() = (outcome as? Outcome.Nagashi)?.value

    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.Round = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Round> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.Round> {
        public val defaultInstance: org.yagi.motel.pantheon.api.Round by lazy { org.yagi.motel.pantheon.api.Round() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.Round = org.yagi.motel.pantheon.api.Round.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Round> = pbandk.MessageDescriptor(
            fullName = "common.Round",
            messageClass = org.yagi.motel.pantheon.api.Round::class,
            messageCompanion = this,
            fields = buildList(7) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ron",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.RonResult.Companion),
                        oneofMember = true,
                        jsonName = "ron",
                        value = org.yagi.motel.pantheon.api.Round::ron
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tsumo",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.TsumoResult.Companion),
                        oneofMember = true,
                        jsonName = "tsumo",
                        value = org.yagi.motel.pantheon.api.Round::tsumo
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "multiron",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.MultironResult.Companion),
                        oneofMember = true,
                        jsonName = "multiron",
                        value = org.yagi.motel.pantheon.api.Round::multiron
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "draw",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.DrawResult.Companion),
                        oneofMember = true,
                        jsonName = "draw",
                        value = org.yagi.motel.pantheon.api.Round::draw
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "abort",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.AbortResult.Companion),
                        oneofMember = true,
                        jsonName = "abort",
                        value = org.yagi.motel.pantheon.api.Round::abort
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "chombo",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.ChomboResult.Companion),
                        oneofMember = true,
                        jsonName = "chombo",
                        value = org.yagi.motel.pantheon.api.Round::chombo
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nagashi",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.NagashiResult.Companion),
                        oneofMember = true,
                        jsonName = "nagashi",
                        value = org.yagi.motel.pantheon.api.Round::nagashi
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GameResult(
    val sessionHash: String = "",
    val replayLink: String = "",
    val players: List<Int> = emptyList(),
    val finalResults: List<org.yagi.motel.pantheon.api.FinalResultOfSession> = emptyList(),
    val rounds: List<org.yagi.motel.pantheon.api.Round> = emptyList(),
    val date: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GameResult = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GameResult> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GameResult> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GameResult by lazy { org.yagi.motel.pantheon.api.GameResult() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GameResult = org.yagi.motel.pantheon.api.GameResult.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GameResult> = pbandk.MessageDescriptor(
            fullName = "common.GameResult",
            messageClass = org.yagi.motel.pantheon.api.GameResult::class,
            messageCompanion = this,
            fields = buildList(6) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_hash",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "sessionHash",
                        value = org.yagi.motel.pantheon.api.GameResult::sessionHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "date",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "date",
                        value = org.yagi.motel.pantheon.api.GameResult::date
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "replay_link",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "replayLink",
                        value = org.yagi.motel.pantheon.api.GameResult::replayLink
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.GameResult::players
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "final_results",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.FinalResultOfSession>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.FinalResultOfSession.Companion)),
                        jsonName = "finalResults",
                        value = org.yagi.motel.pantheon.api.GameResult::finalResults
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rounds",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Round>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Round.Companion)),
                        jsonName = "rounds",
                        value = org.yagi.motel.pantheon.api.GameResult::rounds
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayerPlaceInSeries(
    val sessionHash: String = "",
    val place: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayerPlaceInSeries = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayerPlaceInSeries> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayerPlaceInSeries> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayerPlaceInSeries by lazy { org.yagi.motel.pantheon.api.PlayerPlaceInSeries() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayerPlaceInSeries = org.yagi.motel.pantheon.api.PlayerPlaceInSeries.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayerPlaceInSeries> = pbandk.MessageDescriptor(
            fullName = "common.PlayerPlaceInSeries",
            messageClass = org.yagi.motel.pantheon.api.PlayerPlaceInSeries::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_hash",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "sessionHash",
                        value = org.yagi.motel.pantheon.api.PlayerPlaceInSeries::sessionHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "place",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "place",
                        value = org.yagi.motel.pantheon.api.PlayerPlaceInSeries::place
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SeriesResult(
    val player: org.yagi.motel.pantheon.api.Player? = null,
    val bestSeries: List<org.yagi.motel.pantheon.api.PlayerPlaceInSeries> = emptyList(),
    val bestSeriesScores: Float = 0.0F,
    val bestSeriesPlaces: Int = 0,
    val bestSeriesAvgPlace: String = "",
    val currentSeries: List<org.yagi.motel.pantheon.api.PlayerPlaceInSeries> = emptyList(),
    val currentSeriesScores: Float = 0.0F,
    val currentSeriesPlaces: Int = 0,
    val currentSeriesAvgPlace: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.SeriesResult = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeriesResult> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.SeriesResult> {
        public val defaultInstance: org.yagi.motel.pantheon.api.SeriesResult by lazy { org.yagi.motel.pantheon.api.SeriesResult() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.SeriesResult = org.yagi.motel.pantheon.api.SeriesResult.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeriesResult> = pbandk.MessageDescriptor(
            fullName = "common.SeriesResult",
            messageClass = org.yagi.motel.pantheon.api.SeriesResult::class,
            messageCompanion = this,
            fields = buildList(9) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Player.Companion),
                        jsonName = "player",
                        value = org.yagi.motel.pantheon.api.SeriesResult::player
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "best_series",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PlayerPlaceInSeries>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PlayerPlaceInSeries.Companion)),
                        jsonName = "bestSeries",
                        value = org.yagi.motel.pantheon.api.SeriesResult::bestSeries
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "best_series_scores",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "bestSeriesScores",
                        value = org.yagi.motel.pantheon.api.SeriesResult::bestSeriesScores
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "best_series_places",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "bestSeriesPlaces",
                        value = org.yagi.motel.pantheon.api.SeriesResult::bestSeriesPlaces
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "best_series_avg_place",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "bestSeriesAvgPlace",
                        value = org.yagi.motel.pantheon.api.SeriesResult::bestSeriesAvgPlace
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "current_series",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PlayerPlaceInSeries>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PlayerPlaceInSeries.Companion)),
                        jsonName = "currentSeries",
                        value = org.yagi.motel.pantheon.api.SeriesResult::currentSeries
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "current_series_scores",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "currentSeriesScores",
                        value = org.yagi.motel.pantheon.api.SeriesResult::currentSeriesScores
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "current_series_places",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "currentSeriesPlaces",
                        value = org.yagi.motel.pantheon.api.SeriesResult::currentSeriesPlaces
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "current_series_avg_place",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "currentSeriesAvgPlace",
                        value = org.yagi.motel.pantheon.api.SeriesResult::currentSeriesAvgPlace
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ReplacementPlayer(
    val id: Int = 0,
    val title: String = "",
    val hasAvatar: Boolean = false,
    val lastUpdate: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.ReplacementPlayer = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.ReplacementPlayer> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.ReplacementPlayer> {
        public val defaultInstance: org.yagi.motel.pantheon.api.ReplacementPlayer by lazy { org.yagi.motel.pantheon.api.ReplacementPlayer() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.ReplacementPlayer = org.yagi.motel.pantheon.api.ReplacementPlayer.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.ReplacementPlayer> = pbandk.MessageDescriptor(
            fullName = "common.ReplacementPlayer",
            messageClass = org.yagi.motel.pantheon.api.ReplacementPlayer::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.ReplacementPlayer::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.ReplacementPlayer::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.ReplacementPlayer::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.ReplacementPlayer::lastUpdate
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayerInSession(
    val id: Int = 0,
    val title: String = "",
    val score: Int = 0,
    val ratingDelta: Float = 0.0F,
    val hasAvatar: Boolean = false,
    val lastUpdate: String = "",
    val yakitori: Boolean = false,
    val replacedBy: org.yagi.motel.pantheon.api.ReplacementPlayer? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayerInSession = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayerInSession> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayerInSession> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayerInSession by lazy { org.yagi.motel.pantheon.api.PlayerInSession() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayerInSession = org.yagi.motel.pantheon.api.PlayerInSession.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayerInSession> = pbandk.MessageDescriptor(
            fullName = "common.PlayerInSession",
            messageClass = org.yagi.motel.pantheon.api.PlayerInSession::class,
            messageCompanion = this,
            fields = buildList(8) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.PlayerInSession::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.PlayerInSession::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "score",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "score",
                        value = org.yagi.motel.pantheon.api.PlayerInSession::score
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "replaced_by",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.ReplacementPlayer.Companion),
                        jsonName = "replacedBy",
                        value = org.yagi.motel.pantheon.api.PlayerInSession::replacedBy
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rating_delta",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "ratingDelta",
                        value = org.yagi.motel.pantheon.api.PlayerInSession::ratingDelta
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.PlayerInSession::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.PlayerInSession::lastUpdate
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "yakitori",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "yakitori",
                        value = org.yagi.motel.pantheon.api.PlayerInSession::yakitori
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RegisteredPlayer(
    val id: Int = 0,
    val title: String = "",
    val tenhouId: String = "",
    val ignoreSeating: Boolean = false,
    val hasAvatar: Boolean = false,
    val lastUpdate: String = "",
    val localId: Int? = null,
    val teamName: String? = null,
    val replacedBy: org.yagi.motel.pantheon.api.ReplacementPlayer? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.RegisteredPlayer = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.RegisteredPlayer> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.RegisteredPlayer> {
        public val defaultInstance: org.yagi.motel.pantheon.api.RegisteredPlayer by lazy { org.yagi.motel.pantheon.api.RegisteredPlayer() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.RegisteredPlayer = org.yagi.motel.pantheon.api.RegisteredPlayer.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.RegisteredPlayer> = pbandk.MessageDescriptor(
            fullName = "common.RegisteredPlayer",
            messageClass = org.yagi.motel.pantheon.api.RegisteredPlayer::class,
            messageCompanion = this,
            fields = buildList(9) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.RegisteredPlayer::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.RegisteredPlayer::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "local_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "localId",
                        value = org.yagi.motel.pantheon.api.RegisteredPlayer::localId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "team_name",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "teamName",
                        value = org.yagi.motel.pantheon.api.RegisteredPlayer::teamName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenhou_id",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tenhouId",
                        value = org.yagi.motel.pantheon.api.RegisteredPlayer::tenhouId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ignore_seating",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ignoreSeating",
                        value = org.yagi.motel.pantheon.api.RegisteredPlayer::ignoreSeating
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "replaced_by",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.ReplacementPlayer.Companion),
                        jsonName = "replacedBy",
                        value = org.yagi.motel.pantheon.api.RegisteredPlayer::replacedBy
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.RegisteredPlayer::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.RegisteredPlayer::lastUpdate
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SessionHistoryResult(
    val sessionHash: String = "",
    val eventId: Int = 0,
    val playerId: Int = 0,
    val score: Int = 0,
    val ratingDelta: Float = 0.0F,
    val place: Int = 0,
    val title: String = "",
    val hasAvatar: Boolean = false,
    val lastUpdate: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.SessionHistoryResult = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SessionHistoryResult> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.SessionHistoryResult> {
        public val defaultInstance: org.yagi.motel.pantheon.api.SessionHistoryResult by lazy { org.yagi.motel.pantheon.api.SessionHistoryResult() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.SessionHistoryResult = org.yagi.motel.pantheon.api.SessionHistoryResult.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SessionHistoryResult> = pbandk.MessageDescriptor(
            fullName = "common.SessionHistoryResult",
            messageClass = org.yagi.motel.pantheon.api.SessionHistoryResult::class,
            messageCompanion = this,
            fields = buildList(9) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_hash",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "sessionHash",
                        value = org.yagi.motel.pantheon.api.SessionHistoryResult::sessionHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.SessionHistoryResult::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.SessionHistoryResult::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "score",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "score",
                        value = org.yagi.motel.pantheon.api.SessionHistoryResult::score
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rating_delta",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "ratingDelta",
                        value = org.yagi.motel.pantheon.api.SessionHistoryResult::ratingDelta
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "place",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "place",
                        value = org.yagi.motel.pantheon.api.SessionHistoryResult::place
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.SessionHistoryResult::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.SessionHistoryResult::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.SessionHistoryResult::lastUpdate
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SessionHistoryResultTable(
    val tables: List<org.yagi.motel.pantheon.api.SessionHistoryResult> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.SessionHistoryResultTable = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SessionHistoryResultTable> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.SessionHistoryResultTable> {
        public val defaultInstance: org.yagi.motel.pantheon.api.SessionHistoryResultTable by lazy { org.yagi.motel.pantheon.api.SessionHistoryResultTable() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.SessionHistoryResultTable = org.yagi.motel.pantheon.api.SessionHistoryResultTable.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SessionHistoryResultTable> = pbandk.MessageDescriptor(
            fullName = "common.SessionHistoryResultTable",
            messageClass = org.yagi.motel.pantheon.api.SessionHistoryResultTable::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tables",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.SessionHistoryResult>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.SessionHistoryResult.Companion)),
                        jsonName = "tables",
                        value = org.yagi.motel.pantheon.api.SessionHistoryResultTable::tables
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlacesSummaryItem(
    val place: Int = 0,
    val count: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlacesSummaryItem = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlacesSummaryItem> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlacesSummaryItem> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlacesSummaryItem by lazy { org.yagi.motel.pantheon.api.PlacesSummaryItem() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlacesSummaryItem = org.yagi.motel.pantheon.api.PlacesSummaryItem.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlacesSummaryItem> = pbandk.MessageDescriptor(
            fullName = "common.PlacesSummaryItem",
            messageClass = org.yagi.motel.pantheon.api.PlacesSummaryItem::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "place",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "place",
                        value = org.yagi.motel.pantheon.api.PlacesSummaryItem::place
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "count",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "count",
                        value = org.yagi.motel.pantheon.api.PlacesSummaryItem::count
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayerWinSummary(
    val ron: Int = 0,
    val tsumo: Int = 0,
    val chombo: Int = 0,
    val feed: Int = 0,
    val tsumofeed: Int = 0,
    val winsWithOpen: Int = 0,
    val winsWithRiichi: Int = 0,
    val winsWithDama: Int = 0,
    val unforcedFeedToOpen: Int = 0,
    val unforcedFeedToRiichi: Int = 0,
    val unforcedFeedToDama: Int = 0,
    val draw: Int = 0,
    val drawTempai: Int = 0,
    val pointsWon: Int = 0,
    val pointsLostRon: Int = 0,
    val pointsLostTsumo: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayerWinSummary = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayerWinSummary> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayerWinSummary> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayerWinSummary by lazy { org.yagi.motel.pantheon.api.PlayerWinSummary() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayerWinSummary = org.yagi.motel.pantheon.api.PlayerWinSummary.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayerWinSummary> = pbandk.MessageDescriptor(
            fullName = "common.PlayerWinSummary",
            messageClass = org.yagi.motel.pantheon.api.PlayerWinSummary::class,
            messageCompanion = this,
            fields = buildList(16) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ron",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "ron",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::ron
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tsumo",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "tsumo",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::tsumo
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "chombo",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "chombo",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::chombo
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "feed",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "feed",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::feed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tsumofeed",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "tsumofeed",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::tsumofeed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "wins_with_open",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "winsWithOpen",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::winsWithOpen
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "wins_with_riichi",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "winsWithRiichi",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::winsWithRiichi
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "wins_with_dama",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "winsWithDama",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::winsWithDama
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unforced_feed_to_open",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "unforcedFeedToOpen",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::unforcedFeedToOpen
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unforced_feed_to_riichi",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "unforcedFeedToRiichi",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::unforcedFeedToRiichi
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unforced_feed_to_dama",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "unforcedFeedToDama",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::unforcedFeedToDama
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "draw",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "draw",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::draw
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "draw_tempai",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "drawTempai",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::drawTempai
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "points_won",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "pointsWon",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::pointsWon
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "points_lost_ron",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "pointsLostRon",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::pointsLostRon
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "points_lost_tsumo",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "pointsLostTsumo",
                        value = org.yagi.motel.pantheon.api.PlayerWinSummary::pointsLostTsumo
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class HandValueStat(
    val hanCount: Int = 0,
    val count: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.HandValueStat = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.HandValueStat> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.HandValueStat> {
        public val defaultInstance: org.yagi.motel.pantheon.api.HandValueStat by lazy { org.yagi.motel.pantheon.api.HandValueStat() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.HandValueStat = org.yagi.motel.pantheon.api.HandValueStat.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.HandValueStat> = pbandk.MessageDescriptor(
            fullName = "common.HandValueStat",
            messageClass = org.yagi.motel.pantheon.api.HandValueStat::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "han_count",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "hanCount",
                        value = org.yagi.motel.pantheon.api.HandValueStat::hanCount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "count",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "count",
                        value = org.yagi.motel.pantheon.api.HandValueStat::count
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class YakuStat(
    val yakuId: Int = 0,
    val count: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.YakuStat = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.YakuStat> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.YakuStat> {
        public val defaultInstance: org.yagi.motel.pantheon.api.YakuStat by lazy { org.yagi.motel.pantheon.api.YakuStat() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.YakuStat = org.yagi.motel.pantheon.api.YakuStat.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.YakuStat> = pbandk.MessageDescriptor(
            fullName = "common.YakuStat",
            messageClass = org.yagi.motel.pantheon.api.YakuStat::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "yaku_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "yakuId",
                        value = org.yagi.motel.pantheon.api.YakuStat::yakuId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "count",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "count",
                        value = org.yagi.motel.pantheon.api.YakuStat::count
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RiichiSummary(
    val riichiWon: Int = 0,
    val riichiLost: Int = 0,
    val feedUnderRiichi: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.RiichiSummary = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.RiichiSummary> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.RiichiSummary> {
        public val defaultInstance: org.yagi.motel.pantheon.api.RiichiSummary by lazy { org.yagi.motel.pantheon.api.RiichiSummary() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.RiichiSummary = org.yagi.motel.pantheon.api.RiichiSummary.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.RiichiSummary> = pbandk.MessageDescriptor(
            fullName = "common.RiichiSummary",
            messageClass = org.yagi.motel.pantheon.api.RiichiSummary::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_won",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "riichiWon",
                        value = org.yagi.motel.pantheon.api.RiichiSummary::riichiWon
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_lost",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "riichiLost",
                        value = org.yagi.motel.pantheon.api.RiichiSummary::riichiLost
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "feed_under_riichi",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "feedUnderRiichi",
                        value = org.yagi.motel.pantheon.api.RiichiSummary::feedUnderRiichi
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class DoraSummary(
    val count: Int = 0,
    val average: Float = 0.0F,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.DoraSummary = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.DoraSummary> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.DoraSummary> {
        public val defaultInstance: org.yagi.motel.pantheon.api.DoraSummary by lazy { org.yagi.motel.pantheon.api.DoraSummary() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.DoraSummary = org.yagi.motel.pantheon.api.DoraSummary.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.DoraSummary> = pbandk.MessageDescriptor(
            fullName = "common.DoraSummary",
            messageClass = org.yagi.motel.pantheon.api.DoraSummary::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "count",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "count",
                        value = org.yagi.motel.pantheon.api.DoraSummary::count
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "average",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "average",
                        value = org.yagi.motel.pantheon.api.DoraSummary::average
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class IntermediateResultOfSession(
    val playerId: Int = 0,
    val score: Int = 0,
    val chomboCount: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.IntermediateResultOfSession = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.IntermediateResultOfSession> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.IntermediateResultOfSession> {
        public val defaultInstance: org.yagi.motel.pantheon.api.IntermediateResultOfSession by lazy { org.yagi.motel.pantheon.api.IntermediateResultOfSession() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.IntermediateResultOfSession = org.yagi.motel.pantheon.api.IntermediateResultOfSession.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.IntermediateResultOfSession> = pbandk.MessageDescriptor(
            fullName = "common.IntermediateResultOfSession",
            messageClass = org.yagi.motel.pantheon.api.IntermediateResultOfSession::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.IntermediateResultOfSession::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "score",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "score",
                        value = org.yagi.motel.pantheon.api.IntermediateResultOfSession::score
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "chombo_count",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "chomboCount",
                        value = org.yagi.motel.pantheon.api.IntermediateResultOfSession::chomboCount
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PaymentLogItem(
    val amount: Int = 0,
    val from: Int? = null,
    val to: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PaymentLogItem = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PaymentLogItem> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PaymentLogItem> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PaymentLogItem by lazy { org.yagi.motel.pantheon.api.PaymentLogItem() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PaymentLogItem = org.yagi.motel.pantheon.api.PaymentLogItem.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PaymentLogItem> = pbandk.MessageDescriptor(
            fullName = "common.PaymentLogItem",
            messageClass = org.yagi.motel.pantheon.api.PaymentLogItem::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "from",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "from",
                        value = org.yagi.motel.pantheon.api.PaymentLogItem::from
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "to",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "to",
                        value = org.yagi.motel.pantheon.api.PaymentLogItem::to
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "amount",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "amount",
                        value = org.yagi.motel.pantheon.api.PaymentLogItem::amount
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PaymentLog(
    val direct: List<org.yagi.motel.pantheon.api.PaymentLogItem> = emptyList(),
    val riichi: List<org.yagi.motel.pantheon.api.PaymentLogItem> = emptyList(),
    val honba: List<org.yagi.motel.pantheon.api.PaymentLogItem> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PaymentLog = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PaymentLog> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PaymentLog> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PaymentLog by lazy { org.yagi.motel.pantheon.api.PaymentLog() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PaymentLog = org.yagi.motel.pantheon.api.PaymentLog.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PaymentLog> = pbandk.MessageDescriptor(
            fullName = "common.PaymentLog",
            messageClass = org.yagi.motel.pantheon.api.PaymentLog::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "direct",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PaymentLogItem>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PaymentLogItem.Companion)),
                        jsonName = "direct",
                        value = org.yagi.motel.pantheon.api.PaymentLog::direct
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PaymentLogItem>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PaymentLogItem.Companion)),
                        jsonName = "riichi",
                        value = org.yagi.motel.pantheon.api.PaymentLog::riichi
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "honba",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PaymentLogItem>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PaymentLogItem.Companion)),
                        jsonName = "honba",
                        value = org.yagi.motel.pantheon.api.PaymentLog::honba
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RoundState(
    val sessionHash: String = "",
    val dealer: Int = 0,
    val roundIndex: Int = 0,
    val riichi: Int = 0,
    val honba: Int = 0,
    val riichiIds: List<Int> = emptyList(),
    val scores: List<org.yagi.motel.pantheon.api.IntermediateResultOfSession> = emptyList(),
    val scoresDelta: List<org.yagi.motel.pantheon.api.IntermediateResultOfSession> = emptyList(),
    val payments: org.yagi.motel.pantheon.api.PaymentLog? = null,
    val round: org.yagi.motel.pantheon.api.Round? = null,
    val outcome: org.yagi.motel.pantheon.api.RoundOutcome = org.yagi.motel.pantheon.api.RoundOutcome.fromValue(0),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.RoundState = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.RoundState> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.RoundState> {
        public val defaultInstance: org.yagi.motel.pantheon.api.RoundState by lazy { org.yagi.motel.pantheon.api.RoundState() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.RoundState = org.yagi.motel.pantheon.api.RoundState.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.RoundState> = pbandk.MessageDescriptor(
            fullName = "common.RoundState",
            messageClass = org.yagi.motel.pantheon.api.RoundState::class,
            messageCompanion = this,
            fields = buildList(11) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_hash",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "sessionHash",
                        value = org.yagi.motel.pantheon.api.RoundState::sessionHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "dealer",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "dealer",
                        value = org.yagi.motel.pantheon.api.RoundState::dealer
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round_index",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "roundIndex",
                        value = org.yagi.motel.pantheon.api.RoundState::roundIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "riichi",
                        value = org.yagi.motel.pantheon.api.RoundState::riichi
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "honba",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "honba",
                        value = org.yagi.motel.pantheon.api.RoundState::honba
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_ids",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "riichiIds",
                        value = org.yagi.motel.pantheon.api.RoundState::riichiIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scores",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.IntermediateResultOfSession>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.IntermediateResultOfSession.Companion)),
                        jsonName = "scores",
                        value = org.yagi.motel.pantheon.api.RoundState::scores
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scores_delta",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.IntermediateResultOfSession>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.IntermediateResultOfSession.Companion)),
                        jsonName = "scoresDelta",
                        value = org.yagi.motel.pantheon.api.RoundState::scoresDelta
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "payments",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PaymentLog.Companion),
                        jsonName = "payments",
                        value = org.yagi.motel.pantheon.api.RoundState::payments
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Round.Companion),
                        jsonName = "round",
                        value = org.yagi.motel.pantheon.api.RoundState::round
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "outcome",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.yagi.motel.pantheon.api.RoundOutcome.Companion),
                        jsonName = "outcome",
                        value = org.yagi.motel.pantheon.api.RoundState::outcome
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventData(
    val title: String = "",
    val description: String = "",
    val duration: Int = 0,
    val timezone: String = "",
    val lobbyId: Int = 0,
    val seriesLength: Int = 0,
    val minGames: Int = 0,
    val isTeam: Boolean = false,
    val isPrescripted: Boolean = false,
    val autostart: Int = 0,
    val rulesetConfig: org.yagi.motel.pantheon.api.RulesetConfig? = null,
    val isListed: Boolean = false,
    val isRatingShown: Boolean = false,
    val achievementsShown: Boolean = false,
    val allowViewOtherTables: Boolean = false,
    val platformId: org.yagi.motel.pantheon.api.PlatformType = org.yagi.motel.pantheon.api.PlatformType.fromValue(0),
    val type: org.yagi.motel.pantheon.api.EventType? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventData = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventData> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventData> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventData by lazy { org.yagi.motel.pantheon.api.EventData() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventData = org.yagi.motel.pantheon.api.EventData.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventData> = pbandk.MessageDescriptor(
            fullName = "common.EventData",
            messageClass = org.yagi.motel.pantheon.api.EventData::class,
            messageCompanion = this,
            fields = buildList(17) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.yagi.motel.pantheon.api.EventType.Companion, hasPresence = true),
                        jsonName = "type",
                        value = org.yagi.motel.pantheon.api.EventData::type
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.EventData::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "description",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "description",
                        value = org.yagi.motel.pantheon.api.EventData::description
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "duration",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "duration",
                        value = org.yagi.motel.pantheon.api.EventData::duration
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timezone",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "timezone",
                        value = org.yagi.motel.pantheon.api.EventData::timezone
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lobby_id",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "lobbyId",
                        value = org.yagi.motel.pantheon.api.EventData::lobbyId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "series_length",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "seriesLength",
                        value = org.yagi.motel.pantheon.api.EventData::seriesLength
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_games",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "minGames",
                        value = org.yagi.motel.pantheon.api.EventData::minGames
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_team",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isTeam",
                        value = org.yagi.motel.pantheon.api.EventData::isTeam
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_prescripted",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isPrescripted",
                        value = org.yagi.motel.pantheon.api.EventData::isPrescripted
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "autostart",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "autostart",
                        value = org.yagi.motel.pantheon.api.EventData::autostart
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ruleset_config",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.RulesetConfig.Companion),
                        jsonName = "rulesetConfig",
                        value = org.yagi.motel.pantheon.api.EventData::rulesetConfig
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_listed",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isListed",
                        value = org.yagi.motel.pantheon.api.EventData::isListed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_rating_shown",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isRatingShown",
                        value = org.yagi.motel.pantheon.api.EventData::isRatingShown
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "achievements_shown",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "achievementsShown",
                        value = org.yagi.motel.pantheon.api.EventData::achievementsShown
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "allow_view_other_tables",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "allowViewOtherTables",
                        value = org.yagi.motel.pantheon.api.EventData::allowViewOtherTables
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "platform_id",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.yagi.motel.pantheon.api.PlatformType.Companion),
                        jsonName = "platformId",
                        value = org.yagi.motel.pantheon.api.EventData::platformId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class TableState(
    val status: org.yagi.motel.pantheon.api.SessionStatus = org.yagi.motel.pantheon.api.SessionStatus.fromValue(0),
    val mayDefinalize: Boolean = false,
    val sessionHash: String = "",
    val currentRoundIndex: Int = 0,
    val scores: List<org.yagi.motel.pantheon.api.IntermediateResultOfSession> = emptyList(),
    val players: List<org.yagi.motel.pantheon.api.RegisteredPlayer> = emptyList(),
    val tableIndex: Int? = null,
    val lastRound: org.yagi.motel.pantheon.api.Round? = null,
    val extraTime: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.TableState = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.TableState> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.TableState> {
        public val defaultInstance: org.yagi.motel.pantheon.api.TableState by lazy { org.yagi.motel.pantheon.api.TableState() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.TableState = org.yagi.motel.pantheon.api.TableState.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.TableState> = pbandk.MessageDescriptor(
            fullName = "common.TableState",
            messageClass = org.yagi.motel.pantheon.api.TableState::class,
            messageCompanion = this,
            fields = buildList(9) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "status",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.yagi.motel.pantheon.api.SessionStatus.Companion),
                        jsonName = "status",
                        value = org.yagi.motel.pantheon.api.TableState::status
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "may_definalize",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "mayDefinalize",
                        value = org.yagi.motel.pantheon.api.TableState::mayDefinalize
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_hash",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "sessionHash",
                        value = org.yagi.motel.pantheon.api.TableState::sessionHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "table_index",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "tableIndex",
                        value = org.yagi.motel.pantheon.api.TableState::tableIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_round",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Round.Companion),
                        jsonName = "lastRound",
                        value = org.yagi.motel.pantheon.api.TableState::lastRound
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "current_round_index",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "currentRoundIndex",
                        value = org.yagi.motel.pantheon.api.TableState::currentRoundIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scores",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.IntermediateResultOfSession>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.IntermediateResultOfSession.Companion)),
                        jsonName = "scores",
                        value = org.yagi.motel.pantheon.api.TableState::scores
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.RegisteredPlayer>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.RegisteredPlayer.Companion)),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.TableState::players
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extra_time",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "extraTime",
                        value = org.yagi.motel.pantheon.api.TableState::extraTime
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Achievement(
    val achievementId: String = "",
    val achievementData: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.Achievement = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Achievement> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.Achievement> {
        public val defaultInstance: org.yagi.motel.pantheon.api.Achievement by lazy { org.yagi.motel.pantheon.api.Achievement() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.Achievement = org.yagi.motel.pantheon.api.Achievement.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Achievement> = pbandk.MessageDescriptor(
            fullName = "common.Achievement",
            messageClass = org.yagi.motel.pantheon.api.Achievement::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "achievement_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "achievementId",
                        value = org.yagi.motel.pantheon.api.Achievement::achievementId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "achievement_data",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "achievementData",
                        value = org.yagi.motel.pantheon.api.Achievement::achievementData
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class LocalIdMapping(
    val playerId: Int = 0,
    val localId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.LocalIdMapping = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.LocalIdMapping> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.LocalIdMapping> {
        public val defaultInstance: org.yagi.motel.pantheon.api.LocalIdMapping by lazy { org.yagi.motel.pantheon.api.LocalIdMapping() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.LocalIdMapping = org.yagi.motel.pantheon.api.LocalIdMapping.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.LocalIdMapping> = pbandk.MessageDescriptor(
            fullName = "common.LocalIdMapping",
            messageClass = org.yagi.motel.pantheon.api.LocalIdMapping::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.LocalIdMapping::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "local_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "localId",
                        value = org.yagi.motel.pantheon.api.LocalIdMapping::localId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class TeamMapping(
    val playerId: Int = 0,
    val teamName: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.TeamMapping = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.TeamMapping> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.TeamMapping> {
        public val defaultInstance: org.yagi.motel.pantheon.api.TeamMapping by lazy { org.yagi.motel.pantheon.api.TeamMapping() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.TeamMapping = org.yagi.motel.pantheon.api.TeamMapping.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.TeamMapping> = pbandk.MessageDescriptor(
            fullName = "common.TeamMapping",
            messageClass = org.yagi.motel.pantheon.api.TeamMapping::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.TeamMapping::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "team_name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "teamName",
                        value = org.yagi.motel.pantheon.api.TeamMapping::teamName
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayerSeating(
    val order: Int = 0,
    val playerId: Int = 0,
    val sessionId: Int = 0,
    val tableIndex: Int = 0,
    val rating: Float = 0.0F,
    val playerTitle: String = "",
    val hasAvatar: Boolean = false,
    val lastUpdate: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayerSeating = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayerSeating> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayerSeating> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayerSeating by lazy { org.yagi.motel.pantheon.api.PlayerSeating() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayerSeating = org.yagi.motel.pantheon.api.PlayerSeating.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayerSeating> = pbandk.MessageDescriptor(
            fullName = "common.PlayerSeating",
            messageClass = org.yagi.motel.pantheon.api.PlayerSeating::class,
            messageCompanion = this,
            fields = buildList(8) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "order",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "order",
                        value = org.yagi.motel.pantheon.api.PlayerSeating::order
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.PlayerSeating::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "sessionId",
                        value = org.yagi.motel.pantheon.api.PlayerSeating::sessionId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "table_index",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "tableIndex",
                        value = org.yagi.motel.pantheon.api.PlayerSeating::tableIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rating",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "rating",
                        value = org.yagi.motel.pantheon.api.PlayerSeating::rating
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_title",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "playerTitle",
                        value = org.yagi.motel.pantheon.api.PlayerSeating::playerTitle
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.PlayerSeating::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.PlayerSeating::lastUpdate
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayerSeatingSwiss(
    val playerId: Int = 0,
    val rating: Float = 0.0F,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayerSeatingSwiss = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayerSeatingSwiss> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayerSeatingSwiss> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayerSeatingSwiss by lazy { org.yagi.motel.pantheon.api.PlayerSeatingSwiss() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayerSeatingSwiss = org.yagi.motel.pantheon.api.PlayerSeatingSwiss.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayerSeatingSwiss> = pbandk.MessageDescriptor(
            fullName = "common.PlayerSeatingSwiss",
            messageClass = org.yagi.motel.pantheon.api.PlayerSeatingSwiss::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.PlayerSeatingSwiss::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rating",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "rating",
                        value = org.yagi.motel.pantheon.api.PlayerSeatingSwiss::rating
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class TableItemSwiss(
    val players: List<org.yagi.motel.pantheon.api.PlayerSeatingSwiss> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.TableItemSwiss = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.TableItemSwiss> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.TableItemSwiss> {
        public val defaultInstance: org.yagi.motel.pantheon.api.TableItemSwiss by lazy { org.yagi.motel.pantheon.api.TableItemSwiss() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.TableItemSwiss = org.yagi.motel.pantheon.api.TableItemSwiss.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.TableItemSwiss> = pbandk.MessageDescriptor(
            fullName = "common.TableItemSwiss",
            messageClass = org.yagi.motel.pantheon.api.TableItemSwiss::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PlayerSeatingSwiss>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PlayerSeatingSwiss.Companion)),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.TableItemSwiss::players
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PrescriptedTable(
    val players: List<org.yagi.motel.pantheon.api.RegisteredPlayer> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PrescriptedTable = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PrescriptedTable> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PrescriptedTable> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PrescriptedTable by lazy { org.yagi.motel.pantheon.api.PrescriptedTable() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PrescriptedTable = org.yagi.motel.pantheon.api.PrescriptedTable.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PrescriptedTable> = pbandk.MessageDescriptor(
            fullName = "common.PrescriptedTable",
            messageClass = org.yagi.motel.pantheon.api.PrescriptedTable::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.RegisteredPlayer>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.RegisteredPlayer.Companion)),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.PrescriptedTable::players
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Chombo(
    val playerId: Int = 0,
    val amount: Float = 0.0F,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.Chombo = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Chombo> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.Chombo> {
        public val defaultInstance: org.yagi.motel.pantheon.api.Chombo by lazy { org.yagi.motel.pantheon.api.Chombo() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.Chombo = org.yagi.motel.pantheon.api.Chombo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Chombo> = pbandk.MessageDescriptor(
            fullName = "common.Chombo",
            messageClass = org.yagi.motel.pantheon.api.Chombo::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.Chombo::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "amount",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "amount",
                        value = org.yagi.motel.pantheon.api.Chombo::amount
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SessionState(
    val dealer: Int = 0,
    val roundIndex: Int = 0,
    val riichiCount: Int = 0,
    val honbaCount: Int = 0,
    val scores: List<org.yagi.motel.pantheon.api.IntermediateResultOfSession> = emptyList(),
    val finished: Boolean = false,
    val lastHandStarted: Boolean = false,
    val chombo: List<org.yagi.motel.pantheon.api.Chombo> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.SessionState = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SessionState> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.SessionState> {
        public val defaultInstance: org.yagi.motel.pantheon.api.SessionState by lazy { org.yagi.motel.pantheon.api.SessionState() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.SessionState = org.yagi.motel.pantheon.api.SessionState.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SessionState> = pbandk.MessageDescriptor(
            fullName = "common.SessionState",
            messageClass = org.yagi.motel.pantheon.api.SessionState::class,
            messageCompanion = this,
            fields = buildList(8) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "dealer",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "dealer",
                        value = org.yagi.motel.pantheon.api.SessionState::dealer
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round_index",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "roundIndex",
                        value = org.yagi.motel.pantheon.api.SessionState::roundIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_count",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "riichiCount",
                        value = org.yagi.motel.pantheon.api.SessionState::riichiCount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "honba_count",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "honbaCount",
                        value = org.yagi.motel.pantheon.api.SessionState::honbaCount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scores",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.IntermediateResultOfSession>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.IntermediateResultOfSession.Companion)),
                        jsonName = "scores",
                        value = org.yagi.motel.pantheon.api.SessionState::scores
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "finished",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "finished",
                        value = org.yagi.motel.pantheon.api.SessionState::finished
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_hand_started",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "lastHandStarted",
                        value = org.yagi.motel.pantheon.api.SessionState::lastHandStarted
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "chombo",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Chombo>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Chombo.Companion)),
                        jsonName = "chombo",
                        value = org.yagi.motel.pantheon.api.SessionState::chombo
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Uma(
    val place1: Int = 0,
    val place2: Int = 0,
    val place3: Int = 0,
    val place4: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.Uma = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Uma> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.Uma> {
        public val defaultInstance: org.yagi.motel.pantheon.api.Uma by lazy { org.yagi.motel.pantheon.api.Uma() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.Uma = org.yagi.motel.pantheon.api.Uma.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.Uma> = pbandk.MessageDescriptor(
            fullName = "common.Uma",
            messageClass = org.yagi.motel.pantheon.api.Uma::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "place1",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "place1",
                        value = org.yagi.motel.pantheon.api.Uma::place1
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "place2",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "place2",
                        value = org.yagi.motel.pantheon.api.Uma::place2
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "place3",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "place3",
                        value = org.yagi.motel.pantheon.api.Uma::place3
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "place4",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "place4",
                        value = org.yagi.motel.pantheon.api.Uma::place4
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ComplexUma(
    val neg1: org.yagi.motel.pantheon.api.Uma? = null,
    val neg3: org.yagi.motel.pantheon.api.Uma? = null,
    val otherwise: org.yagi.motel.pantheon.api.Uma? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.ComplexUma = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.ComplexUma> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.ComplexUma> {
        public val defaultInstance: org.yagi.motel.pantheon.api.ComplexUma by lazy { org.yagi.motel.pantheon.api.ComplexUma() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.ComplexUma = org.yagi.motel.pantheon.api.ComplexUma.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.ComplexUma> = pbandk.MessageDescriptor(
            fullName = "common.ComplexUma",
            messageClass = org.yagi.motel.pantheon.api.ComplexUma::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "neg1",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Uma.Companion),
                        jsonName = "neg1",
                        value = org.yagi.motel.pantheon.api.ComplexUma::neg1
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "neg3",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Uma.Companion),
                        jsonName = "neg3",
                        value = org.yagi.motel.pantheon.api.ComplexUma::neg3
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "otherwise",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Uma.Companion),
                        jsonName = "otherwise",
                        value = org.yagi.motel.pantheon.api.ComplexUma::otherwise
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RulesetConfig(
    val complexUma: org.yagi.motel.pantheon.api.ComplexUma? = null,
    val endingPolicy: org.yagi.motel.pantheon.api.EndingPolicy = org.yagi.motel.pantheon.api.EndingPolicy.fromValue(0),
    val uma: org.yagi.motel.pantheon.api.Uma? = null,
    val umaType: org.yagi.motel.pantheon.api.UmaType = org.yagi.motel.pantheon.api.UmaType.fromValue(0),
    val doubleronHonbaAtamahane: Boolean = false,
    val doubleronRiichiAtamahane: Boolean = false,
    val equalizeUma: Boolean = false,
    val extraChomboPayments: Boolean = false,
    val playAdditionalRounds: Boolean = false,
    val riichiGoesToWinner: Boolean = false,
    val tonpuusen: Boolean = false,
    val withAbortives: Boolean = false,
    val withAtamahane: Boolean = false,
    val withButtobi: Boolean = false,
    val withKazoe: Boolean = false,
    val withKiriageMangan: Boolean = false,
    val withKuitan: Boolean = false,
    val withLeadingDealerGameOver: Boolean = false,
    val withMultiYakumans: Boolean = false,
    val withNagashiMangan: Boolean = false,
    val withWinningDealerHonbaSkipped: Boolean = false,
    val chipsValue: Int = 0,
    val chomboAmount: Int = 0,
    val gameExpirationTime: Int = 0,
    val goalPoints: Int = 0,
    val maxPenalty: Int = 0,
    val minPenalty: Int = 0,
    val oka: Int = 0,
    val penaltyStep: Int = 0,
    val replacementPlayerFixedPoints: Int = 0,
    val replacementPlayerOverrideUma: Int = 0,
    val startPoints: Int = 0,
    val startRating: Int = 0,
    val allowedYaku: List<Int> = emptyList(),
    val yakuWithPao: List<Int> = emptyList(),
    val withYakitori: Boolean = false,
    val yakitoriPenalty: Int = 0,
    val chomboEndsGame: Boolean = false,
    val honbaValue: Int = 0,
    val doubleYakuman: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.RulesetConfig = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.RulesetConfig> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.RulesetConfig> {
        public val defaultInstance: org.yagi.motel.pantheon.api.RulesetConfig by lazy { org.yagi.motel.pantheon.api.RulesetConfig() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.RulesetConfig = org.yagi.motel.pantheon.api.RulesetConfig.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.RulesetConfig> = pbandk.MessageDescriptor(
            fullName = "common.RulesetConfig",
            messageClass = org.yagi.motel.pantheon.api.RulesetConfig::class,
            messageCompanion = this,
            fields = buildList(40) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "complex_uma",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.ComplexUma.Companion),
                        jsonName = "complexUma",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::complexUma
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ending_policy",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.yagi.motel.pantheon.api.EndingPolicy.Companion),
                        jsonName = "endingPolicy",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::endingPolicy
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uma",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Uma.Companion),
                        jsonName = "uma",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::uma
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uma_type",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.yagi.motel.pantheon.api.UmaType.Companion),
                        jsonName = "umaType",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::umaType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "doubleron_honba_atamahane",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "doubleronHonbaAtamahane",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::doubleronHonbaAtamahane
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "doubleron_riichi_atamahane",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "doubleronRiichiAtamahane",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::doubleronRiichiAtamahane
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "equalize_uma",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "equalizeUma",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::equalizeUma
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extra_chombo_payments",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "extraChomboPayments",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::extraChomboPayments
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "play_additional_rounds",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "playAdditionalRounds",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::playAdditionalRounds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_goes_to_winner",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "riichiGoesToWinner",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::riichiGoesToWinner
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tonpuusen",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "tonpuusen",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::tonpuusen
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_abortives",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withAbortives",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::withAbortives
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_atamahane",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withAtamahane",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::withAtamahane
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_buttobi",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withButtobi",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::withButtobi
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_kazoe",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withKazoe",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::withKazoe
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_kiriage_mangan",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withKiriageMangan",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::withKiriageMangan
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_kuitan",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withKuitan",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::withKuitan
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_leading_dealer_game_over",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withLeadingDealerGameOver",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::withLeadingDealerGameOver
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_multi_yakumans",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withMultiYakumans",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::withMultiYakumans
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_nagashi_mangan",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withNagashiMangan",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::withNagashiMangan
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_winning_dealer_honba_skipped",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withWinningDealerHonbaSkipped",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::withWinningDealerHonbaSkipped
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "chips_value",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "chipsValue",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::chipsValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "chombo_amount",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "chomboAmount",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::chomboAmount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "game_expiration_time",
                        number = 24,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "gameExpirationTime",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::gameExpirationTime
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "goal_points",
                        number = 25,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "goalPoints",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::goalPoints
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_penalty",
                        number = 26,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "maxPenalty",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::maxPenalty
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_penalty",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "minPenalty",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::minPenalty
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oka",
                        number = 28,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "oka",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::oka
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "penalty_step",
                        number = 29,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "penaltyStep",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::penaltyStep
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "replacement_player_fixed_points",
                        number = 30,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "replacementPlayerFixedPoints",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::replacementPlayerFixedPoints
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "replacement_player_override_uma",
                        number = 31,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "replacementPlayerOverrideUma",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::replacementPlayerOverrideUma
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "start_points",
                        number = 32,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "startPoints",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::startPoints
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "start_rating",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "startRating",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::startRating
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "allowed_yaku",
                        number = 34,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "allowedYaku",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::allowedYaku
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "yaku_with_pao",
                        number = 35,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "yakuWithPao",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::yakuWithPao
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "with_yakitori",
                        number = 36,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "withYakitori",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::withYakitori
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "yakitori_penalty",
                        number = 37,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "yakitoriPenalty",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::yakitoriPenalty
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "chombo_ends_game",
                        number = 38,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "chomboEndsGame",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::chomboEndsGame
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "honba_value",
                        number = 39,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "honbaValue",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::honbaValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "double_yakuman",
                        number = 40,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "doubleYakuman",
                        value = org.yagi.motel.pantheon.api.RulesetConfig::doubleYakuman
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class MajsoulSearchEx(
    val nickname: String = "",
    val accountId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.MajsoulSearchEx = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.MajsoulSearchEx> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.MajsoulSearchEx> {
        public val defaultInstance: org.yagi.motel.pantheon.api.MajsoulSearchEx by lazy { org.yagi.motel.pantheon.api.MajsoulSearchEx() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.MajsoulSearchEx = org.yagi.motel.pantheon.api.MajsoulSearchEx.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.MajsoulSearchEx> = pbandk.MessageDescriptor(
            fullName = "common.MajsoulSearchEx",
            messageClass = org.yagi.motel.pantheon.api.MajsoulSearchEx::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nickname",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "nickname",
                        value = org.yagi.motel.pantheon.api.MajsoulSearchEx::nickname
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "account_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "accountId",
                        value = org.yagi.motel.pantheon.api.MajsoulSearchEx::accountId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class MajsoulPersonMapping(
    val personId: Int = 0,
    val nickname: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.MajsoulPersonMapping = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.MajsoulPersonMapping> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.MajsoulPersonMapping> {
        public val defaultInstance: org.yagi.motel.pantheon.api.MajsoulPersonMapping by lazy { org.yagi.motel.pantheon.api.MajsoulPersonMapping() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.MajsoulPersonMapping = org.yagi.motel.pantheon.api.MajsoulPersonMapping.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.MajsoulPersonMapping> = pbandk.MessageDescriptor(
            fullName = "common.MajsoulPersonMapping",
            messageClass = org.yagi.motel.pantheon.api.MajsoulPersonMapping::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.MajsoulPersonMapping::personId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nickname",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "nickname",
                        value = org.yagi.motel.pantheon.api.MajsoulPersonMapping::nickname
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GenericSuccessResponse(
    val success: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GenericSuccessResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GenericSuccessResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GenericSuccessResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GenericSuccessResponse by lazy { org.yagi.motel.pantheon.api.GenericSuccessResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GenericSuccessResponse = org.yagi.motel.pantheon.api.GenericSuccessResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GenericSuccessResponse> = pbandk.MessageDescriptor(
            fullName = "common.GenericSuccessResponse",
            messageClass = org.yagi.motel.pantheon.api.GenericSuccessResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "success",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "success",
                        value = org.yagi.motel.pantheon.api.GenericSuccessResponse::success
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GenericEventPayload(
    val eventId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GenericEventPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GenericEventPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GenericEventPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GenericEventPayload by lazy { org.yagi.motel.pantheon.api.GenericEventPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GenericEventPayload = org.yagi.motel.pantheon.api.GenericEventPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GenericEventPayload> = pbandk.MessageDescriptor(
            fullName = "common.GenericEventPayload",
            messageClass = org.yagi.motel.pantheon.api.GenericEventPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.GenericEventPayload::eventId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GenericSessionPayload(
    val sessionHash: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GenericSessionPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GenericSessionPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GenericSessionPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GenericSessionPayload by lazy { org.yagi.motel.pantheon.api.GenericSessionPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GenericSessionPayload = org.yagi.motel.pantheon.api.GenericSessionPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GenericSessionPayload> = pbandk.MessageDescriptor(
            fullName = "common.GenericSessionPayload",
            messageClass = org.yagi.motel.pantheon.api.GenericSessionPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_hash",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "sessionHash",
                        value = org.yagi.motel.pantheon.api.GenericSessionPayload::sessionHash
                    )
                )
            }
        )
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventAdmin")
public fun EventAdmin?.orDefault(): org.yagi.motel.pantheon.api.EventAdmin = this ?: EventAdmin.defaultInstance

private fun EventAdmin.protoMergeImpl(plus: pbandk.Message?): EventAdmin = (plus as? EventAdmin)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventAdmin.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventAdmin {
    var ruleId = 0
    var personId = 0
    var personName = ""
    var hasAvatar = false
    var lastUpdate = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ruleId = _fieldValue as Int
            2 -> personId = _fieldValue as Int
            3 -> personName = _fieldValue as String
            4 -> hasAvatar = _fieldValue as Boolean
            5 -> lastUpdate = _fieldValue as String
        }
    }

    return EventAdmin(ruleId, personId, personName, hasAvatar,
        lastUpdate, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventReferee")
public fun EventReferee?.orDefault(): org.yagi.motel.pantheon.api.EventReferee = this ?: EventReferee.defaultInstance

private fun EventReferee.protoMergeImpl(plus: pbandk.Message?): EventReferee = (plus as? EventReferee)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventReferee.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventReferee {
    var ruleId = 0
    var personId = 0
    var personName = ""
    var hasAvatar = false
    var lastUpdate = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ruleId = _fieldValue as Int
            2 -> personId = _fieldValue as Int
            3 -> personName = _fieldValue as String
            4 -> hasAvatar = _fieldValue as Boolean
            5 -> lastUpdate = _fieldValue as String
        }
    }

    return EventReferee(ruleId, personId, personName, hasAvatar,
        lastUpdate, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPerson")
public fun Person?.orDefault(): org.yagi.motel.pantheon.api.Person = this ?: Person.defaultInstance

private fun Person.protoMergeImpl(plus: pbandk.Message?): Person = (plus as? Person)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Person.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Person {
    var id = 0
    var city = ""
    var tenhouId = ""
    var title = ""
    var hasAvatar = false
    var lastUpdate = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> city = _fieldValue as String
            3 -> tenhouId = _fieldValue as String
            4 -> title = _fieldValue as String
            5 -> hasAvatar = _fieldValue as Boolean
            6 -> lastUpdate = _fieldValue as String
        }
    }

    return Person(id, city, tenhouId, title,
        hasAvatar, lastUpdate, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonEx")
public fun PersonEx?.orDefault(): org.yagi.motel.pantheon.api.PersonEx = this ?: PersonEx.defaultInstance

private fun PersonEx.protoMergeImpl(plus: pbandk.Message?): PersonEx = (plus as? PersonEx)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonEx.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonEx {
    var id = 0
    var city = ""
    var tenhouId = ""
    var title = ""
    var country = ""
    var email = ""
    var phone = ""
    var hasAvatar = false
    var lastUpdate = ""
    var msNickname = ""
    var msAccountId = 0
    var telegramId = ""
    var notifications = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> city = _fieldValue as String
            3 -> tenhouId = _fieldValue as String
            4 -> title = _fieldValue as String
            5 -> country = _fieldValue as String
            6 -> email = _fieldValue as String
            7 -> phone = _fieldValue as String
            9 -> hasAvatar = _fieldValue as Boolean
            10 -> lastUpdate = _fieldValue as String
            11 -> msNickname = _fieldValue as String
            12 -> msAccountId = _fieldValue as Int
            13 -> telegramId = _fieldValue as String
            14 -> notifications = _fieldValue as String
        }
    }

    return PersonEx(id, city, tenhouId, title,
        country, email, phone, hasAvatar,
        lastUpdate, msNickname, msAccountId, telegramId,
        notifications, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCountry")
public fun Country?.orDefault(): org.yagi.motel.pantheon.api.Country = this ?: Country.defaultInstance

private fun Country.protoMergeImpl(plus: pbandk.Message?): Country = (plus as? Country)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Country.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Country {
    var code = ""
    var name = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> code = _fieldValue as String
            2 -> name = _fieldValue as String
        }
    }

    return Country(code, name, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEvent")
public fun Event?.orDefault(): org.yagi.motel.pantheon.api.Event = this ?: Event.defaultInstance

private fun Event.protoMergeImpl(plus: pbandk.Message?): Event = (plus as? Event)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Event.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Event {
    var id = 0
    var title = ""
    var description = ""
    var finished = false
    var isListed = false
    var isRatingShown = false
    var tournamentStarted = false
    var type: org.yagi.motel.pantheon.api.EventType = org.yagi.motel.pantheon.api.EventType.fromValue(0)
    var isPrescripted = false
    var isTeam = false
    var hasSeries = false
    var withChips = false
    var minGamesCount = 0
    var achievementsShown = false
    var withYakitori = false
    var platformId: org.yagi.motel.pantheon.api.PlatformType = org.yagi.motel.pantheon.api.PlatformType.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> title = _fieldValue as String
            3 -> description = _fieldValue as String
            4 -> finished = _fieldValue as Boolean
            5 -> isListed = _fieldValue as Boolean
            6 -> isRatingShown = _fieldValue as Boolean
            7 -> tournamentStarted = _fieldValue as Boolean
            8 -> type = _fieldValue as org.yagi.motel.pantheon.api.EventType
            9 -> isPrescripted = _fieldValue as Boolean
            10 -> isTeam = _fieldValue as Boolean
            11 -> hasSeries = _fieldValue as Boolean
            12 -> withChips = _fieldValue as Boolean
            13 -> minGamesCount = _fieldValue as Int
            15 -> achievementsShown = _fieldValue as Boolean
            16 -> withYakitori = _fieldValue as Boolean
            17 -> platformId = _fieldValue as org.yagi.motel.pantheon.api.PlatformType
        }
    }

    return Event(id, title, description, finished,
        isListed, isRatingShown, tournamentStarted, type,
        isPrescripted, isTeam, hasSeries, withChips,
        minGamesCount, achievementsShown, withYakitori, platformId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMyEvent")
public fun MyEvent?.orDefault(): org.yagi.motel.pantheon.api.MyEvent = this ?: MyEvent.defaultInstance

private fun MyEvent.protoMergeImpl(plus: pbandk.Message?): MyEvent = (plus as? MyEvent)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MyEvent.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MyEvent {
    var id = 0
    var title = ""
    var description = ""
    var isOnline = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> title = _fieldValue as String
            3 -> description = _fieldValue as String
            4 -> isOnline = _fieldValue as Boolean
        }
    }

    return MyEvent(id, title, description, isOnline, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGameConfig")
public fun GameConfig?.orDefault(): org.yagi.motel.pantheon.api.GameConfig = this ?: GameConfig.defaultInstance

private fun GameConfig.protoMergeImpl(plus: pbandk.Message?): GameConfig = (plus as? GameConfig)?.let {
    it.copy(
        rulesetConfig = rulesetConfig?.plus(plus.rulesetConfig) ?: plus.rulesetConfig,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GameConfig.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GameConfig {
    var rulesetTitle = ""
    var eventTitle = ""
    var eventDescription = ""
    var eventStatHost = ""
    var useTimer = false
    var usePenalty = false
    var gameDuration = 0
    var timezone = ""
    var isOnline = false
    var isTeam = false
    var autoSeating = false
    var syncStart = false
    var syncEnd = false
    var sortByGames = false
    var allowPlayerAppend = false
    var seriesLength = 0
    var minGamesCount = 0
    var gamesStatus: org.yagi.motel.pantheon.api.TournamentGamesStatus = org.yagi.motel.pantheon.api.TournamentGamesStatus.fromValue(0)
    var hideResults = false
    var hideAddReplayButton = false
    var isPrescripted = false
    var isFinished = false
    var rulesetConfig: org.yagi.motel.pantheon.api.RulesetConfig? = null
    var lobbyId = 0
    var allowViewOtherTables = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            10 -> rulesetTitle = _fieldValue as String
            26 -> eventTitle = _fieldValue as String
            27 -> eventDescription = _fieldValue as String
            28 -> eventStatHost = _fieldValue as String
            29 -> useTimer = _fieldValue as Boolean
            30 -> usePenalty = _fieldValue as Boolean
            34 -> gameDuration = _fieldValue as Int
            35 -> timezone = _fieldValue as String
            36 -> isOnline = _fieldValue as Boolean
            37 -> isTeam = _fieldValue as Boolean
            38 -> autoSeating = _fieldValue as Boolean
            39 -> syncStart = _fieldValue as Boolean
            40 -> syncEnd = _fieldValue as Boolean
            41 -> sortByGames = _fieldValue as Boolean
            42 -> allowPlayerAppend = _fieldValue as Boolean
            45 -> seriesLength = _fieldValue as Int
            46 -> minGamesCount = _fieldValue as Int
            47 -> gamesStatus = _fieldValue as org.yagi.motel.pantheon.api.TournamentGamesStatus
            48 -> hideResults = _fieldValue as Boolean
            49 -> hideAddReplayButton = _fieldValue as Boolean
            50 -> isPrescripted = _fieldValue as Boolean
            52 -> isFinished = _fieldValue as Boolean
            53 -> rulesetConfig = _fieldValue as org.yagi.motel.pantheon.api.RulesetConfig
            54 -> lobbyId = _fieldValue as Int
            55 -> allowViewOtherTables = _fieldValue as Boolean
        }
    }

    return GameConfig(rulesetTitle, eventTitle, eventDescription, eventStatHost,
        useTimer, usePenalty, gameDuration, timezone,
        isOnline, isTeam, autoSeating, syncStart,
        syncEnd, sortByGames, allowPlayerAppend, seriesLength,
        minGamesCount, gamesStatus, hideResults, hideAddReplayButton,
        isPrescripted, isFinished, rulesetConfig, lobbyId,
        allowViewOtherTables, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayerInRating")
public fun PlayerInRating?.orDefault(): org.yagi.motel.pantheon.api.PlayerInRating = this ?: PlayerInRating.defaultInstance

private fun PlayerInRating.protoMergeImpl(plus: pbandk.Message?): PlayerInRating = (plus as? PlayerInRating)?.let {
    it.copy(
        teamName = plus.teamName ?: teamName,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayerInRating.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayerInRating {
    var id = 0
    var title = ""
    var tenhouId = ""
    var rating = 0.0F
    var chips = 0
    var winnerZone = false
    var avgPlace = 0.0F
    var avgScore = 0.0F
    var gamesPlayed = 0
    var hasAvatar = false
    var lastUpdate = ""
    var penaltiesAmount = 0.0F
    var penaltiesCount = 0
    var teamName: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> title = _fieldValue as String
            3 -> tenhouId = _fieldValue as String
            4 -> rating = _fieldValue as Float
            5 -> chips = _fieldValue as Int
            6 -> winnerZone = _fieldValue as Boolean
            7 -> avgPlace = _fieldValue as Float
            8 -> avgScore = _fieldValue as Float
            9 -> gamesPlayed = _fieldValue as Int
            10 -> teamName = _fieldValue as String
            11 -> hasAvatar = _fieldValue as Boolean
            12 -> lastUpdate = _fieldValue as String
            13 -> penaltiesAmount = _fieldValue as Float
            14 -> penaltiesCount = _fieldValue as Int
        }
    }

    return PlayerInRating(id, title, tenhouId, rating,
        chips, winnerZone, avgPlace, avgScore,
        gamesPlayed, hasAvatar, lastUpdate, penaltiesAmount,
        penaltiesCount, teamName, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayer")
public fun Player?.orDefault(): org.yagi.motel.pantheon.api.Player = this ?: Player.defaultInstance

private fun Player.protoMergeImpl(plus: pbandk.Message?): Player = (plus as? Player)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Player.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Player {
    var id = 0
    var title = ""
    var tenhouId = ""
    var hasAvatar = false
    var lastUpdate = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> title = _fieldValue as String
            3 -> tenhouId = _fieldValue as String
            4 -> hasAvatar = _fieldValue as Boolean
            5 -> lastUpdate = _fieldValue as String
        }
    }

    return Player(id, title, tenhouId, hasAvatar,
        lastUpdate, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFinalResultOfSession")
public fun FinalResultOfSession?.orDefault(): org.yagi.motel.pantheon.api.FinalResultOfSession = this ?: FinalResultOfSession.defaultInstance

private fun FinalResultOfSession.protoMergeImpl(plus: pbandk.Message?): FinalResultOfSession = (plus as? FinalResultOfSession)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FinalResultOfSession.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FinalResultOfSession {
    var playerId = 0
    var score = 0
    var ratingDelta = 0.0F
    var place = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> score = _fieldValue as Int
            3 -> ratingDelta = _fieldValue as Float
            4 -> place = _fieldValue as Int
        }
    }

    return FinalResultOfSession(playerId, score, ratingDelta, place, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPenalty")
public fun Penalty?.orDefault(): org.yagi.motel.pantheon.api.Penalty = this ?: Penalty.defaultInstance

private fun Penalty.protoMergeImpl(plus: pbandk.Message?): Penalty = (plus as? Penalty)?.let {
    it.copy(
        reason = plus.reason ?: reason,
        cancellationReason = plus.cancellationReason ?: cancellationReason,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Penalty.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Penalty {
    var who = 0
    var amount = 0
    var assignedBy = 0
    var createdAt = ""
    var isCancelled = false
    var id = 0
    var reason: String? = null
    var cancellationReason: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> who = _fieldValue as Int
            2 -> amount = _fieldValue as Int
            3 -> reason = _fieldValue as String
            4 -> assignedBy = _fieldValue as Int
            5 -> createdAt = _fieldValue as String
            6 -> isCancelled = _fieldValue as Boolean
            7 -> cancellationReason = _fieldValue as String
            8 -> id = _fieldValue as Int
        }
    }

    return Penalty(who, amount, assignedBy, createdAt,
        isCancelled, id, reason, cancellationReason, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRonResult")
public fun RonResult?.orDefault(): org.yagi.motel.pantheon.api.RonResult = this ?: RonResult.defaultInstance

private fun RonResult.protoMergeImpl(plus: pbandk.Message?): RonResult = (plus as? RonResult)?.let {
    it.copy(
        yaku = yaku + plus.yaku,
        riichiBets = riichiBets + plus.riichiBets,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RonResult.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RonResult {
    var roundIndex = 0
    var honba = 0
    var winnerId = 0
    var loserId = 0
    var paoPlayerId = 0
    var han = 0
    var fu = 0
    var yaku: pbandk.ListWithSize.Builder<Int>? = null
    var riichiBets: pbandk.ListWithSize.Builder<Int>? = null
    var dora = 0
    var uradora = 0
    var kandora = 0
    var kanuradora = 0
    var openHand = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> roundIndex = _fieldValue as Int
            2 -> honba = _fieldValue as Int
            3 -> winnerId = _fieldValue as Int
            4 -> loserId = _fieldValue as Int
            5 -> paoPlayerId = _fieldValue as Int
            6 -> han = _fieldValue as Int
            7 -> fu = _fieldValue as Int
            8 -> yaku = (yaku ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            9 -> riichiBets = (riichiBets ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            10 -> dora = _fieldValue as Int
            11 -> uradora = _fieldValue as Int
            12 -> kandora = _fieldValue as Int
            13 -> kanuradora = _fieldValue as Int
            14 -> openHand = _fieldValue as Boolean
        }
    }

    return RonResult(roundIndex, honba, winnerId, loserId,
        paoPlayerId, han, fu, pbandk.ListWithSize.Builder.fixed(yaku),
        pbandk.ListWithSize.Builder.fixed(riichiBets), dora, uradora, kandora,
        kanuradora, openHand, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMultironWin")
public fun MultironWin?.orDefault(): org.yagi.motel.pantheon.api.MultironWin = this ?: MultironWin.defaultInstance

private fun MultironWin.protoMergeImpl(plus: pbandk.Message?): MultironWin = (plus as? MultironWin)?.let {
    it.copy(
        yaku = yaku + plus.yaku,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MultironWin.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MultironWin {
    var winnerId = 0
    var paoPlayerId = 0
    var han = 0
    var fu = 0
    var yaku: pbandk.ListWithSize.Builder<Int>? = null
    var dora = 0
    var uradora = 0
    var kandora = 0
    var kanuradora = 0
    var openHand = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> winnerId = _fieldValue as Int
            2 -> paoPlayerId = _fieldValue as Int
            3 -> han = _fieldValue as Int
            4 -> fu = _fieldValue as Int
            5 -> yaku = (yaku ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            6 -> dora = _fieldValue as Int
            7 -> uradora = _fieldValue as Int
            8 -> kandora = _fieldValue as Int
            9 -> kanuradora = _fieldValue as Int
            10 -> openHand = _fieldValue as Boolean
        }
    }

    return MultironWin(winnerId, paoPlayerId, han, fu,
        pbandk.ListWithSize.Builder.fixed(yaku), dora, uradora, kandora,
        kanuradora, openHand, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMultironResult")
public fun MultironResult?.orDefault(): org.yagi.motel.pantheon.api.MultironResult = this ?: MultironResult.defaultInstance

private fun MultironResult.protoMergeImpl(plus: pbandk.Message?): MultironResult = (plus as? MultironResult)?.let {
    it.copy(
        wins = wins + plus.wins,
        riichiBets = riichiBets + plus.riichiBets,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MultironResult.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MultironResult {
    var roundIndex = 0
    var honba = 0
    var loserId = 0
    var multiRon = 0
    var wins: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.MultironWin>? = null
    var riichiBets: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> roundIndex = _fieldValue as Int
            2 -> honba = _fieldValue as Int
            3 -> loserId = _fieldValue as Int
            4 -> multiRon = _fieldValue as Int
            5 -> wins = (wins ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.MultironWin> }
            6 -> riichiBets = (riichiBets ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
        }
    }

    return MultironResult(roundIndex, honba, loserId, multiRon,
        pbandk.ListWithSize.Builder.fixed(wins), pbandk.ListWithSize.Builder.fixed(riichiBets), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTsumoResult")
public fun TsumoResult?.orDefault(): org.yagi.motel.pantheon.api.TsumoResult = this ?: TsumoResult.defaultInstance

private fun TsumoResult.protoMergeImpl(plus: pbandk.Message?): TsumoResult = (plus as? TsumoResult)?.let {
    it.copy(
        yaku = yaku + plus.yaku,
        riichiBets = riichiBets + plus.riichiBets,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TsumoResult.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TsumoResult {
    var roundIndex = 0
    var honba = 0
    var winnerId = 0
    var paoPlayerId = 0
    var han = 0
    var fu = 0
    var yaku: pbandk.ListWithSize.Builder<Int>? = null
    var riichiBets: pbandk.ListWithSize.Builder<Int>? = null
    var dora = 0
    var uradora = 0
    var kandora = 0
    var kanuradora = 0
    var openHand = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> roundIndex = _fieldValue as Int
            2 -> honba = _fieldValue as Int
            3 -> winnerId = _fieldValue as Int
            4 -> paoPlayerId = _fieldValue as Int
            5 -> han = _fieldValue as Int
            6 -> fu = _fieldValue as Int
            7 -> yaku = (yaku ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            8 -> riichiBets = (riichiBets ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            9 -> dora = _fieldValue as Int
            10 -> uradora = _fieldValue as Int
            11 -> kandora = _fieldValue as Int
            12 -> kanuradora = _fieldValue as Int
            13 -> openHand = _fieldValue as Boolean
        }
    }

    return TsumoResult(roundIndex, honba, winnerId, paoPlayerId,
        han, fu, pbandk.ListWithSize.Builder.fixed(yaku), pbandk.ListWithSize.Builder.fixed(riichiBets),
        dora, uradora, kandora, kanuradora,
        openHand, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDrawResult")
public fun DrawResult?.orDefault(): org.yagi.motel.pantheon.api.DrawResult = this ?: DrawResult.defaultInstance

private fun DrawResult.protoMergeImpl(plus: pbandk.Message?): DrawResult = (plus as? DrawResult)?.let {
    it.copy(
        riichiBets = riichiBets + plus.riichiBets,
        tempai = tempai + plus.tempai,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DrawResult.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DrawResult {
    var roundIndex = 0
    var honba = 0
    var riichiBets: pbandk.ListWithSize.Builder<Int>? = null
    var tempai: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> roundIndex = _fieldValue as Int
            2 -> honba = _fieldValue as Int
            3 -> riichiBets = (riichiBets ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            4 -> tempai = (tempai ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
        }
    }

    return DrawResult(roundIndex, honba, pbandk.ListWithSize.Builder.fixed(riichiBets), pbandk.ListWithSize.Builder.fixed(tempai), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAbortResult")
public fun AbortResult?.orDefault(): org.yagi.motel.pantheon.api.AbortResult = this ?: AbortResult.defaultInstance

private fun AbortResult.protoMergeImpl(plus: pbandk.Message?): AbortResult = (plus as? AbortResult)?.let {
    it.copy(
        riichiBets = riichiBets + plus.riichiBets,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AbortResult.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AbortResult {
    var roundIndex = 0
    var honba = 0
    var riichiBets: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> roundIndex = _fieldValue as Int
            2 -> honba = _fieldValue as Int
            3 -> riichiBets = (riichiBets ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
        }
    }

    return AbortResult(roundIndex, honba, pbandk.ListWithSize.Builder.fixed(riichiBets), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForChomboResult")
public fun ChomboResult?.orDefault(): org.yagi.motel.pantheon.api.ChomboResult = this ?: ChomboResult.defaultInstance

private fun ChomboResult.protoMergeImpl(plus: pbandk.Message?): ChomboResult = (plus as? ChomboResult)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ChomboResult.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ChomboResult {
    var roundIndex = 0
    var honba = 0
    var loserId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> roundIndex = _fieldValue as Int
            2 -> honba = _fieldValue as Int
            3 -> loserId = _fieldValue as Int
        }
    }

    return ChomboResult(roundIndex, honba, loserId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForNagashiResult")
public fun NagashiResult?.orDefault(): org.yagi.motel.pantheon.api.NagashiResult = this ?: NagashiResult.defaultInstance

private fun NagashiResult.protoMergeImpl(plus: pbandk.Message?): NagashiResult = (plus as? NagashiResult)?.let {
    it.copy(
        riichiBets = riichiBets + plus.riichiBets,
        tempai = tempai + plus.tempai,
        nagashi = nagashi + plus.nagashi,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun NagashiResult.Companion.decodeWithImpl(u: pbandk.MessageDecoder): NagashiResult {
    var roundIndex = 0
    var honba = 0
    var riichiBets: pbandk.ListWithSize.Builder<Int>? = null
    var tempai: pbandk.ListWithSize.Builder<Int>? = null
    var nagashi: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> roundIndex = _fieldValue as Int
            2 -> honba = _fieldValue as Int
            3 -> riichiBets = (riichiBets ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            4 -> tempai = (tempai ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            5 -> nagashi = (nagashi ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
        }
    }

    return NagashiResult(roundIndex, honba, pbandk.ListWithSize.Builder.fixed(riichiBets), pbandk.ListWithSize.Builder.fixed(tempai),
        pbandk.ListWithSize.Builder.fixed(nagashi), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRound")
public fun Round?.orDefault(): org.yagi.motel.pantheon.api.Round = this ?: Round.defaultInstance

private fun Round.protoMergeImpl(plus: pbandk.Message?): Round = (plus as? Round)?.let {
    it.copy(
        outcome = when {
            outcome is Round.Outcome.Ron && plus.outcome is Round.Outcome.Ron ->
                Round.Outcome.Ron(outcome.value + plus.outcome.value)
            outcome is Round.Outcome.Tsumo && plus.outcome is Round.Outcome.Tsumo ->
                Round.Outcome.Tsumo(outcome.value + plus.outcome.value)
            outcome is Round.Outcome.Multiron && plus.outcome is Round.Outcome.Multiron ->
                Round.Outcome.Multiron(outcome.value + plus.outcome.value)
            outcome is Round.Outcome.Draw && plus.outcome is Round.Outcome.Draw ->
                Round.Outcome.Draw(outcome.value + plus.outcome.value)
            outcome is Round.Outcome.Abort && plus.outcome is Round.Outcome.Abort ->
                Round.Outcome.Abort(outcome.value + plus.outcome.value)
            outcome is Round.Outcome.Chombo && plus.outcome is Round.Outcome.Chombo ->
                Round.Outcome.Chombo(outcome.value + plus.outcome.value)
            outcome is Round.Outcome.Nagashi && plus.outcome is Round.Outcome.Nagashi ->
                Round.Outcome.Nagashi(outcome.value + plus.outcome.value)
            else ->
                plus.outcome ?: outcome
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Round.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Round {
    var outcome: Round.Outcome<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> outcome = Round.Outcome.Ron(_fieldValue as org.yagi.motel.pantheon.api.RonResult)
            2 -> outcome = Round.Outcome.Tsumo(_fieldValue as org.yagi.motel.pantheon.api.TsumoResult)
            3 -> outcome = Round.Outcome.Multiron(_fieldValue as org.yagi.motel.pantheon.api.MultironResult)
            4 -> outcome = Round.Outcome.Draw(_fieldValue as org.yagi.motel.pantheon.api.DrawResult)
            5 -> outcome = Round.Outcome.Abort(_fieldValue as org.yagi.motel.pantheon.api.AbortResult)
            6 -> outcome = Round.Outcome.Chombo(_fieldValue as org.yagi.motel.pantheon.api.ChomboResult)
            7 -> outcome = Round.Outcome.Nagashi(_fieldValue as org.yagi.motel.pantheon.api.NagashiResult)
        }
    }

    return Round(outcome, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGameResult")
public fun GameResult?.orDefault(): org.yagi.motel.pantheon.api.GameResult = this ?: GameResult.defaultInstance

private fun GameResult.protoMergeImpl(plus: pbandk.Message?): GameResult = (plus as? GameResult)?.let {
    it.copy(
        players = players + plus.players,
        finalResults = finalResults + plus.finalResults,
        rounds = rounds + plus.rounds,
        date = plus.date ?: date,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GameResult.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GameResult {
    var sessionHash = ""
    var replayLink = ""
    var players: pbandk.ListWithSize.Builder<Int>? = null
    var finalResults: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.FinalResultOfSession>? = null
    var rounds: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Round>? = null
    var date: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessionHash = _fieldValue as String
            2 -> date = _fieldValue as String
            3 -> replayLink = _fieldValue as String
            4 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            5 -> finalResults = (finalResults ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.FinalResultOfSession> }
            7 -> rounds = (rounds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Round> }
        }
    }

    return GameResult(sessionHash, replayLink, pbandk.ListWithSize.Builder.fixed(players), pbandk.ListWithSize.Builder.fixed(finalResults),
        pbandk.ListWithSize.Builder.fixed(rounds), date, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayerPlaceInSeries")
public fun PlayerPlaceInSeries?.orDefault(): org.yagi.motel.pantheon.api.PlayerPlaceInSeries = this ?: PlayerPlaceInSeries.defaultInstance

private fun PlayerPlaceInSeries.protoMergeImpl(plus: pbandk.Message?): PlayerPlaceInSeries = (plus as? PlayerPlaceInSeries)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayerPlaceInSeries.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayerPlaceInSeries {
    var sessionHash = ""
    var place = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessionHash = _fieldValue as String
            2 -> place = _fieldValue as Int
        }
    }

    return PlayerPlaceInSeries(sessionHash, place, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSeriesResult")
public fun SeriesResult?.orDefault(): org.yagi.motel.pantheon.api.SeriesResult = this ?: SeriesResult.defaultInstance

private fun SeriesResult.protoMergeImpl(plus: pbandk.Message?): SeriesResult = (plus as? SeriesResult)?.let {
    it.copy(
        player = player?.plus(plus.player) ?: plus.player,
        bestSeries = bestSeries + plus.bestSeries,
        currentSeries = currentSeries + plus.currentSeries,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SeriesResult.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SeriesResult {
    var player: org.yagi.motel.pantheon.api.Player? = null
    var bestSeries: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PlayerPlaceInSeries>? = null
    var bestSeriesScores = 0.0F
    var bestSeriesPlaces = 0
    var bestSeriesAvgPlace = ""
    var currentSeries: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PlayerPlaceInSeries>? = null
    var currentSeriesScores = 0.0F
    var currentSeriesPlaces = 0
    var currentSeriesAvgPlace = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> player = _fieldValue as org.yagi.motel.pantheon.api.Player
            2 -> bestSeries = (bestSeries ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PlayerPlaceInSeries> }
            3 -> bestSeriesScores = _fieldValue as Float
            4 -> bestSeriesPlaces = _fieldValue as Int
            5 -> bestSeriesAvgPlace = _fieldValue as String
            6 -> currentSeries = (currentSeries ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PlayerPlaceInSeries> }
            7 -> currentSeriesScores = _fieldValue as Float
            8 -> currentSeriesPlaces = _fieldValue as Int
            9 -> currentSeriesAvgPlace = _fieldValue as String
        }
    }

    return SeriesResult(player, pbandk.ListWithSize.Builder.fixed(bestSeries), bestSeriesScores, bestSeriesPlaces,
        bestSeriesAvgPlace, pbandk.ListWithSize.Builder.fixed(currentSeries), currentSeriesScores, currentSeriesPlaces,
        currentSeriesAvgPlace, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForReplacementPlayer")
public fun ReplacementPlayer?.orDefault(): org.yagi.motel.pantheon.api.ReplacementPlayer = this ?: ReplacementPlayer.defaultInstance

private fun ReplacementPlayer.protoMergeImpl(plus: pbandk.Message?): ReplacementPlayer = (plus as? ReplacementPlayer)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ReplacementPlayer.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ReplacementPlayer {
    var id = 0
    var title = ""
    var hasAvatar = false
    var lastUpdate = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> title = _fieldValue as String
            3 -> hasAvatar = _fieldValue as Boolean
            4 -> lastUpdate = _fieldValue as String
        }
    }

    return ReplacementPlayer(id, title, hasAvatar, lastUpdate, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayerInSession")
public fun PlayerInSession?.orDefault(): org.yagi.motel.pantheon.api.PlayerInSession = this ?: PlayerInSession.defaultInstance

private fun PlayerInSession.protoMergeImpl(plus: pbandk.Message?): PlayerInSession = (plus as? PlayerInSession)?.let {
    it.copy(
        replacedBy = replacedBy?.plus(plus.replacedBy) ?: plus.replacedBy,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayerInSession.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayerInSession {
    var id = 0
    var title = ""
    var score = 0
    var ratingDelta = 0.0F
    var hasAvatar = false
    var lastUpdate = ""
    var yakitori = false
    var replacedBy: org.yagi.motel.pantheon.api.ReplacementPlayer? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> title = _fieldValue as String
            3 -> score = _fieldValue as Int
            4 -> replacedBy = _fieldValue as org.yagi.motel.pantheon.api.ReplacementPlayer
            5 -> ratingDelta = _fieldValue as Float
            6 -> hasAvatar = _fieldValue as Boolean
            7 -> lastUpdate = _fieldValue as String
            8 -> yakitori = _fieldValue as Boolean
        }
    }

    return PlayerInSession(id, title, score, ratingDelta,
        hasAvatar, lastUpdate, yakitori, replacedBy, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRegisteredPlayer")
public fun RegisteredPlayer?.orDefault(): org.yagi.motel.pantheon.api.RegisteredPlayer = this ?: RegisteredPlayer.defaultInstance

private fun RegisteredPlayer.protoMergeImpl(plus: pbandk.Message?): RegisteredPlayer = (plus as? RegisteredPlayer)?.let {
    it.copy(
        localId = plus.localId ?: localId,
        teamName = plus.teamName ?: teamName,
        replacedBy = replacedBy?.plus(plus.replacedBy) ?: plus.replacedBy,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RegisteredPlayer.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RegisteredPlayer {
    var id = 0
    var title = ""
    var tenhouId = ""
    var ignoreSeating = false
    var hasAvatar = false
    var lastUpdate = ""
    var localId: Int? = null
    var teamName: String? = null
    var replacedBy: org.yagi.motel.pantheon.api.ReplacementPlayer? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> title = _fieldValue as String
            3 -> localId = _fieldValue as Int
            4 -> teamName = _fieldValue as String
            5 -> tenhouId = _fieldValue as String
            6 -> ignoreSeating = _fieldValue as Boolean
            7 -> replacedBy = _fieldValue as org.yagi.motel.pantheon.api.ReplacementPlayer
            8 -> hasAvatar = _fieldValue as Boolean
            9 -> lastUpdate = _fieldValue as String
        }
    }

    return RegisteredPlayer(id, title, tenhouId, ignoreSeating,
        hasAvatar, lastUpdate, localId, teamName,
        replacedBy, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSessionHistoryResult")
public fun SessionHistoryResult?.orDefault(): org.yagi.motel.pantheon.api.SessionHistoryResult = this ?: SessionHistoryResult.defaultInstance

private fun SessionHistoryResult.protoMergeImpl(plus: pbandk.Message?): SessionHistoryResult = (plus as? SessionHistoryResult)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SessionHistoryResult.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SessionHistoryResult {
    var sessionHash = ""
    var eventId = 0
    var playerId = 0
    var score = 0
    var ratingDelta = 0.0F
    var place = 0
    var title = ""
    var hasAvatar = false
    var lastUpdate = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessionHash = _fieldValue as String
            2 -> eventId = _fieldValue as Int
            3 -> playerId = _fieldValue as Int
            4 -> score = _fieldValue as Int
            5 -> ratingDelta = _fieldValue as Float
            6 -> place = _fieldValue as Int
            7 -> title = _fieldValue as String
            8 -> hasAvatar = _fieldValue as Boolean
            9 -> lastUpdate = _fieldValue as String
        }
    }

    return SessionHistoryResult(sessionHash, eventId, playerId, score,
        ratingDelta, place, title, hasAvatar,
        lastUpdate, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSessionHistoryResultTable")
public fun SessionHistoryResultTable?.orDefault(): org.yagi.motel.pantheon.api.SessionHistoryResultTable = this ?: SessionHistoryResultTable.defaultInstance

private fun SessionHistoryResultTable.protoMergeImpl(plus: pbandk.Message?): SessionHistoryResultTable = (plus as? SessionHistoryResultTable)?.let {
    it.copy(
        tables = tables + plus.tables,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SessionHistoryResultTable.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SessionHistoryResultTable {
    var tables: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.SessionHistoryResult>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tables = (tables ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.SessionHistoryResult> }
        }
    }

    return SessionHistoryResultTable(pbandk.ListWithSize.Builder.fixed(tables), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlacesSummaryItem")
public fun PlacesSummaryItem?.orDefault(): org.yagi.motel.pantheon.api.PlacesSummaryItem = this ?: PlacesSummaryItem.defaultInstance

private fun PlacesSummaryItem.protoMergeImpl(plus: pbandk.Message?): PlacesSummaryItem = (plus as? PlacesSummaryItem)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlacesSummaryItem.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlacesSummaryItem {
    var place = 0
    var count = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> place = _fieldValue as Int
            2 -> count = _fieldValue as Int
        }
    }

    return PlacesSummaryItem(place, count, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayerWinSummary")
public fun PlayerWinSummary?.orDefault(): org.yagi.motel.pantheon.api.PlayerWinSummary = this ?: PlayerWinSummary.defaultInstance

private fun PlayerWinSummary.protoMergeImpl(plus: pbandk.Message?): PlayerWinSummary = (plus as? PlayerWinSummary)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayerWinSummary.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayerWinSummary {
    var ron = 0
    var tsumo = 0
    var chombo = 0
    var feed = 0
    var tsumofeed = 0
    var winsWithOpen = 0
    var winsWithRiichi = 0
    var winsWithDama = 0
    var unforcedFeedToOpen = 0
    var unforcedFeedToRiichi = 0
    var unforcedFeedToDama = 0
    var draw = 0
    var drawTempai = 0
    var pointsWon = 0
    var pointsLostRon = 0
    var pointsLostTsumo = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ron = _fieldValue as Int
            2 -> tsumo = _fieldValue as Int
            3 -> chombo = _fieldValue as Int
            4 -> feed = _fieldValue as Int
            5 -> tsumofeed = _fieldValue as Int
            6 -> winsWithOpen = _fieldValue as Int
            7 -> winsWithRiichi = _fieldValue as Int
            8 -> winsWithDama = _fieldValue as Int
            9 -> unforcedFeedToOpen = _fieldValue as Int
            10 -> unforcedFeedToRiichi = _fieldValue as Int
            11 -> unforcedFeedToDama = _fieldValue as Int
            12 -> draw = _fieldValue as Int
            13 -> drawTempai = _fieldValue as Int
            14 -> pointsWon = _fieldValue as Int
            15 -> pointsLostRon = _fieldValue as Int
            16 -> pointsLostTsumo = _fieldValue as Int
        }
    }

    return PlayerWinSummary(ron, tsumo, chombo, feed,
        tsumofeed, winsWithOpen, winsWithRiichi, winsWithDama,
        unforcedFeedToOpen, unforcedFeedToRiichi, unforcedFeedToDama, draw,
        drawTempai, pointsWon, pointsLostRon, pointsLostTsumo, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForHandValueStat")
public fun HandValueStat?.orDefault(): org.yagi.motel.pantheon.api.HandValueStat = this ?: HandValueStat.defaultInstance

private fun HandValueStat.protoMergeImpl(plus: pbandk.Message?): HandValueStat = (plus as? HandValueStat)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun HandValueStat.Companion.decodeWithImpl(u: pbandk.MessageDecoder): HandValueStat {
    var hanCount = 0
    var count = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> hanCount = _fieldValue as Int
            2 -> count = _fieldValue as Int
        }
    }

    return HandValueStat(hanCount, count, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForYakuStat")
public fun YakuStat?.orDefault(): org.yagi.motel.pantheon.api.YakuStat = this ?: YakuStat.defaultInstance

private fun YakuStat.protoMergeImpl(plus: pbandk.Message?): YakuStat = (plus as? YakuStat)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun YakuStat.Companion.decodeWithImpl(u: pbandk.MessageDecoder): YakuStat {
    var yakuId = 0
    var count = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> yakuId = _fieldValue as Int
            2 -> count = _fieldValue as Int
        }
    }

    return YakuStat(yakuId, count, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRiichiSummary")
public fun RiichiSummary?.orDefault(): org.yagi.motel.pantheon.api.RiichiSummary = this ?: RiichiSummary.defaultInstance

private fun RiichiSummary.protoMergeImpl(plus: pbandk.Message?): RiichiSummary = (plus as? RiichiSummary)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RiichiSummary.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RiichiSummary {
    var riichiWon = 0
    var riichiLost = 0
    var feedUnderRiichi = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> riichiWon = _fieldValue as Int
            2 -> riichiLost = _fieldValue as Int
            3 -> feedUnderRiichi = _fieldValue as Int
        }
    }

    return RiichiSummary(riichiWon, riichiLost, feedUnderRiichi, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDoraSummary")
public fun DoraSummary?.orDefault(): org.yagi.motel.pantheon.api.DoraSummary = this ?: DoraSummary.defaultInstance

private fun DoraSummary.protoMergeImpl(plus: pbandk.Message?): DoraSummary = (plus as? DoraSummary)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DoraSummary.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DoraSummary {
    var count = 0
    var average = 0.0F

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> count = _fieldValue as Int
            2 -> average = _fieldValue as Float
        }
    }

    return DoraSummary(count, average, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForIntermediateResultOfSession")
public fun IntermediateResultOfSession?.orDefault(): org.yagi.motel.pantheon.api.IntermediateResultOfSession = this ?: IntermediateResultOfSession.defaultInstance

private fun IntermediateResultOfSession.protoMergeImpl(plus: pbandk.Message?): IntermediateResultOfSession = (plus as? IntermediateResultOfSession)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun IntermediateResultOfSession.Companion.decodeWithImpl(u: pbandk.MessageDecoder): IntermediateResultOfSession {
    var playerId = 0
    var score = 0
    var chomboCount = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> score = _fieldValue as Int
            4 -> chomboCount = _fieldValue as Int
        }
    }

    return IntermediateResultOfSession(playerId, score, chomboCount, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPaymentLogItem")
public fun PaymentLogItem?.orDefault(): org.yagi.motel.pantheon.api.PaymentLogItem = this ?: PaymentLogItem.defaultInstance

private fun PaymentLogItem.protoMergeImpl(plus: pbandk.Message?): PaymentLogItem = (plus as? PaymentLogItem)?.let {
    it.copy(
        from = plus.from ?: from,
        to = plus.to ?: to,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PaymentLogItem.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PaymentLogItem {
    var amount = 0
    var from: Int? = null
    var to: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> from = _fieldValue as Int
            2 -> to = _fieldValue as Int
            3 -> amount = _fieldValue as Int
        }
    }

    return PaymentLogItem(amount, from, to, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPaymentLog")
public fun PaymentLog?.orDefault(): org.yagi.motel.pantheon.api.PaymentLog = this ?: PaymentLog.defaultInstance

private fun PaymentLog.protoMergeImpl(plus: pbandk.Message?): PaymentLog = (plus as? PaymentLog)?.let {
    it.copy(
        direct = direct + plus.direct,
        riichi = riichi + plus.riichi,
        honba = honba + plus.honba,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PaymentLog.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PaymentLog {
    var direct: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PaymentLogItem>? = null
    var riichi: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PaymentLogItem>? = null
    var honba: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PaymentLogItem>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> direct = (direct ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PaymentLogItem> }
            2 -> riichi = (riichi ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PaymentLogItem> }
            3 -> honba = (honba ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PaymentLogItem> }
        }
    }

    return PaymentLog(pbandk.ListWithSize.Builder.fixed(direct), pbandk.ListWithSize.Builder.fixed(riichi), pbandk.ListWithSize.Builder.fixed(honba), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRoundState")
public fun RoundState?.orDefault(): org.yagi.motel.pantheon.api.RoundState = this ?: RoundState.defaultInstance

private fun RoundState.protoMergeImpl(plus: pbandk.Message?): RoundState = (plus as? RoundState)?.let {
    it.copy(
        riichiIds = riichiIds + plus.riichiIds,
        scores = scores + plus.scores,
        scoresDelta = scoresDelta + plus.scoresDelta,
        payments = payments?.plus(plus.payments) ?: plus.payments,
        round = round?.plus(plus.round) ?: plus.round,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RoundState.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RoundState {
    var sessionHash = ""
    var dealer = 0
    var roundIndex = 0
    var riichi = 0
    var honba = 0
    var riichiIds: pbandk.ListWithSize.Builder<Int>? = null
    var scores: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.IntermediateResultOfSession>? = null
    var scoresDelta: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.IntermediateResultOfSession>? = null
    var payments: org.yagi.motel.pantheon.api.PaymentLog? = null
    var round: org.yagi.motel.pantheon.api.Round? = null
    var outcome: org.yagi.motel.pantheon.api.RoundOutcome = org.yagi.motel.pantheon.api.RoundOutcome.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessionHash = _fieldValue as String
            2 -> dealer = _fieldValue as Int
            3 -> roundIndex = _fieldValue as Int
            4 -> riichi = _fieldValue as Int
            5 -> honba = _fieldValue as Int
            6 -> riichiIds = (riichiIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            7 -> scores = (scores ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.IntermediateResultOfSession> }
            8 -> scoresDelta = (scoresDelta ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.IntermediateResultOfSession> }
            9 -> payments = _fieldValue as org.yagi.motel.pantheon.api.PaymentLog
            10 -> round = _fieldValue as org.yagi.motel.pantheon.api.Round
            11 -> outcome = _fieldValue as org.yagi.motel.pantheon.api.RoundOutcome
        }
    }

    return RoundState(sessionHash, dealer, roundIndex, riichi,
        honba, pbandk.ListWithSize.Builder.fixed(riichiIds), pbandk.ListWithSize.Builder.fixed(scores), pbandk.ListWithSize.Builder.fixed(scoresDelta),
        payments, round, outcome, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventData")
public fun EventData?.orDefault(): org.yagi.motel.pantheon.api.EventData = this ?: EventData.defaultInstance

private fun EventData.protoMergeImpl(plus: pbandk.Message?): EventData = (plus as? EventData)?.let {
    it.copy(
        rulesetConfig = rulesetConfig?.plus(plus.rulesetConfig) ?: plus.rulesetConfig,
        type = plus.type ?: type,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventData.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventData {
    var title = ""
    var description = ""
    var duration = 0
    var timezone = ""
    var lobbyId = 0
    var seriesLength = 0
    var minGames = 0
    var isTeam = false
    var isPrescripted = false
    var autostart = 0
    var rulesetConfig: org.yagi.motel.pantheon.api.RulesetConfig? = null
    var isListed = false
    var isRatingShown = false
    var achievementsShown = false
    var allowViewOtherTables = false
    var platformId: org.yagi.motel.pantheon.api.PlatformType = org.yagi.motel.pantheon.api.PlatformType.fromValue(0)
    var type: org.yagi.motel.pantheon.api.EventType? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = _fieldValue as org.yagi.motel.pantheon.api.EventType
            2 -> title = _fieldValue as String
            3 -> description = _fieldValue as String
            4 -> duration = _fieldValue as Int
            6 -> timezone = _fieldValue as String
            7 -> lobbyId = _fieldValue as Int
            8 -> seriesLength = _fieldValue as Int
            9 -> minGames = _fieldValue as Int
            10 -> isTeam = _fieldValue as Boolean
            11 -> isPrescripted = _fieldValue as Boolean
            12 -> autostart = _fieldValue as Int
            14 -> rulesetConfig = _fieldValue as org.yagi.motel.pantheon.api.RulesetConfig
            15 -> isListed = _fieldValue as Boolean
            16 -> isRatingShown = _fieldValue as Boolean
            17 -> achievementsShown = _fieldValue as Boolean
            18 -> allowViewOtherTables = _fieldValue as Boolean
            19 -> platformId = _fieldValue as org.yagi.motel.pantheon.api.PlatformType
        }
    }

    return EventData(title, description, duration, timezone,
        lobbyId, seriesLength, minGames, isTeam,
        isPrescripted, autostart, rulesetConfig, isListed,
        isRatingShown, achievementsShown, allowViewOtherTables, platformId,
        type, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTableState")
public fun TableState?.orDefault(): org.yagi.motel.pantheon.api.TableState = this ?: TableState.defaultInstance

private fun TableState.protoMergeImpl(plus: pbandk.Message?): TableState = (plus as? TableState)?.let {
    it.copy(
        scores = scores + plus.scores,
        players = players + plus.players,
        tableIndex = plus.tableIndex ?: tableIndex,
        lastRound = lastRound?.plus(plus.lastRound) ?: plus.lastRound,
        extraTime = plus.extraTime ?: extraTime,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TableState.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TableState {
    var status: org.yagi.motel.pantheon.api.SessionStatus = org.yagi.motel.pantheon.api.SessionStatus.fromValue(0)
    var mayDefinalize = false
    var sessionHash = ""
    var currentRoundIndex = 0
    var scores: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.IntermediateResultOfSession>? = null
    var players: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.RegisteredPlayer>? = null
    var tableIndex: Int? = null
    var lastRound: org.yagi.motel.pantheon.api.Round? = null
    var extraTime: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> status = _fieldValue as org.yagi.motel.pantheon.api.SessionStatus
            2 -> mayDefinalize = _fieldValue as Boolean
            3 -> sessionHash = _fieldValue as String
            5 -> tableIndex = _fieldValue as Int
            6 -> lastRound = _fieldValue as org.yagi.motel.pantheon.api.Round
            7 -> currentRoundIndex = _fieldValue as Int
            8 -> scores = (scores ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.IntermediateResultOfSession> }
            9 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.RegisteredPlayer> }
            10 -> extraTime = _fieldValue as Int
        }
    }

    return TableState(status, mayDefinalize, sessionHash, currentRoundIndex,
        pbandk.ListWithSize.Builder.fixed(scores), pbandk.ListWithSize.Builder.fixed(players), tableIndex, lastRound,
        extraTime, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAchievement")
public fun Achievement?.orDefault(): org.yagi.motel.pantheon.api.Achievement = this ?: Achievement.defaultInstance

private fun Achievement.protoMergeImpl(plus: pbandk.Message?): Achievement = (plus as? Achievement)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Achievement.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Achievement {
    var achievementId = ""
    var achievementData = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> achievementId = _fieldValue as String
            2 -> achievementData = _fieldValue as String
        }
    }

    return Achievement(achievementId, achievementData, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForLocalIdMapping")
public fun LocalIdMapping?.orDefault(): org.yagi.motel.pantheon.api.LocalIdMapping = this ?: LocalIdMapping.defaultInstance

private fun LocalIdMapping.protoMergeImpl(plus: pbandk.Message?): LocalIdMapping = (plus as? LocalIdMapping)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun LocalIdMapping.Companion.decodeWithImpl(u: pbandk.MessageDecoder): LocalIdMapping {
    var playerId = 0
    var localId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> localId = _fieldValue as Int
        }
    }

    return LocalIdMapping(playerId, localId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTeamMapping")
public fun TeamMapping?.orDefault(): org.yagi.motel.pantheon.api.TeamMapping = this ?: TeamMapping.defaultInstance

private fun TeamMapping.protoMergeImpl(plus: pbandk.Message?): TeamMapping = (plus as? TeamMapping)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TeamMapping.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TeamMapping {
    var playerId = 0
    var teamName = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> teamName = _fieldValue as String
        }
    }

    return TeamMapping(playerId, teamName, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayerSeating")
public fun PlayerSeating?.orDefault(): org.yagi.motel.pantheon.api.PlayerSeating = this ?: PlayerSeating.defaultInstance

private fun PlayerSeating.protoMergeImpl(plus: pbandk.Message?): PlayerSeating = (plus as? PlayerSeating)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayerSeating.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayerSeating {
    var order = 0
    var playerId = 0
    var sessionId = 0
    var tableIndex = 0
    var rating = 0.0F
    var playerTitle = ""
    var hasAvatar = false
    var lastUpdate = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> order = _fieldValue as Int
            2 -> playerId = _fieldValue as Int
            3 -> sessionId = _fieldValue as Int
            4 -> tableIndex = _fieldValue as Int
            5 -> rating = _fieldValue as Float
            6 -> playerTitle = _fieldValue as String
            7 -> hasAvatar = _fieldValue as Boolean
            8 -> lastUpdate = _fieldValue as String
        }
    }

    return PlayerSeating(order, playerId, sessionId, tableIndex,
        rating, playerTitle, hasAvatar, lastUpdate, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayerSeatingSwiss")
public fun PlayerSeatingSwiss?.orDefault(): org.yagi.motel.pantheon.api.PlayerSeatingSwiss = this ?: PlayerSeatingSwiss.defaultInstance

private fun PlayerSeatingSwiss.protoMergeImpl(plus: pbandk.Message?): PlayerSeatingSwiss = (plus as? PlayerSeatingSwiss)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayerSeatingSwiss.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayerSeatingSwiss {
    var playerId = 0
    var rating = 0.0F

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> rating = _fieldValue as Float
        }
    }

    return PlayerSeatingSwiss(playerId, rating, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTableItemSwiss")
public fun TableItemSwiss?.orDefault(): org.yagi.motel.pantheon.api.TableItemSwiss = this ?: TableItemSwiss.defaultInstance

private fun TableItemSwiss.protoMergeImpl(plus: pbandk.Message?): TableItemSwiss = (plus as? TableItemSwiss)?.let {
    it.copy(
        players = players + plus.players,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TableItemSwiss.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TableItemSwiss {
    var players: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PlayerSeatingSwiss>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PlayerSeatingSwiss> }
        }
    }

    return TableItemSwiss(pbandk.ListWithSize.Builder.fixed(players), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPrescriptedTable")
public fun PrescriptedTable?.orDefault(): org.yagi.motel.pantheon.api.PrescriptedTable = this ?: PrescriptedTable.defaultInstance

private fun PrescriptedTable.protoMergeImpl(plus: pbandk.Message?): PrescriptedTable = (plus as? PrescriptedTable)?.let {
    it.copy(
        players = players + plus.players,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PrescriptedTable.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PrescriptedTable {
    var players: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.RegisteredPlayer>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.RegisteredPlayer> }
        }
    }

    return PrescriptedTable(pbandk.ListWithSize.Builder.fixed(players), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForChombo")
public fun Chombo?.orDefault(): org.yagi.motel.pantheon.api.Chombo = this ?: Chombo.defaultInstance

private fun Chombo.protoMergeImpl(plus: pbandk.Message?): Chombo = (plus as? Chombo)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Chombo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Chombo {
    var playerId = 0
    var amount = 0.0F

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> amount = _fieldValue as Float
        }
    }

    return Chombo(playerId, amount, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSessionState")
public fun SessionState?.orDefault(): org.yagi.motel.pantheon.api.SessionState = this ?: SessionState.defaultInstance

private fun SessionState.protoMergeImpl(plus: pbandk.Message?): SessionState = (plus as? SessionState)?.let {
    it.copy(
        scores = scores + plus.scores,
        chombo = chombo + plus.chombo,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SessionState.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SessionState {
    var dealer = 0
    var roundIndex = 0
    var riichiCount = 0
    var honbaCount = 0
    var scores: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.IntermediateResultOfSession>? = null
    var finished = false
    var lastHandStarted = false
    var chombo: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Chombo>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> dealer = _fieldValue as Int
            2 -> roundIndex = _fieldValue as Int
            3 -> riichiCount = _fieldValue as Int
            4 -> honbaCount = _fieldValue as Int
            5 -> scores = (scores ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.IntermediateResultOfSession> }
            6 -> finished = _fieldValue as Boolean
            8 -> lastHandStarted = _fieldValue as Boolean
            9 -> chombo = (chombo ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Chombo> }
        }
    }

    return SessionState(dealer, roundIndex, riichiCount, honbaCount,
        pbandk.ListWithSize.Builder.fixed(scores), finished, lastHandStarted, pbandk.ListWithSize.Builder.fixed(chombo), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUma")
public fun Uma?.orDefault(): org.yagi.motel.pantheon.api.Uma = this ?: Uma.defaultInstance

private fun Uma.protoMergeImpl(plus: pbandk.Message?): Uma = (plus as? Uma)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Uma.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Uma {
    var place1 = 0
    var place2 = 0
    var place3 = 0
    var place4 = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> place1 = _fieldValue as Int
            2 -> place2 = _fieldValue as Int
            3 -> place3 = _fieldValue as Int
            4 -> place4 = _fieldValue as Int
        }
    }

    return Uma(place1, place2, place3, place4, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForComplexUma")
public fun ComplexUma?.orDefault(): org.yagi.motel.pantheon.api.ComplexUma = this ?: ComplexUma.defaultInstance

private fun ComplexUma.protoMergeImpl(plus: pbandk.Message?): ComplexUma = (plus as? ComplexUma)?.let {
    it.copy(
        neg1 = neg1?.plus(plus.neg1) ?: plus.neg1,
        neg3 = neg3?.plus(plus.neg3) ?: plus.neg3,
        otherwise = otherwise?.plus(plus.otherwise) ?: plus.otherwise,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ComplexUma.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ComplexUma {
    var neg1: org.yagi.motel.pantheon.api.Uma? = null
    var neg3: org.yagi.motel.pantheon.api.Uma? = null
    var otherwise: org.yagi.motel.pantheon.api.Uma? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> neg1 = _fieldValue as org.yagi.motel.pantheon.api.Uma
            2 -> neg3 = _fieldValue as org.yagi.motel.pantheon.api.Uma
            3 -> otherwise = _fieldValue as org.yagi.motel.pantheon.api.Uma
        }
    }

    return ComplexUma(neg1, neg3, otherwise, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRulesetConfig")
public fun RulesetConfig?.orDefault(): org.yagi.motel.pantheon.api.RulesetConfig = this ?: RulesetConfig.defaultInstance

private fun RulesetConfig.protoMergeImpl(plus: pbandk.Message?): RulesetConfig = (plus as? RulesetConfig)?.let {
    it.copy(
        complexUma = complexUma?.plus(plus.complexUma) ?: plus.complexUma,
        uma = uma?.plus(plus.uma) ?: plus.uma,
        allowedYaku = allowedYaku + plus.allowedYaku,
        yakuWithPao = yakuWithPao + plus.yakuWithPao,
        doubleYakuman = doubleYakuman + plus.doubleYakuman,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RulesetConfig.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RulesetConfig {
    var complexUma: org.yagi.motel.pantheon.api.ComplexUma? = null
    var endingPolicy: org.yagi.motel.pantheon.api.EndingPolicy = org.yagi.motel.pantheon.api.EndingPolicy.fromValue(0)
    var uma: org.yagi.motel.pantheon.api.Uma? = null
    var umaType: org.yagi.motel.pantheon.api.UmaType = org.yagi.motel.pantheon.api.UmaType.fromValue(0)
    var doubleronHonbaAtamahane = false
    var doubleronRiichiAtamahane = false
    var equalizeUma = false
    var extraChomboPayments = false
    var playAdditionalRounds = false
    var riichiGoesToWinner = false
    var tonpuusen = false
    var withAbortives = false
    var withAtamahane = false
    var withButtobi = false
    var withKazoe = false
    var withKiriageMangan = false
    var withKuitan = false
    var withLeadingDealerGameOver = false
    var withMultiYakumans = false
    var withNagashiMangan = false
    var withWinningDealerHonbaSkipped = false
    var chipsValue = 0
    var chomboAmount = 0
    var gameExpirationTime = 0
    var goalPoints = 0
    var maxPenalty = 0
    var minPenalty = 0
    var oka = 0
    var penaltyStep = 0
    var replacementPlayerFixedPoints = 0
    var replacementPlayerOverrideUma = 0
    var startPoints = 0
    var startRating = 0
    var allowedYaku: pbandk.ListWithSize.Builder<Int>? = null
    var yakuWithPao: pbandk.ListWithSize.Builder<Int>? = null
    var withYakitori = false
    var yakitoriPenalty = 0
    var chomboEndsGame = false
    var honbaValue = 0
    var doubleYakuman: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> complexUma = _fieldValue as org.yagi.motel.pantheon.api.ComplexUma
            2 -> endingPolicy = _fieldValue as org.yagi.motel.pantheon.api.EndingPolicy
            3 -> uma = _fieldValue as org.yagi.motel.pantheon.api.Uma
            4 -> umaType = _fieldValue as org.yagi.motel.pantheon.api.UmaType
            5 -> doubleronHonbaAtamahane = _fieldValue as Boolean
            6 -> doubleronRiichiAtamahane = _fieldValue as Boolean
            7 -> equalizeUma = _fieldValue as Boolean
            8 -> extraChomboPayments = _fieldValue as Boolean
            9 -> playAdditionalRounds = _fieldValue as Boolean
            10 -> riichiGoesToWinner = _fieldValue as Boolean
            11 -> tonpuusen = _fieldValue as Boolean
            12 -> withAbortives = _fieldValue as Boolean
            13 -> withAtamahane = _fieldValue as Boolean
            14 -> withButtobi = _fieldValue as Boolean
            15 -> withKazoe = _fieldValue as Boolean
            16 -> withKiriageMangan = _fieldValue as Boolean
            17 -> withKuitan = _fieldValue as Boolean
            18 -> withLeadingDealerGameOver = _fieldValue as Boolean
            19 -> withMultiYakumans = _fieldValue as Boolean
            20 -> withNagashiMangan = _fieldValue as Boolean
            21 -> withWinningDealerHonbaSkipped = _fieldValue as Boolean
            22 -> chipsValue = _fieldValue as Int
            23 -> chomboAmount = _fieldValue as Int
            24 -> gameExpirationTime = _fieldValue as Int
            25 -> goalPoints = _fieldValue as Int
            26 -> maxPenalty = _fieldValue as Int
            27 -> minPenalty = _fieldValue as Int
            28 -> oka = _fieldValue as Int
            29 -> penaltyStep = _fieldValue as Int
            30 -> replacementPlayerFixedPoints = _fieldValue as Int
            31 -> replacementPlayerOverrideUma = _fieldValue as Int
            32 -> startPoints = _fieldValue as Int
            33 -> startRating = _fieldValue as Int
            34 -> allowedYaku = (allowedYaku ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            35 -> yakuWithPao = (yakuWithPao ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            36 -> withYakitori = _fieldValue as Boolean
            37 -> yakitoriPenalty = _fieldValue as Int
            38 -> chomboEndsGame = _fieldValue as Boolean
            39 -> honbaValue = _fieldValue as Int
            40 -> doubleYakuman = (doubleYakuman ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
        }
    }

    return RulesetConfig(complexUma, endingPolicy, uma, umaType,
        doubleronHonbaAtamahane, doubleronRiichiAtamahane, equalizeUma, extraChomboPayments,
        playAdditionalRounds, riichiGoesToWinner, tonpuusen, withAbortives,
        withAtamahane, withButtobi, withKazoe, withKiriageMangan,
        withKuitan, withLeadingDealerGameOver, withMultiYakumans, withNagashiMangan,
        withWinningDealerHonbaSkipped, chipsValue, chomboAmount, gameExpirationTime,
        goalPoints, maxPenalty, minPenalty, oka,
        penaltyStep, replacementPlayerFixedPoints, replacementPlayerOverrideUma, startPoints,
        startRating, pbandk.ListWithSize.Builder.fixed(allowedYaku), pbandk.ListWithSize.Builder.fixed(yakuWithPao), withYakitori,
        yakitoriPenalty, chomboEndsGame, honbaValue, pbandk.ListWithSize.Builder.fixed(doubleYakuman), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMajsoulSearchEx")
public fun MajsoulSearchEx?.orDefault(): org.yagi.motel.pantheon.api.MajsoulSearchEx = this ?: MajsoulSearchEx.defaultInstance

private fun MajsoulSearchEx.protoMergeImpl(plus: pbandk.Message?): MajsoulSearchEx = (plus as? MajsoulSearchEx)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MajsoulSearchEx.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MajsoulSearchEx {
    var nickname = ""
    var accountId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> nickname = _fieldValue as String
            2 -> accountId = _fieldValue as Int
        }
    }

    return MajsoulSearchEx(nickname, accountId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMajsoulPersonMapping")
public fun MajsoulPersonMapping?.orDefault(): org.yagi.motel.pantheon.api.MajsoulPersonMapping = this ?: MajsoulPersonMapping.defaultInstance

private fun MajsoulPersonMapping.protoMergeImpl(plus: pbandk.Message?): MajsoulPersonMapping = (plus as? MajsoulPersonMapping)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MajsoulPersonMapping.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MajsoulPersonMapping {
    var personId = 0
    var nickname = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> personId = _fieldValue as Int
            2 -> nickname = _fieldValue as String
        }
    }

    return MajsoulPersonMapping(personId, nickname, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGenericSuccessResponse")
public fun GenericSuccessResponse?.orDefault(): org.yagi.motel.pantheon.api.GenericSuccessResponse = this ?: GenericSuccessResponse.defaultInstance

private fun GenericSuccessResponse.protoMergeImpl(plus: pbandk.Message?): GenericSuccessResponse = (plus as? GenericSuccessResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GenericSuccessResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GenericSuccessResponse {
    var success = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> success = _fieldValue as Boolean
        }
    }

    return GenericSuccessResponse(success, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGenericEventPayload")
public fun GenericEventPayload?.orDefault(): org.yagi.motel.pantheon.api.GenericEventPayload = this ?: GenericEventPayload.defaultInstance

private fun GenericEventPayload.protoMergeImpl(plus: pbandk.Message?): GenericEventPayload = (plus as? GenericEventPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GenericEventPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GenericEventPayload {
    var eventId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
        }
    }

    return GenericEventPayload(eventId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGenericSessionPayload")
public fun GenericSessionPayload?.orDefault(): org.yagi.motel.pantheon.api.GenericSessionPayload = this ?: GenericSessionPayload.defaultInstance

private fun GenericSessionPayload.protoMergeImpl(plus: pbandk.Message?): GenericSessionPayload = (plus as? GenericSessionPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GenericSessionPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GenericSessionPayload {
    var sessionHash = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessionHash = _fieldValue as String
        }
    }

    return GenericSessionPayload(sessionHash, unknownFields)
}
