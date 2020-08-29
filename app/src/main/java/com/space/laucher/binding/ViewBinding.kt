package com.space.laucher.binding

import android.view.View
import androidx.databinding.BindingAdapter
import com.space.laucher.extensions.gone

@BindingAdapter("gone")
fun setGone(view: View,gone:Boolean) = view.gone(gone)

