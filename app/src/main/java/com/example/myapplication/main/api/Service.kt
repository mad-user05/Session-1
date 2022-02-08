package com.example.myapplication.main.api

import com.example.myapplication.signup.model.ModelRef
import com.example.myapplication.signup.model.ModelToken
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface Service {
    @GET("name")
        suspend fun getPhotos(@Query("name") name : String)

    @POST("auth/register")
    suspend fun getReg(@Body ModelRef : ModelRef ): Response
}