package com.example.recycler.DB

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Nota (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val titulo:String,
    val descripcion:String
)