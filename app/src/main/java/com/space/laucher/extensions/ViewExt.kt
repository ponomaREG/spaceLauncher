package com.space.laucher.extensions

import android.view.View

fun View.gone(gone:Boolean){
    if(gone) this.visibility = View.GONE
    else this.visibility = View.VISIBLE
}