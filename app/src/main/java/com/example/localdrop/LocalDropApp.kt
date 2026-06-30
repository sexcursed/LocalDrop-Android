package com.example.localdrop

import android.app.Application
import com.example.localdrop.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class LocalDropApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@LocalDropApp)
            modules(appModule)
        }
    }
}