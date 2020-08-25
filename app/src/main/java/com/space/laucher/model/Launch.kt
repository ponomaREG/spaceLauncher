package com.space.laucher.model

import java.util.*

data class Launch(
    var id: Int? = null,
    var name: String? = null,
    var windowstart: String? = null,
    var windowend: String? = null,
    var net: String? = null,
    var wsstamp: Int? = null,
    var westamp: Int? = null,
    var netstamp: Int? = null,
    var isostart: String? = null,
    var isoend: String? = null,
    var isonet: String? = null,
    var status: Int? = null,
    var inhold: Int? = null,
    var tbdtime: Int? = null,
    var vidURLs: List<Any>? = null,
    var vidURL: Any? = null,
    var infoURLs: List<Any>? = null,
    var infoURL: Any? = null,
    var holdreason: Any? = null,
    var failreason: Any? = null,
    var tbddate: Int? = null,
    var probability: Int? = null,
    var hashtag: Any? = null,
    var changed: String? = null,
    var location: Location? = null,
    var rocket: Rocket? = null,
    var missions: List<Any>? = null,
    var lsp: Lsp? = null
)