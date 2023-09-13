package com.example.ishakachinavka.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shayaritable ")

data class Favshayari(
    @PrimaryKey var id:Int,
                      val text: String)
