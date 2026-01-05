# TaskTracker-Abnormal
# Task Tracker – Spring Boot Application

This is a simple Task Tracker web application built using **Spring Boot**.  
The application allows users to **create, view, update, delete, and mark tasks as completed** through a web-based interface.

---

## Features

- Add new tasks with title and description
- View all tasks in a list
- Update existing tasks
- Mark tasks as completed
- Delete tasks
- Simple and clean UI
- In-memory database for easy setup

---

## Technology Stack

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- H2 In-Memory Database
- Maven

---

## Project Structure

tasktracker
├── src/main/java/com/example/tasktracker
│ ├── TaskTrackerApplication.java
│ ├── controller/TaskController.java
│ ├── model/Task.java
│ └── repository/TaskRepository.java
└── src/main/resources
├── templates
│ ├── tasks.html
│ └── edit-task.html
└── application.properties

## Setup and Run Instructions

### Prerequisites
- Java 17 or higher
- Maven

### Steps to Run

Clone the repository: git clone https://github.com/captain26/TaskTracker-Abnormal.git
   
Run the application: mvn spring-boot:run

Open the application in a browser: http://localhost:8080/tasks


### AI tools (such as ChatGPT) were used to assist during development in the following ways:

1) To generate the initial Spring Boot project boilerplate and basic application structure.
2) To help draft the HTML (Thymeleaf) templates for the user interface.
3) As a reference for Spring Boot best practices and application structuring, since it had been some time since I last worked extensively with Spring Boot.

### Manual Verification & Adjustments:
1) All generated code was reviewed and adjusted manually.
2) Package structure, dependency configuration, and imports were verified.
3) CRUD functionality was implemented and tested end-to-end.
4) UI layout and task update behavior were refined manually.
   
### DESIGN:

1) The application uses H2 In-Memory Database for simplicity and ease of setup, avoiding external database dependencies while still demonstrating JPA-based persistence.
2) A simple server-rendered HTML interface (Thymeleaf) is used, allowing users to:
   - Add tasks with a title and description
   - Edit existing tasks
   - Mark tasks as completed
   - Delete tasks
4) A controller handles all GET and POST mappings for task creation, retrieval, updating, completion, and deletion of Tasks.
