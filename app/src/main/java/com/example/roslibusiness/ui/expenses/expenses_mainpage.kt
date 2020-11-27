package com.example.roslibusiness.ui.expenses

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roslibusiness.R
import kotlinx.android.synthetic.main.expenses_mainpage.*

class expenses_mainpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.expenses_mainpage)

        btnAddExpenses.setOnClickListener {
            val intent1 = Intent(this, expenses_additem::class.java)
            startActivity(intent1)
        }
    }
}