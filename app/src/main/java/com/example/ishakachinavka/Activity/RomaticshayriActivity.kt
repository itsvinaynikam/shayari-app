package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityRomaticshayriBinding

class RomaticshayriActivity : AppCompatActivity() {

    lateinit var binding: ActivityRomaticshayriBinding
    lateinit var romaticShayariShowAdapter: ShayariDataShowAdpter
    var romticShayriList= mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRomaticshayriBinding.inflate(layoutInflater)
        setContentView(binding.root)




        romaticShayariShowAdapter= ShayariDataShowAdpter(this,romticShayriList)
        binding.romaticshyariShowrecycleview.adapter=romaticShayariShowAdapter
        binding.romaticshyariShowrecycleview.layoutManager= LinearLayoutManager(this)
        binding.backBtn.setOnClickListener {
            onBackPressed()
        }

    }
}