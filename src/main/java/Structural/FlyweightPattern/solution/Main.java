package Structural.FlyweightPattern.solution;

import Structural.FlyweightPattern.solution.TheContextC.Tree;
import Structural.FlyweightPattern.solution.TheFlyweightA.TreeType;
import Structural.FlyweightPattern.solution.TheFlyweightFactoryB.TreeFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Tree> forest = new ArrayList<>();

        System.out.println("--- Planting the Forest ---");

        // Planting 3 Oak Trees
        TreeType oakType1 = TreeFactory.getTreeType("Oak", "Green", "[1MB Oak Mesh]");
        forest.add(new Tree(10, 20, oakType1));

        TreeType oakType2 = TreeFactory.getTreeType("Oak", "Green", "[1MB Oak Mesh]");
        forest.add(new Tree(15, 30, oakType2));

        TreeType oakType3 = TreeFactory.getTreeType("Oak", "Green", "[1MB Oak Mesh]");
        forest.add(new Tree(25, 45, oakType3));

        // Planting 2 Pine Trees
        TreeType pineType1 = TreeFactory.getTreeType("Pine", "Dark Green", "[1.5MB Pine Mesh]");
        forest.add(new Tree(100, 200, pineType1));

        TreeType pineType2 = TreeFactory.getTreeType("Pine", "Dark Green", "[1.5MB Pine Mesh]");
        forest.add(new Tree(120, 250, pineType2));

        System.out.println("\n--- Rendering the Forest ---");
        for (Tree tree : forest) {
            tree.draw();
        }

        System.out.println("\n--- Memory Analysis ---");
        System.out.println("Total Trees in RAM: " + forest.size());
        System.out.println("Total Heavy 3D Models in RAM: 2"); // We saved 3 Megabytes of RAM just on 5 trees!
    }
}