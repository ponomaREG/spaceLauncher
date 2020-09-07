package com.space.laucher.extensions

import android.view.Gravity
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.prepareActionBar(){
    val actionBar = this.supportActionBar
    actionBar!!.setDisplayShowTitleEnabled(false)
    val imageLogo = ImageView(actionBar.themedContext)
    imageLogo.layoutParams = ActionBar.LayoutParams(
        120, 120,Gravity.CENTER)
    imageLogo.scaleType = ImageView.ScaleType.FIT_XY
    imageLogo.setImageDrawable(packageManager.getApplicationIcon(packageName))
    actionBar.customView = imageLogo
    actionBar.setDisplayShowCustomEnabled(true)
}