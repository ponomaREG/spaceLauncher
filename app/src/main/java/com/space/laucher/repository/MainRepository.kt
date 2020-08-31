package com.space.laucher.repository

import android.util.Log
import com.space.laucher.model.LaunchesResponse
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

class MainRepository {

    companion object{
        private var instance:MainRepository? = null

        fun getInstance():MainRepository{
            if(instance == null) instance = MainRepository()
            return instance as MainRepository
        }
    }

    private fun loadR():MainRepositoryQueries
            = BaseRepository.getInstance().retrofit.create(MainRepositoryQueries::class.java)

    fun fetchLaunches(
        onNext:(LaunchesResponse) -> Unit,
        onError:(Throwable) -> Unit,
        onSuccess:() -> Unit
    ){
        Log.e("FETCH","~")
        loadR().fetchLaunches()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(
                onNext,
                onError,
                onSuccess
            )
    }

    interface MainRepositoryQueries{
        @GET("launch/next/{count}/")
        fun fetchLaunches(
            @Path("count") count:Int = 10
        ):Observable<LaunchesResponse>
    }
}