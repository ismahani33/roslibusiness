package com.example.roslibusiness

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.AdapterView
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.zxing.BarcodeFormat
import com.google.zxing.oned.Code128Writer
import kotlinx.android.synthetic.main.inventory_additem.*
import kotlinx.android.synthetic.main.inventory_details.*

class inventory_additem : AppCompatActivity() {

    private val REQUEST_IMAGE_GALLERY = 132
    private val REQUEST_IMAGE_CAMERA = 142


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inventory_additem)

        val text_barang = findViewById<EditText>(R.id.inputNamaBarang)
//        val text_harga = findViewById<EditText>(R.id.inputHarga)

        //button close
        btnClose.setOnClickListener {
            val intent = Intent(this, inventory_mainpage::class.java)
            startActivity(intent)
        }

        //camera gallery
        imageInventory.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Pilih Gambar")
            builder.setMessage("Sila pilih sumber gambar")
            builder.setPositiveButton("Galeri") { dialog, which ->
                dialog.dismiss()
                val intent = Intent(Intent.ACTION_PICK)
                intent.type = "image/*"
                startActivityForResult(intent, REQUEST_IMAGE_GALLERY)
            }
            builder.setNegativeButton("Kamera") { dialog, which ->
                dialog.dismiss()
                Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {takePictureIntent ->
                    takePictureIntent.resolveActivity(packageManager)?.also {
                        val permission = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
                        if (permission != PackageManager.PERMISSION_GRANTED){
                            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA,
                                android.Manifest.permission.WRITE_EXTERNAL_STORAGE), 1)
                        }
                        else{
                            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAMERA)
                        }
                    }
                }

            }
            val dialog :AlertDialog = builder.create()
            dialog.show()
        }



        //dropdown for inventory category
        spinKategori.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //button plus
//        btnTambah.setOnClickListener {
//            //input name, price
//            if (text_barang.text.isNotEmpty()) {
//                var KANTIN = 100
//                KANTIN += 1
//                displayBitmap(KANTIN.toString())
//            } else{
//                Toast.makeText(this, "Sila masukkan nama barang", Toast.LENGTH_SHORT).show()
//            }
//        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_GALLERY && resultCode == Activity.RESULT_OK && data != null){
            imageInventory.setImageURI(data.data)
        }
        else if (requestCode == REQUEST_IMAGE_CAMERA && resultCode == Activity.RESULT_OK && data != null){
            imageInventory.setImageBitmap(data.extras?.get("data") as Bitmap)
        }
        else{
            Toast.makeText(this, "Sedikit masalah berlaku", Toast.LENGTH_SHORT).show()
        }
    }

    //start barcode

//    @RequiresApi(Build.VERSION_CODES.M)
//    private fun displayBitmap(value: String) {
//        val widthPixels = resources.getDimensionPixelSize(R.dimen.width_barcode)
//        val heightPixels = resources.getDimensionPixelSize(R.dimen.height_barcode)
//
//        image_barcode.setImageBitmap(
//            createBarcodeBitmap(
//                barcodeValue = value,
//                barcodeColor = getColor(R.color.colorPrimary),
//                backgroundColor = getColor(android.R.color.white),
//                widthPixels = widthPixels,
//                heightPixels = heightPixels
//            )
//        )
//        textNama.text = value
//    }
//
//    private fun createBarcodeBitmap(
//        barcodeValue: String,
//        barcodeColor: Int,
//        backgroundColor: Int,
//        widthPixels: Int,
//        heightPixels: Int
//    ): Bitmap {
//        val bitMatrix = Code128Writer().encode(
//            barcodeValue,
//            BarcodeFormat.CODE_128,
//            widthPixels,
//            heightPixels
//        )
//
//        val pixels = IntArray(bitMatrix.width * bitMatrix.height)
//        for (y in 0 until bitMatrix.height) {
//            val offset = y * bitMatrix.width
//            for (x in 0 until bitMatrix.width) {
//                pixels[offset + x] =
//                    if (bitMatrix.get(x, y)) barcodeColor else backgroundColor
//            }
//        }
//
//        val bitmap = Bitmap.createBitmap(
//            bitMatrix.width,
//            bitMatrix.height,
//            Bitmap.Config.ARGB_8888
//        )
//        bitmap.setPixels(
//            pixels,
//            0,
//            bitMatrix.width,
//            0,
//            0,
//            bitMatrix.width,
//            bitMatrix.height
//        )
//        return bitmap
//    }
}