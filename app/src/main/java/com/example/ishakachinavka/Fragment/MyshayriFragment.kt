package com.example.ishakachinavka.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ishakachinavka.Activity.IshakachiNaukaActivity
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.FragmentFavshayariBinding
import com.example.ishakachinavka.databinding.FragmentMyshayriBinding

class MyshayriFragment : Fragment() {


lateinit var binding: FragmentMyshayriBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentMyshayriBinding.inflate(layoutInflater,container,false)


        binding.btnIshakachinauka.setOnClickListener {
          startActivity(Intent(requireContext(),IshakachiNaukaActivity::class.java))

        }


        return binding.root
    }


}