package com.example.myshoppinglistapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {
    private const val BASE_URL = "https://maps.googlemapsapis.com/"

    fun create():GeoCodingApiService{
        val retrofit= Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(GeoCodingApiService::class.java)
    }
}