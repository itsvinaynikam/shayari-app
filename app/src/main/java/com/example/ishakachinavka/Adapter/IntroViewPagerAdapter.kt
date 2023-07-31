package com.example.ishakachinavka.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.ishakachinavka.InterFace.HomefragmetButtonclikelisner
import com.example.ishakachinavka.Model.IntroScreenItem
import com.example.ishakachinavka.databinding.IntroLayoutscreenBinding


class IntroViewPagerAdapter(var mContext: Context, var mListScreen: List<IntroScreenItem>) : PagerAdapter() {


    lateinit var binding: IntroLayoutscreenBinding

    //lateinit var lisner:HomefragmetButtonclikelisner

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        binding= IntroLayoutscreenBinding.inflate(LayoutInflater.from(mContext),container,false)
        binding.introTitle.setText(mListScreen[position].title)
        binding.introDescription.setText(mListScreen[position].description)
        binding.introImg.setImageResource(mListScreen[position].screenImg)
        container.addView(binding.root)
     //   lisner.cateGoryButtonClick(position)
        return binding.root
    }

    override fun getCount(): Int {
        return mListScreen.size
    }

    override fun isViewFromObject(view: View, o: Any): Boolean {
        return view === o
        //return view ==object
    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}