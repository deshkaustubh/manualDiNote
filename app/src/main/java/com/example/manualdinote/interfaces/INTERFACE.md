# 🧩 Interface-based Dependency Injection in Android

This module demonstrates how to apply **interface-based manual dependency injection** using Kotlin in Android.

---

## 📦 Code Structure

```kotlin
package com.example.manualdinote.interfaces

import android.util.Log

// Step 1: Define an Interface
interface One {
    fun one()
}

// Step 2: Provide an Implementation
class ImplementOne : One {
    override fun one() {
        Log.d("main", "one: is calling....")
    }
}

// Step 3: Use Interface as a Dependency
class Main constructor(private val one: One) {
    fun main() {
        one.one()
    }
}

// Step 4: Create a Singleton DI Container
object AppModule {
    val main = Main(ImplementOne())
}
```

---

## 🔧 Application Class

```kotlin
class BaseApp : Application() {
    val main = AppModule.main
}
```

---

## 🧠 Explanation

| Concept         | Purpose |
|------------------|---------|
| `interface One`  | Abstract contract for dependency |
| `ImplementOne`   | Concrete class providing implementation |
| `Main`           | Consumes the interface for logic |
| `AppModule`      | Acts as DI container providing concrete objects |
| `BaseApp`        | Makes `main` instance available app-wide |

---

## 💡 Advantages

✅ Promotes loose coupling  
✅ Makes unit testing easier (mock implementations)  
✅ Encourages good architecture (interface segregation)  
✅ No third-party dependency needed

---

## 🔗 References

- [Kotlin Interfaces – Official Docs](https://kotlinlang.org/docs/interfaces.html)
- [Android DI Principles](https://developer.android.com/training/dependency-injection)
