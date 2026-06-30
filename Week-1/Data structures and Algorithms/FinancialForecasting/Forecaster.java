// package FinancialForecasting;

import java.util.HashMap;
import java.util.Map;

public class Forecaster {

    /**
     * 1. Basic Recursive Approach
     * Formula: Future Value = Present Value * (1 + growthRate)^years
     * Time Complexity: O(N) where N is the number of years.
     */
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base Case: If years is 0, the value hasn't changed
        if (years == 0) {
            return presentValue;
        }
        
        // Recursive Call: Value next year is this year's value plus growth
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    /**
     * 2. Optimized Recursive Approach (Using Memoization / Map cache)
     * Avoids excessive recalculation if the tool is called repeatedly for the same years.
     * Time Complexity: O(N) for first calculation, O(1) for subsequent lookups.
     */
    private static Map<Integer, Double> cache = new HashMap<>();

    public static double calculateFutureValueOptimized(double presentValue, double growthRate, int years) {
        // Base Case
        if (years == 0) {
            return presentValue;
        }

        // Check if value is already computed for this year
        if (cache.containsKey(years)) {
            return cache.get(years);
        }

        // Calculate recursively and store in cache
        double result = calculateFutureValueOptimized(presentValue * (1 + growthRate), growthRate, years - 1);
        cache.put(years, result);
        
        return result;
    }
}