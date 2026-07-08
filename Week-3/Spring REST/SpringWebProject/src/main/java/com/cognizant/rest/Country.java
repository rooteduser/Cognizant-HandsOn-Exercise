package com.cognizant.rest;

/**
 * Represents a Country entity with a country code and name.
 */
public class Country {

    private String code;
    private String name;
    private String capital;

    // Default constructor required by Spring XML config
    public Country() {}

    public Country(String code, String name, String capital) {
        this.code = code;
        this.name = name;
        this.capital = capital;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCapital() { return capital; }
    public void setCapital(String capital) { this.capital = capital; }

    @Override
    public String toString() {
        return "Country{code='" + code + "', name='" + name + "', capital='" + capital + "'}";
    }
}
