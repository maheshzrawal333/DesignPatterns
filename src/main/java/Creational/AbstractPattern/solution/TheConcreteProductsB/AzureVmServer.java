package Creational.AbstractPattern.solution.TheConcreteProductsB;

import Creational.AbstractPattern.solution.TheProductFamiliesA.Server;

public class AzureVmServer implements Server {
    @Override
    public void bootUp() { System.out.println("[Azure VM]: Server booting up in West Europe..."); }
}
