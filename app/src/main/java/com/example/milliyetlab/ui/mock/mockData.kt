package com.example.milliyetlab.ui.mock

import com.example.milliyetlab.ui.NewsFragment
import com.example.milliyetlab.ui.enums.NewsType
import com.example.milliyetlab.ui.model.AdsModel
import com.example.milliyetlab.ui.model.BaseNewsModel
import com.example.milliyetlab.ui.model.FragmentModel
import com.example.milliyetlab.ui.model.NewsModel
import com.google.android.gms.ads.AdSize

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

    fun getNewsList(newsListSize: Int): List<BaseNewsModel> {
        val newsList = ArrayList<BaseNewsModel>()
        repeat(newsListSize) {

            val adsModel = AdsModel(
                AdSize.BANNER,
                "ca-app-pub-3940256099942544/6300978111",
                NewsType.ADS_BANNER.id
            )

            val bigNewsModel = NewsModel(
                "https://cdn.pixabay.com/photo/2015/04/22/19/35/photographing-children-735226_960_720.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                NewsType.BIG_NEWS.id
            )
            val smallNewsModel1 = NewsModel(
                "https://cdn.pixabay.com/photo/2015/04/22/19/35/photographing-children-735226_960_720.jpg",
                "ve miray dener açıkladı!!!!!!ve miray dener açıkladı!!!!!!ve miray dener açıkladı!!!!!!ve miray dener açıkladı!!!!!!\" ",
                NewsType.SMALL_NEWS.id

            )
            val smallNewsModel2 = NewsModel(
                "https://cdn.pixabay.com/photo/2015/04/22/19/35/photographing-children-735226_960_720.jpg",
                "ve miray dener açıkladı!!!!!!ve miray dener açıkladı!!!!!!ve miray dener açıkladı!!!!!!ve miray dener açıkladı!!!!!!\" ",
                NewsType.SMALL_NEWS.id

            )
            val smallNewsModel3 = NewsModel(
                "https://cdn.pixabay.com/photo/2015/04/22/19/35/photographing-children-735226_960_720.jpg",
                "ve miray dener açıkladı!!!!!!ve miray dener açıkladı!!!!!!ve miray dener açıkladı!!!!!!ve miray dener açıkladı!!!!!!\" ",
                NewsType.SMALL_NEWS.id

            )
            val smallNewsModel4 = NewsModel(
                "https://cdn.pixabay.com/photo/2015/04/22/19/35/photographing-children-735226_960_720.jpg",
                "ve miray dener açıkladı!!!!!!ve miray dener açıkladı!!!!!!ve miray dener açıkladı!!!!!!ve miray dener açıkladı!!!!!!\" ",
                NewsType.SMALL_NEWS.id

            )
            newsList.add(adsModel)
            newsList.add(smallNewsModel1)
            newsList.add(smallNewsModel2)
            newsList.add(smallNewsModel3)
            newsList.add(smallNewsModel4)
            newsList.add(bigNewsModel)

        }
        return newsList
    }
}