# 🚗 Manual Dependency Injection Example in Android (Application Level)

This example demonstrates **manual dependency injection** using an `Application` class in Android to provide a **global application state**.

---

## 📁 Project Structure

```
com.example.manualdinote.applicationlevel
│
├── Car.kt
├── Engine.kt
├── Wheel.kt
└── BaseApp.kt
```

---

## 🔧 Car.kt

```kotlin
package com.example.manualdinote.applicationlevel

import android.util.Log

// A class representing a Car that depends on Engine and Wheel
class Car constructor(
    private val engine: Engine,
    private val wheel: Wheel
) {
    fun getCar() {
        engine.getEngine()
        wheel.getWheel()
        Log.d("main", "my car is Running")
    }
}

// A simple Engine class
class Engine {
    fun getEngine() {
        Log.d("main", "EngineStarted")
    }
}

// A simple Wheel class
class Wheel {
    fun getWheel() {
        Log.d("main", "wheel Started")
    }
}
```

---

## 🌐 BaseApp.kt

```kotlin
package com.example.manualdinote.applicationlevel

import android.app.Application

// Base class to maintain global application state
class BaseApp: Application() {

    // Here, the Car object is created with its dependencies manually injected
    var car = Car(
        engine = Engine(),
        wheel = Wheel()
    )
}
```

---

## 🧠 Explanation

### ✅ What is `Application` Level Class?

- It is a class that extends `android.app.Application`.
- Used to **maintain global application state**.
- Only one instance is created during the lifecycle of the app.
- Typically used for initializing libraries, managing services, or shared objects like Retrofit, Room, or manual DI (as shown here).

### ✅ What is Global Application State?

- **Global state** refers to the **shared data or objects** that can be accessed throughout the entire app lifecycle.
- Examples: app-wide configuration settings, singletons, service instances, shared resources (e.g., logging, analytics).

---

## 📝 Notes

1. ✅ You **must declare** your custom `Application` class (`BaseApp`) in the `AndroidManifest.xml`:
```xml
<application
    android:name=".applicationlevel.BaseApp"
    ... >
```

2. ✅ Access the globally created object (`car`) like this:
```kotlin
val myCar = (applicationContext as BaseApp).car
myCar.getCar()
```

3. ✅ This approach is suitable for **small projects** or learning. For scalable projects, consider using **Dagger/Hilt/Koin** for better dependency management.

---

## 📌 Summary

| Concept                | Description |
|------------------------|-------------|
| `Application` class    | Entry point for app-wide state |
| Manual DI              | Dependencies are passed manually |
| Global State           | Shared object accessible throughout the app |
| When to use            | For simple apps or bootstrapping dependencies |

---
