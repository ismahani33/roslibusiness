package com.example.roslibusiness.ui.inventory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roslibusiness.R
//import com.google.zxing.integration.android.IntentIntegrator
//import com.google.zxing.integration.android.IntentResult
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.inventory_barcode_page.*


class barcodePageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inventory_barcode_page)

//    btnTambah.setOnClickListener{
//        run{
//            IntentIntegrator(this@barcodePageActivity).initiateScan()
//        }
//    }
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//
//        val result: IntentResult? = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
//
//        if(result != null){
//
//            if(result.contents != null){
//                scanTxt.text = result.contents
//            } else {
//                scanTxt.text = "scan failed"
//            }
//        } else {
//            super.onActivityResult(requestCode, resultCode, data)
//        }
//    }
    }
}