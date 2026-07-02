package com.cognizant.junit.aaa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A test class demonstrating the AAA pattern and setup/teardown fixtures.
 */
public class ShoppingCartTest {

    // Test Fixture
    private ShoppingCart cart;

    /**
     * Setup method executed before each test method.
     */
    @BeforeEach
    public void setUp() {
        System.out.println("Setting up the test fixture...");
        cart = new ShoppingCart();
    }

    /**
     * Teardown method executed after each test method.
     */
    @AfterEach
    public void tearDown() {
        System.out.println("Tearing down the test fixture...");
        cart.clear();
        cart = null;
    }

    @Test
    public void testAddItem_UsingAAAPattern() {
        // Arrange (Setup the necessary data and preconditions)
        String itemToAdd = "Laptop";
        int initialCount = cart.getItemCount();
        
        // Act (Invoke the method under test)
        cart.addItem(itemToAdd);
        
        // Assert (Verify the outcome)
        int newCount = cart.getItemCount();
        assertEquals(initialCount + 1, newCount, "Cart should have one additional item after adding.");
    }
}
