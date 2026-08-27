package Structural.FacadePattern.solution.TheChaosA;

public class InventoryService {
    public boolean checkStock(String productId) {
        System.out.println("[Inventory] Checking stock for: " + productId + "... Available!");
        return true;
    }
}
