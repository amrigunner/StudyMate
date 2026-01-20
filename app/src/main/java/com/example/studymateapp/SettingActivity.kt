package com.example.studymateapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Menghubungkan ke layout activity_settings.xml
        setContentView(R.layout.activity_settings)

        supportActionBar?.hide()

        // Contoh fungsi butang logout jika ada dalam design anda
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        btnLogout?.setOnClickListener {
            Toast.makeText(this, "Logged out successfully", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}