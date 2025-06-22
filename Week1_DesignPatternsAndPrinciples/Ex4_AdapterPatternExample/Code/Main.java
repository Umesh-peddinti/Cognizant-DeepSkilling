package Week1_DesignPatternsAndPrinciples.Ex4_AdapterPatternExample.Code;

public class Main {
    public static void main(String[] args) {
        // Create gateways
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        // Create adapters
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);

        // Process payments using common interface
        payPalProcessor.processPayment(890.0);
        stripeProcessor.processPayment(308.0);
    }
}