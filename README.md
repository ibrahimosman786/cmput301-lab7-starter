# 🏙️ ListyCity — Android UI Testing (Lab 7)

**CMPUT 301 — Winter 2026**

| | |
|---|---|
| **Name** | Ibrahim |
| **CCID** | ibrahi10 |

---

## 📱 About

ListyCity is an Android app that lets users manage a list of cities. Users can add cities, clear the list, and tap on any city to view its details in a dedicated screen. This project demonstrates **Android UI Testing with Espresso**.

---

## ✨ Features

- **Add City** — Add any city to your list
- **Clear All** — Remove all cities at once
- **City Details** — Tap a city to view it in ShowActivity
- **Back Navigation** — Return to the main list seamlessly

---

## 🧪 Espresso UI Tests

| Test | Description |
|------|-------------|
| `testAddCity()` | Adds a city and verifies it appears on screen |
| `testClearCity()` | Adds cities, clears list, verifies they're gone |
| `testListView()` | Verifies city is at correct position in ListView |
| `testActivitySwitch()` | Verifies ShowActivity launches on city click |
| `testCityNameConsistency()` | Confirms city name matches between activities |
| `testBackButton()` | Tests back navigation from ShowActivity to MainActivity |

---

## 🛠️ Built With

- Java
- Android Studio
- Espresso Testing Framework
- Espresso Intents

---

## 🚀 How to Run

1. Clone this repo
2. Open in Android Studio
3. Run on emulator or physical device
4. Right-click `MainActivityTest.java` → **Run** to execute tests
