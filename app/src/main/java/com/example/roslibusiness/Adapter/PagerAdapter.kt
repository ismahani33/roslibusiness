@file:Suppress("DEPRECATION")

package com.example.roslibusiness.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.roslibusiness.Fragments.*

internal class PagerViewAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                All_ItemFragment()
            }
            1 -> {
                DagingFragment()
            }
            2 -> {
                SayuranFragment()
            }
            3 -> {
               RempahFragment()
            }
            4 -> {
                PerkakasFragment()
            }
            5 -> {
                Lain_lainFragment()
            }
            else -> All_ItemFragment()
        }
    }

    override fun getCount(): Int {

        return 6
    }
}