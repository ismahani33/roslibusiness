package com.example.roslibusiness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.inventory_mainpage.*

class inventoryMainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inventory_mainpage)

        btnAddInventory.setOnClickListener {
            val intent1 = Intent(this, inventory_additem::class.java)

            startActivity(intent1)
        }

    }
}