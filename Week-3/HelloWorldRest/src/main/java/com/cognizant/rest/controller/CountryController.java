package com.cognizant.rest.controller;

import com.cognizant.rest.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * REST Controller implementing all mandatory Spring REST hands-on exercises.
 *
 * Exercise: Hello World RESTful Web Service
 * Exercise: REST - Country Web Service
 * Exercise: REST - Get country based on country code
 */
@RestController
@RequestMapping("/api")
public class CountryController {

    // In-memory data store (no database needed for this exercise)
    private final List<Country> countries = Arrays.asList(
            new Country("IN", "India", "New Delhi"),
            new Country("US", "United States", "Washington D.C."),
            new Country("UK", "United Kingdom", "London"),
            new Country("AU", "Australia", "Canberra"),
            new Country("DE", "Germany", "Berlin")
    );

    /**
     * Exercise: Hello World RESTful Web Service
     * GET /api/hello
     */
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World! Welcome to Spring REST.";
    }

    /**
     * Exercise: REST - Country Web Service
     * GET /api/countries — returns the full list of countries as JSON
     */
    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countries;
    }

    /**
     * Exercise: REST - Get country based on country code
     * GET /api/countries/{code} — returns a single country or 404 message
     */
    @GetMapping("/countries/{code}")
    public Object getCountryByCode(@PathVariable String code) {
        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .map(c -> (Object) c)
                .orElse("Country not found for code: " + code.toUpperCase());
    }
}
