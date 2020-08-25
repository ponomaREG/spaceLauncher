package com.space.laucher.ui.main

import androidx.databinding.ObservableBoolean
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import com.space.laucher.sample.LiveCoroutinesViewModel

class MainViewModel @ViewModelInject constructor(
    @Assisted private val savedStateHandle:SavedStateHandle
):LiveCoroutinesViewModel(){

    val loading:ObservableBoolean = ObservableBoolean(false)

}