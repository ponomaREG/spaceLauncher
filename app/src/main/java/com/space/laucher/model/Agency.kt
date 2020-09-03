package com.space.laucher.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Agency(
    var id: Int? = null,
    var name: String? = null,
    var abbrev: String? = null,
    var countryCode: String? = null,
    var type: Int? = null,
    var infoURL: String? = null,
    var wikiURL: String? = null,
    var changed: String? = null,
    var infoURLs: List<String>? = null
    ) : Parcelable