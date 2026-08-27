package Behavioral.CommandPattern.solution.TheObjectsC;

import Behavioral.CommandPattern.solution.ContractA.Command;
import Behavioral.CommandPattern.solution.TheReceiverB.SmartLight;

public class LightOnCommand implements Command {
    private final SmartLight light;

    public LightOnCommand(SmartLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff(); // The exact opposite of execute!
    }
}