package Week1_AlgorithmsAndDataStructures.Ex7_FinancialForecasting.Code;

public class FinancialForecast {

    /**
     * Recursive method to calculate future value.
     * @param principal Initial amount (P)
     * @param rate Annual growth rate (decimal, e.g., 0.05 for 5%)
     * @param years Number of years (n)
     * @return Future value
     */
    public double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal; // Base case: year 0 => principal
        }
        return calculateFutureValue(principal, rate, years - 1) * (1 + rate);
    }

    /**
     * Optimized version: iterative calculation (more efficient)
     */
    public double calculateFutureValueIterative(double principal, double rate, int years) {
        double futureValue = principal;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + rate);
        }
        return futureValue;
    }
}
