package Behavioral.VisitorPattern.solution.TheConcreteElementsC;

import Behavioral.VisitorPattern.solution.TheElementContractB.ItemElement;
import Behavioral.VisitorPattern.solution.TheVisitorContractA.CartVisitor;

public class Grocery implements ItemElement {
    private final double price;

    public Grocery(double price) { this.price = price; }
    public double getPrice() { return price; }

    @Override
    public double accept(CartVisitor visitor) {
        return visitor.visit(this);
    }
}
