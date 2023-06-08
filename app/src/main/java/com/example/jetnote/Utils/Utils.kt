package com.example.jetnote.Utils

import java.text.SimpleDateFormat
import java.util.Date

class Utils {
    companion object{
        fun formatDate(date : Date):String{
            val  dateFormat = SimpleDateFormat("EEE, d MMM")
            return dateFormat.format(date)
        }
    }
}