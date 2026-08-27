package Structural.CompositePattern.solution;

import Structural.CompositePattern.solution.TheCompositeC.Folder;
import Structural.CompositePattern.solution.TheContractA.FileSystemComponent;
import Structural.CompositePattern.solution.TheLeafB.File;

public class Main {
    public static void main(String[] args) {

        // 1. Create some raw files (Leaves)
        FileSystemComponent resume = new File("resume.pdf", 2);
        FileSystemComponent photo1 = new File("vacation_1.jpg", 5);
        FileSystemComponent photo2 = new File("vacation_2.jpg", 4);
        FileSystemComponent game = new File("minecraft.exe", 200);

        // 2. Create some Folders (Composites)
        Folder photosFolder = new Folder("My Photos");
        photosFolder.add(photo1);
        photosFolder.add(photo2);

        Folder documentsFolder = new Folder("My Documents");
        documentsFolder.add(resume);
        // We can put a Folder INSIDE a Folder!
        documentsFolder.add(photosFolder);

        Folder rootDrive = new Folder("C: Drive");
        rootDrive.add(documentsFolder);
        rootDrive.add(game);

        // 3. The Execution!
        System.out.println("--- Entire File System Structure ---");
        rootDrive.print(""); // Prints the whole tree perfectly indented

        System.out.println("\n--- Calculating Sizes ---");
        System.out.println("Size of Photos Folder: " + photosFolder.getSize() + " MB");

        // The root drive recursively calculates the size of the game, the documents, AND the photos!
        System.out.println("Total Size of C: Drive: " + rootDrive.getSize() + " MB");
    }
}