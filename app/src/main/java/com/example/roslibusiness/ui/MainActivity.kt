package com.example.roslibusiness.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roslibusiness.R
import com.example.roslibusiness.ui.expenses.ExpensesMainpageActivity
import com.example.roslibusiness.ui.inventory.InventoryMainpageActivity
import com.example.roslibusiness.ui.sales.SalesMainpageActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val buttonInventory = findViewById<ImageView>(R.id.imageStok)
//        val buttonSales = findViewById<ImageView>(R.id.imageHasil)
//        val buttonExpenses = findViewById<ImageView>(R.id.imageBelanja)

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

    }
}