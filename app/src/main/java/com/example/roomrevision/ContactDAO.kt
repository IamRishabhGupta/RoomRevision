package com.example.roomrevision

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import androidx.lifecycle.LiveData


@Dao
interface ContactDAO {

    @Insert
   suspend fun insertContact(contact: Contact)

    @Update
    suspend fun updateContact(contact: Contact)

    @Delete
    suspend fun deleteContact(contact: Contact)



    @Query("SELECT * FROM CONTACT")
    fun getContact():LiveData<List<Contact>>


}