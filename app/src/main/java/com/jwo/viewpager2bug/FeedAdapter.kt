package com.jwo.viewpager2bug

import android.graphics.Color
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class FeedAdapter(fm: FragmentManager) : FragmentStateAdapter(fm) {
    val colors = listOf(
        Color.RED,
        Color.GREEN,
        Color.WHITE,
        Color.BLACK,
        Color.YELLOW
    )

    override fun getItem(position: Int): Fragment {
        return ItemFragment.newInstance(colors[position % colors.size])
    }

    override fun getItemCount(): Int = 100
}