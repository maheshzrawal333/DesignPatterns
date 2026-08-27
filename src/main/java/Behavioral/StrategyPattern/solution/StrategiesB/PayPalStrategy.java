package Behavioral.StrategyPattern.solution.StrategiesB;

import Behavioral.StrategyPattern.solution.ContractA.PaymentStrategy;

public class PayPalStrategy implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Redirecting to PayPal for $" + amount);
    }
}
