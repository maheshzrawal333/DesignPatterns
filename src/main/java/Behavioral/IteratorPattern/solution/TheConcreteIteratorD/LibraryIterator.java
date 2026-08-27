package Behavioral.IteratorPattern.solution.TheConcreteIteratorD;

import Behavioral.IteratorPattern.solution.TheContractsA.MyIterator;
import Behavioral.IteratorPattern.solution.TheDataObjectB.Book;

public class LibraryIterator implements MyIterator {

    private final Book[] collection;
    private int position = 0;

    public LibraryIterator(Book[] collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        // Check if we are at the end, OR if the next slot is empty
        return position < collection.length && collection[position] != null;
    }

    @Override
    public Object next() {
        Book book = collection[position];
        position++;
        return book;
    }
}
