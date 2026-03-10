# PracticeQA Automation Framework

## 📌 Project Overview

This project is a **Selenium Automation Framework** built using **Java, Selenium WebDriver, TestNG, and Maven**.
It automates test scenarios for the Practice Software Testing application and follows a **config-driven framework design** where environment values like the application URL are read from configuration files instead of being hardcoded.

---

## 🛠 Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Apache Maven
* Git & GitHub
* Jenkins (CI Integration)
* Eclipse IDE

---

## 📂 Project Structure

```
practiceqa-automation
│
├── pom.xml
├── testng.xml
├── README.md
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   └── test
│       ├── java
│       │   ├── com.pages
│       │   │   └── BasePage.java
│       │   │
│       │   ├── com.tests
│       │   │   └── NavigateTest.java
│       │   │
│       │   └── utils
│       │       └── ConfigReader.java
│       │
│       └── resources
│           └── config.properties
│
├── target
└── test-output
```

---

## ⚙️ Framework Features

* Config-driven environment setup (URL stored in properties file)
* Centralized WebDriver setup using BasePage
* TestNG test execution
* Maven dependency management
* Clean separation of:

  * Test classes
  * Page/Base classes
  * Utilities
  * Configuration files

---

## 🔧 Configuration

Application settings are stored in:

```
src/test/resources/config.properties
```

Example:

```
app.url=https://with-bugs.practicesoftwaretesting.com
browser=chrome
```

---

## ▶️ How to Run Tests

### Using Eclipse

1. Right-click on the test class
2. Select **Run As → TestNG Test**

### Using Maven

Run the following command in the project root directory:

```
mvn clean test
```

---

## 🧪 Sample Test Case

**NavigateTest**

Steps performed:

1. Read application URL from configuration file
2. Launch browser
3. Navigate to the application
4. Print page title in console

---

## 🔄 CI/CD Integration

This framework is integrated with **Jenkins** for Continuous Integration.

Jenkins automatically performs the following steps:

1. Pulls the latest source code from **GitHub**
2. Builds the project using **Maven**
3. Executes **TestNG test suite**
4. Displays the test results in the Jenkins dashboard

---

## ⚡ Jenkins Job Execution Flow

```
GitHub Repository
        │
        ▼
Jenkins Job Trigger
        │
        ▼
Clone Repository
        │
        ▼
Maven Build (mvn clean test)
        │
        ▼
Execute TestNG Suite
        │
        ▼
Display Test Results
```

Example Jenkins console result:

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running NavigateTest

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS
```

---

## 📈 Future Improvements

* Implement complete **Page Object Model (POM)**
* Parallel test execution with TestNG
* Multi-browser support
* Advanced reporting (Extent Reports / Allure)
* GitHub Webhook integration for automatic Jenkins builds

---

## 👨‍💻 Author

**Balram Rajale**

QA Engineer | Automation Testing
Experience: **3.5+ Years in Software Testing**

---
