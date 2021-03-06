package com.example.milliyetlab.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.milliyetlab.R
import com.example.milliyetlab.ui.adapter.CategoryNewsAdapter
import com.example.milliyetlab.ui.mock.mockData
import com.example.milliyetlab.ui.util.extGetDrawable
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        init()
    }

    private fun init() {
        vpNewsCategory.adapter =
            CategoryNewsAdapter(
                supportFragmentManager,
                mockData.getNewsCategoryFragment()
            )
        tabLayNewsCategory.setupWithViewPager(vpNewsCategory)//tablayouta viewpager eklemek icin setup kısmını kullanıyoruz

        toolbar.logo = extGetDrawable(R.drawable.milliyet_logo_white)

    }
}
