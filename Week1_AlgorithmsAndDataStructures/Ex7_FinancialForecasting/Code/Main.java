package Week1_AlgorithmsAndDataStructures.Ex7_FinancialForecasting.Code;


public class Main {
    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast();

        double principal = 1000.0; // initial investment
        double rate = 0.05; // 5% annual growth rate
        int years = 5;

        // Recursive method
        double futureValueRecursive = forecast.calculateFutureValue(principal, rate, years);
        System.out.printf("Future Value (Recursive): %.2f%n", futureValueRecursive);

        // Iterative method
        double futureValueIterative = forecast.calculateFutureValueIterative(principal, rate, years);
        System.out.printf("Future Value (Iterative): %.2f%n", futureValueIterative);
    }
}
