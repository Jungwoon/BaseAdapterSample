package com.byjw.practice.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerViewAdapter<T, VDB : ViewDataBinding>(var items: List<T>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    @LayoutRes
    abstract fun getLayoutResId(): Int

    var binding: Any? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return BaseViewHolder(
            LayoutInflater.from(parent.context).inflate(
                getLayoutResId(),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = items.size

    inner class BaseViewHolder(view: View) : BindingViewHolder<VDB>(view)

}