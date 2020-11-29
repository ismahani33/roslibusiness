package com.example.roslibusiness.ui.sales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roslibusiness.R
import kotlinx.android.synthetic.main.sales_mainpage.*

class sales_mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sales_mainpage)

        btnAddSales.setOnClickListener(){
            val intent = Intent(this, sales_additem::class.java)
            startActivity(intent)
        }


    }
}