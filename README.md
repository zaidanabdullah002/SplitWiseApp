SplitWiseApp 💸
A robust expense-sharing engine built with Kotlin and Gradle. This application manages complex debt relationships, allowing users to track who paid for what and how much each person owes within a group.

🏗 Project Structure
The project follows a standard Gradle multi-module structure:

app/src/main/kotlin: Contains the core business logic.

UserService.kt: Manages user profiles and registration.

ExpenseService.kt: Handles the creation and categorization of expenses.

SplitService.kt: The logic engine for dividing costs.

BalanceService.kt: Calculates the net "owe/owed" state between users.

App.kt: The main entry point of the application.

utils/: Helper functions and common utilities.

buildSrc/: Custom Gradle build logic and dependency management.

🛠 Tech Stack
Language: Kotlin

Build System: Gradle (Kotlin DSL)

Architecture: Service-Repository Pattern

🚀 Getting Started
Prerequisites
JDK 17 or higher

Gradle (or use the included ./gradlew wrapper)

Installation & Setup
Clone the repository:

Bash
git clone git@github.com:zaidanabdullah002/SplitWiseApp.git
cd SplitWiseApp
Build the project:

Bash
./gradlew build
Run the Application:

Bash
./gradlew run
🧪 Running Tests
The project includes a test suite located in app/src/test. To run them:

Bash
./gradlew test
📝 Planned Features
[ ] Persistence layer (SQL/NoSQL database integration)

[ ] REST API layer using Ktor or Spring Boot

[ ] Support for unequal splits (percentages/shares)

[ ] Settlement algorithm optimization (Simplify Debts)

How to update this on GitHub:
Since you've already successfully pushed to the master branch, follow these steps to add this README:

Open the file: nano README.md (or open it in VS Code/IntelliJ).

Paste the content above and save it.

Push the update:

Bash
git add README.md
git commit -m "docs: customize readme for kotlin/gradle structure"
git push origin master
