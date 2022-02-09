package com.example.myapplication.main.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Inter {
    val URL = "http://cinema.areas.su/up/images/"

        val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        val api by lazy {
            retrofit.create(Service::class.java)
        }
}