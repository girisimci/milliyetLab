package com.example.milliyetlab.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.milliyetlab.R
import com.example.milliyetlab.ui.adapter.NewsListAdapter
import com.example.milliyetlab.ui.mock.mockData
import kotlinx.android.synthetic.main.fragment_news.*

class NewsFragment : Fragment(R.layout.fragment_news) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycNewsList.adapter = NewsListAdapter(mockData.getNewsList(10)) { baseNewsModel ->

        }
    }
}
