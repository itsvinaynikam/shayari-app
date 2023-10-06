package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityIshakachiNaukaBinding

class IshakachiNaukaActivity : AppCompatActivity() {


    lateinit var binding:ActivityIshakachiNaukaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityIshakachiNaukaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}