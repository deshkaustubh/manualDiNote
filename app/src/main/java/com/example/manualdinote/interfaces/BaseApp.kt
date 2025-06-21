package com.example.manualdinote.interfaces

import android.app.Application


class BaseApp: Application() {
    val main = AppModule.main
}