package com.example.studymateapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        supportActionBar?.hide()

        // Cari ID Card dari XML
        val cardNotes = findViewById<CardView>(R.id.cardNotes)
        val cardTimer = findViewById<CardView>(R.id.cardTimer)

        // Klik Card Notes -> Pergi ke NotesActivity
        cardNotes.setOnClickListener {
            val intent = Intent(this, NotesActivity::class.java)
            startActivity(intent)
        }

        // Klik Card Timer -> Pergi ke TimerActivity
        cardTimer.setOnClickListener {
            val intent = Intent(this, TimerActivity::class.java)
            startActivity(intent)
        }
    }
}