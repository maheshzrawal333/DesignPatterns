package Structural.CompositePattern.solution.TheContractA;

public interface FileSystemComponent {
    // Every component must know how to print its name and calculate its size
    void print(String indent);
    int getSize();
}
