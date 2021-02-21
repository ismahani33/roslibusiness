package com.example.roslibusiness.data.api

import com.example.roslibusiness.data.model.InventoryItem
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class ServiceBuilder {

    private val service: RestApi

    companion object{
        const val BASE_URL = "https://roslibiz.com/"
    }

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(RestApi::class.java)
    }

    fun getLowStock(): Call<List<InventoryItem>>{
        return service.getInventoriesLowStock()
    }




//    private val client = OkHttpClient.Builder().build()
//
//    private val retrofit = Retrofit.Builder()
//        .baseUrl("https://roslibiz.com")
//        .addConverterFactory(GsonConverterFactory.create())
//        .client(client)
//        .build()
//
//    fun<T> buildService(service:Class<T>):T{
//        return retrofit.create(service)
//    }
}