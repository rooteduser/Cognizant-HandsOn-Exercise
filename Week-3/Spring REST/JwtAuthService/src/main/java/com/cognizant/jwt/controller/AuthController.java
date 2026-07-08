package com.cognizant.jwt.controller;

import com.cognizant.jwt.model.AuthRequest;
import com.cognizant.jwt.model.AuthResponse;
import com.cognizant.jwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for JWT Authentication.
 *
 * Exercise: Create authentication service that returns JWT
 *
 * POST /api/auth/login  — accepts username/password, returns JWT on success
 * GET  /api/resource    — example secured endpoint (shows token-based access)
 */
@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    // Hardcoded credentials for demonstration (no DB needed for this exercise)
    private static final String VALID_USER = "admin";
    private static final String VALID_PASS = "password123";

    /**
     * Authentication endpoint.
     * POST /api/auth/login
     * Body: { "username": "admin", "password": "password123" }
     * Returns: { "token": "<JWT>" }
     */
    @PostMapping("/auth/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest request) {
        if (VALID_USER.equals(request.getUsername())
                && VALID_PASS.equals(request.getPassword())) {
            String token = jwtUtil.generateToken(request.getUsername());
            return ResponseEntity.ok(new AuthResponse(token));
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("Invalid username or password.");
    }

    /**
     * Example endpoint to demonstrate JWT validation.
     * GET /api/resource
     * Header: Authorization: Bearer <token>
     */
    @GetMapping("/resource")
    public ResponseEntity<String> securedResource(
            @RequestHeader(value = "Authorization", required = false) String authHeader) {

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Missing or invalid Authorization header.");
        }

        String token = authHeader.substring(7);
        try {
            String username = jwtUtil.extractUsername(token);
            if (jwtUtil.validateToken(token, username)) {
                return ResponseEntity.ok("Hello, " + username + "! You have access to this secured resource.");
            }
        } catch (Exception e) {
            // Token invalid or expired
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid or expired JWT token.");
    }
}
