package com.byjw.practice.first

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.byjw.practice.GameData
import com.byjw.practice.R

class GameAdapter(private val items: List<GameData>) : RecyclerView.Adapter<GameAdapter.GameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        return GameViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_game,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

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

}