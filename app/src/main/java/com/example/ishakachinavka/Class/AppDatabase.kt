package com.example.ishakachinavka.Class

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ishakachinavka.InterFace.ShayariDao
import com.example.ishakachinavka.Model.Favshayari
import com.example.ishakachinavka.Model.Shayari


@Database(entities = [Favshayari::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): ShayariDao
}