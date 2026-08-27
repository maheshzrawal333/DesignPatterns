package Creational.PrototypePattern.solution.TheConcretePrototypeB;

import Creational.PrototypePattern.solution.TheContractA.Prototype;

public class OrcMonster implements Prototype {

    private String name;
    private int health;
    private String heavyAiLogic; // Represents heavy data

    // 1. The STANDARD Constructor (Very slow, does the heavy lifting)
    public OrcMonster(String name, int health) {
        System.out.println("--- BOOTING: Loading Orc 3D models and AI from Database (Takes 5 seconds) ---");
        this.name = name;
        this.health = health;
        this.heavyAiLogic = "Aggressive Melee AI Tree"; // Pretend this was slow to load
    }

    // 2. The COPY Constructor (Instantaneous! Skips the database entirely)
    private OrcMonster(OrcMonster source) {
        this.name = source.name;
        this.health = source.health;
        this.heavyAiLogic = source.heavyAiLogic;
    }

    // 3. The Prototype Contract implementation
    @Override
    public Prototype clone() {
        // We just pass 'this' to the private copy constructor!
        return new OrcMonster(this);
    }

    // A setter so we can tweak the clone slightly after copying it
    public void setName(String name) {
        this.name = name;
    }

    public void printStats() {
        System.out.println("Orc: " + name + " | HP: " + health + " | AI: " + heavyAiLogic);
    }
}