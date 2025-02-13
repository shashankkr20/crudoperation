# UserController - Spring Boot CRUD API

## Overview
This package `com.example.springcrud.controller` contains the `UserController` class, which manages user-related operations in a Spring Boot application. The controller provides RESTful APIs for user CRUD operations, utilizing Swagger annotations for API documentation.

## Endpoints

### 1. Get All Users
- **URL:** `/user/getuser`
- **Method:** `GET`
- **Description:** Fetches all users from the system.
- **Response:** Returns a list of `User` objects.

### 2. Get User by ID
- **URL:** `/user/getone/{id}`
- **Method:** `GET`
- **Description:** Retrieves a user by their unique ID.
- **Path Variable:** `id` (Integer) - The ID of the user.
- **Response:** Returns a `User` object.

### 3. Add a New User
- **URL:** `/user/adduser`
- **Method:** `POST`
- **Description:** Adds a new user to the system.
- **Request Body:** `User` object containing user details.
- **Response:** Returns a success message.

### 4. Update an Existing User
- **URL:** `/user/update/{id}`
- **Method:** `PUT`
- **Description:** Updates user details based on ID.
- **Path Variable:** `id` (Integer) - The ID of the user to update.
- **Request Body:** `User` object with updated details.
- **Response:** Returns a success message.

## Annotations Used
- `@RestController` - Marks the class as a RESTful controller.
- `@RequestMapping("/user")` - Defines the base path for all endpoints.
- `@CrossOrigin(origins = "*")` - Enables cross-origin requests.
- `@Autowired` - Injects `UserServiceimpl` for handling business logic.
- `@GetMapping`, `@PostMapping`, `@PutMapping` - Maps HTTP methods to corresponding API endpoints.
- `@PathVariable` - Extracts path parameters from the URL.
- `@RequestBody` - Maps request bodies to Java objects.
- `@Tag`, `@Operation` - Used for API documentation with Swagger.

## Dependencies Required
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- MySQL Driver
- Swagger (Springdoc OpenAPI)

## Setup Instructions
1. Ensure MySQL is running and update `application.yml` with correct credentials.
2. Run the Spring Boot application.
3. Access Swagger UI at: `http://localhost:8081/swagger-ui.html`
4. Test the API endpoints using Postman or Swagger UI.

---

### Author
Developed by **Shashank Kumar**

For further queries, contact: [GitHub](https://github.com/shashankkr20) | [LinkedIn](https://linkedin.com/in/shashank-kumar-4b6a80206)

