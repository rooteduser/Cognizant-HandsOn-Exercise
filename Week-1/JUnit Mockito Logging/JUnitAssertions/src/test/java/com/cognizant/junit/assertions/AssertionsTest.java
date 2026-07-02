package com.cognizant.junit.assertions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A test class demonstrating various JUnit assertions.
 */
public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals - verifies that the expected and actual values are equal
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");

        // Assert true - verifies that the condition is true
        assertTrue(5 > 3, "5 should be greater than 3");

        // Assert false - verifies that the condition is false
        assertFalse(5 < 3, "5 should not be less than 3");

        // Assert null - verifies that the object reference is null
        String nullString = null;
        assertNull(nullString, "The string reference should be null");

        // Assert not null - verifies that the object reference is not null
        Object nonNullObject = new Object();
        assertNotNull(nonNullObject, "The object reference should not be null");
    }
}
