package com.example.studymateapp

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class NotesActivity : AppCompatActivity() {

    // Senarai folder mengikut design yang awak mahukan
    private val folderList = mutableListOf(
        FolderModel("Science", "#B9C9B4"),
        FolderModel("Mathematics", "#A2CAD4"),
        FolderModel("English", "#7FA6BD"),
        FolderModel("History", "#E0E0E2"),
        FolderModel("Geography", "#F8D7DA"),
        FolderModel("Physics", "#D1E7DD")
    )

    private lateinit var adapter: FolderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        // 1. Setup Gambar Profil (Budak Perempuan)
        val btnProfile = findViewById<ShapeableImageView>(R.id.btnProfile)
        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // 2. Setup RecyclerView untuk Folder
        val rvFolders = findViewById<RecyclerView>(R.id.rvFolders)
        adapter = FolderAdapter(folderList) { folder ->
            // Buka NoteEditorActivity bila folder ditekan
            val intent = Intent(this, NoteEditorActivity::class.java)
            intent.putExtra("FOLDER_NAME", folder.name)
            startActivity(intent)
        }

        // Guna GridLayoutManager dengan 2 kolum
        rvFolders.layoutManager = GridLayoutManager(this, 2)
        rvFolders.adapter = adapter

        // 3. Setup Butang Tambah (+) di Bottom Bar
        val btnAddFolder = findViewById<ImageButton>(R.id.btnAddFolder)
        btnAddFolder.setOnClickListener {
            val intent = Intent(this, AddFolderActivity::class.java)
            startActivity(intent)
        }

        // 4. Input Carian (Search Bar)
        val etSearch = findViewById<EditText>(R.id.etSearch)
        // Fungsi search boleh ditambah di sini nanti
    }
}