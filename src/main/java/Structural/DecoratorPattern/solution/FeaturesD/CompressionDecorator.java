package Structural.DecoratorPattern.solution.FeaturesD;

import Structural.DecoratorPattern.solution.ContractA.DataSource;
import Structural.DecoratorPattern.solution.WrapperBlueprintC.DataSourceDecorator;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void write(String data) {
        String compressedData = compress(data);
        System.out.println("[Compression Layer]: Data shrunk by 50%.");

        // Pass the altered data to the next layer!
        wrappee.write(compressedData);
    }

    private String compress(String data) {
        return data.replace(" ", ""); // Fake compression by removing spaces
    }
}
