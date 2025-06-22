package Week1_DesignPatternsAndPrinciples.Ex8_StrategyPatternExample.Code;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.pay(250.75);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.pay(99.99);
    }
}