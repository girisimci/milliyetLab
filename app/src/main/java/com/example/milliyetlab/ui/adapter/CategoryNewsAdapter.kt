package com.example.milliyetlab.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.milliyetlab.ui.model.FragmentModel

class CategoryNewsAdapter(
    fragmentManager: FragmentManager,
    private val newsFragmentList: List<FragmentModel>
) : FragmentStatePagerAdapter(
    fragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getItem(position: Int): Fragment = newsFragmentList[position].fragment

    override fun getCount(): Int = newsFragmentList.size

    override fun getPageTitle(position: Int): CharSequence? =
        newsFragmentList[position].fragmentTitle


}