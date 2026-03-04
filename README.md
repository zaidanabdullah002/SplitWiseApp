# 💸 SplitWiseApp

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9+-purple.svg?style=flat&logo=kotlin)](https://kotlinlang.org/)
[![Gradle](https://img.shields.io/badge/Build-Gradle-02303A.svg?style=flat&logo=gradle)](https://gradle.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A robust **expense-sharing engine** built with Kotlin. This application resolves the "who owes whom" headache by managing complex debt relationships and calculating net balances across groups.

---

## 🏗 Project Architecture
The project follows a **Service-Repository Pattern**, ensuring a clean separation between data handling and business logic.



### 📂 Directory Breakdown
```text
root/
├── app/src/main/kotlin/        # Core Engine
│   ├── App.kt                 # Main Entry Point
│   ├── UserService.kt         # Identity & Profiles
│   ├── ExpenseService.kt      # Transaction Management
│   ├── SplitService.kt        # Calculation Engine (The "Brain")
│   └── BalanceService.kt      # Settlement & Owe/Owed Logic
├── utils/                     # Common Helpers
└── buildSrc/                  # Kotlin DSL Build Logic


🗺 Roadmap
[ ] Data Persistence: Integration with PostgreSQL/Exposed.

[ ] Advanced Splitting: Support for percentages, shares, and itemized splits.

[ ] Simplify Debts: Implementation of a min-cost flow algorithm to minimize transactions.

[ ] Web API: Exposing the engine via Ktor.
