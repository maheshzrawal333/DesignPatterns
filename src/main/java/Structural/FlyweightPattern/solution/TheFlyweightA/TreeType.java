package Structural.FlyweightPattern.solution.TheFlyweightA;

public class TreeType {

    // The Heavy, Shared Data
    private final String name;
    private final String color;
    private final String heavy3DModel;

    public TreeType(String name, String color, String heavy3DModel) {
        this.name = name;
        this.color = color;
        this.heavy3DModel = heavy3DModel;
    }

    // The Flyweight accepts the Extrinsic state (x, y) as arguments when it's time to do work!
    public void draw(int x, int y) {
        System.out.println("Rendering [" + name + " Tree] at coordinates (" + x + ", " + y + ") using heavy 3D model.");
    }
}
