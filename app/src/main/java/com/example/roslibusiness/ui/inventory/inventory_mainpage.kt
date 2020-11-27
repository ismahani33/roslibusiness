package com.example.roslibusiness.ui.inventory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roslibusiness.R
import kotlinx.android.synthetic.main.inventory_mainpage.*

class inventory_mainpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inventory_mainpage)

        btnAddInventory.setOnClickListener {
            val intent1 = Intent(this, inventory_additem::class.java)
            startActivity(intent1)
        }

        btnScanBarcode.setOnClickListener {
            val intent1 = Intent(this, inventory_barcode_page::class.java)
            startActivity(intent1)
        }


    }
}