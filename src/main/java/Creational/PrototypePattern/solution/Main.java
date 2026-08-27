package Creational.PrototypePattern.solution;

import Creational.PrototypePattern.solution.TheConcretePrototypeB.OrcMonster;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- 1. Creating the Original Prototype (SLOW) ---");
        OrcMonster originalOrc = new OrcMonster("Orc Grunt", 100);
        originalOrc.printStats();

        System.out.println("\n--- 2. Cloning the Prototype (INSTANT) ---");
        // We do NOT use 'new OrcMonster()'. We just use the photocopier!
        OrcMonster clone1 = (OrcMonster) originalOrc.clone();
        clone1.setName("Orc Warrior"); // Tweak the clone

        OrcMonster clone2 = (OrcMonster) originalOrc.clone();
        clone2.setName("Orc Archer"); // Tweak the clone

        // Prove they are completely independent objects in memory
        clone1.printStats();
        clone2.printStats();

        System.out.println("\nAre clone1 and clone2 the exact same object in RAM?");
        System.out.println(clone1 == clone2); // False! They are independent copies.
    }
}
