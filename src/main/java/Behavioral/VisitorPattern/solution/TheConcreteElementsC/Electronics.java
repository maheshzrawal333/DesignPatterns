package Behavioral.VisitorPattern.solution.TheConcreteElementsC;

import Behavioral.VisitorPattern.solution.TheElementContractB.ItemElement;
import Behavioral.VisitorPattern.solution.TheVisitorContractA.CartVisitor;

public class Electronics implements ItemElement {
    private final double price;
    private final double weightInKg;

    public Electronics(double price, double weightInKg) { this.price = price; this.weightInKg = weightInKg; }
    public double getPrice() { return price; }
    public double getWeight() { return weightInKg; }

    @Override
    public double accept(CartVisitor visitor) {
        // "Welcome, Visitor! Run your Electronics logic on me!"
        return visitor.visit(this);
    }
}
