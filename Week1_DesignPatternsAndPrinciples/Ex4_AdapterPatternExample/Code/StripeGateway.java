package Week1_DesignPatternsAndPrinciples.Ex4_AdapterPatternExample.Code;

// Simulates an existing Stripe library
public class StripeGateway {
    public void makePayment(double amountInDollars) {
        System.out.println("Processing payment of $" + amountInDollars + " through Stripe.");
    }
}