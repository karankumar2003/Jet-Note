package com.example.jetnote.model

import android.provider.CalendarContract.CalendarAlerts
import java.util.Calendar
import java.util.Date
import java.util.UUID

data class Note(
    val title : String,
    val description:String,
    val id:UUID = UUID.randomUUID(),
    val time : Calendar = Calendar.getInstance()
)
