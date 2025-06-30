package Week1_DesignPatternsAndPrinciples.Ex8_StrategyPatternExample.Code;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Set strategy dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy not set!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}