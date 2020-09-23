package com.example.trackrun.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

//we use dagger in this project
//so we dnt have to worry about the singleton functionality of our room db
//dagger will handle it for us

@Database(entities = [Run::class], version = 1)
@TypeConverters(Converters::class)
abstract class RunningDatabase: RoomDatabase() {
    abstract fun getRunDao(): RunDAO
}