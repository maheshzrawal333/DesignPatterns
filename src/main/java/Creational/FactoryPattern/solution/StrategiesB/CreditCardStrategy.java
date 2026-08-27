package Creational.FactoryPattern.solution.StrategiesB;

import Creational.FactoryPattern.solution.ContractA.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card for $" + amount);
    }
}
