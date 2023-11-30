package com.example.ishakachinavka

import android.Manifest
import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.Base64
import android.util.Log
import android.view.View
import android.widget.EditText
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
import com.github.dhaval2404.imagepicker.ImagePicker
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle
import java.io.ByteArrayOutputStream





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
                R.id.btn_edite -> {
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

    private fun askGallaryPermission() {

        Log.e("askGallaryPermission", "askGallaryPermission:     1" )

      /*  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestGallaryPermissionss();

        } else if (shouldShowRequestPermissionRationale(Manifest.permission.READ_EXTERNAL_STORAGE))
        { Toast.makeText(this, "permission alert", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, "permition olready granted", Toast.LENGTH_SHORT).show()
            Log.e("askGallaryPermission", "askGallaryPermission:     3" )

        }*/

        ImagePicker.with(this)
            .galleryOnly()
            .crop()	    			//Crop image(Optional), Check Customization for more option
            .compress(1024)			//Final image size will be less than 1 MB(Optional)
            .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
            .start(GALLERY)


    }

    private fun requestCameraPermissionss()
    {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
            == PackageManager.PERMISSION_GRANTED) {
            Log.e("askCameraPermission", "askCameraPermission:      4", )
            takePhotoFromCamera()


            Toast.makeText(this, "permition olready granted", Toast.LENGTH_SHORT).show()
        }else
        {
            Log.e("askCameraPermission", "askCameraPermission:      5", )

            requestPermissions(arrayOf(Manifest.permission.CAMERA), CAMERA)
        }

    }
    private fun requestGallaryPermissionss() {
        if (ContextCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED)
            { Toast.makeText(this, "permition olready granted", Toast.LENGTH_SHORT).show()
                Log.e("askGallaryPermission", "askGallaryPermission:     4" )

            }else {
            Log.e("askGallaryPermission", "askGallaryPermission:     5" )

            requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), GALLERY)
        }

    }
    private fun setProfileImage() {
        val imagePath: String? = preferencess.getImagePath(this)
        var   subTitle: String? = preferencess.getSubtitle("princess")
        binding.subtitile.setText(subTitle)

        if (imagePath != null) {
            val b: ByteArray = Base64.decode(imagePath, Base64.DEFAULT)
            val bitmap = BitmapFactory.decodeByteArray(b, 0, b.size)
            binding.displayimage.setImageBitmap(bitmap)

        }
    }

    private fun showPictureDialog() {
        val pictureDialog = AlertDialog.Builder(this)
        pictureDialog.setTitle("Add Photo ")
        val pictureDialogItems = arrayOf("Select photo from gallery", " Select photo from camera","Edite Subtitle")
        pictureDialog.setItems(pictureDialogItems
        ) { dialog, which ->
            when (which) {
                0 -> askGallaryPermission()
                1 -> askCameraPermission()
                2->showEditeSubtitleDailog()
            }
        }
        pictureDialog.show()
    }

    private fun showEditeSubtitleDailog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Name")

        val customLayout: View = layoutInflater.inflate(R.layout.custom_layout_subtitle, null)
        val editText = customLayout.findViewById<EditText>(R.id.editText)
        //if (subTitle!=null){

            var subtitle=preferencess.getSubtitle("princess")
            editText.setText(subtitle)
       // }



        Log.e("editText", "showEditeSubtitleDailog: "+editText )

        builder.setView(customLayout)

        builder.setPositiveButton("OK") { dialog: DialogInterface?, which: Int ->
            sendDialogDataToActivity(editText.text.toString())
        }
        val dialog = builder.create()
        dialog.show()

    }

    private fun sendDialogDataToActivity(subtitle: String){
        preferencess.setSubTitle(subtitle)
        binding.subtitile.setText(subtitle)
    }

    private fun askCameraPermission() {

        Log.e("askCameraPermission", "askCameraPermission:      1", )

        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestCameraPermissionss();
        } else if (shouldShowRequestPermissionRationale(Manifest.permission.CAMERA))
        { Toast.makeText(this, "permission alert", Toast.LENGTH_SHORT).show()
        }

        else{
            Toast.makeText(this, "permition olready granted", Toast.LENGTH_SHORT).show()
            Log.e("askCameraPermission", "askCameraPermission:      3", )

        }*/
        ImagePicker.with(this)
            .cameraOnly()
            .crop()	    			//Crop image(Optional), Check Customization for more option
            .compress(1024)			//Final image size will be less than 1 MB(Optional)
            .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
            .start(CAMERA)




    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode === RESULT_OK) {
            if (requestCode == GALLERY) {
                if (data != null)
                {
                    Log.e("askGallaryPermission", "askGallaryPermission:     8" )

                    val contentURI = data!!.data
                    var displayImage=findViewById<ImageView>(R.id.displayimage)
                    displayImage.setImageURI(contentURI)
                    val bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, contentURI)

                    val baos = ByteArrayOutputStream()
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos)
                    val b = baos.toByteArray()
                    val encodedImage: String = Base64.encodeToString(b, Base64.DEFAULT)

                    preferencess.saveImagePath(this,encodedImage)
                    displayImage.invalidate()

                }

            }
            else if (requestCode == CAMERA)
            {
                Log.e("askCameraPermission", "askCameraPermission:      8", )
/*
                val camarabitmap = data!!.extras!!.get("data") as Bitmap
                var displayImage=findViewById<ImageView>(R.id.displayimage)
                displayImage!!.setImageBitmap(camarabitmap)

                val baos = ByteArrayOutputStream()
                camarabitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos)
                val b = baos.toByteArray()
                val encodedCameraImage: String = Base64.encodeToString(b, Base64.DEFAULT)

                preferencess.saveImagePath(this,encodedCameraImage)*/



                val contentURI = data!!.data
                var displayImage=findViewById<ImageView>(R.id.displayimage)
                displayImage.setImageURI(contentURI)
                val bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, contentURI)

                val baos = ByteArrayOutputStream()
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos)
                val b = baos.toByteArray()
                val encodedImage: String = Base64.encodeToString(b, Base64.DEFAULT)

                preferencess.saveImagePath(this,encodedImage)
                displayImage.invalidate()

            }


        }

    }
  /*  override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
if (requestCode==GALLERY)
{
    Log.e("askGallaryPermission", "askGallaryPermission:     6" )

    if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED))
    { Toast.makeText(this, "user allowed permission", Toast.LENGTH_SHORT).show()
        Log.e("askGallaryPermission", "askGallaryPermission:     6.1" )

        choosePhotoFromGallary()
    }
}
else if (requestCode==CAMERA) {
    Log.e("askCameraPermission", "askCameraPermission:      6", )

    if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED))
    {
        Log.e("askCameraPermission", "askCameraPermission:      6.1", )

        Toast.makeText(this, "user allowed permission", Toast.LENGTH_SHORT).show()
        takePhotoFromCamera()
    }
}
else{
    Toast.makeText(this, "user denine permission", Toast.LENGTH_SHORT).show()
}

    }*/
    private fun setToolbar()
    { setSupportActionBar(binding.toolbar)
        val drawerToggle = DuoDrawerToggle(this, binding.drawer, binding.toolbar, R.string.open_nav, R.string.close_nav)
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
        Log.e("askCameraPermission", "askCameraPermission:      7", )

        startActivityForResult(intent, CAMERA)
    }
    private fun choosePhotoFromGallary() {
        Log.e("askGallaryPermission", "askGallaryPermission:     7" )

        val galleryIntent = Intent(Intent.ACTION_PICK,
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(galleryIntent, GALLERY)
    }


    override fun onBackPressed()
    {
        super.onBackPressed()
        finishAffinity()
    }


}