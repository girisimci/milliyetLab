package com.example.milliyetlab.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.milliyetlab.R
import com.example.milliyetlab.ui.adapter.CategoryNewsAdapter
import com.example.milliyetlab.ui.mock.mockData
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


    }

    private fun init() {
        vpNewsCategory.adapter =
            CategoryNewsAdapter(
                supportFragmentManager,
                mockData.getNewsCategoryFragment(6)
            )
        tabLayNewsCategory.setupWithViewPager(vpNewsCategory)
    }
}
