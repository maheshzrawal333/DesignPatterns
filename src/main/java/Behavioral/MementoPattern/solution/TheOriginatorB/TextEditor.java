package Behavioral.MementoPattern.solution.TheOriginatorB;

import Behavioral.MementoPattern.solution.TheMementoA.EditorMemento;

public class TextEditor {

    // The internal private state
    private String text = "";
    private int cursorPosition = 0;

    // Business Logic: Typing in the editor
    public void type(String newWords) {
        this.text += newWords;
        this.cursorPosition += newWords.length();
    }

    public void printCurrentState() {
        System.out.println("Document: '" + text + "' | Cursor: " + cursorPosition);
    }

    // ----------------------------------------------------
    // THE MEMENTO MAGIC: Taking the Snapshot!
    // ----------------------------------------------------
    public EditorMemento save() {
        System.out.println("Saving snapshot to the time capsule...");
        // It builds the capsule using its own private data
        return new EditorMemento(this.text, this.cursorPosition);
    }

    // ----------------------------------------------------
    // THE MEMENTO MAGIC: Restoring from the Snapshot!
    // ----------------------------------------------------
    public void restore(EditorMemento memento) {
        System.out.println("Rolling back to previous snapshot...");
        // It rips open the capsule and overwrites its current state!
        this.text = memento.getTextSnapshot();
        this.cursorPosition = memento.getCursorPositionSnapshot();
    }
}