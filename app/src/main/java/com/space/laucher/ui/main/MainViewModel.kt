package com.space.laucher.ui.main

import androidx.databinding.ObservableBoolean
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.space.laucher.model.Launch
import com.space.laucher.repository.MainRepository
import com.space.laucher.sample.LiveCoroutinesViewModel

class MainViewModel @ViewModelInject constructor(
    @Assisted private val savedStateHandle:SavedStateHandle
):LiveCoroutinesViewModel(){
    private val repos:MainRepository = MainRepository.getInstance()
    val liveDataLaunchesList:MutableLiveData<List<Launch>> = MutableLiveData()
    var loading:ObservableBoolean = ObservableBoolean(false)
    val toastLiveData:MutableLiveData<String> = MutableLiveData()

    init {
        repos.fetchLaunches(
            onSuccess = {
                loading.set(true)
            },
            onError = {
            toastLiveData.postValue(it.message)
            },
            onNext = {
                liveDataLaunchesList.value = it.launches
            }
        )
    }

}