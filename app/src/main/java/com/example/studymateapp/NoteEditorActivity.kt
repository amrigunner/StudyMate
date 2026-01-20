package com.example.studymateapp

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NoteEditorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_editor)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val btnSave = findViewById<TextView>(R.id.btnSave)
        val editTitle = findViewById<EditText>(R.id.editNoteTitle)
        val editContent = findViewById<EditText>(R.id.editNoteContent)

        // Terima data subjek dari skrin sebelumnya (contoh: "Science")
        val subjectName = intent.getStringExtra("SUBJECT")
        if (subjectName != null) {
            editTitle.setText(subjectName) // Set tajuk automatik ikut folder yang ditekan
        }

        // Fungsi butang kembali
        btnBack.setOnClickListener {
            finish()
        }

        // Fungsi butang Save
        btnSave.setOnClickListener {
            val title = editTitle.text.toString()
            if (title.isNotEmpty()) {
                Toast.makeText(this, "Note '$title' Saved!", Toast.LENGTH_SHORT).show()
                finish() // Kembali ke skrin folder selepas save
            } else {
                Toast.makeText(this, "Please enter a title", Toast.LENGTH_SHORT).show()
            }
        }
    }
}