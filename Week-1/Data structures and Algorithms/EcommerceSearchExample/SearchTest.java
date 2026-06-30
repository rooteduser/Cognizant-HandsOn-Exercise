package EcommerceSearchExample;

import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {
    public static void main(String[] args) {
        // Setup mock e-commerce product database
        Product[] products = {
            new Product("P105", "Wireless Mouse", "Electronics"),
            new Product("P101", "Mechanical Keyboard", "Electronics"),
            new Product("P104", "Gaming Headset", "Electronics"),
            new Product("P102", "Leather Wallet", "Accessories"),
            new Product("P103", "Running Shoes", "Footwear")
        };

        // String targetId = "String to find: P104";
        // Let's clean up the search key to match actual IDs
        String cleanTargetId = "P104";

        System.out.println("=== 1. Linear Search (Unsorted Array) ===");
        Product resultLinear = SearchAlgorithms.linearSearch(products, cleanTargetId);
        System.out.println("Result: " + (resultLinear != null ? resultLinear : "Product Not Found"));

        System.out.println("\n=== 2. Preparing Array for Binary Search ===");
        // Sorting the array by Product ID alphabetically using a Lambda comparator
        Arrays.sort(products, Comparator.comparing(Product::getProductId));
        System.out.println("Sorted Database IDs: " + Arrays.stream(products).map(Product::getProductId).toList());

        System.out.println("\n=== 3. Binary Search (Sorted Array) ===");
        Product resultBinary = SearchAlgorithms.binarySearch(products, cleanTargetId);
        System.out.println("Result: " + (resultBinary != null ? resultBinary : "Product Not Found"));
    }
}