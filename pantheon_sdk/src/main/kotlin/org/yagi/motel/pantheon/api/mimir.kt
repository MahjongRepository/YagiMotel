@file:OptIn(pbandk.PublicForGeneratedCode::class)

package org.yagi.motel.pantheon.api

@pbandk.Export
public data class EventsGetRulesetsPayload(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetRulesetsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetRulesetsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetRulesetsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetRulesetsPayload by lazy { org.yagi.motel.pantheon.api.EventsGetRulesetsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetRulesetsPayload = org.yagi.motel.pantheon.api.EventsGetRulesetsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetRulesetsPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetRulesetsPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsGetRulesetsPayload::class,
            messageCompanion = this,
            fields = buildList(0) {
            }
        )
    }
}

@pbandk.Export
public data class EventsGetRulesetsResponse(
    val rulesets: List<org.yagi.motel.pantheon.api.RulesetConfig> = emptyList(),
    val rulesetIds: List<String> = emptyList(),
    val rulesetTitles: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetRulesetsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetRulesetsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetRulesetsResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetRulesetsResponse by lazy { org.yagi.motel.pantheon.api.EventsGetRulesetsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetRulesetsResponse = org.yagi.motel.pantheon.api.EventsGetRulesetsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetRulesetsResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetRulesetsResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetRulesetsResponse::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rulesets",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.RulesetConfig>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.RulesetConfig.Companion)),
                        jsonName = "rulesets",
                        value = org.yagi.motel.pantheon.api.EventsGetRulesetsResponse::rulesets
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ruleset_ids",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "rulesetIds",
                        value = org.yagi.motel.pantheon.api.EventsGetRulesetsResponse::rulesetIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ruleset_titles",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "rulesetTitles",
                        value = org.yagi.motel.pantheon.api.EventsGetRulesetsResponse::rulesetTitles
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetEventsPayload(
    val limit: Int = 0,
    val offset: Int = 0,
    val filterUnlisted: Boolean = false,
    val filter: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetEventsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetEventsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetEventsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetEventsPayload by lazy { org.yagi.motel.pantheon.api.EventsGetEventsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetEventsPayload = org.yagi.motel.pantheon.api.EventsGetEventsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetEventsPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetEventsPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsGetEventsPayload::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "limit",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "limit",
                        value = org.yagi.motel.pantheon.api.EventsGetEventsPayload::limit
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "offset",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "offset",
                        value = org.yagi.motel.pantheon.api.EventsGetEventsPayload::offset
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "filter_unlisted",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "filterUnlisted",
                        value = org.yagi.motel.pantheon.api.EventsGetEventsPayload::filterUnlisted
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "filter",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "filter",
                        value = org.yagi.motel.pantheon.api.EventsGetEventsPayload::filter
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetEventsResponse(
    val total: Int = 0,
    val events: List<org.yagi.motel.pantheon.api.Event> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetEventsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetEventsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetEventsResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetEventsResponse by lazy { org.yagi.motel.pantheon.api.EventsGetEventsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetEventsResponse = org.yagi.motel.pantheon.api.EventsGetEventsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetEventsResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetEventsResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetEventsResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "total",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "total",
                        value = org.yagi.motel.pantheon.api.EventsGetEventsResponse::total
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "events",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Event>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Event.Companion)),
                        jsonName = "events",
                        value = org.yagi.motel.pantheon.api.EventsGetEventsResponse::events
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetEventsByIdPayload(
    val ids: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload by lazy { org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload = org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetEventsByIdPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ids",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "ids",
                        value = org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload::ids
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetEventsByIdResponse(
    val events: List<org.yagi.motel.pantheon.api.Event> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse by lazy { org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse = org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetEventsByIdResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "events",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Event>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Event.Companion)),
                        jsonName = "events",
                        value = org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse::events
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetMyEventsPayload(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetMyEventsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetMyEventsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetMyEventsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetMyEventsPayload by lazy { org.yagi.motel.pantheon.api.PlayersGetMyEventsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetMyEventsPayload = org.yagi.motel.pantheon.api.PlayersGetMyEventsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetMyEventsPayload> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetMyEventsPayload",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetMyEventsPayload::class,
            messageCompanion = this,
            fields = buildList(0) {
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetMyEventsResponse(
    val events: List<org.yagi.motel.pantheon.api.MyEvent> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse by lazy { org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse = org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetMyEventsResponse",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "events",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.MyEvent>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.MyEvent.Companion)),
                        jsonName = "events",
                        value = org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse::events
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetRatingTablePayload(
    val eventIdList: List<Int> = emptyList(),
    val orderBy: String = "",
    val order: String = "",
    val onlyMinGames: Boolean? = null,
    val dateFrom: String? = null,
    val dateTo: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetRatingTablePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetRatingTablePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetRatingTablePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetRatingTablePayload by lazy { org.yagi.motel.pantheon.api.EventsGetRatingTablePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetRatingTablePayload = org.yagi.motel.pantheon.api.EventsGetRatingTablePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetRatingTablePayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetRatingTablePayload",
            messageClass = org.yagi.motel.pantheon.api.EventsGetRatingTablePayload::class,
            messageCompanion = this,
            fields = buildList(6) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id_list",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "eventIdList",
                        value = org.yagi.motel.pantheon.api.EventsGetRatingTablePayload::eventIdList
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "order_by",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "orderBy",
                        value = org.yagi.motel.pantheon.api.EventsGetRatingTablePayload::orderBy
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "order",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "order",
                        value = org.yagi.motel.pantheon.api.EventsGetRatingTablePayload::order
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "only_min_games",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "onlyMinGames",
                        value = org.yagi.motel.pantheon.api.EventsGetRatingTablePayload::onlyMinGames
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "date_from",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "dateFrom",
                        value = org.yagi.motel.pantheon.api.EventsGetRatingTablePayload::dateFrom
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "date_to",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "dateTo",
                        value = org.yagi.motel.pantheon.api.EventsGetRatingTablePayload::dateTo
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetRatingTableResponse(
    val list: List<org.yagi.motel.pantheon.api.PlayerInRating> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetRatingTableResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetRatingTableResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetRatingTableResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetRatingTableResponse by lazy { org.yagi.motel.pantheon.api.EventsGetRatingTableResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetRatingTableResponse = org.yagi.motel.pantheon.api.EventsGetRatingTableResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetRatingTableResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetRatingTableResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetRatingTableResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "list",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PlayerInRating>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PlayerInRating.Companion)),
                        jsonName = "list",
                        value = org.yagi.motel.pantheon.api.EventsGetRatingTableResponse::list
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetLastGamesPayload(
    val eventIdList: List<Int> = emptyList(),
    val limit: Int = 0,
    val offset: Int = 0,
    val orderBy: String? = null,
    val order: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetLastGamesPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetLastGamesPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetLastGamesPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetLastGamesPayload by lazy { org.yagi.motel.pantheon.api.EventsGetLastGamesPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetLastGamesPayload = org.yagi.motel.pantheon.api.EventsGetLastGamesPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetLastGamesPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetLastGamesPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsGetLastGamesPayload::class,
            messageCompanion = this,
            fields = buildList(5) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id_list",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "eventIdList",
                        value = org.yagi.motel.pantheon.api.EventsGetLastGamesPayload::eventIdList
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "limit",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "limit",
                        value = org.yagi.motel.pantheon.api.EventsGetLastGamesPayload::limit
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "offset",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "offset",
                        value = org.yagi.motel.pantheon.api.EventsGetLastGamesPayload::offset
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "order_by",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "orderBy",
                        value = org.yagi.motel.pantheon.api.EventsGetLastGamesPayload::orderBy
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "order",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "order",
                        value = org.yagi.motel.pantheon.api.EventsGetLastGamesPayload::order
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetLastGamesResponse(
    val games: List<org.yagi.motel.pantheon.api.GameResult> = emptyList(),
    val players: List<org.yagi.motel.pantheon.api.Player> = emptyList(),
    val totalGames: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetLastGamesResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetLastGamesResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetLastGamesResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetLastGamesResponse by lazy { org.yagi.motel.pantheon.api.EventsGetLastGamesResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetLastGamesResponse = org.yagi.motel.pantheon.api.EventsGetLastGamesResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetLastGamesResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetLastGamesResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetLastGamesResponse::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "games",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.GameResult>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.GameResult.Companion)),
                        jsonName = "games",
                        value = org.yagi.motel.pantheon.api.EventsGetLastGamesResponse::games
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Player>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Player.Companion)),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.EventsGetLastGamesResponse::players
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "total_games",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "totalGames",
                        value = org.yagi.motel.pantheon.api.EventsGetLastGamesResponse::totalGames
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetGameResponse(
    val game: org.yagi.motel.pantheon.api.GameResult? = null,
    val players: List<org.yagi.motel.pantheon.api.Player> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetGameResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetGameResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetGameResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetGameResponse by lazy { org.yagi.motel.pantheon.api.EventsGetGameResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetGameResponse = org.yagi.motel.pantheon.api.EventsGetGameResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetGameResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetGameResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetGameResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "game",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.GameResult.Companion),
                        jsonName = "game",
                        value = org.yagi.motel.pantheon.api.EventsGetGameResponse::game
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Player>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Player.Companion)),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.EventsGetGameResponse::players
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetGamesSeriesResponse(
    val results: List<org.yagi.motel.pantheon.api.SeriesResult> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse by lazy { org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse = org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetGamesSeriesResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "results",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.SeriesResult>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.SeriesResult.Companion)),
                        jsonName = "results",
                        value = org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse::results
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetCurrentSessionsPayload(
    val playerId: Int = 0,
    val eventId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload by lazy { org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload = org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetCurrentSessionsPayload",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload::eventId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class CurrentSession(
    val sessionHash: String = "",
    val status: String = "",
    val players: List<org.yagi.motel.pantheon.api.PlayerInSession> = emptyList(),
    val timerState: org.yagi.motel.pantheon.api.EventsGetTimerStateResponse? = null,
    val tableIndex: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.CurrentSession = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.CurrentSession> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.CurrentSession> {
        public val defaultInstance: org.yagi.motel.pantheon.api.CurrentSession by lazy { org.yagi.motel.pantheon.api.CurrentSession() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.CurrentSession = org.yagi.motel.pantheon.api.CurrentSession.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.CurrentSession> = pbandk.MessageDescriptor(
            fullName = "common.CurrentSession",
            messageClass = org.yagi.motel.pantheon.api.CurrentSession::class,
            messageCompanion = this,
            fields = buildList(5) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_hash",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "sessionHash",
                        value = org.yagi.motel.pantheon.api.CurrentSession::sessionHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "status",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "status",
                        value = org.yagi.motel.pantheon.api.CurrentSession::status
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "table_index",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "tableIndex",
                        value = org.yagi.motel.pantheon.api.CurrentSession::tableIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PlayerInSession>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PlayerInSession.Companion)),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.CurrentSession::players
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timer_state",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.EventsGetTimerStateResponse.Companion),
                        jsonName = "timerState",
                        value = org.yagi.motel.pantheon.api.CurrentSession::timerState
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetCurrentSessionsResponse(
    val sessions: List<org.yagi.motel.pantheon.api.CurrentSession> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse by lazy { org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse = org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetCurrentSessionsResponse",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sessions",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.CurrentSession>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.CurrentSession.Companion)),
                        jsonName = "sessions",
                        value = org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse::sessions
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetAllRegisteredPlayersPayload(
    val eventIds: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload by lazy { org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload = org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetAllRegisteredPlayersPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_ids",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "eventIds",
                        value = org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload::eventIds
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetAllRegisteredPlayersResponse(
    val players: List<org.yagi.motel.pantheon.api.RegisteredPlayer> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse by lazy { org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse = org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetAllRegisteredPlayersResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.RegisteredPlayer>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.RegisteredPlayer.Companion)),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse::players
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetTimerStateResponse(
    val started: Boolean = false,
    val finished: Boolean = false,
    val timeRemaining: Int = 0,
    val waitingForTimer: Boolean = false,
    val haveAutostart: Boolean = false,
    val autostartTimer: Boolean = false,
    val hideSeatingAfter: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetTimerStateResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetTimerStateResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetTimerStateResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetTimerStateResponse by lazy { org.yagi.motel.pantheon.api.EventsGetTimerStateResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetTimerStateResponse = org.yagi.motel.pantheon.api.EventsGetTimerStateResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetTimerStateResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetTimerStateResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetTimerStateResponse::class,
            messageCompanion = this,
            fields = buildList(7) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "started",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "started",
                        value = org.yagi.motel.pantheon.api.EventsGetTimerStateResponse::started
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "finished",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "finished",
                        value = org.yagi.motel.pantheon.api.EventsGetTimerStateResponse::finished
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "time_remaining",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "timeRemaining",
                        value = org.yagi.motel.pantheon.api.EventsGetTimerStateResponse::timeRemaining
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "waiting_for_timer",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "waitingForTimer",
                        value = org.yagi.motel.pantheon.api.EventsGetTimerStateResponse::waitingForTimer
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "have_autostart",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "haveAutostart",
                        value = org.yagi.motel.pantheon.api.EventsGetTimerStateResponse::haveAutostart
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "autostart_timer",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "autostartTimer",
                        value = org.yagi.motel.pantheon.api.EventsGetTimerStateResponse::autostartTimer
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "hide_seating_after",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "hideSeatingAfter",
                        value = org.yagi.motel.pantheon.api.EventsGetTimerStateResponse::hideSeatingAfter
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GamesGetSessionOverviewResponse(
    val id: Int = 0,
    val eventId: Int = 0,
    val players: List<org.yagi.motel.pantheon.api.PlayerInSession> = emptyList(),
    val state: org.yagi.motel.pantheon.api.SessionState? = null,
    val timerState: org.yagi.motel.pantheon.api.EventsGetTimerStateResponse? = null,
    val tableIndex: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse by lazy { org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse = org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse> = pbandk.MessageDescriptor(
            fullName = "common.GamesGetSessionOverviewResponse",
            messageClass = org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse::class,
            messageCompanion = this,
            fields = buildList(6) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "table_index",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "tableIndex",
                        value = org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse::tableIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PlayerInSession>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PlayerInSession.Companion)),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse::players
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "state",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.SessionState.Companion),
                        jsonName = "state",
                        value = org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse::state
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timer_state",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.EventsGetTimerStateResponse.Companion),
                        jsonName = "timerState",
                        value = org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse::timerState
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetPlayerStatsPayload(
    val playerId: Int = 0,
    val eventIdList: List<Int> = emptyList(),
    val dateFrom: String? = null,
    val dateTo: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload by lazy { org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetPlayerStatsPayload",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id_list",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "eventIdList",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload::eventIdList
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "date_from",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "dateFrom",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload::dateFrom
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "date_to",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "dateTo",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload::dateTo
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetPlayerStatsResponse(
    val ratingHistory: List<Int> = emptyList(),
    val scoreHistory: List<org.yagi.motel.pantheon.api.SessionHistoryResultTable> = emptyList(),
    val playersInfo: List<org.yagi.motel.pantheon.api.Player> = emptyList(),
    val placesSummary: List<org.yagi.motel.pantheon.api.PlacesSummaryItem> = emptyList(),
    val totalPlayedGames: Int = 0,
    val totalPlayedRounds: Int = 0,
    val winSummary: org.yagi.motel.pantheon.api.PlayerWinSummary? = null,
    val handsValueSummary: List<org.yagi.motel.pantheon.api.HandValueStat> = emptyList(),
    val yakuSummary: List<org.yagi.motel.pantheon.api.YakuStat> = emptyList(),
    val riichiSummary: org.yagi.motel.pantheon.api.RiichiSummary? = null,
    val doraStat: org.yagi.motel.pantheon.api.DoraSummary? = null,
    val lastUpdate: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse by lazy { org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetPlayerStatsResponse",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::class,
            messageCompanion = this,
            fields = buildList(12) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rating_history",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "ratingHistory",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::ratingHistory
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "score_history",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.SessionHistoryResultTable>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.SessionHistoryResultTable.Companion)),
                        jsonName = "scoreHistory",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::scoreHistory
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players_info",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Player>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Player.Companion)),
                        jsonName = "playersInfo",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::playersInfo
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "places_summary",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PlacesSummaryItem>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PlacesSummaryItem.Companion)),
                        jsonName = "placesSummary",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::placesSummary
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "total_played_games",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "totalPlayedGames",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::totalPlayedGames
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "total_played_rounds",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "totalPlayedRounds",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::totalPlayedRounds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "win_summary",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PlayerWinSummary.Companion),
                        jsonName = "winSummary",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::winSummary
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "hands_value_summary",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.HandValueStat>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.HandValueStat.Companion)),
                        jsonName = "handsValueSummary",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::handsValueSummary
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "yaku_summary",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.YakuStat>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.YakuStat.Companion)),
                        jsonName = "yakuSummary",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::yakuSummary
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_summary",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.RiichiSummary.Companion),
                        jsonName = "riichiSummary",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::riichiSummary
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "dora_stat",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.DoraSummary.Companion),
                        jsonName = "doraStat",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::doraStat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse::lastUpdate
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GamesAddRoundPayload(
    val sessionHash: String = "",
    val roundData: org.yagi.motel.pantheon.api.Round? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GamesAddRoundPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesAddRoundPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GamesAddRoundPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GamesAddRoundPayload by lazy { org.yagi.motel.pantheon.api.GamesAddRoundPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GamesAddRoundPayload = org.yagi.motel.pantheon.api.GamesAddRoundPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesAddRoundPayload> = pbandk.MessageDescriptor(
            fullName = "common.GamesAddRoundPayload",
            messageClass = org.yagi.motel.pantheon.api.GamesAddRoundPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_hash",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "sessionHash",
                        value = org.yagi.motel.pantheon.api.GamesAddRoundPayload::sessionHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round_data",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Round.Companion),
                        jsonName = "roundData",
                        value = org.yagi.motel.pantheon.api.GamesAddRoundPayload::roundData
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GamesAddRoundResponse(
    val scores: List<org.yagi.motel.pantheon.api.IntermediateResultOfSession> = emptyList(),
    val round: Int = 0,
    val honba: Int = 0,
    val riichiBets: Int = 0,
    val prematurelyFinished: Boolean = false,
    val roundJustChanged: Boolean = false,
    val isFinished: Boolean = false,
    val lastHandStarted: Boolean = false,
    val lastOutcome: org.yagi.motel.pantheon.api.RoundOutcome? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GamesAddRoundResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesAddRoundResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GamesAddRoundResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GamesAddRoundResponse by lazy { org.yagi.motel.pantheon.api.GamesAddRoundResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GamesAddRoundResponse = org.yagi.motel.pantheon.api.GamesAddRoundResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesAddRoundResponse> = pbandk.MessageDescriptor(
            fullName = "common.GamesAddRoundResponse",
            messageClass = org.yagi.motel.pantheon.api.GamesAddRoundResponse::class,
            messageCompanion = this,
            fields = buildList(9) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scores",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.IntermediateResultOfSession>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.IntermediateResultOfSession.Companion)),
                        jsonName = "scores",
                        value = org.yagi.motel.pantheon.api.GamesAddRoundResponse::scores
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "round",
                        value = org.yagi.motel.pantheon.api.GamesAddRoundResponse::round
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "honba",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "honba",
                        value = org.yagi.motel.pantheon.api.GamesAddRoundResponse::honba
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "riichi_bets",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "riichiBets",
                        value = org.yagi.motel.pantheon.api.GamesAddRoundResponse::riichiBets
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "prematurely_finished",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "prematurelyFinished",
                        value = org.yagi.motel.pantheon.api.GamesAddRoundResponse::prematurelyFinished
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round_just_changed",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "roundJustChanged",
                        value = org.yagi.motel.pantheon.api.GamesAddRoundResponse::roundJustChanged
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_finished",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isFinished",
                        value = org.yagi.motel.pantheon.api.GamesAddRoundResponse::isFinished
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_hand_started",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "lastHandStarted",
                        value = org.yagi.motel.pantheon.api.GamesAddRoundResponse::lastHandStarted
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_outcome",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.yagi.motel.pantheon.api.RoundOutcome.Companion, hasPresence = true),
                        jsonName = "lastOutcome",
                        value = org.yagi.motel.pantheon.api.GamesAddRoundResponse::lastOutcome
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GamesPreviewRoundPayload(
    val sessionHash: String = "",
    val roundData: org.yagi.motel.pantheon.api.Round? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GamesPreviewRoundPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesPreviewRoundPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GamesPreviewRoundPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GamesPreviewRoundPayload by lazy { org.yagi.motel.pantheon.api.GamesPreviewRoundPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GamesPreviewRoundPayload = org.yagi.motel.pantheon.api.GamesPreviewRoundPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesPreviewRoundPayload> = pbandk.MessageDescriptor(
            fullName = "common.GamesPreviewRoundPayload",
            messageClass = org.yagi.motel.pantheon.api.GamesPreviewRoundPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_hash",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "sessionHash",
                        value = org.yagi.motel.pantheon.api.GamesPreviewRoundPayload::sessionHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round_data",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Round.Companion),
                        jsonName = "roundData",
                        value = org.yagi.motel.pantheon.api.GamesPreviewRoundPayload::roundData
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GamesPreviewRoundResponse(
    val state: org.yagi.motel.pantheon.api.RoundState? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GamesPreviewRoundResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesPreviewRoundResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GamesPreviewRoundResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GamesPreviewRoundResponse by lazy { org.yagi.motel.pantheon.api.GamesPreviewRoundResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GamesPreviewRoundResponse = org.yagi.motel.pantheon.api.GamesPreviewRoundResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesPreviewRoundResponse> = pbandk.MessageDescriptor(
            fullName = "common.GamesPreviewRoundResponse",
            messageClass = org.yagi.motel.pantheon.api.GamesPreviewRoundResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "state",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.RoundState.Companion),
                        jsonName = "state",
                        value = org.yagi.motel.pantheon.api.GamesPreviewRoundResponse::state
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GamesAddOnlineReplayPayload(
    val eventId: Int = 0,
    val link: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload by lazy { org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload = org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload> = pbandk.MessageDescriptor(
            fullName = "common.GamesAddOnlineReplayPayload",
            messageClass = org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "link",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "link",
                        value = org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload::link
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GamesAddOnlineReplayResponse(
    val game: org.yagi.motel.pantheon.api.GameResult? = null,
    val players: List<org.yagi.motel.pantheon.api.Player> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse by lazy { org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse = org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse> = pbandk.MessageDescriptor(
            fullName = "common.GamesAddOnlineReplayResponse",
            messageClass = org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "game",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.GameResult.Companion),
                        jsonName = "game",
                        value = org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse::game
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Player>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Player.Companion)),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse::players
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetLastResultsPayload(
    val playerId: Int = 0,
    val eventId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload by lazy { org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload = org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetLastResultsPayload",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload::eventId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetLastResultsResponse(
    val results: List<org.yagi.motel.pantheon.api.SessionHistoryResult> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse by lazy { org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse = org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetLastResultsResponse",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "results",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.SessionHistoryResult>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.SessionHistoryResult.Companion)),
                        jsonName = "results",
                        value = org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse::results
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetLastRoundPayload(
    val playerId: Int = 0,
    val eventId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload by lazy { org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload = org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetLastRoundPayload",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload::eventId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetLastRoundResponse(
    val round: org.yagi.motel.pantheon.api.RoundState? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse by lazy { org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse = org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetLastRoundResponse",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.RoundState.Companion),
                        jsonName = "round",
                        value = org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse::round
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetAllRoundsResponse(
    val rounds: List<org.yagi.motel.pantheon.api.RoundState> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse by lazy { org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse = org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetAllRoundsResponse",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rounds",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.RoundState>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.RoundState.Companion)),
                        jsonName = "rounds",
                        value = org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse::rounds
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetLastRoundByHashResponse(
    val round: org.yagi.motel.pantheon.api.RoundState? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse by lazy { org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse = org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetLastRoundByHashResponse",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "round",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.RoundState.Companion),
                        jsonName = "round",
                        value = org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse::round
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetEventForEditPayload(
    val id: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetEventForEditPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetEventForEditPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetEventForEditPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetEventForEditPayload by lazy { org.yagi.motel.pantheon.api.EventsGetEventForEditPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetEventForEditPayload = org.yagi.motel.pantheon.api.EventsGetEventForEditPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetEventForEditPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetEventForEditPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsGetEventForEditPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.EventsGetEventForEditPayload::id
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetEventForEditResponse(
    val id: Int = 0,
    val event: org.yagi.motel.pantheon.api.EventData? = null,
    val finished: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetEventForEditResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetEventForEditResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetEventForEditResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetEventForEditResponse by lazy { org.yagi.motel.pantheon.api.EventsGetEventForEditResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetEventForEditResponse = org.yagi.motel.pantheon.api.EventsGetEventForEditResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetEventForEditResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetEventForEditResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetEventForEditResponse::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.EventsGetEventForEditResponse::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.EventData.Companion),
                        jsonName = "event",
                        value = org.yagi.motel.pantheon.api.EventsGetEventForEditResponse::event
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "finished",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "finished",
                        value = org.yagi.motel.pantheon.api.EventsGetEventForEditResponse::finished
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsUpdateEventPayload(
    val id: Int = 0,
    val event: org.yagi.motel.pantheon.api.EventData? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsUpdateEventPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUpdateEventPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsUpdateEventPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsUpdateEventPayload by lazy { org.yagi.motel.pantheon.api.EventsUpdateEventPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsUpdateEventPayload = org.yagi.motel.pantheon.api.EventsUpdateEventPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUpdateEventPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsUpdateEventPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsUpdateEventPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.EventsUpdateEventPayload::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.EventData.Companion),
                        jsonName = "event",
                        value = org.yagi.motel.pantheon.api.EventsUpdateEventPayload::event
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetTablesStatePayload(
    val eventId: Int = 0,
    val omitLastRound: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetTablesStatePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetTablesStatePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetTablesStatePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetTablesStatePayload by lazy { org.yagi.motel.pantheon.api.EventsGetTablesStatePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetTablesStatePayload = org.yagi.motel.pantheon.api.EventsGetTablesStatePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetTablesStatePayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetTablesStatePayload",
            messageClass = org.yagi.motel.pantheon.api.EventsGetTablesStatePayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.EventsGetTablesStatePayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "omit_last_round",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "omitLastRound",
                        value = org.yagi.motel.pantheon.api.EventsGetTablesStatePayload::omitLastRound
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetTablesStateResponse(
    val tables: List<org.yagi.motel.pantheon.api.TableState> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetTablesStateResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetTablesStateResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetTablesStateResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetTablesStateResponse by lazy { org.yagi.motel.pantheon.api.EventsGetTablesStateResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetTablesStateResponse = org.yagi.motel.pantheon.api.EventsGetTablesStateResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetTablesStateResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetTablesStateResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetTablesStateResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tables",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.TableState>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.TableState.Companion)),
                        jsonName = "tables",
                        value = org.yagi.motel.pantheon.api.EventsGetTablesStateResponse::tables
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsRegisterPlayerPayload(
    val playerId: Int = 0,
    val eventId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload by lazy { org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload = org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsRegisterPlayerPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload::eventId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsUnregisterPlayerPayload(
    val playerId: Int = 0,
    val eventId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload by lazy { org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload = org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsUnregisterPlayerPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload::eventId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsUpdatePlayerSeatingFlagPayload(
    val playerId: Int = 0,
    val eventId: Int = 0,
    val ignoreSeating: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload by lazy { org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload = org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsUpdatePlayerSeatingFlagPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ignore_seating",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ignoreSeating",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload::ignoreSeating
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetAchievementsPayload(
    val achievementsList: List<String> = emptyList(),
    val eventId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetAchievementsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetAchievementsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetAchievementsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetAchievementsPayload by lazy { org.yagi.motel.pantheon.api.EventsGetAchievementsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetAchievementsPayload = org.yagi.motel.pantheon.api.EventsGetAchievementsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetAchievementsPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetAchievementsPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsGetAchievementsPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "achievements_list",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "achievementsList",
                        value = org.yagi.motel.pantheon.api.EventsGetAchievementsPayload::achievementsList
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.EventsGetAchievementsPayload::eventId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetAchievementsResponse(
    val achievements: List<org.yagi.motel.pantheon.api.Achievement> = emptyList(),
    val lastUpdate: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetAchievementsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetAchievementsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetAchievementsResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetAchievementsResponse by lazy { org.yagi.motel.pantheon.api.EventsGetAchievementsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetAchievementsResponse = org.yagi.motel.pantheon.api.EventsGetAchievementsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetAchievementsResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetAchievementsResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetAchievementsResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "achievements",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Achievement>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Achievement.Companion)),
                        jsonName = "achievements",
                        value = org.yagi.motel.pantheon.api.EventsGetAchievementsResponse::achievements
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.EventsGetAchievementsResponse::lastUpdate
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsUpdatePlayersLocalIdsPayload(
    val eventId: Int = 0,
    val idsToLocalIds: List<org.yagi.motel.pantheon.api.LocalIdMapping> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload by lazy { org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload = org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsUpdatePlayersLocalIdsPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ids_to_local_ids",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.LocalIdMapping>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.LocalIdMapping.Companion)),
                        jsonName = "idsToLocalIds",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload::idsToLocalIds
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsUpdatePlayerReplacementPayload(
    val playerId: Int = 0,
    val eventId: Int = 0,
    val replacementId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload by lazy { org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload = org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsUpdatePlayerReplacementPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "replacement_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "replacementId",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload::replacementId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsUpdatePlayersTeamsPayload(
    val eventId: Int = 0,
    val idsToTeamNames: List<org.yagi.motel.pantheon.api.TeamMapping> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload by lazy { org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload = org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsUpdatePlayersTeamsPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ids_to_team_names",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.TeamMapping>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.TeamMapping.Companion)),
                        jsonName = "idsToTeamNames",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload::idsToTeamNames
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GamesStartGamePayload(
    val eventId: Int = 0,
    val players: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GamesStartGamePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesStartGamePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GamesStartGamePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GamesStartGamePayload by lazy { org.yagi.motel.pantheon.api.GamesStartGamePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GamesStartGamePayload = org.yagi.motel.pantheon.api.GamesStartGamePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesStartGamePayload> = pbandk.MessageDescriptor(
            fullName = "common.GamesStartGamePayload",
            messageClass = org.yagi.motel.pantheon.api.GamesStartGamePayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.GamesStartGamePayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.GamesStartGamePayload::players
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GamesDropLastRoundPayload(
    val sessionHash: String = "",
    val intermediateResults: List<org.yagi.motel.pantheon.api.IntermediateResultOfSession> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GamesDropLastRoundPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesDropLastRoundPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GamesDropLastRoundPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GamesDropLastRoundPayload by lazy { org.yagi.motel.pantheon.api.GamesDropLastRoundPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GamesDropLastRoundPayload = org.yagi.motel.pantheon.api.GamesDropLastRoundPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesDropLastRoundPayload> = pbandk.MessageDescriptor(
            fullName = "common.GamesDropLastRoundPayload",
            messageClass = org.yagi.motel.pantheon.api.GamesDropLastRoundPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_hash",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "sessionHash",
                        value = org.yagi.motel.pantheon.api.GamesDropLastRoundPayload::sessionHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "intermediate_results",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.IntermediateResultOfSession>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.IntermediateResultOfSession.Companion)),
                        jsonName = "intermediateResults",
                        value = org.yagi.motel.pantheon.api.GamesDropLastRoundPayload::intermediateResults
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GamesAddPenaltyPayload(
    val eventId: Int = 0,
    val playerId: Int = 0,
    val amount: Int = 0,
    val reason: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GamesAddPenaltyPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesAddPenaltyPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GamesAddPenaltyPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GamesAddPenaltyPayload by lazy { org.yagi.motel.pantheon.api.GamesAddPenaltyPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GamesAddPenaltyPayload = org.yagi.motel.pantheon.api.GamesAddPenaltyPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesAddPenaltyPayload> = pbandk.MessageDescriptor(
            fullName = "common.GamesAddPenaltyPayload",
            messageClass = org.yagi.motel.pantheon.api.GamesAddPenaltyPayload::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.GamesAddPenaltyPayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.GamesAddPenaltyPayload::playerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "amount",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "amount",
                        value = org.yagi.motel.pantheon.api.GamesAddPenaltyPayload::amount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reason",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "reason",
                        value = org.yagi.motel.pantheon.api.GamesAddPenaltyPayload::reason
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GamesAddPenaltyGamePayload(
    val eventId: Int = 0,
    val players: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload by lazy { org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload = org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload> = pbandk.MessageDescriptor(
            fullName = "common.GamesAddPenaltyGamePayload",
            messageClass = org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload::players
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetPlayerPayload(
    val id: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetPlayerPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetPlayerPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetPlayerPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetPlayerPayload by lazy { org.yagi.motel.pantheon.api.PlayersGetPlayerPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetPlayerPayload = org.yagi.motel.pantheon.api.PlayersGetPlayerPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetPlayerPayload> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetPlayerPayload",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetPlayerPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerPayload::id
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PlayersGetPlayerResponse(
    val players: org.yagi.motel.pantheon.api.Player? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PlayersGetPlayerResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetPlayerResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PlayersGetPlayerResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PlayersGetPlayerResponse by lazy { org.yagi.motel.pantheon.api.PlayersGetPlayerResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PlayersGetPlayerResponse = org.yagi.motel.pantheon.api.PlayersGetPlayerResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PlayersGetPlayerResponse> = pbandk.MessageDescriptor(
            fullName = "common.PlayersGetPlayerResponse",
            messageClass = org.yagi.motel.pantheon.api.PlayersGetPlayerResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Player.Companion),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.PlayersGetPlayerResponse::players
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetCurrentSeatingResponse(
    val seating: List<org.yagi.motel.pantheon.api.PlayerSeating> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse by lazy { org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse = org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetCurrentSeatingResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "seating",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PlayerSeating>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PlayerSeating.Companion)),
                        jsonName = "seating",
                        value = org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse::seating
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SeatingMakeShuffledSeatingPayload(
    val eventId: Int = 0,
    val groupsCount: Int = 0,
    val seed: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload by lazy { org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload = org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload> = pbandk.MessageDescriptor(
            fullName = "common.SeatingMakeShuffledSeatingPayload",
            messageClass = org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "groups_count",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "groupsCount",
                        value = org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload::groupsCount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "seed",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "seed",
                        value = org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload::seed
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SeatingGenerateSwissSeatingPayload(
    val eventId: Int = 0,
    val substituteReplacementPlayers: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload by lazy { org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload = org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload> = pbandk.MessageDescriptor(
            fullName = "common.SeatingGenerateSwissSeatingPayload",
            messageClass = org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "substitute_replacement_players",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "substituteReplacementPlayers",
                        value = org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload::substituteReplacementPlayers
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SeatingGenerateSwissSeatingResponse(
    val tables: List<org.yagi.motel.pantheon.api.TableItemSwiss> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse by lazy { org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse = org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse> = pbandk.MessageDescriptor(
            fullName = "common.SeatingGenerateSwissSeatingResponse",
            messageClass = org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tables",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.TableItemSwiss>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.TableItemSwiss.Companion)),
                        jsonName = "tables",
                        value = org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse::tables
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SeatingMakeIntervalSeatingPayload(
    val eventId: Int = 0,
    val step: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload by lazy { org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload = org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload> = pbandk.MessageDescriptor(
            fullName = "common.SeatingMakeIntervalSeatingPayload",
            messageClass = org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "step",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "step",
                        value = org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload::step
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SeatingMakePrescriptedSeatingPayload(
    val eventId: Int = 0,
    val randomizeAtTables: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload by lazy { org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload = org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload> = pbandk.MessageDescriptor(
            fullName = "common.SeatingMakePrescriptedSeatingPayload",
            messageClass = org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "randomize_at_tables",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "randomizeAtTables",
                        value = org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload::randomizeAtTables
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SeatingGetNextPrescriptedSeatingResponse(
    val tables: List<org.yagi.motel.pantheon.api.PrescriptedTable> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse by lazy { org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse = org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse> = pbandk.MessageDescriptor(
            fullName = "common.SeatingGetNextPrescriptedSeatingResponse",
            messageClass = org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tables",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PrescriptedTable>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PrescriptedTable.Companion)),
                        jsonName = "tables",
                        value = org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse::tables
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetPrescriptedEventConfigResponse(
    val eventId: Int = 0,
    val nextSessionIndex: Int = 0,
    val errors: List<String> = emptyList(),
    val prescript: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse by lazy { org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse = org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetPrescriptedEventConfigResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "next_session_index",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "nextSessionIndex",
                        value = org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse::nextSessionIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "prescript",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "prescript",
                        value = org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse::prescript
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "errors",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "errors",
                        value = org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse::errors
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsUpdatePrescriptedEventConfigPayload(
    val eventId: Int = 0,
    val nextSessionIndex: Int = 0,
    val prescript: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload by lazy { org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload = org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload> = pbandk.MessageDescriptor(
            fullName = "common.EventsUpdatePrescriptedEventConfigPayload",
            messageClass = org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "next_session_index",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "nextSessionIndex",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload::nextSessionIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "prescript",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "prescript",
                        value = org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload::prescript
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EventsGetStartingTimerResponse(
    val timer: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse by lazy { org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse = org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse> = pbandk.MessageDescriptor(
            fullName = "common.EventsGetStartingTimerResponse",
            messageClass = org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timer",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "timer",
                        value = org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse::timer
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ClearStatCachePayload(
    val playerId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.ClearStatCachePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.ClearStatCachePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.ClearStatCachePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.ClearStatCachePayload by lazy { org.yagi.motel.pantheon.api.ClearStatCachePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.ClearStatCachePayload = org.yagi.motel.pantheon.api.ClearStatCachePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.ClearStatCachePayload> = pbandk.MessageDescriptor(
            fullName = "common.ClearStatCachePayload",
            messageClass = org.yagi.motel.pantheon.api.ClearStatCachePayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.ClearStatCachePayload::playerId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class TypedGamesAddOnlineReplayPayload(
    val eventId: Int = 0,
    val platformId: Int = 0,
    val contentType: Int = 0,
    val logTimestamp: Int = 0,
    val replayHash: String = "",
    val content: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload by lazy { org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload = org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload> = pbandk.MessageDescriptor(
            fullName = "common.TypedGamesAddOnlineReplayPayload",
            messageClass = org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload::class,
            messageCompanion = this,
            fields = buildList(6) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "platform_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "platformId",
                        value = org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload::platformId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "content_type",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "contentType",
                        value = org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload::contentType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "log_timestamp",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "logTimestamp",
                        value = org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload::logTimestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "replay_hash",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "replayHash",
                        value = org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload::replayHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "content",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "content",
                        value = org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload::content
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class CallRefereePayload(
    val tableIndex: Int = 0,
    val eventId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.CallRefereePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.CallRefereePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.CallRefereePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.CallRefereePayload by lazy { org.yagi.motel.pantheon.api.CallRefereePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.CallRefereePayload = org.yagi.motel.pantheon.api.CallRefereePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.CallRefereePayload> = pbandk.MessageDescriptor(
            fullName = "common.CallRefereePayload",
            messageClass = org.yagi.motel.pantheon.api.CallRefereePayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "table_index",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "tableIndex",
                        value = org.yagi.motel.pantheon.api.CallRefereePayload::tableIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.CallRefereePayload::eventId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PenaltiesResponse(
    val penalties: List<org.yagi.motel.pantheon.api.Penalty> = emptyList(),
    val referees: List<org.yagi.motel.pantheon.api.Player> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PenaltiesResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PenaltiesResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PenaltiesResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PenaltiesResponse by lazy { org.yagi.motel.pantheon.api.PenaltiesResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PenaltiesResponse = org.yagi.motel.pantheon.api.PenaltiesResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PenaltiesResponse> = pbandk.MessageDescriptor(
            fullName = "common.PenaltiesResponse",
            messageClass = org.yagi.motel.pantheon.api.PenaltiesResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "penalties",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Penalty>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Penalty.Companion)),
                        jsonName = "penalties",
                        value = org.yagi.motel.pantheon.api.PenaltiesResponse::penalties
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "referees",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Player>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Player.Companion)),
                        jsonName = "referees",
                        value = org.yagi.motel.pantheon.api.PenaltiesResponse::referees
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class CancelPenaltyPayload(
    val penaltyId: Int = 0,
    val reason: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.CancelPenaltyPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.CancelPenaltyPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.CancelPenaltyPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.CancelPenaltyPayload by lazy { org.yagi.motel.pantheon.api.CancelPenaltyPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.CancelPenaltyPayload = org.yagi.motel.pantheon.api.CancelPenaltyPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.CancelPenaltyPayload> = pbandk.MessageDescriptor(
            fullName = "common.CancelPenaltyPayload",
            messageClass = org.yagi.motel.pantheon.api.CancelPenaltyPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "penalty_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "penaltyId",
                        value = org.yagi.motel.pantheon.api.CancelPenaltyPayload::penaltyId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reason",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "reason",
                        value = org.yagi.motel.pantheon.api.CancelPenaltyPayload::reason
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AddExtraTimePayload(
    val sessionHashList: List<String> = emptyList(),
    val extraTime: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AddExtraTimePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AddExtraTimePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AddExtraTimePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AddExtraTimePayload by lazy { org.yagi.motel.pantheon.api.AddExtraTimePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AddExtraTimePayload = org.yagi.motel.pantheon.api.AddExtraTimePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AddExtraTimePayload> = pbandk.MessageDescriptor(
            fullName = "common.AddExtraTimePayload",
            messageClass = org.yagi.motel.pantheon.api.AddExtraTimePayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_hash_list",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "sessionHashList",
                        value = org.yagi.motel.pantheon.api.AddExtraTimePayload::sessionHashList
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extra_time",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "extraTime",
                        value = org.yagi.motel.pantheon.api.AddExtraTimePayload::extraTime
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GetCurrentStatePayload(
    val eventId: Int = 0,
    val playerId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GetCurrentStatePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GetCurrentStatePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GetCurrentStatePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GetCurrentStatePayload by lazy { org.yagi.motel.pantheon.api.GetCurrentStatePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GetCurrentStatePayload = org.yagi.motel.pantheon.api.GetCurrentStatePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GetCurrentStatePayload> = pbandk.MessageDescriptor(
            fullName = "common.GetCurrentStatePayload",
            messageClass = org.yagi.motel.pantheon.api.GetCurrentStatePayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.GetCurrentStatePayload::eventId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "player_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "playerId",
                        value = org.yagi.motel.pantheon.api.GetCurrentStatePayload::playerId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GetCurrentStateResponse(
    val sessions: List<org.yagi.motel.pantheon.api.CurrentSession> = emptyList(),
    val config: org.yagi.motel.pantheon.api.GameConfig? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.GetCurrentStateResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GetCurrentStateResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.GetCurrentStateResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.GetCurrentStateResponse by lazy { org.yagi.motel.pantheon.api.GetCurrentStateResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.GetCurrentStateResponse = org.yagi.motel.pantheon.api.GetCurrentStateResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.GetCurrentStateResponse> = pbandk.MessageDescriptor(
            fullName = "common.GetCurrentStateResponse",
            messageClass = org.yagi.motel.pantheon.api.GetCurrentStateResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sessions",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.CurrentSession>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.CurrentSession.Companion)),
                        jsonName = "sessions",
                        value = org.yagi.motel.pantheon.api.GetCurrentStateResponse::sessions
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "config",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.GameConfig.Companion),
                        jsonName = "config",
                        value = org.yagi.motel.pantheon.api.GetCurrentStateResponse::config
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ChomboResponse(
    val chombos: List<org.yagi.motel.pantheon.api.Chombo> = emptyList(),
    val players: List<org.yagi.motel.pantheon.api.Player> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.ChomboResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.ChomboResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.ChomboResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.ChomboResponse by lazy { org.yagi.motel.pantheon.api.ChomboResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.ChomboResponse = org.yagi.motel.pantheon.api.ChomboResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.ChomboResponse> = pbandk.MessageDescriptor(
            fullName = "common.ChomboResponse",
            messageClass = org.yagi.motel.pantheon.api.ChomboResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "chombos",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Chombo>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Chombo.Companion)),
                        jsonName = "chombos",
                        value = org.yagi.motel.pantheon.api.ChomboResponse::chombos
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "players",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Player>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Player.Companion)),
                        jsonName = "players",
                        value = org.yagi.motel.pantheon.api.ChomboResponse::players
                    )
                )
            }
        )
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetRulesetsPayload")
public fun EventsGetRulesetsPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsGetRulesetsPayload = this ?: EventsGetRulesetsPayload.defaultInstance

private fun EventsGetRulesetsPayload.protoMergeImpl(plus: pbandk.Message?): EventsGetRulesetsPayload = (plus as? EventsGetRulesetsPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetRulesetsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetRulesetsPayload {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return EventsGetRulesetsPayload(unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetRulesetsResponse")
public fun EventsGetRulesetsResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetRulesetsResponse = this ?: EventsGetRulesetsResponse.defaultInstance

private fun EventsGetRulesetsResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetRulesetsResponse = (plus as? EventsGetRulesetsResponse)?.let {
    it.copy(
        rulesets = rulesets + plus.rulesets,
        rulesetIds = rulesetIds + plus.rulesetIds,
        rulesetTitles = rulesetTitles + plus.rulesetTitles,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetRulesetsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetRulesetsResponse {
    var rulesets: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.RulesetConfig>? = null
    var rulesetIds: pbandk.ListWithSize.Builder<String>? = null
    var rulesetTitles: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> rulesets = (rulesets ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.RulesetConfig> }
            2 -> rulesetIds = (rulesetIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            3 -> rulesetTitles = (rulesetTitles ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
        }
    }

    return EventsGetRulesetsResponse(pbandk.ListWithSize.Builder.fixed(rulesets), pbandk.ListWithSize.Builder.fixed(rulesetIds), pbandk.ListWithSize.Builder.fixed(rulesetTitles), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetEventsPayload")
public fun EventsGetEventsPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsGetEventsPayload = this ?: EventsGetEventsPayload.defaultInstance

private fun EventsGetEventsPayload.protoMergeImpl(plus: pbandk.Message?): EventsGetEventsPayload = (plus as? EventsGetEventsPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetEventsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetEventsPayload {
    var limit = 0
    var offset = 0
    var filterUnlisted = false
    var filter = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> limit = _fieldValue as Int
            2 -> offset = _fieldValue as Int
            3 -> filterUnlisted = _fieldValue as Boolean
            4 -> filter = _fieldValue as String
        }
    }

    return EventsGetEventsPayload(limit, offset, filterUnlisted, filter, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetEventsResponse")
public fun EventsGetEventsResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetEventsResponse = this ?: EventsGetEventsResponse.defaultInstance

private fun EventsGetEventsResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetEventsResponse = (plus as? EventsGetEventsResponse)?.let {
    it.copy(
        events = events + plus.events,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetEventsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetEventsResponse {
    var total = 0
    var events: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Event>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> total = _fieldValue as Int
            2 -> events = (events ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Event> }
        }
    }

    return EventsGetEventsResponse(total, pbandk.ListWithSize.Builder.fixed(events), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetEventsByIdPayload")
public fun EventsGetEventsByIdPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsGetEventsByIdPayload = this ?: EventsGetEventsByIdPayload.defaultInstance

private fun EventsGetEventsByIdPayload.protoMergeImpl(plus: pbandk.Message?): EventsGetEventsByIdPayload = (plus as? EventsGetEventsByIdPayload)?.let {
    it.copy(
        ids = ids + plus.ids,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetEventsByIdPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetEventsByIdPayload {
    var ids: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ids = (ids ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
        }
    }

    return EventsGetEventsByIdPayload(pbandk.ListWithSize.Builder.fixed(ids), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetEventsByIdResponse")
public fun EventsGetEventsByIdResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetEventsByIdResponse = this ?: EventsGetEventsByIdResponse.defaultInstance

private fun EventsGetEventsByIdResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetEventsByIdResponse = (plus as? EventsGetEventsByIdResponse)?.let {
    it.copy(
        events = events + plus.events,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetEventsByIdResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetEventsByIdResponse {
    var events: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Event>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> events = (events ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Event> }
        }
    }

    return EventsGetEventsByIdResponse(pbandk.ListWithSize.Builder.fixed(events), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetMyEventsPayload")
public fun PlayersGetMyEventsPayload?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetMyEventsPayload = this ?: PlayersGetMyEventsPayload.defaultInstance

private fun PlayersGetMyEventsPayload.protoMergeImpl(plus: pbandk.Message?): PlayersGetMyEventsPayload = (plus as? PlayersGetMyEventsPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetMyEventsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetMyEventsPayload {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return PlayersGetMyEventsPayload(unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetMyEventsResponse")
public fun PlayersGetMyEventsResponse?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetMyEventsResponse = this ?: PlayersGetMyEventsResponse.defaultInstance

private fun PlayersGetMyEventsResponse.protoMergeImpl(plus: pbandk.Message?): PlayersGetMyEventsResponse = (plus as? PlayersGetMyEventsResponse)?.let {
    it.copy(
        events = events + plus.events,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetMyEventsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetMyEventsResponse {
    var events: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.MyEvent>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> events = (events ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.MyEvent> }
        }
    }

    return PlayersGetMyEventsResponse(pbandk.ListWithSize.Builder.fixed(events), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetRatingTablePayload")
public fun EventsGetRatingTablePayload?.orDefault(): org.yagi.motel.pantheon.api.EventsGetRatingTablePayload = this ?: EventsGetRatingTablePayload.defaultInstance

private fun EventsGetRatingTablePayload.protoMergeImpl(plus: pbandk.Message?): EventsGetRatingTablePayload = (plus as? EventsGetRatingTablePayload)?.let {
    it.copy(
        eventIdList = eventIdList + plus.eventIdList,
        onlyMinGames = plus.onlyMinGames ?: onlyMinGames,
        dateFrom = plus.dateFrom ?: dateFrom,
        dateTo = plus.dateTo ?: dateTo,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetRatingTablePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetRatingTablePayload {
    var eventIdList: pbandk.ListWithSize.Builder<Int>? = null
    var orderBy = ""
    var order = ""
    var onlyMinGames: Boolean? = null
    var dateFrom: String? = null
    var dateTo: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventIdList = (eventIdList ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            2 -> orderBy = _fieldValue as String
            3 -> order = _fieldValue as String
            5 -> onlyMinGames = _fieldValue as Boolean
            6 -> dateFrom = _fieldValue as String
            7 -> dateTo = _fieldValue as String
        }
    }

    return EventsGetRatingTablePayload(pbandk.ListWithSize.Builder.fixed(eventIdList), orderBy, order, onlyMinGames,
        dateFrom, dateTo, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetRatingTableResponse")
public fun EventsGetRatingTableResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetRatingTableResponse = this ?: EventsGetRatingTableResponse.defaultInstance

private fun EventsGetRatingTableResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetRatingTableResponse = (plus as? EventsGetRatingTableResponse)?.let {
    it.copy(
        list = list + plus.list,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetRatingTableResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetRatingTableResponse {
    var list: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PlayerInRating>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> list = (list ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PlayerInRating> }
        }
    }

    return EventsGetRatingTableResponse(pbandk.ListWithSize.Builder.fixed(list), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetLastGamesPayload")
public fun EventsGetLastGamesPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsGetLastGamesPayload = this ?: EventsGetLastGamesPayload.defaultInstance

private fun EventsGetLastGamesPayload.protoMergeImpl(plus: pbandk.Message?): EventsGetLastGamesPayload = (plus as? EventsGetLastGamesPayload)?.let {
    it.copy(
        eventIdList = eventIdList + plus.eventIdList,
        orderBy = plus.orderBy ?: orderBy,
        order = plus.order ?: order,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetLastGamesPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetLastGamesPayload {
    var eventIdList: pbandk.ListWithSize.Builder<Int>? = null
    var limit = 0
    var offset = 0
    var orderBy: String? = null
    var order: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventIdList = (eventIdList ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            2 -> limit = _fieldValue as Int
            3 -> offset = _fieldValue as Int
            4 -> orderBy = _fieldValue as String
            5 -> order = _fieldValue as String
        }
    }

    return EventsGetLastGamesPayload(pbandk.ListWithSize.Builder.fixed(eventIdList), limit, offset, orderBy,
        order, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetLastGamesResponse")
public fun EventsGetLastGamesResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetLastGamesResponse = this ?: EventsGetLastGamesResponse.defaultInstance

private fun EventsGetLastGamesResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetLastGamesResponse = (plus as? EventsGetLastGamesResponse)?.let {
    it.copy(
        games = games + plus.games,
        players = players + plus.players,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetLastGamesResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetLastGamesResponse {
    var games: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.GameResult>? = null
    var players: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Player>? = null
    var totalGames = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> games = (games ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.GameResult> }
            2 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Player> }
            3 -> totalGames = _fieldValue as Int
        }
    }

    return EventsGetLastGamesResponse(pbandk.ListWithSize.Builder.fixed(games), pbandk.ListWithSize.Builder.fixed(players), totalGames, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetGameResponse")
public fun EventsGetGameResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetGameResponse = this ?: EventsGetGameResponse.defaultInstance

private fun EventsGetGameResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetGameResponse = (plus as? EventsGetGameResponse)?.let {
    it.copy(
        game = game?.plus(plus.game) ?: plus.game,
        players = players + plus.players,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetGameResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetGameResponse {
    var game: org.yagi.motel.pantheon.api.GameResult? = null
    var players: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Player>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> game = _fieldValue as org.yagi.motel.pantheon.api.GameResult
            2 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Player> }
        }
    }

    return EventsGetGameResponse(game, pbandk.ListWithSize.Builder.fixed(players), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetGamesSeriesResponse")
public fun EventsGetGamesSeriesResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetGamesSeriesResponse = this ?: EventsGetGamesSeriesResponse.defaultInstance

private fun EventsGetGamesSeriesResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetGamesSeriesResponse = (plus as? EventsGetGamesSeriesResponse)?.let {
    it.copy(
        results = results + plus.results,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetGamesSeriesResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetGamesSeriesResponse {
    var results: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.SeriesResult>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> results = (results ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.SeriesResult> }
        }
    }

    return EventsGetGamesSeriesResponse(pbandk.ListWithSize.Builder.fixed(results), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetCurrentSessionsPayload")
public fun PlayersGetCurrentSessionsPayload?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsPayload = this ?: PlayersGetCurrentSessionsPayload.defaultInstance

private fun PlayersGetCurrentSessionsPayload.protoMergeImpl(plus: pbandk.Message?): PlayersGetCurrentSessionsPayload = (plus as? PlayersGetCurrentSessionsPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetCurrentSessionsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetCurrentSessionsPayload {
    var playerId = 0
    var eventId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> eventId = _fieldValue as Int
        }
    }

    return PlayersGetCurrentSessionsPayload(playerId, eventId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCurrentSession")
public fun CurrentSession?.orDefault(): org.yagi.motel.pantheon.api.CurrentSession = this ?: CurrentSession.defaultInstance

private fun CurrentSession.protoMergeImpl(plus: pbandk.Message?): CurrentSession = (plus as? CurrentSession)?.let {
    it.copy(
        players = players + plus.players,
        timerState = timerState?.plus(plus.timerState) ?: plus.timerState,
        tableIndex = plus.tableIndex ?: tableIndex,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CurrentSession.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CurrentSession {
    var sessionHash = ""
    var status = ""
    var players: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PlayerInSession>? = null
    var timerState: org.yagi.motel.pantheon.api.EventsGetTimerStateResponse? = null
    var tableIndex: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessionHash = _fieldValue as String
            2 -> status = _fieldValue as String
            3 -> tableIndex = _fieldValue as Int
            4 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PlayerInSession> }
            5 -> timerState = _fieldValue as org.yagi.motel.pantheon.api.EventsGetTimerStateResponse
        }
    }

    return CurrentSession(sessionHash, status, pbandk.ListWithSize.Builder.fixed(players), timerState,
        tableIndex, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetCurrentSessionsResponse")
public fun PlayersGetCurrentSessionsResponse?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetCurrentSessionsResponse = this ?: PlayersGetCurrentSessionsResponse.defaultInstance

private fun PlayersGetCurrentSessionsResponse.protoMergeImpl(plus: pbandk.Message?): PlayersGetCurrentSessionsResponse = (plus as? PlayersGetCurrentSessionsResponse)?.let {
    it.copy(
        sessions = sessions + plus.sessions,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetCurrentSessionsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetCurrentSessionsResponse {
    var sessions: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.CurrentSession>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessions = (sessions ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.CurrentSession> }
        }
    }

    return PlayersGetCurrentSessionsResponse(pbandk.ListWithSize.Builder.fixed(sessions), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetAllRegisteredPlayersPayload")
public fun EventsGetAllRegisteredPlayersPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersPayload = this ?: EventsGetAllRegisteredPlayersPayload.defaultInstance

private fun EventsGetAllRegisteredPlayersPayload.protoMergeImpl(plus: pbandk.Message?): EventsGetAllRegisteredPlayersPayload = (plus as? EventsGetAllRegisteredPlayersPayload)?.let {
    it.copy(
        eventIds = eventIds + plus.eventIds,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetAllRegisteredPlayersPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetAllRegisteredPlayersPayload {
    var eventIds: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventIds = (eventIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
        }
    }

    return EventsGetAllRegisteredPlayersPayload(pbandk.ListWithSize.Builder.fixed(eventIds), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetAllRegisteredPlayersResponse")
public fun EventsGetAllRegisteredPlayersResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetAllRegisteredPlayersResponse = this ?: EventsGetAllRegisteredPlayersResponse.defaultInstance

private fun EventsGetAllRegisteredPlayersResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetAllRegisteredPlayersResponse = (plus as? EventsGetAllRegisteredPlayersResponse)?.let {
    it.copy(
        players = players + plus.players,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetAllRegisteredPlayersResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetAllRegisteredPlayersResponse {
    var players: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.RegisteredPlayer>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.RegisteredPlayer> }
        }
    }

    return EventsGetAllRegisteredPlayersResponse(pbandk.ListWithSize.Builder.fixed(players), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetTimerStateResponse")
public fun EventsGetTimerStateResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetTimerStateResponse = this ?: EventsGetTimerStateResponse.defaultInstance

private fun EventsGetTimerStateResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetTimerStateResponse = (plus as? EventsGetTimerStateResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetTimerStateResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetTimerStateResponse {
    var started = false
    var finished = false
    var timeRemaining = 0
    var waitingForTimer = false
    var haveAutostart = false
    var autostartTimer = false
    var hideSeatingAfter = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> started = _fieldValue as Boolean
            2 -> finished = _fieldValue as Boolean
            3 -> timeRemaining = _fieldValue as Int
            4 -> waitingForTimer = _fieldValue as Boolean
            5 -> haveAutostart = _fieldValue as Boolean
            6 -> autostartTimer = _fieldValue as Boolean
            8 -> hideSeatingAfter = _fieldValue as Int
        }
    }

    return EventsGetTimerStateResponse(started, finished, timeRemaining, waitingForTimer,
        haveAutostart, autostartTimer, hideSeatingAfter, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGamesGetSessionOverviewResponse")
public fun GamesGetSessionOverviewResponse?.orDefault(): org.yagi.motel.pantheon.api.GamesGetSessionOverviewResponse = this ?: GamesGetSessionOverviewResponse.defaultInstance

private fun GamesGetSessionOverviewResponse.protoMergeImpl(plus: pbandk.Message?): GamesGetSessionOverviewResponse = (plus as? GamesGetSessionOverviewResponse)?.let {
    it.copy(
        players = players + plus.players,
        state = state?.plus(plus.state) ?: plus.state,
        timerState = timerState?.plus(plus.timerState) ?: plus.timerState,
        tableIndex = plus.tableIndex ?: tableIndex,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GamesGetSessionOverviewResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GamesGetSessionOverviewResponse {
    var id = 0
    var eventId = 0
    var players: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PlayerInSession>? = null
    var state: org.yagi.motel.pantheon.api.SessionState? = null
    var timerState: org.yagi.motel.pantheon.api.EventsGetTimerStateResponse? = null
    var tableIndex: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> eventId = _fieldValue as Int
            3 -> tableIndex = _fieldValue as Int
            4 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PlayerInSession> }
            5 -> state = _fieldValue as org.yagi.motel.pantheon.api.SessionState
            6 -> timerState = _fieldValue as org.yagi.motel.pantheon.api.EventsGetTimerStateResponse
        }
    }

    return GamesGetSessionOverviewResponse(id, eventId, pbandk.ListWithSize.Builder.fixed(players), state,
        timerState, tableIndex, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetPlayerStatsPayload")
public fun PlayersGetPlayerStatsPayload?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetPlayerStatsPayload = this ?: PlayersGetPlayerStatsPayload.defaultInstance

private fun PlayersGetPlayerStatsPayload.protoMergeImpl(plus: pbandk.Message?): PlayersGetPlayerStatsPayload = (plus as? PlayersGetPlayerStatsPayload)?.let {
    it.copy(
        eventIdList = eventIdList + plus.eventIdList,
        dateFrom = plus.dateFrom ?: dateFrom,
        dateTo = plus.dateTo ?: dateTo,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetPlayerStatsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetPlayerStatsPayload {
    var playerId = 0
    var eventIdList: pbandk.ListWithSize.Builder<Int>? = null
    var dateFrom: String? = null
    var dateTo: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> eventIdList = (eventIdList ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            3 -> dateFrom = _fieldValue as String
            4 -> dateTo = _fieldValue as String
        }
    }

    return PlayersGetPlayerStatsPayload(playerId, pbandk.ListWithSize.Builder.fixed(eventIdList), dateFrom, dateTo, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetPlayerStatsResponse")
public fun PlayersGetPlayerStatsResponse?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetPlayerStatsResponse = this ?: PlayersGetPlayerStatsResponse.defaultInstance

private fun PlayersGetPlayerStatsResponse.protoMergeImpl(plus: pbandk.Message?): PlayersGetPlayerStatsResponse = (plus as? PlayersGetPlayerStatsResponse)?.let {
    it.copy(
        ratingHistory = ratingHistory + plus.ratingHistory,
        scoreHistory = scoreHistory + plus.scoreHistory,
        playersInfo = playersInfo + plus.playersInfo,
        placesSummary = placesSummary + plus.placesSummary,
        winSummary = winSummary?.plus(plus.winSummary) ?: plus.winSummary,
        handsValueSummary = handsValueSummary + plus.handsValueSummary,
        yakuSummary = yakuSummary + plus.yakuSummary,
        riichiSummary = riichiSummary?.plus(plus.riichiSummary) ?: plus.riichiSummary,
        doraStat = doraStat?.plus(plus.doraStat) ?: plus.doraStat,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetPlayerStatsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetPlayerStatsResponse {
    var ratingHistory: pbandk.ListWithSize.Builder<Int>? = null
    var scoreHistory: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.SessionHistoryResultTable>? = null
    var playersInfo: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Player>? = null
    var placesSummary: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PlacesSummaryItem>? = null
    var totalPlayedGames = 0
    var totalPlayedRounds = 0
    var winSummary: org.yagi.motel.pantheon.api.PlayerWinSummary? = null
    var handsValueSummary: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.HandValueStat>? = null
    var yakuSummary: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.YakuStat>? = null
    var riichiSummary: org.yagi.motel.pantheon.api.RiichiSummary? = null
    var doraStat: org.yagi.motel.pantheon.api.DoraSummary? = null
    var lastUpdate = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ratingHistory = (ratingHistory ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            2 -> scoreHistory = (scoreHistory ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.SessionHistoryResultTable> }
            3 -> playersInfo = (playersInfo ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Player> }
            4 -> placesSummary = (placesSummary ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PlacesSummaryItem> }
            5 -> totalPlayedGames = _fieldValue as Int
            6 -> totalPlayedRounds = _fieldValue as Int
            7 -> winSummary = _fieldValue as org.yagi.motel.pantheon.api.PlayerWinSummary
            8 -> handsValueSummary = (handsValueSummary ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.HandValueStat> }
            9 -> yakuSummary = (yakuSummary ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.YakuStat> }
            10 -> riichiSummary = _fieldValue as org.yagi.motel.pantheon.api.RiichiSummary
            11 -> doraStat = _fieldValue as org.yagi.motel.pantheon.api.DoraSummary
            12 -> lastUpdate = _fieldValue as String
        }
    }

    return PlayersGetPlayerStatsResponse(pbandk.ListWithSize.Builder.fixed(ratingHistory), pbandk.ListWithSize.Builder.fixed(scoreHistory), pbandk.ListWithSize.Builder.fixed(playersInfo), pbandk.ListWithSize.Builder.fixed(placesSummary),
        totalPlayedGames, totalPlayedRounds, winSummary, pbandk.ListWithSize.Builder.fixed(handsValueSummary),
        pbandk.ListWithSize.Builder.fixed(yakuSummary), riichiSummary, doraStat, lastUpdate, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGamesAddRoundPayload")
public fun GamesAddRoundPayload?.orDefault(): org.yagi.motel.pantheon.api.GamesAddRoundPayload = this ?: GamesAddRoundPayload.defaultInstance

private fun GamesAddRoundPayload.protoMergeImpl(plus: pbandk.Message?): GamesAddRoundPayload = (plus as? GamesAddRoundPayload)?.let {
    it.copy(
        roundData = roundData?.plus(plus.roundData) ?: plus.roundData,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GamesAddRoundPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GamesAddRoundPayload {
    var sessionHash = ""
    var roundData: org.yagi.motel.pantheon.api.Round? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessionHash = _fieldValue as String
            2 -> roundData = _fieldValue as org.yagi.motel.pantheon.api.Round
        }
    }

    return GamesAddRoundPayload(sessionHash, roundData, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGamesAddRoundResponse")
public fun GamesAddRoundResponse?.orDefault(): org.yagi.motel.pantheon.api.GamesAddRoundResponse = this ?: GamesAddRoundResponse.defaultInstance

private fun GamesAddRoundResponse.protoMergeImpl(plus: pbandk.Message?): GamesAddRoundResponse = (plus as? GamesAddRoundResponse)?.let {
    it.copy(
        scores = scores + plus.scores,
        lastOutcome = plus.lastOutcome ?: lastOutcome,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GamesAddRoundResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GamesAddRoundResponse {
    var scores: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.IntermediateResultOfSession>? = null
    var round = 0
    var honba = 0
    var riichiBets = 0
    var prematurelyFinished = false
    var roundJustChanged = false
    var isFinished = false
    var lastHandStarted = false
    var lastOutcome: org.yagi.motel.pantheon.api.RoundOutcome? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> scores = (scores ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.IntermediateResultOfSession> }
            3 -> round = _fieldValue as Int
            4 -> honba = _fieldValue as Int
            5 -> riichiBets = _fieldValue as Int
            6 -> prematurelyFinished = _fieldValue as Boolean
            7 -> roundJustChanged = _fieldValue as Boolean
            8 -> isFinished = _fieldValue as Boolean
            9 -> lastHandStarted = _fieldValue as Boolean
            10 -> lastOutcome = _fieldValue as org.yagi.motel.pantheon.api.RoundOutcome
        }
    }

    return GamesAddRoundResponse(pbandk.ListWithSize.Builder.fixed(scores), round, honba, riichiBets,
        prematurelyFinished, roundJustChanged, isFinished, lastHandStarted,
        lastOutcome, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGamesPreviewRoundPayload")
public fun GamesPreviewRoundPayload?.orDefault(): org.yagi.motel.pantheon.api.GamesPreviewRoundPayload = this ?: GamesPreviewRoundPayload.defaultInstance

private fun GamesPreviewRoundPayload.protoMergeImpl(plus: pbandk.Message?): GamesPreviewRoundPayload = (plus as? GamesPreviewRoundPayload)?.let {
    it.copy(
        roundData = roundData?.plus(plus.roundData) ?: plus.roundData,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GamesPreviewRoundPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GamesPreviewRoundPayload {
    var sessionHash = ""
    var roundData: org.yagi.motel.pantheon.api.Round? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessionHash = _fieldValue as String
            2 -> roundData = _fieldValue as org.yagi.motel.pantheon.api.Round
        }
    }

    return GamesPreviewRoundPayload(sessionHash, roundData, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGamesPreviewRoundResponse")
public fun GamesPreviewRoundResponse?.orDefault(): org.yagi.motel.pantheon.api.GamesPreviewRoundResponse = this ?: GamesPreviewRoundResponse.defaultInstance

private fun GamesPreviewRoundResponse.protoMergeImpl(plus: pbandk.Message?): GamesPreviewRoundResponse = (plus as? GamesPreviewRoundResponse)?.let {
    it.copy(
        state = state?.plus(plus.state) ?: plus.state,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GamesPreviewRoundResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GamesPreviewRoundResponse {
    var state: org.yagi.motel.pantheon.api.RoundState? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> state = _fieldValue as org.yagi.motel.pantheon.api.RoundState
        }
    }

    return GamesPreviewRoundResponse(state, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGamesAddOnlineReplayPayload")
public fun GamesAddOnlineReplayPayload?.orDefault(): org.yagi.motel.pantheon.api.GamesAddOnlineReplayPayload = this ?: GamesAddOnlineReplayPayload.defaultInstance

private fun GamesAddOnlineReplayPayload.protoMergeImpl(plus: pbandk.Message?): GamesAddOnlineReplayPayload = (plus as? GamesAddOnlineReplayPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GamesAddOnlineReplayPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GamesAddOnlineReplayPayload {
    var eventId = 0
    var link = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> link = _fieldValue as String
        }
    }

    return GamesAddOnlineReplayPayload(eventId, link, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGamesAddOnlineReplayResponse")
public fun GamesAddOnlineReplayResponse?.orDefault(): org.yagi.motel.pantheon.api.GamesAddOnlineReplayResponse = this ?: GamesAddOnlineReplayResponse.defaultInstance

private fun GamesAddOnlineReplayResponse.protoMergeImpl(plus: pbandk.Message?): GamesAddOnlineReplayResponse = (plus as? GamesAddOnlineReplayResponse)?.let {
    it.copy(
        game = game?.plus(plus.game) ?: plus.game,
        players = players + plus.players,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GamesAddOnlineReplayResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GamesAddOnlineReplayResponse {
    var game: org.yagi.motel.pantheon.api.GameResult? = null
    var players: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Player>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> game = _fieldValue as org.yagi.motel.pantheon.api.GameResult
            2 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Player> }
        }
    }

    return GamesAddOnlineReplayResponse(game, pbandk.ListWithSize.Builder.fixed(players), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetLastResultsPayload")
public fun PlayersGetLastResultsPayload?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetLastResultsPayload = this ?: PlayersGetLastResultsPayload.defaultInstance

private fun PlayersGetLastResultsPayload.protoMergeImpl(plus: pbandk.Message?): PlayersGetLastResultsPayload = (plus as? PlayersGetLastResultsPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetLastResultsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetLastResultsPayload {
    var playerId = 0
    var eventId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> eventId = _fieldValue as Int
        }
    }

    return PlayersGetLastResultsPayload(playerId, eventId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetLastResultsResponse")
public fun PlayersGetLastResultsResponse?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetLastResultsResponse = this ?: PlayersGetLastResultsResponse.defaultInstance

private fun PlayersGetLastResultsResponse.protoMergeImpl(plus: pbandk.Message?): PlayersGetLastResultsResponse = (plus as? PlayersGetLastResultsResponse)?.let {
    it.copy(
        results = results + plus.results,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetLastResultsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetLastResultsResponse {
    var results: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.SessionHistoryResult>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> results = (results ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.SessionHistoryResult> }
        }
    }

    return PlayersGetLastResultsResponse(pbandk.ListWithSize.Builder.fixed(results), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetLastRoundPayload")
public fun PlayersGetLastRoundPayload?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetLastRoundPayload = this ?: PlayersGetLastRoundPayload.defaultInstance

private fun PlayersGetLastRoundPayload.protoMergeImpl(plus: pbandk.Message?): PlayersGetLastRoundPayload = (plus as? PlayersGetLastRoundPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetLastRoundPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetLastRoundPayload {
    var playerId = 0
    var eventId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> eventId = _fieldValue as Int
        }
    }

    return PlayersGetLastRoundPayload(playerId, eventId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetLastRoundResponse")
public fun PlayersGetLastRoundResponse?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetLastRoundResponse = this ?: PlayersGetLastRoundResponse.defaultInstance

private fun PlayersGetLastRoundResponse.protoMergeImpl(plus: pbandk.Message?): PlayersGetLastRoundResponse = (plus as? PlayersGetLastRoundResponse)?.let {
    it.copy(
        round = round?.plus(plus.round) ?: plus.round,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetLastRoundResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetLastRoundResponse {
    var round: org.yagi.motel.pantheon.api.RoundState? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> round = _fieldValue as org.yagi.motel.pantheon.api.RoundState
        }
    }

    return PlayersGetLastRoundResponse(round, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetAllRoundsResponse")
public fun PlayersGetAllRoundsResponse?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetAllRoundsResponse = this ?: PlayersGetAllRoundsResponse.defaultInstance

private fun PlayersGetAllRoundsResponse.protoMergeImpl(plus: pbandk.Message?): PlayersGetAllRoundsResponse = (plus as? PlayersGetAllRoundsResponse)?.let {
    it.copy(
        rounds = rounds + plus.rounds,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetAllRoundsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetAllRoundsResponse {
    var rounds: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.RoundState>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> rounds = (rounds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.RoundState> }
        }
    }

    return PlayersGetAllRoundsResponse(pbandk.ListWithSize.Builder.fixed(rounds), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetLastRoundByHashResponse")
public fun PlayersGetLastRoundByHashResponse?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetLastRoundByHashResponse = this ?: PlayersGetLastRoundByHashResponse.defaultInstance

private fun PlayersGetLastRoundByHashResponse.protoMergeImpl(plus: pbandk.Message?): PlayersGetLastRoundByHashResponse = (plus as? PlayersGetLastRoundByHashResponse)?.let {
    it.copy(
        round = round?.plus(plus.round) ?: plus.round,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetLastRoundByHashResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetLastRoundByHashResponse {
    var round: org.yagi.motel.pantheon.api.RoundState? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> round = _fieldValue as org.yagi.motel.pantheon.api.RoundState
        }
    }

    return PlayersGetLastRoundByHashResponse(round, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetEventForEditPayload")
public fun EventsGetEventForEditPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsGetEventForEditPayload = this ?: EventsGetEventForEditPayload.defaultInstance

private fun EventsGetEventForEditPayload.protoMergeImpl(plus: pbandk.Message?): EventsGetEventForEditPayload = (plus as? EventsGetEventForEditPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetEventForEditPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetEventForEditPayload {
    var id = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
        }
    }

    return EventsGetEventForEditPayload(id, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetEventForEditResponse")
public fun EventsGetEventForEditResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetEventForEditResponse = this ?: EventsGetEventForEditResponse.defaultInstance

private fun EventsGetEventForEditResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetEventForEditResponse = (plus as? EventsGetEventForEditResponse)?.let {
    it.copy(
        event = event?.plus(plus.event) ?: plus.event,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetEventForEditResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetEventForEditResponse {
    var id = 0
    var event: org.yagi.motel.pantheon.api.EventData? = null
    var finished = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> event = _fieldValue as org.yagi.motel.pantheon.api.EventData
            3 -> finished = _fieldValue as Boolean
        }
    }

    return EventsGetEventForEditResponse(id, event, finished, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsUpdateEventPayload")
public fun EventsUpdateEventPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsUpdateEventPayload = this ?: EventsUpdateEventPayload.defaultInstance

private fun EventsUpdateEventPayload.protoMergeImpl(plus: pbandk.Message?): EventsUpdateEventPayload = (plus as? EventsUpdateEventPayload)?.let {
    it.copy(
        event = event?.plus(plus.event) ?: plus.event,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsUpdateEventPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsUpdateEventPayload {
    var id = 0
    var event: org.yagi.motel.pantheon.api.EventData? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> event = _fieldValue as org.yagi.motel.pantheon.api.EventData
        }
    }

    return EventsUpdateEventPayload(id, event, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetTablesStatePayload")
public fun EventsGetTablesStatePayload?.orDefault(): org.yagi.motel.pantheon.api.EventsGetTablesStatePayload = this ?: EventsGetTablesStatePayload.defaultInstance

private fun EventsGetTablesStatePayload.protoMergeImpl(plus: pbandk.Message?): EventsGetTablesStatePayload = (plus as? EventsGetTablesStatePayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetTablesStatePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetTablesStatePayload {
    var eventId = 0
    var omitLastRound = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> omitLastRound = _fieldValue as Boolean
        }
    }

    return EventsGetTablesStatePayload(eventId, omitLastRound, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetTablesStateResponse")
public fun EventsGetTablesStateResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetTablesStateResponse = this ?: EventsGetTablesStateResponse.defaultInstance

private fun EventsGetTablesStateResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetTablesStateResponse = (plus as? EventsGetTablesStateResponse)?.let {
    it.copy(
        tables = tables + plus.tables,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetTablesStateResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetTablesStateResponse {
    var tables: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.TableState>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tables = (tables ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.TableState> }
        }
    }

    return EventsGetTablesStateResponse(pbandk.ListWithSize.Builder.fixed(tables), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsRegisterPlayerPayload")
public fun EventsRegisterPlayerPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsRegisterPlayerPayload = this ?: EventsRegisterPlayerPayload.defaultInstance

private fun EventsRegisterPlayerPayload.protoMergeImpl(plus: pbandk.Message?): EventsRegisterPlayerPayload = (plus as? EventsRegisterPlayerPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsRegisterPlayerPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsRegisterPlayerPayload {
    var playerId = 0
    var eventId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> eventId = _fieldValue as Int
        }
    }

    return EventsRegisterPlayerPayload(playerId, eventId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsUnregisterPlayerPayload")
public fun EventsUnregisterPlayerPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsUnregisterPlayerPayload = this ?: EventsUnregisterPlayerPayload.defaultInstance

private fun EventsUnregisterPlayerPayload.protoMergeImpl(plus: pbandk.Message?): EventsUnregisterPlayerPayload = (plus as? EventsUnregisterPlayerPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsUnregisterPlayerPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsUnregisterPlayerPayload {
    var playerId = 0
    var eventId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> eventId = _fieldValue as Int
        }
    }

    return EventsUnregisterPlayerPayload(playerId, eventId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsUpdatePlayerSeatingFlagPayload")
public fun EventsUpdatePlayerSeatingFlagPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsUpdatePlayerSeatingFlagPayload = this ?: EventsUpdatePlayerSeatingFlagPayload.defaultInstance

private fun EventsUpdatePlayerSeatingFlagPayload.protoMergeImpl(plus: pbandk.Message?): EventsUpdatePlayerSeatingFlagPayload = (plus as? EventsUpdatePlayerSeatingFlagPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsUpdatePlayerSeatingFlagPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsUpdatePlayerSeatingFlagPayload {
    var playerId = 0
    var eventId = 0
    var ignoreSeating = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> eventId = _fieldValue as Int
            3 -> ignoreSeating = _fieldValue as Boolean
        }
    }

    return EventsUpdatePlayerSeatingFlagPayload(playerId, eventId, ignoreSeating, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetAchievementsPayload")
public fun EventsGetAchievementsPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsGetAchievementsPayload = this ?: EventsGetAchievementsPayload.defaultInstance

private fun EventsGetAchievementsPayload.protoMergeImpl(plus: pbandk.Message?): EventsGetAchievementsPayload = (plus as? EventsGetAchievementsPayload)?.let {
    it.copy(
        achievementsList = achievementsList + plus.achievementsList,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetAchievementsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetAchievementsPayload {
    var achievementsList: pbandk.ListWithSize.Builder<String>? = null
    var eventId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            2 -> achievementsList = (achievementsList ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            3 -> eventId = _fieldValue as Int
        }
    }

    return EventsGetAchievementsPayload(pbandk.ListWithSize.Builder.fixed(achievementsList), eventId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetAchievementsResponse")
public fun EventsGetAchievementsResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetAchievementsResponse = this ?: EventsGetAchievementsResponse.defaultInstance

private fun EventsGetAchievementsResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetAchievementsResponse = (plus as? EventsGetAchievementsResponse)?.let {
    it.copy(
        achievements = achievements + plus.achievements,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetAchievementsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetAchievementsResponse {
    var achievements: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Achievement>? = null
    var lastUpdate = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> achievements = (achievements ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Achievement> }
            2 -> lastUpdate = _fieldValue as String
        }
    }

    return EventsGetAchievementsResponse(pbandk.ListWithSize.Builder.fixed(achievements), lastUpdate, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsUpdatePlayersLocalIdsPayload")
public fun EventsUpdatePlayersLocalIdsPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsUpdatePlayersLocalIdsPayload = this ?: EventsUpdatePlayersLocalIdsPayload.defaultInstance

private fun EventsUpdatePlayersLocalIdsPayload.protoMergeImpl(plus: pbandk.Message?): EventsUpdatePlayersLocalIdsPayload = (plus as? EventsUpdatePlayersLocalIdsPayload)?.let {
    it.copy(
        idsToLocalIds = idsToLocalIds + plus.idsToLocalIds,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsUpdatePlayersLocalIdsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsUpdatePlayersLocalIdsPayload {
    var eventId = 0
    var idsToLocalIds: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.LocalIdMapping>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> idsToLocalIds = (idsToLocalIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.LocalIdMapping> }
        }
    }

    return EventsUpdatePlayersLocalIdsPayload(eventId, pbandk.ListWithSize.Builder.fixed(idsToLocalIds), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsUpdatePlayerReplacementPayload")
public fun EventsUpdatePlayerReplacementPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsUpdatePlayerReplacementPayload = this ?: EventsUpdatePlayerReplacementPayload.defaultInstance

private fun EventsUpdatePlayerReplacementPayload.protoMergeImpl(plus: pbandk.Message?): EventsUpdatePlayerReplacementPayload = (plus as? EventsUpdatePlayerReplacementPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsUpdatePlayerReplacementPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsUpdatePlayerReplacementPayload {
    var playerId = 0
    var eventId = 0
    var replacementId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
            2 -> eventId = _fieldValue as Int
            3 -> replacementId = _fieldValue as Int
        }
    }

    return EventsUpdatePlayerReplacementPayload(playerId, eventId, replacementId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsUpdatePlayersTeamsPayload")
public fun EventsUpdatePlayersTeamsPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsUpdatePlayersTeamsPayload = this ?: EventsUpdatePlayersTeamsPayload.defaultInstance

private fun EventsUpdatePlayersTeamsPayload.protoMergeImpl(plus: pbandk.Message?): EventsUpdatePlayersTeamsPayload = (plus as? EventsUpdatePlayersTeamsPayload)?.let {
    it.copy(
        idsToTeamNames = idsToTeamNames + plus.idsToTeamNames,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsUpdatePlayersTeamsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsUpdatePlayersTeamsPayload {
    var eventId = 0
    var idsToTeamNames: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.TeamMapping>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> idsToTeamNames = (idsToTeamNames ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.TeamMapping> }
        }
    }

    return EventsUpdatePlayersTeamsPayload(eventId, pbandk.ListWithSize.Builder.fixed(idsToTeamNames), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGamesStartGamePayload")
public fun GamesStartGamePayload?.orDefault(): org.yagi.motel.pantheon.api.GamesStartGamePayload = this ?: GamesStartGamePayload.defaultInstance

private fun GamesStartGamePayload.protoMergeImpl(plus: pbandk.Message?): GamesStartGamePayload = (plus as? GamesStartGamePayload)?.let {
    it.copy(
        players = players + plus.players,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GamesStartGamePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GamesStartGamePayload {
    var eventId = 0
    var players: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
        }
    }

    return GamesStartGamePayload(eventId, pbandk.ListWithSize.Builder.fixed(players), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGamesDropLastRoundPayload")
public fun GamesDropLastRoundPayload?.orDefault(): org.yagi.motel.pantheon.api.GamesDropLastRoundPayload = this ?: GamesDropLastRoundPayload.defaultInstance

private fun GamesDropLastRoundPayload.protoMergeImpl(plus: pbandk.Message?): GamesDropLastRoundPayload = (plus as? GamesDropLastRoundPayload)?.let {
    it.copy(
        intermediateResults = intermediateResults + plus.intermediateResults,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GamesDropLastRoundPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GamesDropLastRoundPayload {
    var sessionHash = ""
    var intermediateResults: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.IntermediateResultOfSession>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessionHash = _fieldValue as String
            2 -> intermediateResults = (intermediateResults ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.IntermediateResultOfSession> }
        }
    }

    return GamesDropLastRoundPayload(sessionHash, pbandk.ListWithSize.Builder.fixed(intermediateResults), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGamesAddPenaltyPayload")
public fun GamesAddPenaltyPayload?.orDefault(): org.yagi.motel.pantheon.api.GamesAddPenaltyPayload = this ?: GamesAddPenaltyPayload.defaultInstance

private fun GamesAddPenaltyPayload.protoMergeImpl(plus: pbandk.Message?): GamesAddPenaltyPayload = (plus as? GamesAddPenaltyPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GamesAddPenaltyPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GamesAddPenaltyPayload {
    var eventId = 0
    var playerId = 0
    var amount = 0
    var reason = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> playerId = _fieldValue as Int
            3 -> amount = _fieldValue as Int
            4 -> reason = _fieldValue as String
        }
    }

    return GamesAddPenaltyPayload(eventId, playerId, amount, reason, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGamesAddPenaltyGamePayload")
public fun GamesAddPenaltyGamePayload?.orDefault(): org.yagi.motel.pantheon.api.GamesAddPenaltyGamePayload = this ?: GamesAddPenaltyGamePayload.defaultInstance

private fun GamesAddPenaltyGamePayload.protoMergeImpl(plus: pbandk.Message?): GamesAddPenaltyGamePayload = (plus as? GamesAddPenaltyGamePayload)?.let {
    it.copy(
        players = players + plus.players,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GamesAddPenaltyGamePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GamesAddPenaltyGamePayload {
    var eventId = 0
    var players: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
        }
    }

    return GamesAddPenaltyGamePayload(eventId, pbandk.ListWithSize.Builder.fixed(players), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetPlayerPayload")
public fun PlayersGetPlayerPayload?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetPlayerPayload = this ?: PlayersGetPlayerPayload.defaultInstance

private fun PlayersGetPlayerPayload.protoMergeImpl(plus: pbandk.Message?): PlayersGetPlayerPayload = (plus as? PlayersGetPlayerPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetPlayerPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetPlayerPayload {
    var id = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
        }
    }

    return PlayersGetPlayerPayload(id, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlayersGetPlayerResponse")
public fun PlayersGetPlayerResponse?.orDefault(): org.yagi.motel.pantheon.api.PlayersGetPlayerResponse = this ?: PlayersGetPlayerResponse.defaultInstance

private fun PlayersGetPlayerResponse.protoMergeImpl(plus: pbandk.Message?): PlayersGetPlayerResponse = (plus as? PlayersGetPlayerResponse)?.let {
    it.copy(
        players = players?.plus(plus.players) ?: plus.players,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlayersGetPlayerResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlayersGetPlayerResponse {
    var players: org.yagi.motel.pantheon.api.Player? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> players = _fieldValue as org.yagi.motel.pantheon.api.Player
        }
    }

    return PlayersGetPlayerResponse(players, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetCurrentSeatingResponse")
public fun EventsGetCurrentSeatingResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetCurrentSeatingResponse = this ?: EventsGetCurrentSeatingResponse.defaultInstance

private fun EventsGetCurrentSeatingResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetCurrentSeatingResponse = (plus as? EventsGetCurrentSeatingResponse)?.let {
    it.copy(
        seating = seating + plus.seating,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetCurrentSeatingResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetCurrentSeatingResponse {
    var seating: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PlayerSeating>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> seating = (seating ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PlayerSeating> }
        }
    }

    return EventsGetCurrentSeatingResponse(pbandk.ListWithSize.Builder.fixed(seating), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSeatingMakeShuffledSeatingPayload")
public fun SeatingMakeShuffledSeatingPayload?.orDefault(): org.yagi.motel.pantheon.api.SeatingMakeShuffledSeatingPayload = this ?: SeatingMakeShuffledSeatingPayload.defaultInstance

private fun SeatingMakeShuffledSeatingPayload.protoMergeImpl(plus: pbandk.Message?): SeatingMakeShuffledSeatingPayload = (plus as? SeatingMakeShuffledSeatingPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SeatingMakeShuffledSeatingPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SeatingMakeShuffledSeatingPayload {
    var eventId = 0
    var groupsCount = 0
    var seed = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> groupsCount = _fieldValue as Int
            3 -> seed = _fieldValue as Int
        }
    }

    return SeatingMakeShuffledSeatingPayload(eventId, groupsCount, seed, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSeatingGenerateSwissSeatingPayload")
public fun SeatingGenerateSwissSeatingPayload?.orDefault(): org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingPayload = this ?: SeatingGenerateSwissSeatingPayload.defaultInstance

private fun SeatingGenerateSwissSeatingPayload.protoMergeImpl(plus: pbandk.Message?): SeatingGenerateSwissSeatingPayload = (plus as? SeatingGenerateSwissSeatingPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SeatingGenerateSwissSeatingPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SeatingGenerateSwissSeatingPayload {
    var eventId = 0
    var substituteReplacementPlayers = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> substituteReplacementPlayers = _fieldValue as Boolean
        }
    }

    return SeatingGenerateSwissSeatingPayload(eventId, substituteReplacementPlayers, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSeatingGenerateSwissSeatingResponse")
public fun SeatingGenerateSwissSeatingResponse?.orDefault(): org.yagi.motel.pantheon.api.SeatingGenerateSwissSeatingResponse = this ?: SeatingGenerateSwissSeatingResponse.defaultInstance

private fun SeatingGenerateSwissSeatingResponse.protoMergeImpl(plus: pbandk.Message?): SeatingGenerateSwissSeatingResponse = (plus as? SeatingGenerateSwissSeatingResponse)?.let {
    it.copy(
        tables = tables + plus.tables,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SeatingGenerateSwissSeatingResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SeatingGenerateSwissSeatingResponse {
    var tables: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.TableItemSwiss>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tables = (tables ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.TableItemSwiss> }
        }
    }

    return SeatingGenerateSwissSeatingResponse(pbandk.ListWithSize.Builder.fixed(tables), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSeatingMakeIntervalSeatingPayload")
public fun SeatingMakeIntervalSeatingPayload?.orDefault(): org.yagi.motel.pantheon.api.SeatingMakeIntervalSeatingPayload = this ?: SeatingMakeIntervalSeatingPayload.defaultInstance

private fun SeatingMakeIntervalSeatingPayload.protoMergeImpl(plus: pbandk.Message?): SeatingMakeIntervalSeatingPayload = (plus as? SeatingMakeIntervalSeatingPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SeatingMakeIntervalSeatingPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SeatingMakeIntervalSeatingPayload {
    var eventId = 0
    var step = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> step = _fieldValue as Int
        }
    }

    return SeatingMakeIntervalSeatingPayload(eventId, step, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSeatingMakePrescriptedSeatingPayload")
public fun SeatingMakePrescriptedSeatingPayload?.orDefault(): org.yagi.motel.pantheon.api.SeatingMakePrescriptedSeatingPayload = this ?: SeatingMakePrescriptedSeatingPayload.defaultInstance

private fun SeatingMakePrescriptedSeatingPayload.protoMergeImpl(plus: pbandk.Message?): SeatingMakePrescriptedSeatingPayload = (plus as? SeatingMakePrescriptedSeatingPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SeatingMakePrescriptedSeatingPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SeatingMakePrescriptedSeatingPayload {
    var eventId = 0
    var randomizeAtTables = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> randomizeAtTables = _fieldValue as Boolean
        }
    }

    return SeatingMakePrescriptedSeatingPayload(eventId, randomizeAtTables, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSeatingGetNextPrescriptedSeatingResponse")
public fun SeatingGetNextPrescriptedSeatingResponse?.orDefault(): org.yagi.motel.pantheon.api.SeatingGetNextPrescriptedSeatingResponse = this ?: SeatingGetNextPrescriptedSeatingResponse.defaultInstance

private fun SeatingGetNextPrescriptedSeatingResponse.protoMergeImpl(plus: pbandk.Message?): SeatingGetNextPrescriptedSeatingResponse = (plus as? SeatingGetNextPrescriptedSeatingResponse)?.let {
    it.copy(
        tables = tables + plus.tables,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SeatingGetNextPrescriptedSeatingResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SeatingGetNextPrescriptedSeatingResponse {
    var tables: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PrescriptedTable>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tables = (tables ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PrescriptedTable> }
        }
    }

    return SeatingGetNextPrescriptedSeatingResponse(pbandk.ListWithSize.Builder.fixed(tables), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetPrescriptedEventConfigResponse")
public fun EventsGetPrescriptedEventConfigResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetPrescriptedEventConfigResponse = this ?: EventsGetPrescriptedEventConfigResponse.defaultInstance

private fun EventsGetPrescriptedEventConfigResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetPrescriptedEventConfigResponse = (plus as? EventsGetPrescriptedEventConfigResponse)?.let {
    it.copy(
        errors = errors + plus.errors,
        prescript = plus.prescript ?: prescript,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetPrescriptedEventConfigResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetPrescriptedEventConfigResponse {
    var eventId = 0
    var nextSessionIndex = 0
    var errors: pbandk.ListWithSize.Builder<String>? = null
    var prescript: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> nextSessionIndex = _fieldValue as Int
            3 -> prescript = _fieldValue as String
            4 -> errors = (errors ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
        }
    }

    return EventsGetPrescriptedEventConfigResponse(eventId, nextSessionIndex, pbandk.ListWithSize.Builder.fixed(errors), prescript, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsUpdatePrescriptedEventConfigPayload")
public fun EventsUpdatePrescriptedEventConfigPayload?.orDefault(): org.yagi.motel.pantheon.api.EventsUpdatePrescriptedEventConfigPayload = this ?: EventsUpdatePrescriptedEventConfigPayload.defaultInstance

private fun EventsUpdatePrescriptedEventConfigPayload.protoMergeImpl(plus: pbandk.Message?): EventsUpdatePrescriptedEventConfigPayload = (plus as? EventsUpdatePrescriptedEventConfigPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsUpdatePrescriptedEventConfigPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsUpdatePrescriptedEventConfigPayload {
    var eventId = 0
    var nextSessionIndex = 0
    var prescript = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> nextSessionIndex = _fieldValue as Int
            3 -> prescript = _fieldValue as String
        }
    }

    return EventsUpdatePrescriptedEventConfigPayload(eventId, nextSessionIndex, prescript, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEventsGetStartingTimerResponse")
public fun EventsGetStartingTimerResponse?.orDefault(): org.yagi.motel.pantheon.api.EventsGetStartingTimerResponse = this ?: EventsGetStartingTimerResponse.defaultInstance

private fun EventsGetStartingTimerResponse.protoMergeImpl(plus: pbandk.Message?): EventsGetStartingTimerResponse = (plus as? EventsGetStartingTimerResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EventsGetStartingTimerResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EventsGetStartingTimerResponse {
    var timer = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> timer = _fieldValue as Int
        }
    }

    return EventsGetStartingTimerResponse(timer, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForClearStatCachePayload")
public fun ClearStatCachePayload?.orDefault(): org.yagi.motel.pantheon.api.ClearStatCachePayload = this ?: ClearStatCachePayload.defaultInstance

private fun ClearStatCachePayload.protoMergeImpl(plus: pbandk.Message?): ClearStatCachePayload = (plus as? ClearStatCachePayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ClearStatCachePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ClearStatCachePayload {
    var playerId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> playerId = _fieldValue as Int
        }
    }

    return ClearStatCachePayload(playerId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTypedGamesAddOnlineReplayPayload")
public fun TypedGamesAddOnlineReplayPayload?.orDefault(): org.yagi.motel.pantheon.api.TypedGamesAddOnlineReplayPayload = this ?: TypedGamesAddOnlineReplayPayload.defaultInstance

private fun TypedGamesAddOnlineReplayPayload.protoMergeImpl(plus: pbandk.Message?): TypedGamesAddOnlineReplayPayload = (plus as? TypedGamesAddOnlineReplayPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TypedGamesAddOnlineReplayPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TypedGamesAddOnlineReplayPayload {
    var eventId = 0
    var platformId = 0
    var contentType = 0
    var logTimestamp = 0
    var replayHash = ""
    var content = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> platformId = _fieldValue as Int
            3 -> contentType = _fieldValue as Int
            4 -> logTimestamp = _fieldValue as Int
            5 -> replayHash = _fieldValue as String
            6 -> content = _fieldValue as String
        }
    }

    return TypedGamesAddOnlineReplayPayload(eventId, platformId, contentType, logTimestamp,
        replayHash, content, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCallRefereePayload")
public fun CallRefereePayload?.orDefault(): org.yagi.motel.pantheon.api.CallRefereePayload = this ?: CallRefereePayload.defaultInstance

private fun CallRefereePayload.protoMergeImpl(plus: pbandk.Message?): CallRefereePayload = (plus as? CallRefereePayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CallRefereePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CallRefereePayload {
    var tableIndex = 0
    var eventId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tableIndex = _fieldValue as Int
            2 -> eventId = _fieldValue as Int
        }
    }

    return CallRefereePayload(tableIndex, eventId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPenaltiesResponse")
public fun PenaltiesResponse?.orDefault(): org.yagi.motel.pantheon.api.PenaltiesResponse = this ?: PenaltiesResponse.defaultInstance

private fun PenaltiesResponse.protoMergeImpl(plus: pbandk.Message?): PenaltiesResponse = (plus as? PenaltiesResponse)?.let {
    it.copy(
        penalties = penalties + plus.penalties,
        referees = referees + plus.referees,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PenaltiesResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PenaltiesResponse {
    var penalties: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Penalty>? = null
    var referees: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Player>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> penalties = (penalties ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Penalty> }
            2 -> referees = (referees ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Player> }
        }
    }

    return PenaltiesResponse(pbandk.ListWithSize.Builder.fixed(penalties), pbandk.ListWithSize.Builder.fixed(referees), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCancelPenaltyPayload")
public fun CancelPenaltyPayload?.orDefault(): org.yagi.motel.pantheon.api.CancelPenaltyPayload = this ?: CancelPenaltyPayload.defaultInstance

private fun CancelPenaltyPayload.protoMergeImpl(plus: pbandk.Message?): CancelPenaltyPayload = (plus as? CancelPenaltyPayload)?.let {
    it.copy(
        reason = plus.reason ?: reason,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CancelPenaltyPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CancelPenaltyPayload {
    var penaltyId = 0
    var reason: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> penaltyId = _fieldValue as Int
            2 -> reason = _fieldValue as String
        }
    }

    return CancelPenaltyPayload(penaltyId, reason, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAddExtraTimePayload")
public fun AddExtraTimePayload?.orDefault(): org.yagi.motel.pantheon.api.AddExtraTimePayload = this ?: AddExtraTimePayload.defaultInstance

private fun AddExtraTimePayload.protoMergeImpl(plus: pbandk.Message?): AddExtraTimePayload = (plus as? AddExtraTimePayload)?.let {
    it.copy(
        sessionHashList = sessionHashList + plus.sessionHashList,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AddExtraTimePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AddExtraTimePayload {
    var sessionHashList: pbandk.ListWithSize.Builder<String>? = null
    var extraTime = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessionHashList = (sessionHashList ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            2 -> extraTime = _fieldValue as Int
        }
    }

    return AddExtraTimePayload(pbandk.ListWithSize.Builder.fixed(sessionHashList), extraTime, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetCurrentStatePayload")
public fun GetCurrentStatePayload?.orDefault(): org.yagi.motel.pantheon.api.GetCurrentStatePayload = this ?: GetCurrentStatePayload.defaultInstance

private fun GetCurrentStatePayload.protoMergeImpl(plus: pbandk.Message?): GetCurrentStatePayload = (plus as? GetCurrentStatePayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetCurrentStatePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetCurrentStatePayload {
    var eventId = 0
    var playerId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
            2 -> playerId = _fieldValue as Int
        }
    }

    return GetCurrentStatePayload(eventId, playerId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetCurrentStateResponse")
public fun GetCurrentStateResponse?.orDefault(): org.yagi.motel.pantheon.api.GetCurrentStateResponse = this ?: GetCurrentStateResponse.defaultInstance

private fun GetCurrentStateResponse.protoMergeImpl(plus: pbandk.Message?): GetCurrentStateResponse = (plus as? GetCurrentStateResponse)?.let {
    it.copy(
        sessions = sessions + plus.sessions,
        config = config?.plus(plus.config) ?: plus.config,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetCurrentStateResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetCurrentStateResponse {
    var sessions: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.CurrentSession>? = null
    var config: org.yagi.motel.pantheon.api.GameConfig? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessions = (sessions ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.CurrentSession> }
            2 -> config = _fieldValue as org.yagi.motel.pantheon.api.GameConfig
        }
    }

    return GetCurrentStateResponse(pbandk.ListWithSize.Builder.fixed(sessions), config, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForChomboResponse")
public fun ChomboResponse?.orDefault(): org.yagi.motel.pantheon.api.ChomboResponse = this ?: ChomboResponse.defaultInstance

private fun ChomboResponse.protoMergeImpl(plus: pbandk.Message?): ChomboResponse = (plus as? ChomboResponse)?.let {
    it.copy(
        chombos = chombos + plus.chombos,
        players = players + plus.players,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ChomboResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ChomboResponse {
    var chombos: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Chombo>? = null
    var players: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Player>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> chombos = (chombos ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Chombo> }
            2 -> players = (players ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Player> }
        }
    }

    return ChomboResponse(pbandk.ListWithSize.Builder.fixed(chombos), pbandk.ListWithSize.Builder.fixed(players), unknownFields)
}
