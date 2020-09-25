package com.example.trackrun

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.trackrun.db.RunningDatabase
import com.example.trackrun.others.Constants.RUNNING_DATABASE_NAME
import dagger.Provides
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.qualifiers.ApplicationContext
import timber.log.Timber
import javax.inject.Singleton

@HiltAndroidApp
class BaseApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}