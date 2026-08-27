package Creational.FactoryPattern.solution.StrategiesB;

import Creational.FactoryPattern.solution.ContractA.PaymentStrategy;

public class PayPalStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Redirecting to PayPal for $" + amount);
    }
}
