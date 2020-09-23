package com.example.trackrun.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data  class Run(
    var img: Bitmap? = null,
    //timestamp is used store date so we can be able to sort our run by date. we save in a Long value instead of date format
    var timestamp: Long? = 0L,
    var averageSpeedInKMH: Float = 0f,
    var distanceInMeters: Int = 0,
    // timeInMillis is how long our run was
    var timeInMillis: Long = 0L,
    var caloriesBurned: Int = 0
    ) {

    //primary key - we wont put it in constructor because we want to create run object without us needing a primary key
    //we want room to create id when we create run
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

}