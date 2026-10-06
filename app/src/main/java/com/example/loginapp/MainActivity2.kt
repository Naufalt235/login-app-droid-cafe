package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        // Ambil username dari Login
        val username = intent.getStringExtra("EXTRA_USERNAME")
        if (username != null) {
            Toast.makeText(this, "Selamat datang, $username!", Toast.LENGTH_SHORT).show()
        }

        // Event klik gambar → Toast
        val donut = findViewById<ImageView>(R.id.donut)
        val iceCream = findViewById<ImageView>(R.id.ice_cream)
        val froyo = findViewById<ImageView>(R.id.froyo)

        donut.setOnClickListener {
            displayToast(getString(R.string.donut_order_message))
        }
        iceCream.setOnClickListener {
            displayToast(getString(R.string.ice_cream_order_message))
        }
        froyo.setOnClickListener {
            displayToast(getString(R.string.froyo_order_message))
        }

        // FAB → pindah ke OrderActivity
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            startActivity(intent)
        }
    }

    fun displayToast(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}