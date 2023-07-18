package com.example.ishakachinavka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.ishakachinavka.Fragment.FavshayariFragment
import com.example.ishakachinavka.Fragment.HomeFragment
import com.example.ishakachinavka.Fragment.MyshayriFragment
import com.example.ishakachinavka.Fragment.ProfileFragment
import com.example.ishakachinavka.databinding.ActivityMainBinding

class HomeAcivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container,HomeFragment())
        transaction.commit()
        binding.mainTitletext.setText("Ishakachi Navka")


        binding.bottmNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.btn_home -> {
                    loadFragment(HomeFragment())
                    binding.mainTitletext.setText("Ishakachi Navka")

                    return@setOnItemSelectedListener true
                }
                R.id.btn_myshayari -> {
                    loadFragment(MyshayriFragment())
                    binding.mainTitletext.setText("Speical Shayari")

                    return@setOnItemSelectedListener true
                }
                R.id.btn_fav -> {
                    loadFragment(FavshayariFragment())
                    binding.mainTitletext.setText("Favorite")

                    return@setOnItemSelectedListener  true
                }
                R.id.btn_profile -> {
                    loadFragment(ProfileFragment())
                    binding.mainTitletext.setText("Profile")

                    return@setOnItemSelectedListener true
                }
                else -> {return@setOnItemSelectedListener false}
            }
        }
    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }


}