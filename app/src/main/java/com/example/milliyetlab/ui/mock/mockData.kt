package com.example.milliyetlab.ui.mock

import com.example.milliyetlab.ui.NewsFragment
import com.example.milliyetlab.ui.model.FragmentModel

object mockData {
    private const val newsCategorySize = 7
    fun getNewsCategoryFragment(): List<FragmentModel> {

        val fragmentList = ArrayList<FragmentModel>()

        repeat(newsCategorySize) { position ->
            val newsFragment = NewsFragment()

            val fragmentModel = FragmentModel(
                position,
                getFragmentTitle(position),
                newsFragment
            )

            fragmentList.add(fragmentModel)

        }

        return fragmentList
    }

    private fun getFragmentTitle(position: Int): String {
        return when (position) {

            0 -> "AnaSayfa"
            1 -> "Yaxarlar"
            2 -> "Gündem"
            3 -> "Siyaset"
            4 -> "Ekonomi"
            5 -> "Spor"
            6 -> "Eğitim"

            else -> ""

        }
    }
}