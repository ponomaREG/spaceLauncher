package com.space.laucher.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mission(
    var id:Int,
    var name:String,
    var description:String?,
    var typeName:String?,
    var agencies:List<Agency>?
) : Parcelable