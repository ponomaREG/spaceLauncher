package com.space.laucher.extensions

import android.util.Log
import android.view.View
import android.widget.ImageView
import com.space.laucher.R
import com.squareup.picasso.Picasso
import java.util.*

fun View.gone(gone:Boolean){
    if(gone) this.visibility = View.GONE
    else this.visibility = View.VISIBLE
}

fun ImageView.loadPhoto(photoURL:String,placeholderID:Int = R.drawable.placeholder_rocket){
    Picasso.get()
        .load(photoURL)
        .placeholder(placeholderID)
        .into(this)
}

fun ImageView.loadCountryFlagByCountryCode(countryCode:String){
    val name = "${countryCode.toLowerCase(Locale.ROOT)}"
    val resourceID = this.context.resources.getIdentifier(
        name,"drawable",this.context.packageName)
    if(resourceID != 0) this.setImageDrawable(this.context.getDrawable(resourceID))
    else this.setImageDrawable(this.context.getDrawable(R.drawable.unknown))
}