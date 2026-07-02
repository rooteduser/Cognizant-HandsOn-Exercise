# Difference between JPA, Hibernate and Spring Data JPA

## JPA (Java Persistence API)
- JPA is a specification or standard for Object-Relational Mapping (ORM) in Java.
- It defines a set of interfaces and annotations (like `@Entity`, `@Id`) but does not provide the actual implementation.
- It provides a standardized way to handle relational data in Java applications.

## Hibernate
- Hibernate is a popular ORM framework that implements the JPA specification.
- It provides the actual code that translates Java objects into database tables and vice versa.
- You can use Hibernate without JPA, but using it as a JPA provider ensures your code remains standardized.

## Spring Data JPA
- Spring Data JPA is an abstraction layer built on top of JPA (and typically Hibernate).
- It simplifies data access by allowing you to define repository interfaces (e.g., `interface UserRepository extends JpaRepository<User, Long>`).
- It automatically generates the implementation for these interfaces at runtime, saving you from writing boilerplate CRUD and query methods.
