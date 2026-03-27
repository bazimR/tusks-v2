# tusks-v2

An Android todo tracker app built with **Jetpack Compose** and the **MVVM** architecture pattern.

## Overview

tusks-v2 is a task/todo management application for Android. Users can create, update, complete, and delete tasks. The app is designed following modern Android development best practices.

## Architecture

The project follows the **MVVM (Model-View-ViewModel)** pattern, which separates the application into three layers:

- **Model** – Represents the data and business logic. This includes data classes (e.g. `Task`), a local database (Room), and a repository that abstracts data access.
- **ViewModel** – Bridges the UI and the data layer. It exposes UI state via `StateFlow` or `LiveData`, handles user events, and calls repository methods. ViewModels survive configuration changes (e.g. screen rotation).
- **View** – The Jetpack Compose UI layer. Composable functions observe state from the ViewModel and render the current UI. They also forward user interactions (button taps, text input) back to the ViewModel.

```
UI (Composables)
      │  observes state / sends events
      ▼
ViewModel
      │  reads/writes data
      ▼
Repository
      │
      ├── Room Database (local persistence)
      └── (optional) Remote API
```

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Kotlin |
| UI | Jetpack Compose |
| Architecture | MVVM |
| Async | Kotlin Coroutines & Flow |
| Local DB | Room |
| DI | Hilt (planned) |
| Navigation | Compose Navigation |

## Project Structure (planned)

```
app/
└── src/
    └── main/
        └── java/com/example/tusks/
            ├── data/
            │   ├── local/          # Room database, DAO, entities
            │   └── repository/     # Repository implementations
            ├── domain/
            │   └── model/          # Plain data classes (Task, etc.)
            ├── ui/
            │   ├── screens/        # Top-level Compose screens
            │   ├── components/     # Reusable Composable components
            │   └── theme/          # Color, typography, shape definitions
            └── viewmodel/          # ViewModels for each screen
```

## Getting Started

1. Clone the repository.
2. Open in **Android Studio Hedgehog** (or later).
3. Let Gradle sync the project.
4. Run the app on an emulator or physical device running **Android 8.0 (API 26)** or higher.

## License

MIT
