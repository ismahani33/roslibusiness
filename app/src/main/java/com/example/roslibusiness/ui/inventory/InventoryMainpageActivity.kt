package com.example.roslibusiness.ui.inventory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roslibusiness.R
import kotlinx.android.synthetic.main.activity_inventory_mainpage.*

class InventoryMainpageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventory_mainpage)

        tambahStokBtn.setOnClickListener {
            val intent1 = Intent(this, InventoryEditorActivity::class.java)
            startActivity(intent1)
        }


    }
}