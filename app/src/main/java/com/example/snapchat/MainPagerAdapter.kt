package com.example.snapchat

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.snapchat.views.camera.CameraFragment
import com.example.snapchat.views.message.MessageFragment
import com.example.snapchat.views.story.StoryFragment

class MainPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> MessageFragment()
            1 -> CameraFragment()
            else -> StoryFragment()
        }
    }

    override fun getCount() = 3
}