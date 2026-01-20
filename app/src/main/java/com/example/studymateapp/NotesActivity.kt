package com.example.studymateapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class NotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        // Klik Folder Science
        val folderScience = findViewById<LinearLayout>(R.id.folderScience)
        folderScience.setOnClickListener {
            val intent = Intent(this, NoteEditorActivity::class.java)
            intent.putExtra("SUBJECT", "Science")
            startActivity(intent)
        }

        // Klik Ikon Profil (Perempuan atas kanan)
        val profileIcon = findViewById<ImageView>(R.id.profileIcon)
        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // Klik Butang Tambah (+)
        val navAdd = findViewById<ImageView>(R.id.navAdd)
        navAdd.setOnClickListener {
            val intent = Intent(this, NoteEditorActivity::class.java)
            startActivity(intent)
        }
    }
}