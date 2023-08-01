package com.example.ishakachinavka.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.ishakachinavka.Activity.RomaticshayriActivity
import com.example.ishakachinavka.Activity.ShowShayariActivity
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(layoutInflater,container,false)

        binding.loveshayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),ShowShayariActivity::class.java))

        }

        binding.romaticshayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),RomaticshayriActivity::class.java))
        }

        binding.attitudeshayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),ShowShayariActivity::class.java))
        }

        binding.brokenshayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),ShowShayariActivity::class.java))

        }

        binding.sadshayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),ShowShayariActivity::class.java))

        }

        binding.befavashayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),ShowShayariActivity::class.java))
        }

        binding.funnyshayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),ShowShayariActivity::class.java))
        }

        binding.inspiralshayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),ShowShayariActivity::class.java))

        }

        binding.maashayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),ShowShayariActivity::class.java))
        }

        binding.birthshariButton.setOnClickListener {
            startActivity(Intent(requireContext(),ShowShayariActivity::class.java))

        }

        binding.soryyshayriButton.setOnClickListener{
            startActivity(Intent(requireContext(),ShowShayariActivity::class.java))

        }

        return binding.root
    }


}