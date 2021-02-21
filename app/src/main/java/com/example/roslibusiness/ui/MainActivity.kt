package com.example.roslibusiness.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roslibusiness.R
import com.example.roslibusiness.adapter.LowStockAdapter
import com.example.roslibusiness.data.api.ServiceBuilder
import com.example.roslibusiness.data.model.InventoryItem
import com.example.roslibusiness.ui.expenses.ExpensesMainpageActivity
import com.example.roslibusiness.ui.inventory.InventoryMainpageActivity
import com.example.roslibusiness.ui.sales.SalesMainpageActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {


    private val retrofit = ServiceBuilder().getLowStock()
    lateinit var recyclerAdapter: LowStockAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stokCard.setOnClickListener {
            val intent1 = Intent(this, InventoryMainpageActivity::class.java)
            startActivity(intent1)
        }
        hasilCard.setOnClickListener {
            val intent1 = Intent(this, SalesMainpageActivity::class.java)
            startActivity(intent1)
        }
        belanjaCard.setOnClickListener {
            val intent1 = Intent(this, ExpensesMainpageActivity::class.java)
            startActivity(intent1)
        }

        //recyclerview from layout file
        lowStockRV.layoutManager = LinearLayoutManager(this)
        lowStockRV.adapter = recyclerAdapter

        retrofit.enqueue(object : Callback<List<InventoryItem>>{
            override fun onResponse(call: Call<List<InventoryItem>>, response: Response<List<InventoryItem>>) {
                if (response.body()!=null)
                    recyclerAdapter.setLowStock(response.body()!!)
            }

            override fun onFailure(call: Call<List<InventoryItem>>, t: Throwable) {

            }

        })

    }




}