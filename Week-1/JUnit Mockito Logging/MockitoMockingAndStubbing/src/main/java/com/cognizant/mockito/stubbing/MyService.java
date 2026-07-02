package com.cognizant.mockito.stubbing;

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
     *
     * @return the fetched data
     */
    public String fetchData() {
        return externalApi.getData();
    }
}
