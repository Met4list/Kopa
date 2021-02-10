package com.example.kopashop.db

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kopashop.R

class RecyclerAdapter(private val values: List<String>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var bootsTitle: TextView
        lateinit var sizeBoots: TextView
        lateinit var imageView: ImageView

        init {
            bootsTitle = itemView.findViewById(R.id.bootsTitle)
            sizeBoots = itemView.findViewById(R.id.sizeBoots)
            imageView = itemView.findViewById(R.id.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent?.context).inflate(
            R.layout.list_layout,
            parent,
            false
        )
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bootsTitle.text = values[position]
        holder.sizeBoots.text = "44"
        //holder.imageView =
    }

    override fun getItemCount() = values.size
}