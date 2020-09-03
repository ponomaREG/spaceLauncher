package com.space.laucher.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Pad(
    var id: Int? = null,
    var name: String? = null,
    var infoURL: String? = null,
    var wikiURL: String? = null,
    var mapURL: String? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var agencies: List<Agency>? = null
) : Parcelable