@file:OptIn(pbandk.PublicForGeneratedCode::class)

package org.yagi.motel.pantheon.api

@pbandk.Export
public data class AuthRequestRegistrationPayload(
    val email: String = "",
    val title: String = "",
    val password: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload by lazy { org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload = org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload> = pbandk.MessageDescriptor(
            fullName = "common.AuthRequestRegistrationPayload",
            messageClass = org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "password",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "password",
                        value = org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload::password
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthRequestRegistrationResponse(
    val approvalCode: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse by lazy { org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse = org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse> = pbandk.MessageDescriptor(
            fullName = "common.AuthRequestRegistrationResponse",
            messageClass = org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "approval_code",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "approvalCode",
                        value = org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse::approvalCode
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthApproveRegistrationPayload(
    val approvalCode: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload by lazy { org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload = org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload> = pbandk.MessageDescriptor(
            fullName = "common.AuthApproveRegistrationPayload",
            messageClass = org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "approval_code",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "approvalCode",
                        value = org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload::approvalCode
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthApproveRegistrationResponse(
    val personId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse by lazy { org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse = org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse> = pbandk.MessageDescriptor(
            fullName = "common.AuthApproveRegistrationResponse",
            messageClass = org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse::personId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthAuthorizePayload(
    val email: String = "",
    val password: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthAuthorizePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthAuthorizePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthAuthorizePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthAuthorizePayload by lazy { org.yagi.motel.pantheon.api.AuthAuthorizePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthAuthorizePayload = org.yagi.motel.pantheon.api.AuthAuthorizePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthAuthorizePayload> = pbandk.MessageDescriptor(
            fullName = "common.AuthAuthorizePayload",
            messageClass = org.yagi.motel.pantheon.api.AuthAuthorizePayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = org.yagi.motel.pantheon.api.AuthAuthorizePayload::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "password",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "password",
                        value = org.yagi.motel.pantheon.api.AuthAuthorizePayload::password
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthAuthorizeResponse(
    val personId: Int = 0,
    val authToken: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthAuthorizeResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthAuthorizeResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthAuthorizeResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthAuthorizeResponse by lazy { org.yagi.motel.pantheon.api.AuthAuthorizeResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthAuthorizeResponse = org.yagi.motel.pantheon.api.AuthAuthorizeResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthAuthorizeResponse> = pbandk.MessageDescriptor(
            fullName = "common.AuthAuthorizeResponse",
            messageClass = org.yagi.motel.pantheon.api.AuthAuthorizeResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.AuthAuthorizeResponse::personId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "auth_token",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "authToken",
                        value = org.yagi.motel.pantheon.api.AuthAuthorizeResponse::authToken
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthQuickAuthorizePayload(
    val personId: Int = 0,
    val authToken: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload by lazy { org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload = org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload> = pbandk.MessageDescriptor(
            fullName = "common.AuthQuickAuthorizePayload",
            messageClass = org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload::personId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "auth_token",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "authToken",
                        value = org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload::authToken
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthQuickAuthorizeResponse(
    val authSuccess: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse by lazy { org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse = org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse> = pbandk.MessageDescriptor(
            fullName = "common.AuthQuickAuthorizeResponse",
            messageClass = org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "auth_success",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "authSuccess",
                        value = org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse::authSuccess
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthMePayload(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthMePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthMePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthMePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthMePayload by lazy { org.yagi.motel.pantheon.api.AuthMePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthMePayload = org.yagi.motel.pantheon.api.AuthMePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthMePayload> = pbandk.MessageDescriptor(
            fullName = "common.AuthMePayload",
            messageClass = org.yagi.motel.pantheon.api.AuthMePayload::class,
            messageCompanion = this,
            fields = buildList(0) {
            }
        )
    }
}

@pbandk.Export
public data class AuthMeResponse(
    val personId: Int = 0,
    val country: String = "",
    val city: String = "",
    val email: String = "",
    val phone: String = "",
    val tenhouId: String = "",
    val title: String = "",
    val hasAvatar: Boolean = false,
    val lastUpdate: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthMeResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthMeResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthMeResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthMeResponse by lazy { org.yagi.motel.pantheon.api.AuthMeResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthMeResponse = org.yagi.motel.pantheon.api.AuthMeResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthMeResponse> = pbandk.MessageDescriptor(
            fullName = "common.AuthMeResponse",
            messageClass = org.yagi.motel.pantheon.api.AuthMeResponse::class,
            messageCompanion = this,
            fields = buildList(9) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.AuthMeResponse::personId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "country",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "country",
                        value = org.yagi.motel.pantheon.api.AuthMeResponse::country
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "city",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "city",
                        value = org.yagi.motel.pantheon.api.AuthMeResponse::city
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = org.yagi.motel.pantheon.api.AuthMeResponse::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "phone",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "phone",
                        value = org.yagi.motel.pantheon.api.AuthMeResponse::phone
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenhou_id",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tenhouId",
                        value = org.yagi.motel.pantheon.api.AuthMeResponse::tenhouId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.AuthMeResponse::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.AuthMeResponse::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_update",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUpdate",
                        value = org.yagi.motel.pantheon.api.AuthMeResponse::lastUpdate
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthChangePasswordPayload(
    val email: String = "",
    val password: String = "",
    val newPassword: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthChangePasswordPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthChangePasswordPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthChangePasswordPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthChangePasswordPayload by lazy { org.yagi.motel.pantheon.api.AuthChangePasswordPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthChangePasswordPayload = org.yagi.motel.pantheon.api.AuthChangePasswordPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthChangePasswordPayload> = pbandk.MessageDescriptor(
            fullName = "common.AuthChangePasswordPayload",
            messageClass = org.yagi.motel.pantheon.api.AuthChangePasswordPayload::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = org.yagi.motel.pantheon.api.AuthChangePasswordPayload::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "password",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "password",
                        value = org.yagi.motel.pantheon.api.AuthChangePasswordPayload::password
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "new_password",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "newPassword",
                        value = org.yagi.motel.pantheon.api.AuthChangePasswordPayload::newPassword
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthChangePasswordResponse(
    val authToken: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthChangePasswordResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthChangePasswordResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthChangePasswordResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthChangePasswordResponse by lazy { org.yagi.motel.pantheon.api.AuthChangePasswordResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthChangePasswordResponse = org.yagi.motel.pantheon.api.AuthChangePasswordResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthChangePasswordResponse> = pbandk.MessageDescriptor(
            fullName = "common.AuthChangePasswordResponse",
            messageClass = org.yagi.motel.pantheon.api.AuthChangePasswordResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "auth_token",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "authToken",
                        value = org.yagi.motel.pantheon.api.AuthChangePasswordResponse::authToken
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthRequestResetPasswordPayload(
    val email: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload by lazy { org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload = org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload> = pbandk.MessageDescriptor(
            fullName = "common.AuthRequestResetPasswordPayload",
            messageClass = org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload::email
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthRequestResetPasswordResponse(
    val resetToken: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse by lazy { org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse = org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse> = pbandk.MessageDescriptor(
            fullName = "common.AuthRequestResetPasswordResponse",
            messageClass = org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reset_token",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "resetToken",
                        value = org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse::resetToken
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthApproveResetPasswordPayload(
    val email: String = "",
    val resetToken: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload by lazy { org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload = org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload> = pbandk.MessageDescriptor(
            fullName = "common.AuthApproveResetPasswordPayload",
            messageClass = org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reset_token",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "resetToken",
                        value = org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload::resetToken
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AuthApproveResetPasswordResponse(
    val newTmpPassword: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse by lazy { org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse = org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse> = pbandk.MessageDescriptor(
            fullName = "common.AuthApproveResetPasswordResponse",
            messageClass = org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "new_tmp_password",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "newTmpPassword",
                        value = org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse::newTmpPassword
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AccessGetEventAdminsPayload(
    val eventId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload by lazy { org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload = org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload> = pbandk.MessageDescriptor(
            fullName = "common.AccessGetEventAdminsPayload",
            messageClass = org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload::eventId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AccessGetEventAdminsResponse(
    val admins: List<org.yagi.motel.pantheon.api.EventAdmin> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse by lazy { org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse = org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse> = pbandk.MessageDescriptor(
            fullName = "common.AccessGetEventAdminsResponse",
            messageClass = org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "admins",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.EventAdmin>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.EventAdmin.Companion)),
                        jsonName = "admins",
                        value = org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse::admins
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AccessGetEventRefereesPayload(
    val eventId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload by lazy { org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload = org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload> = pbandk.MessageDescriptor(
            fullName = "common.AccessGetEventRefereesPayload",
            messageClass = org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload::eventId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AccessGetEventRefereesResponse(
    val referees: List<org.yagi.motel.pantheon.api.EventReferee> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse by lazy { org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse = org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse> = pbandk.MessageDescriptor(
            fullName = "common.AccessGetEventRefereesResponse",
            messageClass = org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "referees",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.EventReferee>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.EventReferee.Companion)),
                        jsonName = "referees",
                        value = org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse::referees
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AccessGetSuperadminFlagPayload(
    val personId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload by lazy { org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload = org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload> = pbandk.MessageDescriptor(
            fullName = "common.AccessGetSuperadminFlagPayload",
            messageClass = org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload::personId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AccessGetSuperadminFlagResponse(
    val isAdmin: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse by lazy { org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse = org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse> = pbandk.MessageDescriptor(
            fullName = "common.AccessGetSuperadminFlagResponse",
            messageClass = org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_admin",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isAdmin",
                        value = org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse::isAdmin
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AccessGetOwnedEventIdsPayload(
    val personId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload by lazy { org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload = org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload> = pbandk.MessageDescriptor(
            fullName = "common.AccessGetOwnedEventIdsPayload",
            messageClass = org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload::personId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AccessGetOwnedEventIdsResponse(
    val eventIds: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse by lazy { org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse = org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse> = pbandk.MessageDescriptor(
            fullName = "common.AccessGetOwnedEventIdsResponse",
            messageClass = org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_ids",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "eventIds",
                        value = org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse::eventIds
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AccessAddRuleForPersonPayload(
    val ruleName: String = "",
    val ruleValue: Int = 0,
    val personId: Int = 0,
    val eventId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload by lazy { org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload = org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload> = pbandk.MessageDescriptor(
            fullName = "common.AccessAddRuleForPersonPayload",
            messageClass = org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rule_name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "ruleName",
                        value = org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload::ruleName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rule_value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "ruleValue",
                        value = org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload::ruleValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload::personId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event_id",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "eventId",
                        value = org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload::eventId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AccessAddRuleForPersonResponse(
    val ruleId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse by lazy { org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse = org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse> = pbandk.MessageDescriptor(
            fullName = "common.AccessAddRuleForPersonResponse",
            messageClass = org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rule_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "ruleId",
                        value = org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse::ruleId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class AccessDeleteRuleForPersonPayload(
    val ruleId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload by lazy { org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload = org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload> = pbandk.MessageDescriptor(
            fullName = "common.AccessDeleteRuleForPersonPayload",
            messageClass = org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rule_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "ruleId",
                        value = org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload::ruleId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsCreateAccountPayload(
    val email: String = "",
    val password: String = "",
    val title: String = "",
    val city: String = "",
    val phone: String = "",
    val tenhouId: String = "",
    val country: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsCreateAccountPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsCreateAccountPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsCreateAccountPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsCreateAccountPayload by lazy { org.yagi.motel.pantheon.api.PersonsCreateAccountPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsCreateAccountPayload = org.yagi.motel.pantheon.api.PersonsCreateAccountPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsCreateAccountPayload> = pbandk.MessageDescriptor(
            fullName = "common.PersonsCreateAccountPayload",
            messageClass = org.yagi.motel.pantheon.api.PersonsCreateAccountPayload::class,
            messageCompanion = this,
            fields = buildList(7) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = org.yagi.motel.pantheon.api.PersonsCreateAccountPayload::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "password",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "password",
                        value = org.yagi.motel.pantheon.api.PersonsCreateAccountPayload::password
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.PersonsCreateAccountPayload::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "city",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "city",
                        value = org.yagi.motel.pantheon.api.PersonsCreateAccountPayload::city
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "phone",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "phone",
                        value = org.yagi.motel.pantheon.api.PersonsCreateAccountPayload::phone
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenhou_id",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tenhouId",
                        value = org.yagi.motel.pantheon.api.PersonsCreateAccountPayload::tenhouId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "country",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "country",
                        value = org.yagi.motel.pantheon.api.PersonsCreateAccountPayload::country
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsCreateAccountResponse(
    val personId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsCreateAccountResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsCreateAccountResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsCreateAccountResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsCreateAccountResponse by lazy { org.yagi.motel.pantheon.api.PersonsCreateAccountResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsCreateAccountResponse = org.yagi.motel.pantheon.api.PersonsCreateAccountResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsCreateAccountResponse> = pbandk.MessageDescriptor(
            fullName = "common.PersonsCreateAccountResponse",
            messageClass = org.yagi.motel.pantheon.api.PersonsCreateAccountResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.PersonsCreateAccountResponse::personId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsUpdatePersonalInfoPayload(
    val id: Int = 0,
    val title: String = "",
    val country: String = "",
    val city: String = "",
    val email: String = "",
    val phone: String = "",
    val tenhouId: String = "",
    val hasAvatar: Boolean = false,
    val avatarData: String = "",
    val msNickname: String? = null,
    val msFriendId: Int? = null,
    val msAccountId: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload by lazy { org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload> = pbandk.MessageDescriptor(
            fullName = "common.PersonsUpdatePersonalInfoPayload",
            messageClass = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::class,
            messageCompanion = this,
            fields = buildList(12) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "country",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "country",
                        value = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::country
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "city",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "city",
                        value = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::city
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "phone",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "phone",
                        value = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::phone
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenhou_id",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tenhouId",
                        value = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::tenhouId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "has_avatar",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "hasAvatar",
                        value = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::hasAvatar
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "avatar_data",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "avatarData",
                        value = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::avatarData
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ms_nickname",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "msNickname",
                        value = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::msNickname
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ms_friend_id",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "msFriendId",
                        value = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::msFriendId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ms_account_id",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "msAccountId",
                        value = org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload::msAccountId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsGetPersonalInfoPayload(
    val ids: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload by lazy { org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload = org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload> = pbandk.MessageDescriptor(
            fullName = "common.PersonsGetPersonalInfoPayload",
            messageClass = org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ids",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "ids",
                        value = org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload::ids
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsGetPersonalInfoResponse(
    val people: List<org.yagi.motel.pantheon.api.PersonEx> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse by lazy { org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse = org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse> = pbandk.MessageDescriptor(
            fullName = "common.PersonsGetPersonalInfoResponse",
            messageClass = org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "people",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PersonEx>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PersonEx.Companion)),
                        jsonName = "people",
                        value = org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse::people
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsFindByTenhouIdsPayload(
    val ids: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload by lazy { org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload = org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload> = pbandk.MessageDescriptor(
            fullName = "common.PersonsFindByTenhouIdsPayload",
            messageClass = org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ids",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "ids",
                        value = org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload::ids
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsFindByMajsoulIdsPayload(
    val ids: List<org.yagi.motel.pantheon.api.MajsoulSearchEx> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload by lazy { org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload = org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload> = pbandk.MessageDescriptor(
            fullName = "common.PersonsFindByMajsoulIdsPayload",
            messageClass = org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ids",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.MajsoulSearchEx>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.MajsoulSearchEx.Companion)),
                        jsonName = "ids",
                        value = org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload::ids
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsFindByTenhouIdsResponse(
    val people: List<org.yagi.motel.pantheon.api.PersonEx> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse by lazy { org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse = org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse> = pbandk.MessageDescriptor(
            fullName = "common.PersonsFindByTenhouIdsResponse",
            messageClass = org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "people",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.PersonEx>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.PersonEx.Companion)),
                        jsonName = "people",
                        value = org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse::people
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsFindByTitlePayload(
    val query: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsFindByTitlePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsFindByTitlePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsFindByTitlePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsFindByTitlePayload by lazy { org.yagi.motel.pantheon.api.PersonsFindByTitlePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsFindByTitlePayload = org.yagi.motel.pantheon.api.PersonsFindByTitlePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsFindByTitlePayload> = pbandk.MessageDescriptor(
            fullName = "common.PersonsFindByTitlePayload",
            messageClass = org.yagi.motel.pantheon.api.PersonsFindByTitlePayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "query",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "query",
                        value = org.yagi.motel.pantheon.api.PersonsFindByTitlePayload::query
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsFindByTitleResponse(
    val people: List<org.yagi.motel.pantheon.api.Person> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsFindByTitleResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsFindByTitleResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsFindByTitleResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsFindByTitleResponse by lazy { org.yagi.motel.pantheon.api.PersonsFindByTitleResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsFindByTitleResponse = org.yagi.motel.pantheon.api.PersonsFindByTitleResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsFindByTitleResponse> = pbandk.MessageDescriptor(
            fullName = "common.PersonsFindByTitleResponse",
            messageClass = org.yagi.motel.pantheon.api.PersonsFindByTitleResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "people",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.Person>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.Person.Companion)),
                        jsonName = "people",
                        value = org.yagi.motel.pantheon.api.PersonsFindByTitleResponse::people
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class DepersonalizePayload(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.DepersonalizePayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.DepersonalizePayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.DepersonalizePayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.DepersonalizePayload by lazy { org.yagi.motel.pantheon.api.DepersonalizePayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.DepersonalizePayload = org.yagi.motel.pantheon.api.DepersonalizePayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.DepersonalizePayload> = pbandk.MessageDescriptor(
            fullName = "common.DepersonalizePayload",
            messageClass = org.yagi.motel.pantheon.api.DepersonalizePayload::class,
            messageCompanion = this,
            fields = buildList(0) {
            }
        )
    }
}

@pbandk.Export
public data class PersonsGetMajsoulNicknamesPayload(
    val ids: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload by lazy { org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload = org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload> = pbandk.MessageDescriptor(
            fullName = "common.PersonsGetMajsoulNicknamesPayload",
            messageClass = org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ids",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "ids",
                        value = org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload::ids
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsGetMajsoulNicknamesResponse(
    val mapping: List<org.yagi.motel.pantheon.api.MajsoulPersonMapping> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse by lazy { org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse = org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse> = pbandk.MessageDescriptor(
            fullName = "common.PersonsGetMajsoulNicknamesResponse",
            messageClass = org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "mapping",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.yagi.motel.pantheon.api.MajsoulPersonMapping>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.yagi.motel.pantheon.api.MajsoulPersonMapping.Companion)),
                        jsonName = "mapping",
                        value = org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse::mapping
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsGetNotificationsSettingsPayload(
    val personId: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload by lazy { org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload = org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload> = pbandk.MessageDescriptor(
            fullName = "common.PersonsGetNotificationsSettingsPayload",
            messageClass = org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload::personId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsGetNotificationsSettingsResponse(
    val telegramId: String = "",
    val notifications: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse by lazy { org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse = org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse> = pbandk.MessageDescriptor(
            fullName = "common.PersonsGetNotificationsSettingsResponse",
            messageClass = org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "telegram_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "telegramId",
                        value = org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse::telegramId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "notifications",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "notifications",
                        value = org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse::notifications
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PersonsSetNotificationsSettingsPayload(
    val personId: Int = 0,
    val telegramId: String = "",
    val notifications: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload> {
        public val defaultInstance: org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload by lazy { org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload = org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload> = pbandk.MessageDescriptor(
            fullName = "common.PersonsSetNotificationsSettingsPayload",
            messageClass = org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "personId",
                        value = org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload::personId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "telegram_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "telegramId",
                        value = org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload::telegramId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "notifications",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "notifications",
                        value = org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload::notifications
                    )
                )
            }
        )
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthRequestRegistrationPayload")
public fun AuthRequestRegistrationPayload?.orDefault(): org.yagi.motel.pantheon.api.AuthRequestRegistrationPayload = this ?: AuthRequestRegistrationPayload.defaultInstance

private fun AuthRequestRegistrationPayload.protoMergeImpl(plus: pbandk.Message?): AuthRequestRegistrationPayload = (plus as? AuthRequestRegistrationPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthRequestRegistrationPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthRequestRegistrationPayload {
    var email = ""
    var title = ""
    var password = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> email = _fieldValue as String
            2 -> title = _fieldValue as String
            3 -> password = _fieldValue as String
        }
    }

    return AuthRequestRegistrationPayload(email, title, password, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthRequestRegistrationResponse")
public fun AuthRequestRegistrationResponse?.orDefault(): org.yagi.motel.pantheon.api.AuthRequestRegistrationResponse = this ?: AuthRequestRegistrationResponse.defaultInstance

private fun AuthRequestRegistrationResponse.protoMergeImpl(plus: pbandk.Message?): AuthRequestRegistrationResponse = (plus as? AuthRequestRegistrationResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthRequestRegistrationResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthRequestRegistrationResponse {
    var approvalCode = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> approvalCode = _fieldValue as String
        }
    }

    return AuthRequestRegistrationResponse(approvalCode, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthApproveRegistrationPayload")
public fun AuthApproveRegistrationPayload?.orDefault(): org.yagi.motel.pantheon.api.AuthApproveRegistrationPayload = this ?: AuthApproveRegistrationPayload.defaultInstance

private fun AuthApproveRegistrationPayload.protoMergeImpl(plus: pbandk.Message?): AuthApproveRegistrationPayload = (plus as? AuthApproveRegistrationPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthApproveRegistrationPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthApproveRegistrationPayload {
    var approvalCode = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> approvalCode = _fieldValue as String
        }
    }

    return AuthApproveRegistrationPayload(approvalCode, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthApproveRegistrationResponse")
public fun AuthApproveRegistrationResponse?.orDefault(): org.yagi.motel.pantheon.api.AuthApproveRegistrationResponse = this ?: AuthApproveRegistrationResponse.defaultInstance

private fun AuthApproveRegistrationResponse.protoMergeImpl(plus: pbandk.Message?): AuthApproveRegistrationResponse = (plus as? AuthApproveRegistrationResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthApproveRegistrationResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthApproveRegistrationResponse {
    var personId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> personId = _fieldValue as Int
        }
    }

    return AuthApproveRegistrationResponse(personId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthAuthorizePayload")
public fun AuthAuthorizePayload?.orDefault(): org.yagi.motel.pantheon.api.AuthAuthorizePayload = this ?: AuthAuthorizePayload.defaultInstance

private fun AuthAuthorizePayload.protoMergeImpl(plus: pbandk.Message?): AuthAuthorizePayload = (plus as? AuthAuthorizePayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthAuthorizePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthAuthorizePayload {
    var email = ""
    var password = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> email = _fieldValue as String
            2 -> password = _fieldValue as String
        }
    }

    return AuthAuthorizePayload(email, password, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthAuthorizeResponse")
public fun AuthAuthorizeResponse?.orDefault(): org.yagi.motel.pantheon.api.AuthAuthorizeResponse = this ?: AuthAuthorizeResponse.defaultInstance

private fun AuthAuthorizeResponse.protoMergeImpl(plus: pbandk.Message?): AuthAuthorizeResponse = (plus as? AuthAuthorizeResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthAuthorizeResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthAuthorizeResponse {
    var personId = 0
    var authToken = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> personId = _fieldValue as Int
            2 -> authToken = _fieldValue as String
        }
    }

    return AuthAuthorizeResponse(personId, authToken, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthQuickAuthorizePayload")
public fun AuthQuickAuthorizePayload?.orDefault(): org.yagi.motel.pantheon.api.AuthQuickAuthorizePayload = this ?: AuthQuickAuthorizePayload.defaultInstance

private fun AuthQuickAuthorizePayload.protoMergeImpl(plus: pbandk.Message?): AuthQuickAuthorizePayload = (plus as? AuthQuickAuthorizePayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthQuickAuthorizePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthQuickAuthorizePayload {
    var personId = 0
    var authToken = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> personId = _fieldValue as Int
            2 -> authToken = _fieldValue as String
        }
    }

    return AuthQuickAuthorizePayload(personId, authToken, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthQuickAuthorizeResponse")
public fun AuthQuickAuthorizeResponse?.orDefault(): org.yagi.motel.pantheon.api.AuthQuickAuthorizeResponse = this ?: AuthQuickAuthorizeResponse.defaultInstance

private fun AuthQuickAuthorizeResponse.protoMergeImpl(plus: pbandk.Message?): AuthQuickAuthorizeResponse = (plus as? AuthQuickAuthorizeResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthQuickAuthorizeResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthQuickAuthorizeResponse {
    var authSuccess = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> authSuccess = _fieldValue as Boolean
        }
    }

    return AuthQuickAuthorizeResponse(authSuccess, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthMePayload")
public fun AuthMePayload?.orDefault(): org.yagi.motel.pantheon.api.AuthMePayload = this ?: AuthMePayload.defaultInstance

private fun AuthMePayload.protoMergeImpl(plus: pbandk.Message?): AuthMePayload = (plus as? AuthMePayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthMePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthMePayload {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return AuthMePayload(unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthMeResponse")
public fun AuthMeResponse?.orDefault(): org.yagi.motel.pantheon.api.AuthMeResponse = this ?: AuthMeResponse.defaultInstance

private fun AuthMeResponse.protoMergeImpl(plus: pbandk.Message?): AuthMeResponse = (plus as? AuthMeResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthMeResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthMeResponse {
    var personId = 0
    var country = ""
    var city = ""
    var email = ""
    var phone = ""
    var tenhouId = ""
    var title = ""
    var hasAvatar = false
    var lastUpdate = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> personId = _fieldValue as Int
            2 -> country = _fieldValue as String
            3 -> city = _fieldValue as String
            4 -> email = _fieldValue as String
            5 -> phone = _fieldValue as String
            6 -> tenhouId = _fieldValue as String
            7 -> title = _fieldValue as String
            9 -> hasAvatar = _fieldValue as Boolean
            10 -> lastUpdate = _fieldValue as String
        }
    }

    return AuthMeResponse(personId, country, city, email,
        phone, tenhouId, title, hasAvatar,
        lastUpdate, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthChangePasswordPayload")
public fun AuthChangePasswordPayload?.orDefault(): org.yagi.motel.pantheon.api.AuthChangePasswordPayload = this ?: AuthChangePasswordPayload.defaultInstance

private fun AuthChangePasswordPayload.protoMergeImpl(plus: pbandk.Message?): AuthChangePasswordPayload = (plus as? AuthChangePasswordPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthChangePasswordPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthChangePasswordPayload {
    var email = ""
    var password = ""
    var newPassword = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> email = _fieldValue as String
            2 -> password = _fieldValue as String
            3 -> newPassword = _fieldValue as String
        }
    }

    return AuthChangePasswordPayload(email, password, newPassword, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthChangePasswordResponse")
public fun AuthChangePasswordResponse?.orDefault(): org.yagi.motel.pantheon.api.AuthChangePasswordResponse = this ?: AuthChangePasswordResponse.defaultInstance

private fun AuthChangePasswordResponse.protoMergeImpl(plus: pbandk.Message?): AuthChangePasswordResponse = (plus as? AuthChangePasswordResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthChangePasswordResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthChangePasswordResponse {
    var authToken = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> authToken = _fieldValue as String
        }
    }

    return AuthChangePasswordResponse(authToken, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthRequestResetPasswordPayload")
public fun AuthRequestResetPasswordPayload?.orDefault(): org.yagi.motel.pantheon.api.AuthRequestResetPasswordPayload = this ?: AuthRequestResetPasswordPayload.defaultInstance

private fun AuthRequestResetPasswordPayload.protoMergeImpl(plus: pbandk.Message?): AuthRequestResetPasswordPayload = (plus as? AuthRequestResetPasswordPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthRequestResetPasswordPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthRequestResetPasswordPayload {
    var email = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> email = _fieldValue as String
        }
    }

    return AuthRequestResetPasswordPayload(email, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthRequestResetPasswordResponse")
public fun AuthRequestResetPasswordResponse?.orDefault(): org.yagi.motel.pantheon.api.AuthRequestResetPasswordResponse = this ?: AuthRequestResetPasswordResponse.defaultInstance

private fun AuthRequestResetPasswordResponse.protoMergeImpl(plus: pbandk.Message?): AuthRequestResetPasswordResponse = (plus as? AuthRequestResetPasswordResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthRequestResetPasswordResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthRequestResetPasswordResponse {
    var resetToken = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> resetToken = _fieldValue as String
        }
    }

    return AuthRequestResetPasswordResponse(resetToken, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthApproveResetPasswordPayload")
public fun AuthApproveResetPasswordPayload?.orDefault(): org.yagi.motel.pantheon.api.AuthApproveResetPasswordPayload = this ?: AuthApproveResetPasswordPayload.defaultInstance

private fun AuthApproveResetPasswordPayload.protoMergeImpl(plus: pbandk.Message?): AuthApproveResetPasswordPayload = (plus as? AuthApproveResetPasswordPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthApproveResetPasswordPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthApproveResetPasswordPayload {
    var email = ""
    var resetToken = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> email = _fieldValue as String
            2 -> resetToken = _fieldValue as String
        }
    }

    return AuthApproveResetPasswordPayload(email, resetToken, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthApproveResetPasswordResponse")
public fun AuthApproveResetPasswordResponse?.orDefault(): org.yagi.motel.pantheon.api.AuthApproveResetPasswordResponse = this ?: AuthApproveResetPasswordResponse.defaultInstance

private fun AuthApproveResetPasswordResponse.protoMergeImpl(plus: pbandk.Message?): AuthApproveResetPasswordResponse = (plus as? AuthApproveResetPasswordResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthApproveResetPasswordResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthApproveResetPasswordResponse {
    var newTmpPassword = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> newTmpPassword = _fieldValue as String
        }
    }

    return AuthApproveResetPasswordResponse(newTmpPassword, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAccessGetEventAdminsPayload")
public fun AccessGetEventAdminsPayload?.orDefault(): org.yagi.motel.pantheon.api.AccessGetEventAdminsPayload = this ?: AccessGetEventAdminsPayload.defaultInstance

private fun AccessGetEventAdminsPayload.protoMergeImpl(plus: pbandk.Message?): AccessGetEventAdminsPayload = (plus as? AccessGetEventAdminsPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AccessGetEventAdminsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AccessGetEventAdminsPayload {
    var eventId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
        }
    }

    return AccessGetEventAdminsPayload(eventId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAccessGetEventAdminsResponse")
public fun AccessGetEventAdminsResponse?.orDefault(): org.yagi.motel.pantheon.api.AccessGetEventAdminsResponse = this ?: AccessGetEventAdminsResponse.defaultInstance

private fun AccessGetEventAdminsResponse.protoMergeImpl(plus: pbandk.Message?): AccessGetEventAdminsResponse = (plus as? AccessGetEventAdminsResponse)?.let {
    it.copy(
        admins = admins + plus.admins,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AccessGetEventAdminsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AccessGetEventAdminsResponse {
    var admins: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.EventAdmin>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> admins = (admins ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.EventAdmin> }
        }
    }

    return AccessGetEventAdminsResponse(pbandk.ListWithSize.Builder.fixed(admins), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAccessGetEventRefereesPayload")
public fun AccessGetEventRefereesPayload?.orDefault(): org.yagi.motel.pantheon.api.AccessGetEventRefereesPayload = this ?: AccessGetEventRefereesPayload.defaultInstance

private fun AccessGetEventRefereesPayload.protoMergeImpl(plus: pbandk.Message?): AccessGetEventRefereesPayload = (plus as? AccessGetEventRefereesPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AccessGetEventRefereesPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AccessGetEventRefereesPayload {
    var eventId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventId = _fieldValue as Int
        }
    }

    return AccessGetEventRefereesPayload(eventId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAccessGetEventRefereesResponse")
public fun AccessGetEventRefereesResponse?.orDefault(): org.yagi.motel.pantheon.api.AccessGetEventRefereesResponse = this ?: AccessGetEventRefereesResponse.defaultInstance

private fun AccessGetEventRefereesResponse.protoMergeImpl(plus: pbandk.Message?): AccessGetEventRefereesResponse = (plus as? AccessGetEventRefereesResponse)?.let {
    it.copy(
        referees = referees + plus.referees,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AccessGetEventRefereesResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AccessGetEventRefereesResponse {
    var referees: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.EventReferee>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> referees = (referees ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.EventReferee> }
        }
    }

    return AccessGetEventRefereesResponse(pbandk.ListWithSize.Builder.fixed(referees), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAccessGetSuperadminFlagPayload")
public fun AccessGetSuperadminFlagPayload?.orDefault(): org.yagi.motel.pantheon.api.AccessGetSuperadminFlagPayload = this ?: AccessGetSuperadminFlagPayload.defaultInstance

private fun AccessGetSuperadminFlagPayload.protoMergeImpl(plus: pbandk.Message?): AccessGetSuperadminFlagPayload = (plus as? AccessGetSuperadminFlagPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AccessGetSuperadminFlagPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AccessGetSuperadminFlagPayload {
    var personId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> personId = _fieldValue as Int
        }
    }

    return AccessGetSuperadminFlagPayload(personId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAccessGetSuperadminFlagResponse")
public fun AccessGetSuperadminFlagResponse?.orDefault(): org.yagi.motel.pantheon.api.AccessGetSuperadminFlagResponse = this ?: AccessGetSuperadminFlagResponse.defaultInstance

private fun AccessGetSuperadminFlagResponse.protoMergeImpl(plus: pbandk.Message?): AccessGetSuperadminFlagResponse = (plus as? AccessGetSuperadminFlagResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AccessGetSuperadminFlagResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AccessGetSuperadminFlagResponse {
    var isAdmin = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> isAdmin = _fieldValue as Boolean
        }
    }

    return AccessGetSuperadminFlagResponse(isAdmin, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAccessGetOwnedEventIdsPayload")
public fun AccessGetOwnedEventIdsPayload?.orDefault(): org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsPayload = this ?: AccessGetOwnedEventIdsPayload.defaultInstance

private fun AccessGetOwnedEventIdsPayload.protoMergeImpl(plus: pbandk.Message?): AccessGetOwnedEventIdsPayload = (plus as? AccessGetOwnedEventIdsPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AccessGetOwnedEventIdsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AccessGetOwnedEventIdsPayload {
    var personId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> personId = _fieldValue as Int
        }
    }

    return AccessGetOwnedEventIdsPayload(personId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAccessGetOwnedEventIdsResponse")
public fun AccessGetOwnedEventIdsResponse?.orDefault(): org.yagi.motel.pantheon.api.AccessGetOwnedEventIdsResponse = this ?: AccessGetOwnedEventIdsResponse.defaultInstance

private fun AccessGetOwnedEventIdsResponse.protoMergeImpl(plus: pbandk.Message?): AccessGetOwnedEventIdsResponse = (plus as? AccessGetOwnedEventIdsResponse)?.let {
    it.copy(
        eventIds = eventIds + plus.eventIds,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AccessGetOwnedEventIdsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AccessGetOwnedEventIdsResponse {
    var eventIds: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> eventIds = (eventIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
        }
    }

    return AccessGetOwnedEventIdsResponse(pbandk.ListWithSize.Builder.fixed(eventIds), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAccessAddRuleForPersonPayload")
public fun AccessAddRuleForPersonPayload?.orDefault(): org.yagi.motel.pantheon.api.AccessAddRuleForPersonPayload = this ?: AccessAddRuleForPersonPayload.defaultInstance

private fun AccessAddRuleForPersonPayload.protoMergeImpl(plus: pbandk.Message?): AccessAddRuleForPersonPayload = (plus as? AccessAddRuleForPersonPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AccessAddRuleForPersonPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AccessAddRuleForPersonPayload {
    var ruleName = ""
    var ruleValue = 0
    var personId = 0
    var eventId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ruleName = _fieldValue as String
            2 -> ruleValue = _fieldValue as Int
            3 -> personId = _fieldValue as Int
            4 -> eventId = _fieldValue as Int
        }
    }

    return AccessAddRuleForPersonPayload(ruleName, ruleValue, personId, eventId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAccessAddRuleForPersonResponse")
public fun AccessAddRuleForPersonResponse?.orDefault(): org.yagi.motel.pantheon.api.AccessAddRuleForPersonResponse = this ?: AccessAddRuleForPersonResponse.defaultInstance

private fun AccessAddRuleForPersonResponse.protoMergeImpl(plus: pbandk.Message?): AccessAddRuleForPersonResponse = (plus as? AccessAddRuleForPersonResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AccessAddRuleForPersonResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AccessAddRuleForPersonResponse {
    var ruleId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ruleId = _fieldValue as Int
        }
    }

    return AccessAddRuleForPersonResponse(ruleId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAccessDeleteRuleForPersonPayload")
public fun AccessDeleteRuleForPersonPayload?.orDefault(): org.yagi.motel.pantheon.api.AccessDeleteRuleForPersonPayload = this ?: AccessDeleteRuleForPersonPayload.defaultInstance

private fun AccessDeleteRuleForPersonPayload.protoMergeImpl(plus: pbandk.Message?): AccessDeleteRuleForPersonPayload = (plus as? AccessDeleteRuleForPersonPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AccessDeleteRuleForPersonPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AccessDeleteRuleForPersonPayload {
    var ruleId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ruleId = _fieldValue as Int
        }
    }

    return AccessDeleteRuleForPersonPayload(ruleId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsCreateAccountPayload")
public fun PersonsCreateAccountPayload?.orDefault(): org.yagi.motel.pantheon.api.PersonsCreateAccountPayload = this ?: PersonsCreateAccountPayload.defaultInstance

private fun PersonsCreateAccountPayload.protoMergeImpl(plus: pbandk.Message?): PersonsCreateAccountPayload = (plus as? PersonsCreateAccountPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsCreateAccountPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsCreateAccountPayload {
    var email = ""
    var password = ""
    var title = ""
    var city = ""
    var phone = ""
    var tenhouId = ""
    var country = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> email = _fieldValue as String
            2 -> password = _fieldValue as String
            3 -> title = _fieldValue as String
            4 -> city = _fieldValue as String
            5 -> phone = _fieldValue as String
            6 -> tenhouId = _fieldValue as String
            7 -> country = _fieldValue as String
        }
    }

    return PersonsCreateAccountPayload(email, password, title, city,
        phone, tenhouId, country, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsCreateAccountResponse")
public fun PersonsCreateAccountResponse?.orDefault(): org.yagi.motel.pantheon.api.PersonsCreateAccountResponse = this ?: PersonsCreateAccountResponse.defaultInstance

private fun PersonsCreateAccountResponse.protoMergeImpl(plus: pbandk.Message?): PersonsCreateAccountResponse = (plus as? PersonsCreateAccountResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsCreateAccountResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsCreateAccountResponse {
    var personId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> personId = _fieldValue as Int
        }
    }

    return PersonsCreateAccountResponse(personId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsUpdatePersonalInfoPayload")
public fun PersonsUpdatePersonalInfoPayload?.orDefault(): org.yagi.motel.pantheon.api.PersonsUpdatePersonalInfoPayload = this ?: PersonsUpdatePersonalInfoPayload.defaultInstance

private fun PersonsUpdatePersonalInfoPayload.protoMergeImpl(plus: pbandk.Message?): PersonsUpdatePersonalInfoPayload = (plus as? PersonsUpdatePersonalInfoPayload)?.let {
    it.copy(
        msNickname = plus.msNickname ?: msNickname,
        msFriendId = plus.msFriendId ?: msFriendId,
        msAccountId = plus.msAccountId ?: msAccountId,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsUpdatePersonalInfoPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsUpdatePersonalInfoPayload {
    var id = 0
    var title = ""
    var country = ""
    var city = ""
    var email = ""
    var phone = ""
    var tenhouId = ""
    var hasAvatar = false
    var avatarData = ""
    var msNickname: String? = null
    var msFriendId: Int? = null
    var msAccountId: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as Int
            2 -> title = _fieldValue as String
            3 -> country = _fieldValue as String
            4 -> city = _fieldValue as String
            5 -> email = _fieldValue as String
            6 -> phone = _fieldValue as String
            7 -> tenhouId = _fieldValue as String
            8 -> hasAvatar = _fieldValue as Boolean
            9 -> avatarData = _fieldValue as String
            10 -> msNickname = _fieldValue as String
            11 -> msFriendId = _fieldValue as Int
            12 -> msAccountId = _fieldValue as Int
        }
    }

    return PersonsUpdatePersonalInfoPayload(id, title, country, city,
        email, phone, tenhouId, hasAvatar,
        avatarData, msNickname, msFriendId, msAccountId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsGetPersonalInfoPayload")
public fun PersonsGetPersonalInfoPayload?.orDefault(): org.yagi.motel.pantheon.api.PersonsGetPersonalInfoPayload = this ?: PersonsGetPersonalInfoPayload.defaultInstance

private fun PersonsGetPersonalInfoPayload.protoMergeImpl(plus: pbandk.Message?): PersonsGetPersonalInfoPayload = (plus as? PersonsGetPersonalInfoPayload)?.let {
    it.copy(
        ids = ids + plus.ids,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsGetPersonalInfoPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsGetPersonalInfoPayload {
    var ids: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ids = (ids ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
        }
    }

    return PersonsGetPersonalInfoPayload(pbandk.ListWithSize.Builder.fixed(ids), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsGetPersonalInfoResponse")
public fun PersonsGetPersonalInfoResponse?.orDefault(): org.yagi.motel.pantheon.api.PersonsGetPersonalInfoResponse = this ?: PersonsGetPersonalInfoResponse.defaultInstance

private fun PersonsGetPersonalInfoResponse.protoMergeImpl(plus: pbandk.Message?): PersonsGetPersonalInfoResponse = (plus as? PersonsGetPersonalInfoResponse)?.let {
    it.copy(
        people = people + plus.people,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsGetPersonalInfoResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsGetPersonalInfoResponse {
    var people: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PersonEx>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> people = (people ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PersonEx> }
        }
    }

    return PersonsGetPersonalInfoResponse(pbandk.ListWithSize.Builder.fixed(people), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsFindByTenhouIdsPayload")
public fun PersonsFindByTenhouIdsPayload?.orDefault(): org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsPayload = this ?: PersonsFindByTenhouIdsPayload.defaultInstance

private fun PersonsFindByTenhouIdsPayload.protoMergeImpl(plus: pbandk.Message?): PersonsFindByTenhouIdsPayload = (plus as? PersonsFindByTenhouIdsPayload)?.let {
    it.copy(
        ids = ids + plus.ids,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsFindByTenhouIdsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsFindByTenhouIdsPayload {
    var ids: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ids = (ids ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
        }
    }

    return PersonsFindByTenhouIdsPayload(pbandk.ListWithSize.Builder.fixed(ids), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsFindByMajsoulIdsPayload")
public fun PersonsFindByMajsoulIdsPayload?.orDefault(): org.yagi.motel.pantheon.api.PersonsFindByMajsoulIdsPayload = this ?: PersonsFindByMajsoulIdsPayload.defaultInstance

private fun PersonsFindByMajsoulIdsPayload.protoMergeImpl(plus: pbandk.Message?): PersonsFindByMajsoulIdsPayload = (plus as? PersonsFindByMajsoulIdsPayload)?.let {
    it.copy(
        ids = ids + plus.ids,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsFindByMajsoulIdsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsFindByMajsoulIdsPayload {
    var ids: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.MajsoulSearchEx>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ids = (ids ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.MajsoulSearchEx> }
        }
    }

    return PersonsFindByMajsoulIdsPayload(pbandk.ListWithSize.Builder.fixed(ids), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsFindByTenhouIdsResponse")
public fun PersonsFindByTenhouIdsResponse?.orDefault(): org.yagi.motel.pantheon.api.PersonsFindByTenhouIdsResponse = this ?: PersonsFindByTenhouIdsResponse.defaultInstance

private fun PersonsFindByTenhouIdsResponse.protoMergeImpl(plus: pbandk.Message?): PersonsFindByTenhouIdsResponse = (plus as? PersonsFindByTenhouIdsResponse)?.let {
    it.copy(
        people = people + plus.people,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsFindByTenhouIdsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsFindByTenhouIdsResponse {
    var people: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.PersonEx>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> people = (people ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.PersonEx> }
        }
    }

    return PersonsFindByTenhouIdsResponse(pbandk.ListWithSize.Builder.fixed(people), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsFindByTitlePayload")
public fun PersonsFindByTitlePayload?.orDefault(): org.yagi.motel.pantheon.api.PersonsFindByTitlePayload = this ?: PersonsFindByTitlePayload.defaultInstance

private fun PersonsFindByTitlePayload.protoMergeImpl(plus: pbandk.Message?): PersonsFindByTitlePayload = (plus as? PersonsFindByTitlePayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsFindByTitlePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsFindByTitlePayload {
    var query = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> query = _fieldValue as String
        }
    }

    return PersonsFindByTitlePayload(query, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsFindByTitleResponse")
public fun PersonsFindByTitleResponse?.orDefault(): org.yagi.motel.pantheon.api.PersonsFindByTitleResponse = this ?: PersonsFindByTitleResponse.defaultInstance

private fun PersonsFindByTitleResponse.protoMergeImpl(plus: pbandk.Message?): PersonsFindByTitleResponse = (plus as? PersonsFindByTitleResponse)?.let {
    it.copy(
        people = people + plus.people,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsFindByTitleResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsFindByTitleResponse {
    var people: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.Person>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> people = (people ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.Person> }
        }
    }

    return PersonsFindByTitleResponse(pbandk.ListWithSize.Builder.fixed(people), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDepersonalizePayload")
public fun DepersonalizePayload?.orDefault(): org.yagi.motel.pantheon.api.DepersonalizePayload = this ?: DepersonalizePayload.defaultInstance

private fun DepersonalizePayload.protoMergeImpl(plus: pbandk.Message?): DepersonalizePayload = (plus as? DepersonalizePayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DepersonalizePayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DepersonalizePayload {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return DepersonalizePayload(unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsGetMajsoulNicknamesPayload")
public fun PersonsGetMajsoulNicknamesPayload?.orDefault(): org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesPayload = this ?: PersonsGetMajsoulNicknamesPayload.defaultInstance

private fun PersonsGetMajsoulNicknamesPayload.protoMergeImpl(plus: pbandk.Message?): PersonsGetMajsoulNicknamesPayload = (plus as? PersonsGetMajsoulNicknamesPayload)?.let {
    it.copy(
        ids = ids + plus.ids,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsGetMajsoulNicknamesPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsGetMajsoulNicknamesPayload {
    var ids: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ids = (ids ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
        }
    }

    return PersonsGetMajsoulNicknamesPayload(pbandk.ListWithSize.Builder.fixed(ids), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsGetMajsoulNicknamesResponse")
public fun PersonsGetMajsoulNicknamesResponse?.orDefault(): org.yagi.motel.pantheon.api.PersonsGetMajsoulNicknamesResponse = this ?: PersonsGetMajsoulNicknamesResponse.defaultInstance

private fun PersonsGetMajsoulNicknamesResponse.protoMergeImpl(plus: pbandk.Message?): PersonsGetMajsoulNicknamesResponse = (plus as? PersonsGetMajsoulNicknamesResponse)?.let {
    it.copy(
        mapping = mapping + plus.mapping,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsGetMajsoulNicknamesResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsGetMajsoulNicknamesResponse {
    var mapping: pbandk.ListWithSize.Builder<org.yagi.motel.pantheon.api.MajsoulPersonMapping>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> mapping = (mapping ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.yagi.motel.pantheon.api.MajsoulPersonMapping> }
        }
    }

    return PersonsGetMajsoulNicknamesResponse(pbandk.ListWithSize.Builder.fixed(mapping), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsGetNotificationsSettingsPayload")
public fun PersonsGetNotificationsSettingsPayload?.orDefault(): org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsPayload = this ?: PersonsGetNotificationsSettingsPayload.defaultInstance

private fun PersonsGetNotificationsSettingsPayload.protoMergeImpl(plus: pbandk.Message?): PersonsGetNotificationsSettingsPayload = (plus as? PersonsGetNotificationsSettingsPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsGetNotificationsSettingsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsGetNotificationsSettingsPayload {
    var personId = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> personId = _fieldValue as Int
        }
    }

    return PersonsGetNotificationsSettingsPayload(personId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsGetNotificationsSettingsResponse")
public fun PersonsGetNotificationsSettingsResponse?.orDefault(): org.yagi.motel.pantheon.api.PersonsGetNotificationsSettingsResponse = this ?: PersonsGetNotificationsSettingsResponse.defaultInstance

private fun PersonsGetNotificationsSettingsResponse.protoMergeImpl(plus: pbandk.Message?): PersonsGetNotificationsSettingsResponse = (plus as? PersonsGetNotificationsSettingsResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsGetNotificationsSettingsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsGetNotificationsSettingsResponse {
    var telegramId = ""
    var notifications = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> telegramId = _fieldValue as String
            2 -> notifications = _fieldValue as String
        }
    }

    return PersonsGetNotificationsSettingsResponse(telegramId, notifications, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonsSetNotificationsSettingsPayload")
public fun PersonsSetNotificationsSettingsPayload?.orDefault(): org.yagi.motel.pantheon.api.PersonsSetNotificationsSettingsPayload = this ?: PersonsSetNotificationsSettingsPayload.defaultInstance

private fun PersonsSetNotificationsSettingsPayload.protoMergeImpl(plus: pbandk.Message?): PersonsSetNotificationsSettingsPayload = (plus as? PersonsSetNotificationsSettingsPayload)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PersonsSetNotificationsSettingsPayload.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PersonsSetNotificationsSettingsPayload {
    var personId = 0
    var telegramId = ""
    var notifications = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> personId = _fieldValue as Int
            2 -> telegramId = _fieldValue as String
            3 -> notifications = _fieldValue as String
        }
    }

    return PersonsSetNotificationsSettingsPayload(personId, telegramId, notifications, unknownFields)
}
