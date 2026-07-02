package com.cognizant.mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;

/**
 * A test class demonstrating Mockito verify interactions.
 */
public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // 1. Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        
        // 2. Call the method with specific arguments (in this case, just call the service method)
        MyService service = new MyService(mockApi);
        service.fetchData();
        
        // 3. Verify the interaction - verify that getData() was called on the mockApi exactly once
        verify(mockApi).getData();
    }
}
