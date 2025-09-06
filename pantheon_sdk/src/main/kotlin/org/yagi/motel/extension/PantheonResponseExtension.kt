package org.yagi.motel.extension

import io.ktor.http.Headers

class PantheonResponseExtension {

    companion object {
        fun <T> Pair<T, Headers>.extractResponse(): T {
            return this.first
        }
    }
}