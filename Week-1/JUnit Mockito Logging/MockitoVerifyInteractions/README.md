# Exercise 2: Verifying Interactions

## Objective
To ensure that a service method calls the expected method on its dependent object by using Mockito's `verify` functionality.

## Concepts Used
- **Testing Framework:** JUnit 5 (Jupiter)
- **Mocking Framework:** Mockito
- **Mocking Concepts:** Creating mock objects, verifying interactions (`Mockito.verify()`)

## Approach
1. **Project Setup:** Created a standard Maven project structure with dependencies for JUnit 5 and Mockito.
2. **Application Code:** 
   - Created an `ExternalApi` interface with a `getData()` method.
   - Created a `MyService` class that has a dependency on `ExternalApi`. The `MyService.fetchData()` method calls `externalApi.getData()`.
3. **Test Class:** Created a `MyServiceTest` class.
4. **Verifying Interactions Implementation:** 
   - Used `Mockito.mock(ExternalApi.class)` to create a mock instance of the external API.
   - Injected the mock object into `MyService` and called `service.fetchData()`.
   - Used `verify(mockApi).getData()` to assert that the `getData()` method was indeed invoked on the mock object exactly once during the execution of `fetchData()`.

## Files Included
- `pom.xml` - Maven configuration file with Mockito dependencies.
- `src/main/java/com/cognizant/mockito/verify/ExternalApi.java` - The external API interface.
- `src/main/java/com/cognizant/mockito/verify/MyService.java` - The class being tested.
- `src/test/java/com/cognizant/mockito/verify/MyServiceTest.java` - The JUnit test class demonstrating interaction verification.

## How to Run
1. Open a terminal/command prompt and navigate to the `MockitoVerifyInteractions` directory.
2. Execute the following Maven command:
   ```bash
   mvn test
   ```

## Expected Output
Running the tests should result in a successful build since the interaction occurred as expected:
```
[INFO] Running com.cognizant.mockito.verify.MyServiceTest
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
