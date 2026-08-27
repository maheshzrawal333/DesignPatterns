package Behavioral.IteratorPattern.solution.TheConcreteCollectionC;

import Behavioral.IteratorPattern.solution.TheConcreteIteratorD.LibraryIterator;
import Behavioral.IteratorPattern.solution.TheContractsA.IterableCollection;
import Behavioral.IteratorPattern.solution.TheContractsA.MyIterator;
import Behavioral.IteratorPattern.solution.TheDataObjectB.Book;

public class Library implements IterableCollection {

    // The internal storage structure (Completely hidden from the outside world!)
    private final Book[] books;
    private int index = 0;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(String title) {
        if (index < books.length) {
            books[index] = new Book(title);
            index++;
        }
    }

    // This is the only way the outside world gets access to the data!
    @Override
    public MyIterator createIterator() {
        return new LibraryIterator(this.books);
    }
}
