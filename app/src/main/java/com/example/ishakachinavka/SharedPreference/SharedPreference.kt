package com.example.ishakachinavka.SharedPreference

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.net.Uri


class SharedPreferencee(var context: Context)
{

     var favoritesPref: SharedPreferences
     var editor: Editor

     var KEY_STATUS="introStatus"
     var KEY_PROFILEIMAGE="profileimage"

    private val PREF_NAME = "MyPrefs"
    private val IMAGE_URI_KEY = "imageUri"


init {
    favoritesPref = context.getSharedPreferences("FavoritesPref", Context.MODE_PRIVATE);
    editor = favoritesPref.edit()
}

    fun setFavShayari(toString: String, newFavoriteStatus: Boolean) {
        editor.putBoolean(toString,newFavoriteStatus)
        editor.apply()
    }
    fun getFavShayari(toString: String, b: Boolean): Boolean
    {
        return favoritesPref.getBoolean(toString, b)
    }
    fun setIntroStatus(status:Boolean){
        editor.putBoolean(KEY_STATUS,status)
        editor.apply()
    }
    fun getIntroStatus(status:Boolean):Boolean{
        return favoritesPref.getBoolean(KEY_STATUS, status)

    }

    fun saveImagePath(context: Context, imagePath: Uri?) {
        editor.putString(KEY_PROFILEIMAGE, imagePath.toString())
        editor.apply()
    }

    fun getImagePath(context: Context): String? {
        return favoritesPref.getString(KEY_PROFILEIMAGE, null)
    }

















}


