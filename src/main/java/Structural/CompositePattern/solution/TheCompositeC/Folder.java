package Structural.CompositePattern.solution.TheCompositeC;
import Structural.CompositePattern.solution.TheContractA.FileSystemComponent;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    private final String name;
    // The magical recursive list! It holds the interface, so it can hold anything.
    private final List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    // Methods to manage the tree
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "📁 Folder: " + name);
        // Recursively tell all children to print themselves!
        for (FileSystemComponent child : children) {
            child.print(indent + "   ");
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        // Recursively ask all children for their size!
        for (FileSystemComponent child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }
}
