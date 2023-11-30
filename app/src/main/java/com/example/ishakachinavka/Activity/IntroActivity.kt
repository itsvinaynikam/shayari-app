package com.example.ishakachinavka.Activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.example.ishakachinavka.Adapter.IntroViewPagerAdapter
import com.example.ishakachinavka.HomeAcivity
import com.example.ishakachinavka.Model.IntroScreenItem
import com.example.ishakachinavka.R
import com.example.ishakachinavka.SharedPreference.SharedPreferencee
import com.example.ishakachinavka.databinding.ActivityIntroBinding


class IntroActivity : AppCompatActivity() {

    lateinit var binding: ActivityIntroBinding
    var mList= mutableListOf<IntroScreenItem>()
    lateinit var introViewPagerAdapter: IntroViewPagerAdapter
    var currentIndex = 0
    lateinit var preferences: SharedPreferencee



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityIntroBinding.inflate(layoutInflater)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.root)
        preferences = SharedPreferencee(this)

        mList.add(IntroScreenItem("इश्काची नाैका...", "Wel Come To इश्काची नाैका  Shayari's wordl..💞",R.drawable.intro_image1))
        mList.add(IntroScreenItem("Best Quotes.. ", "You Will Find Your Favorite Shayari Here...💖", R.drawable.intro_image2))
        mList.add(IntroScreenItem("Shayari's wordl..", "It's Time To Get Lost In The World Of Shayari..😍",R.drawable.intro_image5))

        introViewPagerAdapter= IntroViewPagerAdapter(this,mList)
        binding.screenViewpager.adapter=introViewPagerAdapter
        updateIndicator(currentIndex)

        binding.screenViewpager.addOnPageChangeListener(object :OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }
            override fun onPageSelected(position: Int) {
                currentIndex=position

                if (currentIndex==introViewPagerAdapter.count-1)
                {
                    binding.btnStarNow.visibility=View.VISIBLE
                    val fadeIn: Animation = AlphaAnimation(0f, 1f)
                    fadeIn.duration = 1000

                    fadeIn.setAnimationListener(object : Animation.AnimationListener {
                        override fun onAnimationStart(animation: Animation) {
                        }

                        override fun onAnimationEnd(animation: Animation) {
                        }

                        override fun onAnimationRepeat(animation: Animation) {
                        }
                    })
                        binding.btnStarNow.startAnimation(fadeIn);
                    binding.btnStarNow.setOnClickListener {
                        preferences.setIntroStatus(true)
                        startActivity(Intent(this@IntroActivity,HomeAcivity::class.java))
                    }
                }

                if (currentIndex!=2)
                {
                     binding.btnStarNow.visibility=View.GONE

                }
                updateIndicator(currentIndex)
            }
            override fun onPageScrollStateChanged(state: Int) {
            }

        })

        binding.btnSkip.setOnClickListener {
            preferences.setIntroStatus(true)
            startActivity(Intent(this@IntroActivity,HomeAcivity::class.java))
        }
    }
    fun updateIndicator(index: Int) {
        binding.tabIndicator.removeAllViews()
        var indicators= arrayOfNulls<ImageView>(3)


        for (i in indicators.indices)
        {
            indicators[i]= ImageView(this@IntroActivity)
            if (i==index)
            { indicators[i]?.setImageDrawable(ContextCompat.getDrawable(this@IntroActivity,R.drawable.heart_activeindecator))
            }else
            { indicators[i]?.setImageDrawable(ContextCompat.getDrawable(this@IntroActivity,R.drawable.heartshape_inactiveindecator))
            }
            var params=LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)
            params.setMargins(20,0,0,0)
            binding.tabIndicator.addView(indicators[i],params)

        }
    }

}