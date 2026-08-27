package Behavioral.MementoPattern.solution.TheMementoA;

public class EditorMemento {
    // The exact state we want to save
    private final String textSnapshot;
    private final int cursorPositionSnapshot;

    // Locked upon creation!
    public EditorMemento(String text, int cursorPosition) {
        this.textSnapshot = text;
        this.cursorPositionSnapshot = cursorPosition;
    }

    // Getters only. The HistoryManager can call these, but we trust it won't alter them.
    public String getTextSnapshot() {
        return textSnapshot;
    }

    public int getCursorPositionSnapshot() {
        return cursorPositionSnapshot;
    }
}
