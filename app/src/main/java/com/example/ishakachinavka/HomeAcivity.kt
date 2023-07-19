package com.example.ishakachinavka

import android.os.Bundle
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

        //binding.mainTitletext.setText("Ishakachi Navka")

        initt()



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