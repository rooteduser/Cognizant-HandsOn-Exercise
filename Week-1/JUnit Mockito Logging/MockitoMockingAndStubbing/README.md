# Exercise 1: Mocking and Stubbing

## Objective
To test a service that depends on an external API by using Mockito to mock the external API and stub its methods.

## Concepts Used
- **Testing Framework:** JUnit 5 (Jupiter)
- **Mocking Framework:** Mockito
- **Mocking Concepts:** Mocking objects, stubbing methods (`when().thenReturn()`)

## Approach
1. **Project Setup:** Created a standard Maven project structure with dependencies for JUnit 5 and Mockito (`mockito-core`, `mockito-junit-jupiter`).
2. **Application Code:** Created an `ExternalApi` interface and a `MyService` class that depends on it. The `MyService.fetchData()` method calls `externalApi.getData()`.
3. **Test Class:** Created a `MyServiceTest` class.
4. **Mocking and Stubbing Implementation:** 
   - Used `Mockito.mock(ExternalApi.class)` to create a mock instance of the external API.
   - Used `when(mockApi.getData()).thenReturn("Mock Data")` to stub the method, ensuring it returns predefined data instead of making a real external call.
   - Injected the mock object into `MyService` and used an assertion to verify that `fetchData()` correctly returns the mocked data.

## Files Included
- `pom.xml` - Maven configuration file with Mockito dependencies.
- `src/main/java/com/cognizant/mockito/stubbing/ExternalApi.java` - The external API interface.
- `src/main/java/com/cognizant/mockito/stubbing/MyService.java` - The class being tested.
- `src/test/java/com/cognizant/mockito/stubbing/MyServiceTest.java` - The JUnit test class demonstrating mocking and stubbing.

## How to Run
1. Open a terminal/command prompt and navigate to the `MockitoMockingAndStubbing` directory.
2. Execute the following Maven command:
   ```bash
   mvn test
   ```

## Expected Output
Running the tests should result in a successful build since the mocked external API behaves as stubbed:
```
[INFO] Running com.cognizant.mockito.stubbing.MyServiceTest
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
