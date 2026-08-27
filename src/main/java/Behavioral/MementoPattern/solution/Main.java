package Behavioral.MementoPattern.solution;

import Behavioral.MementoPattern.solution.TheCaretakerC.HistoryManager;
import Behavioral.MementoPattern.solution.TheMementoA.EditorMemento;
import Behavioral.MementoPattern.solution.TheOriginatorB.TextEditor;

;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        HistoryManager history = new HistoryManager();

        System.out.println("--- User starts typing ---");
        editor.type("Hello ");
        editor.type("World!");
        editor.printCurrentState();

        // 1. User hits Ctrl+S (Save the Memento!)
        history.saveSnapshot(editor.save());

        System.out.println("\n--- User makes a terrible mistake ---");
        editor.type(" sjfhksjdhfkjsdf"); // Cat walked on keyboard
        editor.printCurrentState();

        System.out.println("\n--- User hits Ctrl+Z (Undo!) ---");
        // 2. We ask history for the capsule, and hand it BACK to the editor to restore!
        EditorMemento lastSave = history.getPreviousSnapshot();
        if (lastSave != null) {
            editor.restore(lastSave);
        }

        // 3. The document is perfectly restored!
        editor.printCurrentState();
    }
}