package com.example.roslibusiness.ui.expenses

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roslibusiness.R
import kotlinx.android.synthetic.main.activity_expenses_mainpage.*

class ExpensesMainpageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expenses_mainpage)

        tambahBelanjaBtn.setOnClickListener {
            startActivity(Intent(this, ExpensesEditorActivity::class.java))

        }
    }
}