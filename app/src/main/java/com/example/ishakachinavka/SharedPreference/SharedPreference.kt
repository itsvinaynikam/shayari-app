package com.example.ishakachinavka.SharedPreference

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor




class SharedPreferencee(var context: Context)
{

    lateinit var favoritesPref: SharedPreferences
    lateinit var editor: Editor


init {
    favoritesPref = context.getSharedPreferences("FavoritesPref", Context.MODE_PRIVATE);
    editor = favoritesPref.edit()
}


    fun setStudentFlag(toString: String, newFavoriteStatus: Boolean) {
        editor.putBoolean(toString,newFavoriteStatus)
        editor.apply()
    }

    fun isStudent(toString: String, b: Boolean): Boolean {
        return favoritesPref.getBoolean(toString, b)
    }




}


