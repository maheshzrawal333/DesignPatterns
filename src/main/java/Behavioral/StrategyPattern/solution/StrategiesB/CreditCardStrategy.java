package Behavioral.StrategyPattern.solution.StrategiesB;

import Behavioral.StrategyPattern.solution.ContractA.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Processing credit card for $" + amount);
    }
}
