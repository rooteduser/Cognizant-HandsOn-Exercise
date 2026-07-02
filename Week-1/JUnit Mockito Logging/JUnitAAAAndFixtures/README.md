# Exercise 4: Arrange-Act-Assert (AAA) Pattern and Test Fixtures

## Objective
To organize JUnit tests using the Arrange-Act-Assert (AAA) pattern for better readability and structure, and to utilize test fixtures (setup and teardown methods) to manage the test environment state.

## Concepts Used
- **Testing Framework:** JUnit 5 (Jupiter)
- **AAA Pattern:** 
  - **Arrange:** Initialize objects and set the value of the data that is passed to the method under test.
  - **Act:** Invoke the method under test with the arranged parameters.
  - **Assert:** Verify that the action of the method under test behaves as expected.
- **Test Fixtures:** 
  - `@BeforeEach` (replaces JUnit 4's `@Before`): Executed before each test method to initialize the environment (e.g., instantiate an object).
  - `@AfterEach` (replaces JUnit 4's `@After`): Executed after each test method to clean up the environment (e.g., clear resources).

## Approach
1. **Project Setup:** Created a standard Maven project structure.
2. **Application Code:** Created a `ShoppingCart` class with an `addItem` method and an `getItemCount` method.
3. **Test Class:** Created a `ShoppingCartTest` class.
4. **Test Fixtures Implementation:** Added a `setUp` method annotated with `@BeforeEach` to initialize the `ShoppingCart` instance before every test, and a `tearDown` method annotated with `@AfterEach` to clear it.
5. **AAA Pattern Implementation:** Wrote a test method `testAddItem_UsingAAAPattern` explicitly divided into `Arrange`, `Act`, and `Assert` sections using comments to demonstrate the structure.

## Files Included
- `pom.xml` - Maven configuration file.
- `src/main/java/com/cognizant/junit/aaa/ShoppingCart.java` - The class being tested.
- `src/test/java/com/cognizant/junit/aaa/ShoppingCartTest.java` - The JUnit test class demonstrating AAA and fixtures.

## How to Run
1. Open a terminal/command prompt and navigate to the `JUnitAAAAndFixtures` directory.
2. Execute the following Maven command:
   ```bash
   mvn test
   ```

## Expected Output
When running the tests, the setup and teardown print statements will show the lifecycle:
```
[INFO] Running com.cognizant.junit.aaa.ShoppingCartTest
Setting up the test fixture...
Tearing down the test fixture...
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: ... s
```
