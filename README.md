# 📦 Manual Dependency Injection in Android (Kotlin)

This project demonstrates how to implement **manual dependency injection** in Android using Kotlin. The goal is to understand and explore how dependency management works **without relying on third-party libraries** like Dagger, Hilt, or Koin.

---

## 🗂️ Project Structure

```
app/
├── manifests/
│   └── AndroidManifest.xml
├── kotlin+java/
│   └── com.example.manualdinote/
│       ├── applicationlevel/
│       │   ├── BaseApp.kt
│       │   ├── Car.kt
│       │   └── [📄 APPLICATIONLEVEL.md](./kotlin+java/com/example/manualdinote/applicationlevel/APPLICATIONLEVEL.md)
│       ├── factory/
│       │   ├── Downloading.kt
│       │   └── [📄 FACTORY.md](./kotlin+java/com/example/manualdinote/factory/FACTORY.md)
│       ├── ui.theme/
│       └── MainActivity.kt
└── res/
```

---

## 🔍 Modules Breakdown

### 1. `applicationlevel` — [📖 APPLICATIONLEVEL.md](./kotlin+java/com/example/manualdinote/applicationlevel/APPLICATIONLEVEL.md)

- Demonstrates how to use the **Application class** to maintain a global state.
- Implements basic manual dependency injection by initializing and providing a `Car` instance.
- Explains:
   - What is Application class?
   - What is a global state?
   - Why use it for dependency injection?

---

### 2. `factory` — [📖 FACTORY.md](./kotlin+java/com/example/manualdinote/factory/FACTORY.md)

- Demonstrates the **Factory Design Pattern**.
- The `DownloaderFactory` creates and wires dependencies (`HttpClient`, `Executor`, `Request`, and `Downloader`).
- Explains:
   - What is the Factory pattern?
   - Benefits of using a factory for object creation.
   - Best practices and usage examples.

---

## 🎯 Purpose of This Project

- Build a solid understanding of how dependency injection works under the hood.
- Learn design patterns like **Factory** and **Manual DI via Application class**.
- Prepare for integrating real-world DI libraries (Hilt/Dagger) by first learning the fundamentals.

---

## 🔗 References

- [Android Application Class – Official Docs](https://developer.android.com/reference/android/app/Application)
- [Factory Design Pattern – GeeksforGeeks](https://www.geeksforgeeks.org/design-patterns-set-2-factory-method/)
- [Dependency Injection in Android](https://developer.android.com/training/dependency-injection)

---

## 👨‍💻 Author

**Kaustubh S.D.**  
Crafted with ❤️ using Kotlin and Android Studio.

---

## 📌 License

This project is for learning purposes and does not include a specific license.
