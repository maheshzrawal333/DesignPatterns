package Behavioral.CommandPattern.solution.TheInvokerD;

import Behavioral.CommandPattern.solution.ContractA.Command;

import java.util.Stack;

public class RemoteControl {

    private Command button;
    // We use a Stack (LIFO - Last In, First Out) to remember the history for Undo!
    private final Stack<Command> history = new Stack<>();

    // We configure what the button does dynamically
    public void setCommand(Command command) {
        this.button = command;
    }

    // The UI is clicked!
    public void pressButton() {
        if (button != null) {
            button.execute();
            history.push(button); // Save it to history in case they want to undo
        }
    }

    // The user presses Ctrl+Z
    public void pressUndo() {
        if (!history.isEmpty()) {
            System.out.println("--- Undo Button Pressed ---");
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
