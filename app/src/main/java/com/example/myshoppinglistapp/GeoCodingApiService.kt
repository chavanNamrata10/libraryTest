package com.example.myshoppinglistapp

import com.google.android.gms.maps.model.LatLng
import retrofit2.http.GET
import retrofit2.http.Query

interface GeoCodingApiService {
    @GET("maps/api/geocode/json")
    suspend fun getAddressFromCoordinate(

        @Query("latlng")latLng: String,
        @Query("key") apiKey: String
    ):GeoCodingResponse
}