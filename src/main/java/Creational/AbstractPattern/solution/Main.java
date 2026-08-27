package Creational.AbstractPattern.solution;

import Creational.AbstractPattern.solution.TheAbstractFactoryC.CloudFactory;
import Creational.AbstractPattern.solution.TheConcreteFactoriesD.AwsFactory;
import Creational.AbstractPattern.solution.TheConcreteFactoriesD.AzureFactory;

public class Main {
    public static void main(String[] args) {

        // At application startup, we read an environment variable or config file
        String config = "AZURE"; // Imagine this comes from application.properties

        CloudFactory factory;

        if (config.equals("AWS")) {
            factory = new AwsFactory();
        } else {
            factory = new AzureFactory();
        }

        // We hand the factory to the application
        System.out.println("--- Initiating Cloud Deployment ---");
        CloudApplication app = new CloudApplication(factory);
        app.runDeploy();
    }
}
