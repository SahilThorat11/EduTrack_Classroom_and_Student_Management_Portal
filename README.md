# 🎓 EduTrack – Classroom & Student Management Portal

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/MongoDB-Database-green)](https://www.mongodb.com/)
[![Maven](https://img.shields.io/badge/Maven-Build-red)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-orange)](LICENSE)

---

## 🔹 Overview

**EduTrack** is a backend system built with **Spring Boot** and **MongoDB** to manage classrooms and student batches efficiently.  

It provides **REST APIs** for CRUD operations and ensures **data validation**, **exception handling**, and clean JSON responses.  

> This project is backend-only and designed for integration with any frontend later (React/Angular/Vue).  

---

## 🛠 Technology Stack

| Layer         | Technology           |
|---------------|-------------------|
| Backend       | Java, Spring Boot  |
| Database      | MongoDB            |
| Build Tool    | Maven              |
| Testing       | Postman            |
| IDE           | IntelliJ IDEA      |
| Java Version  | 17+                |

---

## 📂 Project Structure

```

EduTrack/
├── src/main/java/com/edutrack
│   ├── config/                  # MongoDB configuration
│   │   └── MongoConfig.java
│   ├── controller/              # REST controllers
│   │   └── BatchEntryController.java
│   ├── entity/                  # Entity classes
│   │   └── BatchEntry.java
│   ├── exception/               # Custom exceptions and global handler (Working on it)
│   │   ├── ResourceNotFoundException.java
│   │   └── GlobalExceptionHandler.java
│   ├── repository/              # MongoDB repositories
│   │   └── BatchEntryRepository.java
│   ├── service/                 # Service classes
│   │   └── BatchEntryService.java
│   └── EdutrackApplication.java # Spring Boot main class
├── src/main/resources/
│   └── application.properties   # App & database configuration
├── pom.xml                       # Maven dependencies
└── .gitignore

````

---

## 🚀 Features

- CRUD operations for **Classroom/Batches**  
- **MongoDB integration** for persistent storage  
- **RESTful APIs** for easy frontend integration  
- **Global Exception Handling** for clean error responses  
- **Validation** to prevent empty names or negative fees  

---

## 📌 API Endpoints

| Method | Endpoint                | Description                  |
|--------|------------------------|------------------------------|
| GET    | `/api/batches`          | Get all batches             |
| POST   | `/api/batches`          | Create a new batch          |
| PUT    | `/api/batches/id/{id}`  | Update a batch by ID        |
| DELETE | `/api/batches/id/{id}`  | Delete a batch by ID        |
| DELETE | `/api/batches/all`      | Delete all batches          |

> All endpoints return **JSON responses** with proper HTTP status codes.

---

## ⚙️ Installation & Run

### 1. Clone the repository

```bash
git clone https://github.com/YourUsername/edutrack-strudent-and-classroom-management.git
cd edutrack-strudent-and-classroom-management/EduTrack
````

### 2. Configure MongoDB

* Make sure **MongoDB is running locally** (default port: 27017)
* The database `edutrack` will be created automatically

### 3. Build & Run

```bash
mvn clean install
mvn spring-boot:run
```

### 4. Test APIs

* Use **Postman** or any REST client
* Base URL: `http://localhost:8080/api/batches`

Example POST:

```json
{
  "name": "Java Full Stack",
  "fees": 5000
}
```

---

## 💡 Validation & Error Handling

* **Name** cannot be empty
* **Fees** must be positive
* **Invalid ID** → 404 Not Found
* **Global exception handler** returns clean JSON errors

Example error response:

```json
{
  "error": "Batch not found with ID: 123"
}
```

---

## 📈 Future Enhancements

* Add **Student module** with batch relationships
* Add **Spring Security** for authentication & authorization
* Add **Frontend UI** using React or Angular
* Implement **report generation** (CSV, Excel)

---

## 🧑‍💻 Author

**Sahil Rajaram Thorat**

* GitHub: [https://github.com/SahilThorat11](https://github.com/SahilThorat11)
* LinkedIn: [https://www.linkedin.com/in/sahilthorat11/](https://www.linkedin.com/in/sahilthorat11/)

---
