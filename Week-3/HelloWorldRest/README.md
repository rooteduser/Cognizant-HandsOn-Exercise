# HelloWorldRest — Spring REST Handson 2

## Exercises Covered
- **Hello World RESTful Web Service**
- **REST - Country Web Service**
- **REST - Get country based on country code**

## How to Run
```bash
mvn spring-boot:run
```
Application starts on **http://localhost:8080**

## Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | `/api/hello` | Returns "Hello, World!" |
| GET | `/api/countries` | Returns all countries as JSON |
| GET | `/api/countries/{code}` | Returns country by code (e.g. `/api/countries/IN`) |

## Sample Responses

**GET /api/hello**
```
Hello, World! Welcome to Spring REST.
```

**GET /api/countries**
```json
[
  { "code": "IN", "name": "India", "capital": "New Delhi" },
  { "code": "US", "name": "United States", "capital": "Washington D.C." },
  ...
]
```

**GET /api/countries/IN**
```json
{ "code": "IN", "name": "India", "capital": "New Delhi" }
```
