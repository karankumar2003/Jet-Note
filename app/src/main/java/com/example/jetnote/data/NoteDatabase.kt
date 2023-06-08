package com.example.jetnote.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.jetnote.Utils.DateTypeConvertor
import com.example.jetnote.model.Note

@Database(entities= [Note::class], version = 2, exportSchema = false)
@TypeConverters(DateTypeConvertor::class)
abstract class NoteDatabase:RoomDatabase() {
    abstract fun getNoteDao() : NoteDao
}