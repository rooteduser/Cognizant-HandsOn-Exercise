# Exercise 3: Assertions in JUnit

## Objective
To write unit tests that utilize various JUnit assertions to validate test results and conditions correctly.

## Concepts Used
- **Testing Framework:** JUnit 5 (Jupiter)
- **Build Tool:** Apache Maven
- **Assertions:** `assertEquals`, `assertTrue`, `assertFalse`, `assertNull`, `assertNotNull`

## Approach
1. **Project Setup:** Created a standard Maven project structure.
2. **Dependency Management:** Configured the `pom.xml` to include the `junit-jupiter-engine` dependency.
3. **Test Class:** Created an `AssertionsTest` class in the test source directory.
4. **Assertions Implementation:** Wrote a test method `testAssertions()` using:
   - `assertEquals` to check if expected and actual values match.
   - `assertTrue` to check if a condition evaluates to true.
   - `assertFalse` to check if a condition evaluates to false.
   - `assertNull` to check if an object reference is null.
   - `assertNotNull` to check if an object reference is not null.

## Files Included
- `pom.xml` - Maven configuration file.
- `src/test/java/com/cognizant/junit/assertions/AssertionsTest.java` - The JUnit test class demonstrating assertions.

## How to Run
This is a standard Maven project. You can run the tests using an IDE (Eclipse, IntelliJ IDEA) by right-clicking the test class and selecting **Run As -> JUnit Test**, or via the command line:

1. Open a terminal/command prompt and navigate to the `JUnitAssertions` directory.
2. Execute the following Maven command:
   ```bash
   mvn test
   ```

## Expected Output
Running the test class should result in a successful build with all assertions passing:
```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.cognizant.junit.assertions.AssertionsTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: ... s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```
