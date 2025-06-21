# 🔧 ManualDI Note – Kotlin Android Project

This project demonstrates how to implement **manual dependency injection (DI)** using different patterns in Android. The goal is to provide hands-on understanding of core concepts like:

- Manual DI via `Application` class
- Factory Design Pattern
- Interface-based DI and abstraction

---

## 🗂️ Project Structure Overview

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

## 🔍 Modules Breakdown

### 📦 `applicationlevel` — [Read More →](./app/src/main/java/com/example/manualdinote/applicationlevel/APPLICATIONLEVEL.md)

- Uses **Application class** to provide a `Car` object with `Engine` and `Wheel` dependencies.
- Teaches the concept of **global application state**.
- Suitable for small-scale apps to maintain app-wide shared instances.

---

### 🏭 `factory` — [Read More →](./app/src/main/java/com/example/manualdinote/factory/FACTORY.md)

- Implements the **Factory Pattern** to create objects (`Downloader`, `Request`, `Executor`, etc.).
- Centralizes object creation to avoid repeating code across consumers.
- Ideal to understand **centralized construction logic** before moving to libraries like Dagger/Hilt.

---

### 🧩 `interfaces` — [Read More →](./app/src/main/java/com/example/manualdinote/interfaces/INTERFACES.md)

- Demonstrates **Interface-based DI**.
- `Main` depends on `One` (interface), allowing for easy swapping of implementations.
- `AppModule` acts as a central provider object.
- Best practice for decoupling and writing testable code.

---

## ✅ Goals of This Project

- Understand core DI principles before using heavy libraries.
- Explore design patterns (Factory, Singleton, Abstraction).
- Encourage clean code architecture and modularization.

---

## 🧠 Key Learnings

| Concept             | Applied In         | Description |
|---------------------|--------------------|-------------|
| Manual DI via Application | `applicationlevel` | For global singleton access |
| Factory Pattern     | `factory`          | Object creation centralized |
| Interface Abstraction | `interfaces`     | Swap logic via interface |
| Module Object (Singleton) | `AppModule`  | Simple DI container |

---

## 🔗 References

- [Android Application Class – Official Docs](https://developer.android.com/reference/android/app/Application)
- [Factory Design Pattern – GeeksforGeeks](https://www.geeksforgeeks.org/design-patterns-set-2-factory-method/)
- [Kotlin Interfaces](https://kotlinlang.org/docs/interfaces.html)
- [Dependency Injection in Android](https://developer.android.com/training/dependency-injection)

---

## 👨‍💻 Author

**Kaustubh S.D.**  
Built for learning the foundations of dependency management in Android.

---

## 📄 License

MIT License / Free to use and modify for educational purposes.
