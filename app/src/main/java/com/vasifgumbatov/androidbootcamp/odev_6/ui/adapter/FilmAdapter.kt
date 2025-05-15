package com.vasifgumbatov.androidbootcamp.odev_6.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidbootcamp.R
import com.vasifgumbatov.androidbootcamp.odev_6.data.Film

class FilmAdapter(
    private val filmList: List<Film>,
    private val onItemClick: (Film) -> Unit,
) : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>() {

    inner class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewFilm: ImageView = itemView.findViewById(R.id.imageViewFilm)
        val textViewPrice: TextView = itemView.findViewById(R.id.textViewPrice)
        val textViewTitle: TextView = itemView.findViewById(R.id.textViewTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false)
        return FilmViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val film = filmList[position]
        holder.imageViewFilm.setImageResource(film.imageResId)
        holder.textViewPrice.text = film.price
        holder.textViewTitle.text = film.title

        holder.itemView.setOnClickListener {
            onItemClick(film)
        }
    }

    override fun getItemCount(): Int = filmList.size
}
