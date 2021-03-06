package com.space.laucher.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.space.laucher.R
import com.space.laucher.databinding.RvItemBinding
import com.space.laucher.extensions.loadCountryFlagByCountryCode
import com.space.laucher.model.Launch
import com.space.laucher.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.rv_item.view.*

class LauchAdapter:RecyclerView.Adapter<LauchAdapter.Holder>() {
    private val items:MutableList<Launch> = mutableListOf()

    class Holder(val binding:RvItemBinding):RecyclerView.ViewHolder(binding.root)

    fun addItems(new_items:List<Launch>){
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
        holder.binding.apply {
            launch = items[position]
            items[position].lsp?.countryCode?.let { root.item_country.loadCountryFlagByCountryCode(it) }
            root.setOnClickListener {
                DetailActivity.startActivity(root.context,items[position])
            }
        }
    }
}