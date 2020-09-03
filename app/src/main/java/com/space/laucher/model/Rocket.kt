package com.space.laucher.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
class Rocket(
    var id: Int? = null,
    var name: String? = null,
    var configuration: String? = null,
    var familyname: String? = null,
    var agencies: List<Agency>? = null,
    var wikiURL: String? = null,
    var infoURLs: List<String>? = null,
    var imageURL: String? = null,
    var imageSizes: List<Int>? = null
    ) : Parcelable