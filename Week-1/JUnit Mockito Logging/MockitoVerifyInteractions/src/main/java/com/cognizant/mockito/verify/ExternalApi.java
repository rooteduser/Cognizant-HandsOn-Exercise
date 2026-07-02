package com.cognizant.mockito.verify;

/**
 * An external API interface that will be mocked.
 */
public interface ExternalApi {
    /**
     * Fetches data from the external API.
     *
     * @return the fetched data
     */
    String getData();
}
