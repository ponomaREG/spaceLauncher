package com.space.laucher.extensions

import android.view.View
import android.widget.ImageView
import com.space.laucher.R
import com.squareup.picasso.Picasso

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