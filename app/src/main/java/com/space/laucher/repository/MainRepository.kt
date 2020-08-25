package com.space.laucher.repository

class MainRepository {

    companion object{
        private var instance:MainRepository? = null

        fun getInstance():MainRepository{
            if(instance == null) instance = MainRepository()
            return instance as MainRepository
        }
    }

    fun loadR():MainRepositoryQueries
            = BaseRepository.getInstance().retrofit.create(MainRepositoryQueries::class.java)

    interface MainRepositoryQueries{

    }
}