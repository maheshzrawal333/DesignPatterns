package Creational.AbstractPattern.solution.TheConcreteFactoriesD;

import Creational.AbstractPattern.solution.TheAbstractFactoryC.CloudFactory;
import Creational.AbstractPattern.solution.TheConcreteProductsB.AzureBlobStorage;
import Creational.AbstractPattern.solution.TheConcreteProductsB.AzureVmServer;
import Creational.AbstractPattern.solution.TheProductFamiliesA.Server;
import Creational.AbstractPattern.solution.TheProductFamiliesA.Storage;

public class AzureFactory implements CloudFactory {
    @Override
    public Server createServer() { return new AzureVmServer(); }

    @Override
    public Storage createStorage() { return new AzureBlobStorage(); }
}