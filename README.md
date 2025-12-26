JBA Learning - Book API
This is a simple educational project to learn Java Spring Boot and PostgreSQL database integration.

Features
REST API for managing a book collection.

Automated database schema generation using Hibernate.

Validation for unique ISBN numbers.

Basic CRUD operations (Create, Read).

Tech Stack
Java 17

Spring Boot

Spring Data JPA

PostgreSQL

API Endpoints
POST /book Used to add a new book to the database. Example JSON Body:

JSON

{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "price": 2500,
  "isbn": "9780132350884"
}
GET /book Returns a list of all books in the database.

GET /book/{id} Returns details of a specific book by its ID.

How to run
Create a PostgreSQL database named jba_learning.

Update src/main/resources/application.properties with your database username and password.

Run the application using your IDE or mvn spring-boot:run.
