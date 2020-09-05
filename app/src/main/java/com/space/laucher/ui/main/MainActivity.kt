package com.space.laucher.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.space.laucher.R
import com.space.laucher.databinding.ActivityMainBinding
import com.space.laucher.sample.DataBindingActivity
import com.space.laucher.ui.adapter.LauchAdapter
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : DataBindingActivity() {
    val mainViewModel: MainViewModel by viewModels()
    private val binding:ActivityMainBinding by binding(R.layout.activity_main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            lifecycleOwner = this@MainActivity
            vm = mainViewModel
            adapter = LauchAdapter()
            divider = DividerItemDecoration(this@MainActivity,LinearLayoutManager.VERTICAL)
        }
    }
}