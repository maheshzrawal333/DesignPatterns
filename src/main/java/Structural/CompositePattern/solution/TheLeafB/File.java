package Structural.CompositePattern.solution.TheLeafB;

import Structural.CompositePattern.solution.TheContractA.FileSystemComponent;

public class File implements FileSystemComponent {

    private final String name;
    private final int sizeMB;

    public File(String name, int sizeMB) {
        this.name = name;
        this.sizeMB = sizeMB;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "📄 File: " + name + " (" + sizeMB + " MB)");
    }

    @Override
    public int getSize() {
        return sizeMB;
    }
}
