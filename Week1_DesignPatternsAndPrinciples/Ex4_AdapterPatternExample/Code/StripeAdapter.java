package Week1_DesignPatternsAndPrinciples.Ex4_AdapterPatternExample.Code;

public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Adapt processPayment() to makePayment()
        stripeGateway.makePayment(amount);
    }
}