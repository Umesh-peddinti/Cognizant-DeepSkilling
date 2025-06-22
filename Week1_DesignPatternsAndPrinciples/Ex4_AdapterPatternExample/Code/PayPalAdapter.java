package Week1_DesignPatternsAndPrinciples.Ex4_AdapterPatternExample.Code;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Adapt processPayment() to sendPayment()
        payPalGateway.sendPayment(amount);
    }
}