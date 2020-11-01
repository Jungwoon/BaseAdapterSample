package com.byjw.practice

import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.byjw.practice.base.BaseRecyclerViewAdapter
import com.byjw.practice.databinding.ItemGameBinding

class GameAdapter(items: List<GameData>) : BaseRecyclerViewAdapter<GameData, ItemGameBinding>(items) {

    @LayoutRes
    override fun getLayoutResId() = R.layout.item_game

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        this.BaseViewHolder(holder.itemView).apply {
            this.binding?.item = items[position]
        }
    }

}