package EcommerceSearchExample;

// import java.util.Arrays;

public class SearchAlgorithms {

    /**
     * Linear Search: Scans every element sequentially.
     * Works on unsorted or sorted arrays.
     */
    public static Product linearSearch(Product[] products, String targetId) {
        for (Product product : products) {
            if (product.getProductId().equals(targetId)) {
                return product; // Element found
            }
        }
        return null; // Element not found
    }

    /**
     * Binary Search: Divid-and-conquer approach.
     * CRITICAL: Requires the array to be sorted by productId beforehand.
     */
    public static Product binarySearch(Product[] sortedProducts, String targetId) {
        int left = 0;
        int right = sortedProducts.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = sortedProducts[mid].getProductId().compareTo(targetId);

            if (comparison == 0) {
                return sortedProducts[mid]; // Element found
            } else if (comparison < 0) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }
        return null; // Element not found
    }
}