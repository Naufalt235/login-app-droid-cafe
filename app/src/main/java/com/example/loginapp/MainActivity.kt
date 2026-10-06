package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.et_username)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener(View.OnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            // Validasi sederhana
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Username & Password tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            } else {
                // Pindah ke MainActivity2 dengan membawa username
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("EXTRA_USERNAME", username)
                startActivity(intent)
                finish()
            }
        })
    }
}