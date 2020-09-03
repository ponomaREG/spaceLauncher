package com.space.laucher.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Location(
    var pads: List<Pad>? = null,
    var id: Int? = null,
    var name: String? = null,
    var infoURL: String? = null,
    var wikiURL: String? = null,
    var countryCode: String? = null
    ) : Parcelable