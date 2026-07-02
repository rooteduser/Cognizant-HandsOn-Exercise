package com.cognizant.junit.setup;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A simple test class to verify that JUnit is set up correctly.
 */
public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        
        // Assert that the result of 2 + 3 is 5
        assertEquals(5, result, "2 + 3 should equal 5");
    }
}
