package Behavioral.CommandPattern.solution.TheObjectsC;

import Behavioral.CommandPattern.solution.ContractA.Command;
import Behavioral.CommandPattern.solution.TheReceiverB.SmartLight;

public class LightOffCommand implements Command {
    private final SmartLight light;

    public LightOffCommand(SmartLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
