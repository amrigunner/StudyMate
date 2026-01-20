package com.example.studymateapp

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Tambah 'private val onItemClick' di dalam kurungan ini
class FolderAdapter(
    private val folderList: List<FolderModel>,
    private val onItemClick: (FolderModel) -> Unit
) : RecyclerView.Adapter<FolderAdapter.FolderViewHolder>() {

    class FolderViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.tvFolderName)
        val folderContainer: LinearLayout = view.findViewById(R.id.folderContainer)
        val folderTab: View = view.findViewById(R.id.folderTab)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FolderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_folder, parent, false)
        return FolderViewHolder(view)
    }

    override fun onBindViewHolder(holder: FolderViewHolder, position: Int) {
        val folder = folderList[position]
        holder.tvName.text = folder.name

        val colorInt = Color.parseColor(folder.color)
        holder.folderContainer.backgroundTintList = ColorStateList.valueOf(colorInt)
        holder.folderTab.backgroundTintList = ColorStateList.valueOf(colorInt)

        // Panggil fungsi klik yang dihantar dari NotesActivity
        holder.itemView.setOnClickListener {
            onItemClick(folder)
        }
    }

    override fun getItemCount(): Int = folderList.size
}