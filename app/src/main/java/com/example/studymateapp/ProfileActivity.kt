package com.example.studymateapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // 1. Cari ID butang Home
        val btnHome = findViewById<ImageView>(R.id.btnHome)

        // 2. Fungsi apabila butang diklik
        btnHome.setOnClickListener {
            // Pindah balik ke NotesActivity (skrin nota awak)
            val intent = Intent(this, NotesActivity::class.java)
            startActivity(intent)
            finish() // Tutup skrin profile untuk jimat RAM
        }
    }
}