# Book Management System

A simple REST API built with **Spring Boot** and **PostgreSQL** for educational purposes. This project demonstrates basic CRUD operations, database connectivity, and JPA repositories.

##  Technologies
* **Java 17**
* **Spring Boot 4**
* **Spring Data JPA**
* **PostgreSQL**
* **Maven**

##  Project Structure
- `BookController`: Handles HTTP requests (GET, POST).
- `BookService`: Contains business logic (e.g., checking if ISBN exists).
- `BookRepository`: Interface for database communication.
- `Book`: The main data model (Entity).

##  API Endpoints

### Add a new book
`POST /book`

**Request Body:**
```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "price": 2500,
  "isbn": "9780132350884"
}

```

### Get all books

`GET /book`

### Get book by ID

`GET /book/{id}`

## Setup

1. Create a database in PostgreSQL named `jba_learning`.
2. Open `src/main/resources/application.properties` and update your credentials:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/jba_learning
spring.datasource.username=your_username
spring.datasource.password=your_password

```


3. Run the application via your IDE or use:
```bash
mvn spring-boot:run

```
