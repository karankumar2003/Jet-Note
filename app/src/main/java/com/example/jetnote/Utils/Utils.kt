package com.example.jetnote.Utils

import java.text.SimpleDateFormat
import java.util.Calendar

class Utils {
    companion object{
        fun formatDate(calendar : Calendar):String{
            val  dateFormat = SimpleDateFormat("EEE, d MMM")
            return dateFormat.format(calendar.time)
        }
    }
}