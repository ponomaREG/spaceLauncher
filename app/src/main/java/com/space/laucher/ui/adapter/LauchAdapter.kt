package com.space.laucher.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.space.laucher.R
import com.space.laucher.databinding.RvItemBinding
import com.space.laucher.model.Launch

class LauchAdapter:RecyclerView.Adapter<LauchAdapter.Holder>() {
    private val items:MutableList<Launch> = mutableListOf()

    class Holder(val binding:RvItemBinding):RecyclerView.ViewHolder(binding.root)

    fun addItems(new_items:List<Launch>){
        Log.e("new_items",new_items.size.toString())
        items.addAll(new_items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<RvItemBinding>(inflater, R.layout.rv_item,parent,false)
        return Holder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Log.e("ON BIND VIEW HOLDER","1")
        holder.binding.apply {
            launch = items[position]
        }
    }
}