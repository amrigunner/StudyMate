package com.example.studymateapp

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NoteEditorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_editor)

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        val etTitle = findViewById<EditText>(R.id.etNoteTitle)
        val etBody = findViewById<EditText>(R.id.etNoteBody)

        // 1. Ambil data jika nota ini dibuka semula untuk edit
        val existingTitle = intent.getStringExtra("NOTE_TITLE")
        val existingContent = intent.getStringExtra("NOTE_CONTENT")
        etTitle.setText(existingTitle)
        etBody.setText(existingContent)

        // 2. Fungsi Auto-Save bila klik butang Back
        btnBack.setOnClickListener {
            val title = etTitle.text.toString().trim()
            val content = etBody.text.toString().trim()

            // Hanya hantar balik kalau ada isi
            if (title.isNotEmpty() || content.isNotEmpty()) {
                val resultIntent = Intent()
                resultIntent.putExtra("SAVED_TITLE", title)
                resultIntent.putExtra("SAVED_CONTENT", content)
                setResult(RESULT_OK, resultIntent)

                Toast.makeText(this, "Note Saved", Toast.LENGTH_SHORT).show()
            }

            finish() // Tutup page
        }
    }

    // Backup: Simpan juga kalau user tekan butang Back di bawah skrin telefon
    override fun onBackPressed() {
        findViewById<ImageButton>(R.id.btnBack).performClick()
        super.onBackPressed()
    }
}