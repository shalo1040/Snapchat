package com.example.snapchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //MainPagerAdapter로 뷰페이저를 Fragment와 연결
        viewPager.adapter = MainPagerAdapter(supportFragmentManager)
        //현재 페이지에서 좌우로 1페이지씩 저장
        viewPager.offscreenPageLimit = 1
        //0,1,2 페이지 중 1인 카메라뷰가 제일 먼저 보여져야함
        viewPager.currentItem = 1
    }
}
