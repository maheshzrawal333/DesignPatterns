package Structural.FacadePattern.solution.TheChaosA;

public class PaymentService {
    public boolean chargeCard(String cardNumber, double amount) {
        System.out.println("[Payment] Charging $" + amount + " to card " + cardNumber + "... Success!");
        return true;
    }
}
