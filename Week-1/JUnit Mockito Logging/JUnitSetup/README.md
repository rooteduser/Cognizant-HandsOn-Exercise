# Exercise 1: Setting Up JUnit

## Objective
To set up JUnit in a Java project and write a basic unit test to ensure that the testing framework is correctly configured.

## Concepts Used
- **Testing Framework:** JUnit 5 (Jupiter)
- **Build Tool:** Apache Maven
- **Java Basics:** Classes, Methods
- **Unit Testing Concepts:** Test methods, Assertions (`assertEquals`)

## Approach
1. **Project Setup:** Created a standard Maven project structure with `src/main/java` and `src/test/java`.
2. **Dependency Management:** Configured the `pom.xml` to include the `junit-jupiter-engine` dependency and configured the `maven-surefire-plugin` to enable running tests via Maven.
3. **Application Code:** Created a simple `Calculator` class with an `add` method to serve as the subject under test.
4. **Test Class:** Created a `CalculatorTest` class in the test source directory, annotated a test method with `@Test`, and used `assertEquals` to verify that `2 + 3` equals `5`.

## Files Included
- `pom.xml` - Maven configuration file containing the JUnit 5 dependency.
- `src/main/java/com/cognizant/junit/setup/Calculator.java` - The class being tested.
- `src/test/java/com/cognizant/junit/setup/CalculatorTest.java` - The JUnit test class.

## How to Run
This is a standard Maven project. You can run the tests using any IDE (Eclipse, IntelliJ IDEA) by right-clicking the test class and selecting **Run As -> JUnit Test**, or you can run it via the command line using Maven:

1. Open a terminal/command prompt and navigate to the `JUnitSetup` directory.
2. Execute the following Maven command:
   ```bash
   mvn test
   ```

## Expected Output
```
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.cognizant.junit:junit-setup >--------------------
[INFO] Building junit-setup 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
...
[INFO] --- maven-surefire-plugin:3.1.2:test (default-test) @ junit-setup ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.cognizant.junit.setup.CalculatorTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.05 s - in com.cognizant.junit.setup.CalculatorTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```
