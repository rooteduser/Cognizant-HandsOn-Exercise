package com.cognizant.junit.aaa;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple ShoppingCart class to be tested.
 */
public class ShoppingCart {
    private List<String> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds an item to the shopping cart.
     *
     * @param item the name of the item
     */
    public void addItem(String item) {
        if (item != null && !item.trim().isEmpty()) {
            items.add(item);
        }
    }

    /**
     * Returns the total number of items in the cart.
     *
     * @return item count
     */
    public int getItemCount() {
        return items.size();
    }

    /**
     * Empties the cart.
     */
    public void clear() {
        items.clear();
    }
}
