package com.example.milliyetlab.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.milliyetlab.ui.enums.NewsType
import com.example.milliyetlab.ui.model.NewsModel

class NewsListAdapter(
    private val newsList: List<NewsModel>,
    private val onItemClickListener: (NewsModel) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            NewsType.SMALL_NEWS.id -> {
                SmallNewsViewHolder(parent)
            }
            NewsType.BIG_NEWS.id -> {
                BigNewsViewHolder(parent)
            }

            else -> {
                BigNewsViewHolder(parent)
            }
        }


    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val newsModel = newsList[position]
        when (newsModel.itemViewType) {
            NewsType.SMALL_NEWS.id -> {
                (holder as SmallNewsViewHolder).bind(newsModel, onItemClickListener)

            }
            NewsType.BIG_NEWS.id -> {
                (holder as BigNewsViewHolder).bind(newsModel, onItemClickListener)

            }

            else -> {
                (holder as BigNewsViewHolder).bind(newsModel, onItemClickListener)

            }
        }

    }

    override fun getItemViewType(position: Int): Int = newsList[position].itemViewType
}