package Behavioral.StrategyPattern.problem;

public class CheckoutService {

    public void processPayment(String paymentType, double amount) {
        // TRAP: Every time the company adds a new payment method,
        // you have to open this file and add another IF statement!
        if (paymentType.equals("CREDIT_CARD")) {
            System.out.println("Processing credit card for $" + amount);
            // 50 lines of credit card logic
        } else if (paymentType.equals("PAYPAL")) {
            System.out.println("Redirecting to PayPal for $" + amount);
            // 50 lines of PayPal logic
        } else if (paymentType.equals("APPLE_PAY")) {
            System.out.println("Pinging Apple device for $" + amount);
            // 50 lines of Apple Pay logic
        } else {
            throw new IllegalArgumentException("Unknown payment method");
        }
    }
}
