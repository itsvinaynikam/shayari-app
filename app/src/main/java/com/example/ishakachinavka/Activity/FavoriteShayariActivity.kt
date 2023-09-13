package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.FragmentFavshayariBinding

class FavoriteShayariActivity : AppCompatActivity() {

    lateinit var binding: FragmentFavshayariBinding

    lateinit var favShayariShowAdapter: ShayariDataShowAdpter
    var favShayriList= mutableListOf<Shayari>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= FragmentFavshayariBinding.inflate(layoutInflater)
        setContentView(binding.root)





        favShayariShowAdapter= ShayariDataShowAdpter(this,favShayriList)
        binding.favshayariShowrecycleview.adapter=favShayariShowAdapter
        binding.favshayariShowrecycleview.layoutManager= LinearLayoutManager(this)



    }
}