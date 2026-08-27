package Behavioral.VisitorPattern.solution.TheConcreteElementsC;

import Behavioral.VisitorPattern.solution.TheElementContractB.ItemElement;
import Behavioral.VisitorPattern.solution.TheVisitorContractA.CartVisitor;

public class Liquor implements ItemElement {
    private final double price;

    public Liquor(double price) { this.price = price; }
    public double getPrice() { return price; }

    @Override
    public double accept(CartVisitor visitor) {
        return visitor.visit(this);
    }
}
