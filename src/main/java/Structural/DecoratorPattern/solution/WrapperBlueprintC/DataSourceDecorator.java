package Structural.DecoratorPattern.solution.WrapperBlueprintC;

import Structural.DecoratorPattern.solution.ContractA.DataSource;

public abstract class DataSourceDecorator implements DataSource {

    // COMPOSITION: The wrapper holds another DataSource inside it!
    protected final DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void write(String data) {
        // By default, just pass the data down to the next layer inside
        wrappee.write(data);
    }
}
