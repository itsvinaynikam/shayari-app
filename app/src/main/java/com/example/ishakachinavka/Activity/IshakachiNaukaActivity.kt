package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityIshakachiNaukaBinding

class IshakachiNaukaActivity : AppCompatActivity() {


    lateinit var binding:ActivityIshakachiNaukaBinding

    lateinit var ishakachiNaukaShayariShowAdapter: ShayariDataShowAdpter
    var ishakachiNaukaShayriList= mutableListOf<Shayari>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityIshakachiNaukaBinding.inflate(layoutInflater)
        setContentView(binding.root)

       /* ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())

        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())

        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())

*/

        ishakachiNaukaShayariShowAdapter= ShayariDataShowAdpter(this,ishakachiNaukaShayriList)
        binding.ishakchinaukashayariShowrecycleview.adapter=ishakachiNaukaShayariShowAdapter
        binding.ishakchinaukashayariShowrecycleview.layoutManager= LinearLayoutManager(this)


        binding.backBtn.setOnClickListener {
            onBackPressed()
        }
    }
}