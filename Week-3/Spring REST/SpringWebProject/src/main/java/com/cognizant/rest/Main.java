package com.cognizant.rest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Exercise: Spring Core – Load Country from Spring Configuration XML
 *
 * Demonstrates creating a Spring application context from an XML configuration
 * file and loading a Country bean defined in applicationContext.xml.
 */
public class Main {

    public static void main(String[] args) {
        // Load Spring application context from XML config file
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the 'country' bean defined in XML
        Country country = context.getBean("country", Country.class);

        System.out.println("=== Spring Core – Load Country from XML Config ===");
        System.out.println("Country loaded from Spring context:");
        System.out.println(country);
    }
}
