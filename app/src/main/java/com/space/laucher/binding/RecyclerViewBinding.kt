package com.space.laucher.binding

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.space.laucher.model.Launch
import com.space.laucher.ui.adapter.LauchAdapter

@BindingAdapter("adapter")
fun addAdapter(view:RecyclerView,adapter:RecyclerView.Adapter<*>){
    view.adapter = adapter
}

@BindingAdapter("launcherList")
fun launcherList(view:RecyclerView,list:List<Launch>){
    if(view.adapter != null){
        (view.adapter as LauchAdapter).addItems(list)
    }
}