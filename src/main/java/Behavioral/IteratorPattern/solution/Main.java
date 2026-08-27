package Behavioral.IteratorPattern.solution;

import Behavioral.IteratorPattern.solution.TheConcreteCollectionC.Library;
import Behavioral.IteratorPattern.solution.TheContractsA.MyIterator;
import Behavioral.IteratorPattern.solution.TheDataObjectB.Book;

public class Main {
    public static void main(String[] args) {

        // 1. Setup the Library
        Library myLibrary = new Library(5);
        myLibrary.addBook("Design Patterns by the Gang of Four");
        myLibrary.addBook("Effective Java");
        myLibrary.addBook("Clean Architecture");

        // 2. The UI asks for the robotic Iterator
        MyIterator iterator = myLibrary.createIterator();

        System.out.println("--- Printing Library Catalog ---");

        // 3. The UI loops through the data safely!
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Found: " + book.getTitle());
        }
    }
}
