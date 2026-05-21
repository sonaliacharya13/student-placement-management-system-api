# Student Placement Management System

A backend REST API project built using Spring Boot and MySQL to manage students, companies, and placement applications.

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## Features

### Student Module
- Add Student
- Get All Students
- Get Student By ID
- Update Student
- Delete Student

### Company Module
- Add Company
- Get All Companies
- Get Company By ID
- Update Company
- Delete Company

### Application Module
- Student applies to company
- Get all applications
- Get application by ID
- Update application status
- Delete application

## API Endpoints

### Student APIs
- POST `/students`
- GET `/students`
- GET `/students/{id}`
- PUT `/students/{id}`
- DELETE `/students/{id}`

### Company APIs
- POST `/companies`
- GET `/companies`
- GET `/companies/{id}`
- PUT `/companies/{id}`
- DELETE `/companies/{id}`

### Application APIs
- POST `/applications`
- GET `/applications`
- GET `/applications/{id}`
- PUT `/applications/{id}`
- DELETE `/applications/{id}`

## Project Structure

src/main/java/com/sonali/student_placement_management_system
│
├── controller
├── entity
├── repository
├── service
└── StudentPlacementManagementSystemApplication.java

## Learning Outcomes
This project helped me understand:
- REST APIs
- CRUD operations
- Layered architecture
- Spring Boot annotations
- JPA Repository
- MySQL integration
- API testing with Postman

## Future Improvements
- Exception Handling
- Validation
- Entity Relationships
- Eligibility Check
- Authentication
