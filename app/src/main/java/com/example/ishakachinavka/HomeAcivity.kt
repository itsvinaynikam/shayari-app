package com.example.ishakachinavka

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.example.ishakachinavka.Fragment.FavshayariFragment
import com.example.ishakachinavka.Fragment.HomeFragment
import com.example.ishakachinavka.Fragment.MyshayriFragment
import com.example.ishakachinavka.Fragment.ProfileFragment
import com.example.ishakachinavka.databinding.ActivityMainBinding
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle
import com.example.ishakachinavka.R
import com.google.android.material.navigation.NavigationView


class HomeAcivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?)
    { super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val transaction = supportFragmentManager.beginTransaction()
                 transaction.add(R.id.container,HomeFragment())
                 transaction.commit()

        //binding.mainTitletext.setText("Ishakachi Navka")

        initt()



/*
       binding.drawnavigationMenu.setNavigationItemSelectedListener {
           when (it.itemId) {
               R.id.duo_btn_home -> {
                   loadFragment(HomeFragment())

                   return@setNavigationItemSelectedListener true
               }
               R.id.btn_heart -> {
                   loadFragment(MyshayriFragment())

                   return@setNavigationItemSelectedListener true
               }
               R.id.btn_share -> {
                   loadFragment(FavshayariFragment())

                   return@setNavigationItemSelectedListener true
               }
               R.id.rate_us -> {
                   loadFragment(ProfileFragment())

                   return@setNavigationItemSelectedListener true
               }
               else -> {  return@setNavigationItemSelectedListener true}
           }

       }
*/

        binding.bottmNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.btn_home -> {
                    loadFragment(HomeFragment())

                    return@setOnItemSelectedListener true
                }
                R.id.btn_myshayari -> {
                    loadFragment(MyshayriFragment())

                    return@setOnItemSelectedListener true
                }
                R.id.btn_fav -> {
                    loadFragment(FavshayariFragment())

                    return@setOnItemSelectedListener  true
                }
                R.id.btn_profile -> {
                    loadFragment(ProfileFragment())

                    return@setOnItemSelectedListener true
                }
                else -> {return@setOnItemSelectedListener false}
            }
        }





    }

    private fun initt() {
        setSupportActionBar(binding.toolbar)
        val drawerToggle = DuoDrawerToggle(this, binding.drawer, binding.toolbar,com.example.ishakachinavka.R.string.open_nav,com.example.ishakachinavka.R.string.close_nav)
        binding.drawer.setDrawerListener(drawerToggle)
        drawerToggle.syncState()
    }



   private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }



}