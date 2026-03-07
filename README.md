# PracticeQA Automation Framework

## 📌 Project Overview

This project is a **Selenium Automation Framework** built using **Java, Selenium WebDriver, TestNG, and Maven**.
It automates test scenarios for the Practice Software Testing application and follows a **config-driven framework design** where environment values like the application URL are read from configuration files instead of being hardcoded.

---

## 🛠 Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Git & GitHub
* Eclipse IDE

---

## 📂 Project Structure

```
practiceqa-automation
│
├── pom.xml
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
  * Page/base classes
  * Utilities
  * Configuration

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

Run the following command in the project root:

```
mvn clean test
```

---

## 🧪 Sample Test Case

**NavigateTest**

Steps:

1. Read application URL from config file
2. Launch browser
3. Navigate to application
4. Print page title in console

---

## 📈 Future Improvements

* Page Object Model implementation
* Parallel test execution
* Multi-browser support
* CI/CD integration (Jenkins/GitHub Actions)
* Reporting integration (Extent Reports / Allure)

---

## 👨‍💻 Author

**Balram Rajale**

QA Engineer | Automation Testing
Experience: 3.5+ Years in Software Testing

---
