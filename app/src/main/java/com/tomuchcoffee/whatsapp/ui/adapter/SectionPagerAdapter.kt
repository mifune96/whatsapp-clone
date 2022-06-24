package com.tomuchcoffee.whatsapp.ui.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tomuchcoffee.whatsapp.ui.fragment.CallsFragment
import com.tomuchcoffee.whatsapp.ui.fragment.ChatFragment
import com.tomuchcoffee.whatsapp.ui.fragment.StatusFragment

class SectionPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity){
    override fun createFragment(position: Int): Fragment {
        when(position){
            0 ->return ChatFragment()
            1 ->return StatusFragment()
            2 ->return CallsFragment()
            else -> return ChatFragment()
        }

    }

    override fun getItemCount(): Int {
        return 3
    }
}