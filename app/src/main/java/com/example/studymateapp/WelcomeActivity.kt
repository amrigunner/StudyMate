package com.example.studymateapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Cari ID butang Google (Pastikan ID dalam XML adalah btnGoogle)
        val btnGoogle = findViewById<LinearLayout>(R.id.btnGoogle)

        btnGoogle.setOnClickListener {
            // Pergi ke NotesActivity
            val intent = Intent(this, NotesActivity::class.java)
            startActivity(intent)
            finish() // Tutup skrin Welcome supaya tak boleh tekan back balik
        }
    }
}