package com.space.laucher.repository

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class BaseRepository {

     val retrofit:Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
    companion object{
        const val BASE_URL = "https://launchlibrary.net/1.4.1/"
        private var instance:BaseRepository? = null
         fun getInstance():BaseRepository{
            if(instance == null) instance = BaseRepository()
            return instance as BaseRepository
        }
    }
}