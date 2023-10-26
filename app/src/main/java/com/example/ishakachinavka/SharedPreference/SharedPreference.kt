package com.example.ishakachinavka.SharedPreference

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor


class SharedPreferencee(var context: Context)
{

     var favoritesPref: SharedPreferences
     var editor: Editor
     var KEY_STATUS="introStatus"


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


    fun setString(key: String?, value: String?) {
        favoritesPref.edit().putString(key, value).apply()
    }

    fun getString(key: String?): String? {
        return favoritesPref.getString(key, "")
    }












}


