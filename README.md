# 📚 Full-Stack Book Library Application

A full-stack web application designed to manage a book collection. Built as a hands-on project to learn enterprise Java backends, RESTful API design, and full-stack integration.

---

## 🚀 Tech Stack

* **Backend:** Java 21, Spring Boot 3.x, Spring Data JPA (Hibernate)
* **Database:** H2 Database (In-Memory)
* **API Documentation:** Springdoc OpenAPI (Swagger UI)
* **Frontend:** HTML5, CSS3, Vanilla JavaScript (Fetch API)
* **Build Tool:** Maven

---

## ✨ Features

* **Complete CRUD Operations:**
  * **Create:** Add new books with title, author, and publication year.
  * **Read:** View a live-updated list of all books in the library collection.
  * **Update:** Edit existing book records dynamically via an interactive form.
  * **Delete:** Remove books from the collection instantly.
* **RESTful Architecture:** Clean separation of concerns between Controller, Repository, and Model layers.
* **Interactive API Docs:** Built-in Swagger UI for testing endpoints directly.

---

## 🔌 API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/books` | Retrieve all books |
| `GET` | `/api/books/{id}` | Retrieve a specific book by ID |
| `POST` | `/api/books` | Add a new book |
| `PUT` | `/api/books/{id}` | Update an existing book |
| `DELETE` | `/api/books/{id}` | Delete a book by ID |

---

## Outcome
✨ Designing and implementing RESTful APIs using Spring Boot and Spring MVC.
✨ Managing database entities and repositories using Spring Data JPA.
✨ Handling asynchronous HTTP requests (fetch, GET, POST, PUT, DELETE) between a vanilla JavaScript frontend and a Java backend.
✨ Managing build lifecycles, dependencies, and configuration via Maven and application.properties.

---