package com.example.roomrevision

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "contact")
data class Contact(
@PrimaryKey(autoGenerate = true)
    val id:Long,
    val name:String,
    val phone:String
)
