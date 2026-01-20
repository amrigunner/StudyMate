package com.example.studymateapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class AddFolderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_folder)

        val btnBack = findViewById<ImageButton>(R.id.btnBackAddFolder)
        val btnSave = findViewById<Button>(R.id.btnSaveFolder)
        val etFolderName = findViewById<EditText>(R.id.etFolderName)

        btnBack.setOnClickListener {
            finish()
        }

        btnSave.setOnClickListener {
            val name = etFolderName.text.toString()
            if (name.isNotEmpty()) {
                // Hantar data balik menggunakan Intent
                val resultIntent = Intent()
                resultIntent.putExtra("NEW_FOLDER_NAME", name)
                setResult(RESULT_OK, resultIntent)
                finish()
            } else {
                etFolderName.error = "Please enter name"
            }
        }
    }
}