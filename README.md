# 🔧 ManualDINote – Manual Dependency Injection in Android (Kotlin)

![Kotlin](https://img.shields.io/badge/Kotlin-1.9-blueviolet?logo=kotlin)
![Android](https://img.shields.io/badge/Platform-Android-green?logo=android)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)
![Status](https://img.shields.io/badge/Project-Learning-informational)

This project demonstrates how to implement **manual dependency injection (DI)** in Android using Kotlin, **without third-party libraries** like Dagger or Hilt. You'll learn three key techniques:

1. ✅ Application-level DI
2. 🏭 Factory pattern-based DI
3. 🧩 Interface-based DI

---

## 🗂️ Project Structure

```
ManualDINote/
├── app/
│   └── src/
│       └── main/
│           └── java/
│               └── com/
│                   └── example/
│                       └── manualdinote/
│                           ├── applicationlevel/
│                           │   ├── BaseApp.kt
│                           │   ├── Car.kt
│                           │   └── 📘 [APPLICATIONLEVEL.md](./app/src/main/java/com/example/manualdinote/applicationlevel/APPLICATIONLEVEL.md)
│                           ├── factory/
│                           │   ├── Downloading.kt
│                           │   └── 📘 [FACTORY.md](./app/src/main/java/com/example/manualdinote/factory/FACTORY.md)
│                           ├── interfaces/
│                           │   ├── BaseApp.kt
│                           │   ├── interfaces.kt
│                           │   └── 📘 [INTERFACES.md](./app/src/main/java/com/example/manualdinote/interfaces/INTERFACES.md)
│                           └── ui/
│                               └── MainActivity.kt
└── README.md
```

---

## 🔍 Module Overview

### 1. 🚘 `applicationlevel` — [Read More →](./app/src/main/java/com/example/manualdinote/applicationlevel/APPLICATIONLEVEL.md)

Implements DI using the `Application` class to create and inject shared instances (e.g., Car with Engine and Wheel).

#### 🔄 Flowchart

```plaintext
   [Application (BaseApp)]
             ↓
           [Car]
         ↙       ↘
     [Engine]   [Wheel]
```

---

### 2. 🏭 `factory` — [Read More →](./app/src/main/java/com/example/manualdinote/factory/FACTORY.md)

Implements the **Factory Pattern** to build a chain of dependencies (Downloader ← Request ← HttpClient + Executor).

#### 🔄 Flowchart

```plaintext
 [DownloaderFactory]
          ↓
      [Downloader]
           ↓
        [Request]
       ↙         ↘
[HttpClient]   [Executor]
```

---

### 3. 🧩 `interfaces` — [Read More →](./app/src/main/java/com/example/manualdinote/interfaces/INTERFACES.md)

Implements **interface-based DI** for decoupled, testable logic with a singleton object (`AppModule`).

#### 🔄 Flowchart

```plaintext
 [AppModule]
      ↓
    [Main]
      ↓
[One Interface] ← [ImplementOne]
```

---

## 🎯 Purpose

- Gain hands-on experience with the **core concepts of DI**
- Learn to decouple classes for **testability** and **maintainability**
- Build a foundation for using DI frameworks like **Dagger/Hilt**

---

## 🧠 Key Concepts

| Concept                | Description |
|------------------------|-------------|
| Application-level DI   | Use of `Application` to provide shared instances |
| Factory Pattern        | Encapsulates object creation logic |
| Interface-based DI     | Enables flexibility and decoupling |
| Singleton (AppModule)  | Provides a central source of dependencies |

---

## 🔗 References

- [Android Application Class – Official Docs](https://developer.android.com/reference/android/app/Application)
- [Factory Design Pattern – GeeksforGeeks](https://www.geeksforgeeks.org/design-patterns-set-2-factory-method/)
- [Kotlin Interfaces](https://kotlinlang.org/docs/interfaces.html)
- [Dependency Injection in Android](https://developer.android.com/training/dependency-injection)

---

## 👨‍💻 Author

**Kaustubh S.D.**  
Crafted with ❤️ using Kotlin and Android Studio.

---

## 📄 License

MIT License — Free to use and modify for educational purposes.
