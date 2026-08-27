package Structural.DecoratorPattern.solution.LEGOB;

import Structural.DecoratorPattern.solution.ContractA.DataSource;

public class CloudStorage implements DataSource {
    @Override
    public void write(String data) {
        System.out.println("Saving to Cloud: " + data);
    }
}
