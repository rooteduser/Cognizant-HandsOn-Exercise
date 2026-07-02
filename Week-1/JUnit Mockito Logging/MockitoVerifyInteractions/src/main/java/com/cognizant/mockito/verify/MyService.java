package com.cognizant.mockito.verify;

/**
 * A service that depends on the ExternalApi.
 */
public class MyService {
    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    /**
     * Fetches data using the external API.
     */
    public void fetchData() {
        // Calls the external API
        externalApi.getData();
    }
}
