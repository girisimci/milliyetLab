package com.example.milliyetlab.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.milliyetlab.R
import com.example.milliyetlab.ui.model.BaseNewsModel
import com.example.milliyetlab.ui.model.NewsModel
import kotlinx.android.synthetic.main.adapter_item_big_news.view.*

class SmallNewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_small_news,
        parent,
        false
    )
) {
    fun bind(
        newsModel: BaseNewsModel,
        onItemClickListener: (BaseNewsModel) -> Unit
    ) {

        Glide.with(itemView.context)
            .load((newsModel as NewsModel).newsImageUrl)
            .centerCrop()
            .into(itemView.imgNews)
        itemView.txtNewsTitle.text = newsModel.newsTitle


        itemView.setOnClickListener {
            onItemClickListener(newsModel)
        }
    }
}