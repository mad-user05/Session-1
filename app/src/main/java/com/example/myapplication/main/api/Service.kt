package com.example.myapplication.main.api

import com.example.myapplication.movie.adapter.models.ModelFirst
import com.example.myapplication.movie.adapter.models.ModelTwo
import retrofit2.Callback
import retrofit2.http.GET
import retrofit2.http.Path
interface Service {


    @GET("movies/{movieId}")
    fun getMovie(@Path("movieId") movieId: Int)
            : Callback<ModelFirst>

    @GET("movies/{movieId}/episodes")
    fun getEpisodes(@Path("movieId") movieId: Int)
            : Callback<ModelTwo>
}
