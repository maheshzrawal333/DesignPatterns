package Structural.DecoratorPattern.solution.FeaturesD;

import Structural.DecoratorPattern.solution.ContractA.DataSource;
import Structural.DecoratorPattern.solution.WrapperBlueprintC.DataSourceDecorator;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee); // Pass the inner object to the parent class
    }

    @Override
    public void write(String data) {
        String encryptedData = scramble(data);
        System.out.println("[Encryption Layer]: Data secured.");

        // Pass the altered data to the next layer!
        wrappee.write(encryptedData);
    }

    private String scramble(String data) {
        return "***" + data.toUpperCase() + "_ENCRYPTED***";
    }
}
