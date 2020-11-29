package com.example.roslibusiness.ui.inventory

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.roslibusiness.R
import kotlinx.android.synthetic.main.inventory_additem.*

class AddItemInventory : AppCompatActivity() {

    private val REQUEST_IMAGE_GALLERY = 132
    private val REQUEST_IMAGE_CAMERA = 142

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inventory_additem)

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
                Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
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
            val dialog : AlertDialog = builder.create()
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

        //butang tambah (add database, generate barcode)
        btnTambahItem.setOnClickListener {
            val intent1 = Intent(this, inventoryDetailsActivity::class.java)
            startActivity(intent1)


        }

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

}
