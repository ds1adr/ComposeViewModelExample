package com.ds2adr.composeviewmodelexample

import retrofit2.Retrofit
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.converter.gson.GsonConverterFactory
import com.ds2adr.composeviewmodelexample.TracksDataModel

interface INetworkService {
    @GET("/hot/electro")
    fun getTracks(@Query("format") format: String): Call<TracksDataModel>
}

class NetworkService {
    val retrofit
        get() = Retrofit.Builder()
            .baseUrl("https://openwhyd.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    val networkService
        get() = retrofit.create(INetworkService::class.java)

    val getTracksCall = networkService.getTracks("json")
}