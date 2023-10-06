package com.example.ishakachinavka.Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.ishakachinavka.Adapter.FavShayariAdapter
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Class.AppDatabase
import com.example.ishakachinavka.Model.Favshayari
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.FragmentFavshayariBinding
import com.example.ishakachinavka.databinding.FragmentHomeBinding

class FavshayariFragment : Fragment() {

    lateinit var binding: FragmentFavshayariBinding

     lateinit var favShayariShowAdapter: FavShayariAdapter
    lateinit var dp: AppDatabase
    var favShayriList= mutableListOf<Favshayari>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentFavshayariBinding.inflate(layoutInflater,container,false)

         dp = Room.databaseBuilder(requireContext() ,AppDatabase::class.java, "favoriteshayari").allowMainThreadQueries().build()
        getDataFavShayari()

        favShayariShowAdapter= FavShayariAdapter(requireContext(),favShayriList)
        binding.favshayariShowrecycleview.adapter=favShayariShowAdapter
        binding.favshayariShowrecycleview.layoutManager= LinearLayoutManager(requireContext())

        return binding.root
    }

    private fun getDataFavShayari()
    {

        favShayriList=dp.userDao().gelAllUsers()


    }


}