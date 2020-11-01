package com.byjw.practice

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("setThumbnail")
fun ImageView.setThumbnail(thumbnail: Int) {
    this.setImageResource(thumbnail)
}