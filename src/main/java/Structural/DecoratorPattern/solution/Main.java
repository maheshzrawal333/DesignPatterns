package Structural.DecoratorPattern.solution;

import Structural.DecoratorPattern.solution.ContractA.DataSource;
import Structural.DecoratorPattern.solution.FeaturesD.CompressionDecorator;
import Structural.DecoratorPattern.solution.FeaturesD.EncryptionDecorator;
import Structural.DecoratorPattern.solution.LEGOB.CloudStorage;

public class Main {
    public static void main(String[] args) {

        String myPassword = "my super secret password";

        System.out.println("--- Scenario 1: Plain Text (Dangerous!) ---");
        DataSource plainCloud = new CloudStorage();
        plainCloud.write(myPassword);

        System.out.println("\n--- Scenario 2: Encrypted Only ---");
        // We wrap the CloudStorage inside the Encryption module
        DataSource secureCloud = new EncryptionDecorator(new CloudStorage());
        secureCloud.write(myPassword);

        System.out.println("\n--- Scenario 3: Compressed AND Encrypted (The Onion) ---");
        // Look at this beauty! We wrap CloudStorage inside Compression, and then wrap ALL OF IT inside Encryption!
        DataSource ultimateCloud = new EncryptionDecorator(
                new CompressionDecorator(
                        new CloudStorage()));

        ultimateCloud.write(myPassword);
    }
}
