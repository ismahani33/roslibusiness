package com.example.roslibusiness.ui.sales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roslibusiness.R
import kotlinx.android.synthetic.main.activity_sales_mainpage.*

class SalesMainpageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sales_mainpage)

        tambahHasilBtn.setOnClickListener{
            val intent = Intent(this, SalesEditorActivity::class.java)
            startActivity(intent)
        }


    }
}