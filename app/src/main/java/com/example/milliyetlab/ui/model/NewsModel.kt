package com.example.milliyetlab.ui.model

data class NewsModel(
    val newsImageUrl: String,
    val newsTitle: String,
    override val itemViewType: Int
) : BaseNewsModel()