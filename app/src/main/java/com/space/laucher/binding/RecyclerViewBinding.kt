package com.space.laucher.binding

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.space.laucher.model.Launch
import com.space.laucher.ui.adapter.LauchAdapter


@BindingAdapter("adapter")
fun addAdapter(view:RecyclerView,adapter:RecyclerView.Adapter<*>){
    view.adapter = adapter
}

@BindingAdapter("launcherList")
fun launcherList(view:RecyclerView,list:List<Launch>?){
    Log.e("LAUCHER LIST","!@#")
    if((view.adapter != null) and (!list.isNullOrEmpty())){
        (view.adapter as LauchAdapter).addItems(list!!)
    }
}