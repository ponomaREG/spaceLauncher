package com.space.laucher.model

import java.util.*

class Rocket(
    var id: Int? = null,
    var name: String? = null,
    var configuration: String? = null,
    var familyname: String? = null,
    var agencies: List<Agency>? = null,
    var wikiURL: String? = null,
    var infoURLs: List<Any>? = null,
    var imageURL: String? = null,
    var imageSizes: List<Int>? = null
    )