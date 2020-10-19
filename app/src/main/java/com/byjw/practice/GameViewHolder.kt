package com.byjw.practice

import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val thumbnail = itemView.findViewById<ImageView>(R.id.thumbnail)
    private val title = itemView.findViewById<TextView>(R.id.title)
    private val genre = itemView.findViewById<TextView>(R.id.genre)
    private val price = itemView.findViewById<TextView>(R.id.price)
    private val rating = itemView.findViewById<RatingBar>(R.id.rating)

    fun bind(gameData: GameData) {
        thumbnail.setImageResource(gameData.thumbnail)
        title.text = gameData.title
        genre.text = gameData.genre
        price.text = gameData.price
        rating.rating = gameData.rating
    }
}