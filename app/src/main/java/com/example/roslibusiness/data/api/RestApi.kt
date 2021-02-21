package com.example.roslibusiness.data.api

import com.example.roslibusiness.data.model.InventoryItem
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface RestApi {

    @GET ("/api/inventory/read.php")
    fun getInventories(): Call<List<InventoryItem>>

    @GET ("/api/inventory/read_lowstock.php")
    fun getInventoriesLowStock(): Call<List<InventoryItem>>

    @Headers("Content-Type: application/json")
    @POST ("inventory")
    fun addInventories(@Body inventoryData: InventoryItem): Call<List<InventoryItem>>
}