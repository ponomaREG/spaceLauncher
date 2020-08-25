package com.space.laucher.model

import java.util.*

data class Pad(
    var id: Int? = null,
    var name: String? = null,
    var infoURL: String? = null,
    var wikiURL: String? = null,
    var mapURL: String? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var agencies: List<Any>? = null
)