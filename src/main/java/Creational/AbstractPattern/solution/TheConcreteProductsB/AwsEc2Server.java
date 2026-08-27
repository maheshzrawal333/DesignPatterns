package Creational.AbstractPattern.solution.TheConcreteProductsB;

import Creational.AbstractPattern.solution.TheProductFamiliesA.Server;

public class AwsEc2Server implements Server {
    @Override
    public void bootUp() { System.out.println("[AWS EC2]: Server booting up in us-east-1..."); }
}
