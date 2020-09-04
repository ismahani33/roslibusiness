package com.example.roslibusiness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<ImageView>(R.id.imageStok)

        button1.setOnClickListener {
            val intent1 = Intent(this, inventoryMainpage::class.java)

            startActivity(intent1)
        }

    }
}