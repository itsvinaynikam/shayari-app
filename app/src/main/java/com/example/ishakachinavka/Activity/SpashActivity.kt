package com.example.ishakachinavka.Activity

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.ishakachinavka.HomeAcivity
import com.example.ishakachinavka.R
import com.example.ishakachinavka.SharedPreference.SharedPreferencee
import com.example.ishakachinavka.databinding.ActivitySpashBinding

class SpashActivity : AppCompatActivity() {


lateinit var binding: ActivitySpashBinding
lateinit var preferences:SharedPreferencee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySpashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        preferences = SharedPreferencee(this)

        Handler().postDelayed({

            var introStatus= preferences.getIntroStatus(false)
            if (introStatus)
            {
                val mIntent = Intent(this@SpashActivity, HomeAcivity::class.java)
                startActivity(mIntent)

            }else{
                val mIntent = Intent(this@SpashActivity, IntroActivity::class.java)
                startActivity(mIntent)
            }


            finish()
        }, 3000)

        //goToMain()
    }

   /* private fun goToMain() {
        Thread.sleep(2000)
        val i = Intent(this, HomeAcivity::class.java)
        finish()
        startActivity(i)
    }*/
}