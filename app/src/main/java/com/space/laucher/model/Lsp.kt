package com.space.laucher.model

import java.util.*

data class Lsp(
    var id: Int? = null,
    var name: String? = null,
    var abbrev: String? = null,
    var countryCode: String? = null,
    var type: Int? = null,
    var infoURL: Any? = null,
    var wikiURL: String? = null,
    var changed: String? = null,
    var infoURLs: List<String>? = null
    )