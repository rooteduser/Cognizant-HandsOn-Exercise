# JwtAuthService — Spring REST JWT Handson 5

## Exercise Covered
- **Create authentication service that returns JWT**

## How to Run
```bash
mvn spring-boot:run
```
Application starts on **http://localhost:8081**

## Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| POST | `/api/auth/login` | Authenticate and receive a JWT |
| GET | `/api/resource` | Access secured resource using Bearer token |

## How to Test

### Step 1 — Login and get a token
```
POST http://localhost:8081/api/auth/login
Content-Type: application/json

{
  "username": "admin",
  "password": "password123"
}
```
**Response:**
```json
{ "token": "eyJhbGciOiJIUzI1NiJ9..." }
```

### Step 2 — Access secured resource
```
GET http://localhost:8081/api/resource
Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...
```
**Response:**
```
Hello, admin! You have access to this secured resource.
```

## Dependencies
- Spring Boot Web
- Spring Security
- JJWT (io.jsonwebtoken) 0.11.5
