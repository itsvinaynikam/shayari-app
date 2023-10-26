package com.example.ishakachinavka

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.preference.PreferenceManager
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.ishakachinavka.Fragment.FavshayariFragment
import com.example.ishakachinavka.Fragment.HomeFragment
import com.example.ishakachinavka.Fragment.MyshayriFragment
import com.example.ishakachinavka.Fragment.ProfileFragment
import com.example.ishakachinavka.databinding.ActivityMainBinding
import nl.psdcompany.duonavigationdrawer.views.DuoMenuView
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle
import java.lang.String
import kotlin.Int
import kotlin.arrayOf


class HomeAcivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    private val GALLERY = 1
    private val CAMERA = 2
   // lateinit var imageView: ImageView
    lateinit var tvHeaderName:TextView


    private val duoMenuView: DuoMenuView? = null



    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?)
    { super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container,HomeFragment())
        transaction.commit()

        setToolbar()

        binding.handlerScreen.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.duo_btn_home -> {
                    loadFragment(HomeFragment())
                    return@setNavigationItemSelectedListener true
                }
                R.id.btn_heart -> {
                    showPictureDialog()
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
        binding.bottmNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.btn_home -> {
                    binding.toolbar.visibility=View.VISIBLE
                    loadFragment(HomeFragment())

                    return@setOnItemSelectedListener true
                }
                R.id.btn_myshayari -> {
                    binding.toolbar.visibility=View.VISIBLE
                    loadFragment(MyshayriFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.btn_fav -> {

                    binding.toolbar.visibility=View.GONE
                    loadFragment(FavshayariFragment())
                    //  startActivity(Intent(this, FavoriteShayariActivity::class.java))
                    return@setOnItemSelectedListener  true
                }

                else -> {return@setOnItemSelectedListener false}
            }
        }















/*
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_CALENDAR)
            != PackageManager.PERMISSION_GRANTED)
        {
            // Permission is not granted
        }*/

      /*    imageView=findViewById<ImageView>(R.id.displayimage)
        val preferences = PreferenceManager.getDefaultSharedPreferences(this)
        val mImageUri = preferences.getString("image", null)
        if (mImageUri != null) {
            imageView.setImageURI(Uri.parse(mImageUri));
        } else {
            imageView.setImageResource(R.drawable.intro_image6);
        }*/





    }

    private fun showPictureDialog() {
        val pictureDialog = AlertDialog.Builder(this)
        pictureDialog.setTitle("Add Photo ")
        val pictureDialogItems = arrayOf("Select photo from gallery", " Select photo from camera")
        pictureDialog.setItems(pictureDialogItems
        ) { dialog, which ->
            when (which) {
                0 -> choosePhotoFromGallary()

                1 -> takePhotoFromCamera()
            }
        }
        pictureDialog.show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode === RESULT_OK) {
            if (requestCode == GALLERY) {
                if (data != null)
                {
                    val contentURI = data!!.data

                    var displayImage=findViewById<ImageView>(R.id.displayimage)

                    val preferences = PreferenceManager.getDefaultSharedPreferences(this)
                    val editor = preferences.edit()
                    editor.putString("image", String.valueOf(contentURI))
                    editor.commit()


                    displayImage.setImageURI(contentURI)
                    Log.e("displayImage", "displayImage:  2 "+displayImage )

                    displayImage.invalidate()


                }

            } else if (requestCode == CAMERA)
            {
                val thumbnail = data!!.extras!!.get("data") as Bitmap
                var displayImage=findViewById<ImageView>(R.id.displayimage)
                displayImage!!.setImageBitmap(thumbnail)
            }


        }



    }
    private fun setToolbar() {
        setSupportActionBar(binding.toolbar)
        val drawerToggle = DuoDrawerToggle(this, binding.drawer, binding.toolbar,
            R.string.open_nav,
            R.string.close_nav)
        binding.drawer.setDrawerListener(drawerToggle)
        drawerToggle.syncState()


        var subtitle=findViewById<TextView>(R.id.duoMenuView_)











































    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }


    private fun takePhotoFromCamera() {

        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent, CAMERA)
    }

    private fun choosePhotoFromGallary() {
        val galleryIntent = Intent(Intent.ACTION_PICK,
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(galleryIntent, GALLERY)
    }


}