package com.example.roslibusiness.ui.expenses

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roslibusiness.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.expenses_mainpage.*

class expenses_mainpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.expenses_mainpage)

        val tambahBelanja = findViewById<FloatingActionButton>(R.id.btnAddExpenses)

        tambahBelanja.setOnClickListener {
            startActivity(Intent(this, expenses_additem::class.java))

        }
    }
}