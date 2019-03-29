package com.jwo.viewpager2bug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pager.orientation = ViewPager2.ORIENTATION_VERTICAL
        pager.adapter = FeedAdapter(supportFragmentManager)
    }

}
