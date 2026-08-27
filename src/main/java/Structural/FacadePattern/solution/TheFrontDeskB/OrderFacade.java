package Structural.FacadePattern.solution.TheFrontDeskB;

import Structural.FacadePattern.solution.TheChaosA.InventoryService;
import Structural.FacadePattern.solution.TheChaosA.PaymentService;
import Structural.FacadePattern.solution.TheChaosA.ShippingService;

public class OrderFacade {

    // The Facade holds all the complex tools
    private final InventoryService inventory;
    private final PaymentService payment;
    private final ShippingService shipping;

    public OrderFacade() {
        this.inventory = new InventoryService();
        this.payment = new PaymentService();
        this.shipping = new ShippingService();
    }

    // The single, simple door to the complex system
    public void placeOrder(String productId, String cardNumber, double amount, String address) {
        System.out.println("--- Starting Order Process via Facade ---");

        // The Facade handles the exact required order of operations!
        if (inventory.checkStock(productId)) {
            if (payment.chargeCard(cardNumber, amount)) {
                shipping.shipItem(productId, address);
                System.out.println("--- Order Completely Successfully ---");
            } else {
                System.out.println("Order failed at payment.");
            }
        } else {
            System.out.println("Order failed. Item out of stock.");
        }
    }
}
