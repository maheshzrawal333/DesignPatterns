package Structural.FlyweightPattern.solution.TheFlyweightFactoryB;

import Structural.FlyweightPattern.solution.TheFlyweightA.TreeType;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    // The Cache storing our shared heavy objects
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String heavy3DModel) {

        // If we don't have this type yet, create it and cache it.
        if (!treeTypes.containsKey(name)) {
            System.out.println("+++ CACHE MISS: Creating brand new TreeType for: " + name + " +++");
            treeTypes.put(name, new TreeType(name, color, heavy3DModel));
        }

        // Return the shared cached instance!
        return treeTypes.get(name);
    }
}
