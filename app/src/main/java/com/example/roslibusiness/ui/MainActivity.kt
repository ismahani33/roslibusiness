package com.example.roslibusiness.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.roslibusiness.R
import com.example.roslibusiness.ui.expenses.expenses_mainpage
import com.example.roslibusiness.ui.inventory.inventory_mainpage
import com.example.roslibusiness.ui.sales.sales_mainpage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonInventory = findViewById<ImageView>(R.id.imageStok)
        val buttonSales = findViewById<ImageView>(R.id.imageHasil)
        val buttonExpenses = findViewById<ImageView>(R.id.imageBelanja)

        buttonInventory .setOnClickListener {
            val intent1 = Intent(this, inventory_mainpage::class.java)

            startActivity(intent1)
        }
        buttonSales.setOnClickListener {
            val intent1 = Intent(this, sales_mainpage::class.java)

            startActivity(intent1)
        }
        buttonExpenses.setOnClickListener {
            val intent1 = Intent(this, expenses_mainpage::class.java)

            startActivity(intent1)
        }

    }
}