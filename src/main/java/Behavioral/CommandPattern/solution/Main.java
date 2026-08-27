package Behavioral.CommandPattern.solution;

import Behavioral.CommandPattern.solution.ContractA.Command;
import Behavioral.CommandPattern.solution.TheInvokerD.RemoteControl;
import Behavioral.CommandPattern.solution.TheObjectsC.LightOffCommand;
import Behavioral.CommandPattern.solution.TheObjectsC.LightOnCommand;
import Behavioral.CommandPattern.solution.TheReceiverB.SmartLight;

public class Main {
    public static void main(String[] args) {

        // 1. The Hardware (Receiver)
        SmartLight livingRoomLight = new SmartLight();

        // 2. The Actions (Commands)
        Command turnOn = new LightOnCommand(livingRoomLight);
        Command turnOff = new LightOffCommand(livingRoomLight);

        // 3. The UI (Invoker)
        RemoteControl remote = new RemoteControl();

        System.out.println("--- User plays with the remote ---");

        // Map the button to "Turn On" and press it
        remote.setCommand(turnOn);
        remote.pressButton();

        // Map the button to "Turn Off" and press it
        remote.setCommand(turnOff);
        remote.pressButton();

        // User changes their mind and presses Undo twice!
        remote.pressUndo(); // Undoes the "Turn Off" (turns it back on)
        remote.pressUndo(); // Undoes the "Turn On" (turns it back off)
    }
}
