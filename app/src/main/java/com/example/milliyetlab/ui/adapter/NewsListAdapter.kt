package com.example.milliyetlab.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.milliyetlab.ui.model.BigNewsModel

class NewsListAdapter(
    private val newsList: List<BigNewsModel>,
    private val onItemClickListener: (BigNewsModel) -> Unit
) : RecyclerView.Adapter<BigNewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BigNewsViewHolder =
        BigNewsViewHolder(parent)

    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: BigNewsViewHolder, position: Int) {

        holder.bind(newsList[position], onItemClickListener)

    }

}