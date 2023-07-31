package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.IntroScreenItem
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityShowShayariBinding

class ShowShayariActivity : AppCompatActivity() {

    lateinit var binding: ActivityShowShayariBinding
    lateinit var shayariShowAdapter:ShayariDataShowAdpter
     var mlis= mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityShowShayariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mlis.add("Item 1")
        mlis.add("Item 2")
        mlis.add("Item 3")
        mlis.add("Item 4")
        mlis.add("Item 5")
        mlis.add("Item 6")
        mlis.add("Item 7")
        mlis.add("Item 8")

        shayariShowAdapter= ShayariDataShowAdpter(this,mlis)
        binding.shyariShowrecycleview.adapter=shayariShowAdapter
        binding.shyariShowrecycleview.layoutManager=LinearLayoutManager(this)

    }
}