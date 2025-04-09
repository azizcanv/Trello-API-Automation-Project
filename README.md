# Trello API Automation Project

This project automates interactions with the Trello API using RestAssured in Java. It is designed to demonstrate API testing practices and integration with Trello's services.

---

## Features

- **Comprehensive API Testing**: Covers various endpoints of Trello's API.
- **Reusable Methods**: Encapsulation of common API interaction methods.
- **Maven Integration**: Dependency management and build automation.

---

## Project Structure

```
trello-api-automation-project/
├── .idea/                      # IDE configuration files
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/          # Page classes for API interaction
│   │   │   │   ├── BoardPage.java
│   │   │   │   └── CardPage.java
│   │   │   └── service/        # API service client
│   │   │       └── TrelloClient.java
│   └── test/
│       ├── java/
│       │   └── tests/          # Test cases
│       │       └── TrelloScenarioTest.java
├── .gitignore                  # Files and directories to be ignored by Git
├── pom.xml                     # Maven configuration file
└── README.md                   # Documentation of the project
```

---

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/azizcanv/Trello-API-Automation-Project.git
   cd trello-api-automation-project
   ```

2. **Open the project in an IDE**:
    - Use IntelliJ IDEA or any other Java-compatible IDE.

3. **Setup dependencies**:
    - Ensure Maven is properly configured to download dependencies from the `pom.xml` file.

---

## Usage

1. **Configure API Keys**:
    - Open the `TrelloClient.java` file.
    - Replace `YOUR_KEY` and `YOUR_TOKEN` placeholders with your actual Trello API Key and Token.

2. **Run Tests**:
    - Execute test cases from the `tests` package.
    - Use your IDE's test runner or the Maven command:
      ```bash
      mvn test
      ```

---

## Contact

- **Author**: Aziz Can Varol
- **GitHub**: [azizcanv](https://github.com/azizcanv)
- **Email**: [azizcanv@gmail.com](mailto:azizcanv@gmail.com)