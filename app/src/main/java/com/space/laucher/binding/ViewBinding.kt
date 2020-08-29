package com.space.laucher.binding

import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import com.space.laucher.extensions.gone

@BindingAdapter("gone")
fun setGone(view: View,gone:Boolean) = view.gone(gone)

@BindingAdapter("toast")
fun showToast(view:View,text:LiveData<String>){
    if(!text.value.isNullOrEmpty()){
        Toast.makeText(view.context,text.value,Toast.LENGTH_SHORT).show()
    }else {
        Toast.makeText(view.context,"text.value",Toast.LENGTH_SHORT).show()
    }
}