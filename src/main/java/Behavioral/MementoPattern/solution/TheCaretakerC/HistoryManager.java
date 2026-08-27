package Behavioral.MementoPattern.solution.TheCaretakerC;

import Behavioral.MementoPattern.solution.TheMementoA.EditorMemento;

import java.util.Stack;

public class HistoryManager {
    // A Stack is perfect for Undo! (Last In, First Out)
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveSnapshot(EditorMemento memento) {
        history.push(memento);
    }

    public EditorMemento getPreviousSnapshot() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        System.out.println("No history to undo!");
        return null;
    }
}
