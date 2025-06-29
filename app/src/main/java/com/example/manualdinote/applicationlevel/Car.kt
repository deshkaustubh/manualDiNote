package com.example.manualdinote.applicationlevel

import android.util.Log

class Car constructor(private val engine: Engine, private val wheel: Wheel) {
    fun getCar() {
        engine.getEngine()
        wheel.getWheel()
        Log.d("main", "my car is Running")
    }
}

class Engine {
    fun getEngine() {
        Log.d("main", "EngineStarted")
    }
}

class Wheel {
    fun getWheel() {
        Log.d("main", "wheel Started")
    }
}