package com.example.ishakachinavka

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.ishakachinavka.Fragment.FavshayariFragment
import com.example.ishakachinavka.Fragment.HomeFragment
import com.example.ishakachinavka.Fragment.MyshayriFragment
import com.example.ishakachinavka.Fragment.ProfileFragment
import com.example.ishakachinavka.SharedPreference.SharedPreferencee
import com.example.ishakachinavka.databinding.ActivityMainBinding
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle


class HomeAcivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    private val GALLERY = 1
    private val CAMERA = 2
    lateinit var preferencess: SharedPreferencee

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?)
    { super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        preferencess = SharedPreferencee(this)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container,HomeFragment())
        transaction.commit()
        setToolbar()
        setProfileImage()


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
        binding.bottmNavigation.setOnItemSelectedListener { when (it.itemId) {
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
            } }
    }

    private fun askPermission() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissionss();
        } else {

        }
    }

    private fun requestPermissionss() {
        if (ContextCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED)
            {

                Toast.makeText(this, "permition olready granted", Toast.LENGTH_SHORT).show()

            }else
            {
                requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), GALLERY)

            }

    }

    private fun setProfileImage() {

        val imagePath: String? = preferencess.getImagePath(this)

        Log.e("imagePath", "setProfileImage: "+imagePath )

        if (imagePath != null) {
            val bitmap = BitmapFactory.decodeFile(imagePath)
            binding.displayimage.setImageBitmap(bitmap)
        }






    }

    private fun showPictureDialog() {
        val pictureDialog = AlertDialog.Builder(this)
        pictureDialog.setTitle("Add Photo ")
        val pictureDialogItems = arrayOf("Select photo from gallery", " Select photo from camera")
        pictureDialog.setItems(pictureDialogItems
        ) { dialog, which ->
            when (which) {
                0 -> askPermission()
                    //choosePhotoFromGallary()

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
                    displayImage.setImageURI(contentURI)

                    //val bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, imageUri)


                    var imagePath=preferencess.saveImagePath(this,contentURI)



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

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
if (requestCode==GALLERY)
{
    if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED))
    {

        Toast.makeText(this, "user allowed permission", Toast.LENGTH_SHORT).show()

    }
    else {
        Toast.makeText(this, "user denine permission", Toast.LENGTH_SHORT).show()


    }

}else{

}

    }
    private fun setToolbar() {
        setSupportActionBar(binding.toolbar)
        val drawerToggle = DuoDrawerToggle(this, binding.drawer, binding.toolbar,
            R.string.open_nav,
            R.string.close_nav)
        binding.drawer.setDrawerListener(drawerToggle)
        drawerToggle.syncState()

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