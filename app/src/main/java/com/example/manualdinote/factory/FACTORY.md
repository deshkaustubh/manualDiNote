# ⬇️ Manual Factory Pattern Example in Android

This example demonstrates how to use a **Factory Design Pattern** in Kotlin to create and provide dependencies manually.

---

## 📁 Project Structure

```
com.example.manualdinote.factory
│
├── Request.kt
├── HttpClient.kt
├── Executor.kt
├── Downloader.kt
└── DownloaderFactory.kt
```

---

## 📦 Complete Code

```kotlin
package com.example.manualdinote.factory

import android.util.Log

// Request depends on HttpClient and Executor
class Request constructor(
    private val client: HttpClient,
    private val executor: Executor
) {
    fun getRequest() {
        Log.d("main", "fileDownloading")
    }
}

// Represents a simple HTTP client
class HttpClient()

// Represents a task executor
class Executor()

// Downloader depends on Request
class Downloader constructor(private val request: Request) {
    fun getDownload() {
        request.getRequest()
    }
}

// Factory object to create a Downloader with its dependencies
object DownloaderFactory {
    fun create(): Downloader {
        val client = HttpClient()
        val executor = Executor()
        val request = Request(client = client, executor = executor)
        return Downloader(request)
    }
}
```

---

## 🧠 Explanation

### ✅ What is the Factory Pattern?

- The **Factory Pattern** is a creational design pattern used to abstract the object creation logic.
- It encapsulates the logic of **how dependencies are created** and wired together, so the consumer just gets a ready-to-use object.

---

## 🧩 Components Overview

| Class         | Role |
|---------------|------|
| `HttpClient`  | Represents a client to handle HTTP communication |
| `Executor`    | Handles background task execution |
| `Request`     | Depends on `HttpClient` and `Executor` to perform a file download |
| `Downloader`  | Depends on `Request` to manage downloading logic |
| `DownloaderFactory` | Responsible for instantiating and wiring all components together |

---

## ✅ Usage Example

```kotlin
val downloader = DownloaderFactory.create()
downloader.getDownload()
```

- This line uses the factory to **create a fully wired Downloader** object with all dependencies.
- Inside `getDownload()`, it logs `"fileDownloading"` to Logcat.

---

## 📝 Benefits of This Approach

✅ **Separation of Concerns**
- Business logic (Downloader) is separated from object creation (DownloaderFactory).

✅ **Easier to Maintain**
- Changes to how objects are created only affect the factory.

✅ **Prepares for DI Frameworks**
- Helps build a solid foundation for migrating to DI frameworks like **Hilt**, **Koin**, or **Dagger**.

---

## 📌 Summary

| Concept         | Description |
|------------------|-------------|
| Factory Pattern  | Encapsulates object creation logic |
| Manual DI        | Dependencies passed manually via constructors |
| Object Composition | Clean and testable structure without external libraries |
| Best For         | Learning and small to medium-sized apps |

---

Let me know if you want a combined README or visual architecture diagram as well!
