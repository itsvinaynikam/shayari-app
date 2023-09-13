package com.example.ishakachinavka.InterFace

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.ishakachinavka.Model.Favshayari
import com.example.ishakachinavka.Model.Shayari

@Dao
interface ShayariDao {

    @Insert
    fun insertAll( insetfavlist: Favshayari)


    @Query("Select * from `shayaritable `")
    fun gelAllUsers(): MutableList<Favshayari>

    @Delete
    fun delete(deleteshayari: Favshayari)



}