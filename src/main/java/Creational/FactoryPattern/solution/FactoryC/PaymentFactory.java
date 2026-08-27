package Creational.FactoryPattern.solution.FactoryC;

import Creational.FactoryPattern.solution.ContractA.PaymentStrategy;
import Creational.FactoryPattern.solution.StrategiesB.ApplePayStrategy;
import Creational.FactoryPattern.solution.StrategiesB.CreditCardStrategy;
import Creational.FactoryPattern.solution.StrategiesB.PayPalStrategy;

public class PaymentFactory {

    // It is usually a static method.
    // We pass in a String, and it returns a fully built tool.
    public static PaymentStrategy createStrategy(String userInput) {

        // Modern Java switch statement
        return switch (userInput.toUpperCase()) {
            case "CREDIT_CARD" -> new CreditCardStrategy();
            case "PAYPAL" -> new PayPalStrategy();
            case "APPLE_PAY" -> new ApplePayStrategy();
            default -> throw new IllegalArgumentException("Invalid payment method: " + userInput);
        };
    }
}
