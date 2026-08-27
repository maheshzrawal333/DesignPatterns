package Creational.AbstractPattern.solution.TheConcreteFactoriesD;

import Creational.AbstractPattern.solution.TheAbstractFactoryC.CloudFactory;
import Creational.AbstractPattern.solution.TheConcreteProductsB.AwsEc2Server;
import Creational.AbstractPattern.solution.TheConcreteProductsB.AwsS3Storage;
import Creational.AbstractPattern.solution.TheProductFamiliesA.Server;
import Creational.AbstractPattern.solution.TheProductFamiliesA.Storage;

public class AwsFactory implements CloudFactory {
    @Override
    public Server createServer() { return new AwsEc2Server(); }

    @Override
    public Storage createStorage() { return new AwsS3Storage(); }
}