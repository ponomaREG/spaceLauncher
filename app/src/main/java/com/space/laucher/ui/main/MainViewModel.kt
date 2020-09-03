package com.space.laucher.ui.main

import android.util.Log
import androidx.databinding.ObservableBoolean
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.switchMap
import com.space.laucher.model.Launch
import com.space.laucher.repository.MainRepository
import com.space.laucher.sample.LiveCoroutinesViewModel
import timber.log.Timber

class MainViewModel @ViewModelInject constructor(
    @Assisted private val savedStateHandle:SavedStateHandle
):LiveCoroutinesViewModel(){
    private val repos:MainRepository = MainRepository.getInstance()
    //TODO:FETCHING LIVE DATA
    val liveDataLaunchesList:MutableLiveData<List<Launch>> = MutableLiveData()
    var loading:ObservableBoolean = ObservableBoolean(true)
    val toastLiveData:MutableLiveData<String> = MutableLiveData()

    init {
        Log.e("INIT","MV")

        repos.fetchLaunches(
            onSuccess = {
                loading.set(false)
            },
            onError = {
                Log.e("error",it.message.toString())
                toastLiveData.postValue(it.message.toString())
                loading.set(false)
            },
            onNext = {
                Log.e("LIST",it.launches.toString())
                Log.e("ASD","123")
                liveDataLaunchesList.value = it.launches
            }
        )
    }

}