# Pet Management System

This is a simple Pet Management System developed using Java and Spring Boot framework. It allows users to perform CRUD operations on pets.

## APIs

### Get All Pets
- **URL**: `/pets/`
- **Method**: GET
- **Description**: Retrieve a list of all pets stored in the system.

### Get Pet by ID
- **URL**: `/pets/{id}`
- **Method**: GET
- **Description**: Retrieve a pet by its unique identifier.

### Add New Pet
- **URL**: `/pets/`
- **Method**: POST
- **Description**: Add a new pet to the system.

### Update Pet
- **URL**: `/pets/{id}`
- **Method**: PUT
- **Description**: Update details of an existing pet.

### Delete Pet
- **URL**: `/pets/{id}`
- **Method**: DELETE
- **Description**: Delete a pet from the system.

## Dependencies
- **Spring Web**: Framework for building web applications.
- **Java Persistence API (JPA)**: Standard for managing relational data in Java applications.
- **H2 Database**: Lightweight, in-memory database for development and testing purposes.


## Usage
1. Access the APIs using a REST client like Postman or any web browser.
2. Use the provided endpoints to perform CRUD operations on pets.

