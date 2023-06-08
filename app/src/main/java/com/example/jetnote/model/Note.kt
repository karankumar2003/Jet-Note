package com.example.jetnote.model

import android.provider.CalendarContract.CalendarAlerts
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.Calendar
import java.util.Date
import java.util.UUID

@Entity
data class Note(
    val title : String,
    val description:String,
    @PrimaryKey
    val id:UUID = UUID.randomUUID(),
//    val time : Date = Date.from(Instant.now())
)
