package com.example.ishakachinavka.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.ishakachinavka.Activity.AttitudeShayriActivity
import com.example.ishakachinavka.Activity.BewafashayariActivity
import com.example.ishakachinavka.Activity.BirthdayShayariActivity
import com.example.ishakachinavka.Activity.BrokenShayariActivity
import com.example.ishakachinavka.Activity.FunnyShayariActivity
import com.example.ishakachinavka.Activity.GoodMoringActivity
import com.example.ishakachinavka.Activity.MomActivity
import com.example.ishakachinavka.Activity.MotivitionActivity
import com.example.ishakachinavka.Activity.RomaticshayriActivity
import com.example.ishakachinavka.Activity.SadShayariActivity
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
            startActivity(Intent(requireContext(),AttitudeShayriActivity::class.java))
        }

        binding.brokenshayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),BrokenShayariActivity::class.java))

        }

        binding.sadshayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),SadShayariActivity::class.java))

        }

        binding.bewafavashayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),BewafashayariActivity::class.java))
        }

        binding.funnyshayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),FunnyShayariActivity::class.java))
        }

        binding.motivationalButton.setOnClickListener {
            startActivity(Intent(requireContext(),MotivitionActivity::class.java))

        }

        binding.maashayariButton.setOnClickListener {
            startActivity(Intent(requireContext(),MomActivity::class.java))
        }

        binding.birthshariButton.setOnClickListener {
            startActivity(Intent(requireContext(),BirthdayShayariActivity::class.java))

        }

        binding.goodmorningButton.setOnClickListener{
            startActivity(Intent(requireContext(),GoodMoringActivity::class.java))
        }

        return binding.root
    }


}