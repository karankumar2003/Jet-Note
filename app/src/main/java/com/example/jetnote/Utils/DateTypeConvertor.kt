package com.example.jetnote.Utils

import androidx.room.TypeConverter
import java.util.Date

class DateTypeConvertor {

    @TypeConverter
    fun fromDate(date : Date): Long{
        return date.time
    }

    @TypeConverter
    fun toDate(time: Long):Date = Date(time)
}