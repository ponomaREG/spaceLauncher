package com.space.laucher.model

import android.os.Parcelable
import android.util.Log
import kotlinx.android.parcel.Parcelize
import java.util.*
import kotlin.math.abs

@Parcelize
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
    var vidURLs: List<String>? = null,
    var vidURL: String? = null,
    var infoURLs: List<String>? = null,
    var infoURL: String? = null,
    var holdreason: String? = null,
    var failreason: String? = null,
    var tbddate: Int? = null,
    var probability: Int? = null,
    var hashtag: String? = null,
    var changed: String? = null,
    var location: Location? = null,
    var rocket: Rocket? = null,
    var missions: List<Mission>? = null,
    var lsp: Lsp? = null
) : Parcelable {
//    fun findDifferenceBetweenTimestampOfStartLaunchAndCurrentDayInDAYS():Long{
//        val currentTimeStamp = System.currentTimeMillis()
//        val timestampOfLaunch:Long = netstamp?.toLong()
//            ?: ((((wsstamp?.toLong() ?: if(westamp != null) westamp?.toLong()
//            else System.currentTimeMillis()))!!.toLong()))
//        Log.e("(currentTimeStamp)","($currentTimeStamp - $timestampOfLaunch)")
//        return (abs(currentTimeStamp - timestampOfLaunch)/3600/24)
//    }
//
//    fun getDifferenceInDays():String{
//        val diff = findDifferenceBetweenTimestampOfStartLaunchAndCurrentDayInDAYS()
//        return if(diff == 0L){
//            ""
//        }else "$diff days left"
//    }
}