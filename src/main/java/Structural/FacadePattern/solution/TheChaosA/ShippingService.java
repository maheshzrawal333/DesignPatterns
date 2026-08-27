package Structural.FacadePattern.solution.TheChaosA;

public class ShippingService {
    public void shipItem(String productId, String address) {
        System.out.println("[Shipping] Generating label and shipping " + productId + " to " + address);
    }
}
