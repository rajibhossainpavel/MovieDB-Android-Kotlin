package com.mdb.movieDB

import android.app.Application
//import com.android.tvflix.config.AppConfig
//import com.google.firebase.FirebaseApp
//import dagger.hilt.android.HiltAndroidApp
//import timber.log.Timber
import javax.inject.Inject

@HiltAndroidApp
class MovieApplication : Application() {
    //@Inject
    //lateinit var appConfig: AppConfig

    override fun onCreate() {
        super.onCreate()
       /* FirebaseApp.initializeApp(this)
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        appConfig.initialise()*/
    }
}
