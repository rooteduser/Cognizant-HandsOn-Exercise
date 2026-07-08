package com.cognizant.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * JWT Authentication Service — Spring Boot entry point.
 *
 * Mandatory Exercise: Create authentication service that returns JWT
 *
 * How to test:
 *   1. Start the application (runs on port 8081)
 *   2. POST http://localhost:8081/api/auth/login
 *      Body: { "username": "admin", "password": "password123" }
 *      → Returns: { "token": "<JWT>" }
 *   3. GET http://localhost:8081/api/resource
 *      Header: Authorization: Bearer <token>
 *      → Returns: Hello, admin! You have access to this secured resource.
 */
@SpringBootApplication
public class JwtAuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtAuthServiceApplication.class, args);
    }
}
