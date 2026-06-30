// package Week-1.Data structure and Algorithms.FinancialForecasting;

public class ForecastingTest {
    public static void main(String[] args) {
        double initialInvestment = 1000.0; // $1,000 principal
        double annualGrowthRate = 0.05;    // 5% growth rate
        int forecastingPeriod = 10;        // Predict 10 years into the future

        System.out.println("=== Financial Forecasting Tool ===");
        System.out.println("Initial Value: $" + initialInvestment);
        System.out.println("Growth Rate: " + (annualGrowthRate * 100) + "%");
        System.out.println("Period: " + forecastingPeriod + " years\n");

        // Execute basic recursion
        long startTime = System.nanoTime();
        double basicResult = Forecaster.calculateFutureValue(initialInvestment, annualGrowthRate, forecastingPeriod);
        long endTime = System.nanoTime();
        System.out.printf("Basic Recursion Result: $%.2f (Time: %d ns)%n", basicResult, (endTime - startTime));

        // Execute optimized memoized recursion
        startTime = System.nanoTime();
        double optimizedResult = Forecaster.calculateFutureValueOptimized(initialInvestment, annualGrowthRate, forecastingPeriod);
        endTime = System.nanoTime();
        System.out.printf("Optimized Recursion Result: $%.2f (Time: %d ns)%n", optimizedResult, (endTime - startTime));
    }
}