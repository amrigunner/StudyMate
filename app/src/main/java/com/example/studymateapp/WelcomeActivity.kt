package com.example.studymateapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnGoogle = findViewById<Button>(R.id.btnGoogleSignIn)

        btnGoogle.setOnClickListener {
            // Berpindah ke NotesActivity bila butang ditekan
            val intent = Intent(this, NotesActivity::class.java)
            startActivity(intent)
            finish() // Menutup page Welcome supaya tidak boleh back ke sini semula
        }
    }
}