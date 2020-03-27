package com.example.milliyetlab.ui.mock

import com.example.milliyetlab.ui.NewsFragment
import com.example.milliyetlab.ui.model.BigNewsModel
import com.example.milliyetlab.ui.model.FragmentModel

object mockData {
    private const val newsCategorySize = 7
    fun getNewsCategoryFragment(): List<FragmentModel> {

        val fragmentList = ArrayList<FragmentModel>()

        repeat(newsCategorySize) { position ->
            val newsFragment = NewsFragment()

            val fragmentModel = FragmentModel(
                position,
                getTitleList()[position],
                newsFragment
            )

            fragmentList.add(fragmentModel)

        }

        return fragmentList
    }

    private fun getTitleList(): List<String> {
        val titleList = ArrayList<String>()
        titleList.add("ANASAYFA")
        titleList.add("YAZARLAR")
        titleList.add("GÜNDEM")
        titleList.add("EKONOMİ")
        titleList.add("SPOR")
        titleList.add("CADDE")
        titleList.add("EĞİTİM")
        titleList.add("TEKNOLOJİ")
        return titleList
    }

    fun getNewsList(newsListSize: Int): List<BigNewsModel> {
        val bigNewsList = ArrayList<BigNewsModel>()
        repeat(newsListSize) {
            val bigNewsModel = BigNewsModel(
                "https://miro.medium.com/max/800/1*99YiKjwB2TliKVA-yGogNQ.png",
                "Ertelendi! Kolay alınmış bir karar değil"
            )
            bigNewsList.add(bigNewsModel)
        }
        return bigNewsList
    }
}