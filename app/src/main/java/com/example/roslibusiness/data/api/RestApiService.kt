package com.example.roslibusiness.data.api

import com.example.roslibusiness.data.model.InventoryItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestApiService {

//    suspend fun getInventories(onResult: (InventoryItem?) ->Unit){
//        val retrofit = ServiceBuilder.buildService(RestApi::class.java)
//        retrofit.getInventories().enqueue(
//            object : Callback<InventoryItem>{
//                override fun onResponse(
//                    call: Call<InventoryItem>,
//                    response: Response<InventoryItem>
//                ) {
//                    val getInventory = response.body()
//                    onResult(getInventory)
//                }
//
//                override fun onFailure(call: Call<InventoryItem>, t: Throwable) {
//                    onResult(null)
//                }
//
//            }
//        )
//    }
}