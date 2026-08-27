package Structural.FlyweightPattern.solution.TheContextC;

import Structural.FlyweightPattern.solution.TheFlyweightA.TreeType;

public class Tree {

    // The Unique Data
    private final int x;
    private final int y;

    // The Shared Data (Pointer to the Flyweight)
    private final TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        // Delegate the heavy rendering to the shared Flyweight, passing in the unique coordinates!
        type.draw(x, y);
    }
}