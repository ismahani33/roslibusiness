package com.example.roslibusiness.ui.inventory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roslibusiness.R
import kotlinx.android.synthetic.main.inventory_mainpage.*

class inventoryMainpageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inventory_mainpage)

        btnAddInventory.setOnClickListener {
            val intent1 = Intent(this, AddItemInventory::class.java)
            startActivity(intent1)
        }

        btnScanBarcode.setOnClickListener {
            val intent1 = Intent(this, barcodePageActivity::class.java)
            startActivity(intent1)
        }


    }
}