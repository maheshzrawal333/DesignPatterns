package Structural.AdapterPattern.solution.TargetA;

public class LegacyAnalyticsSystem implements XmlAnalyticsClient {
    @Override
    public void analyzeData(String xmlData) {
        System.out.println("Processing XML Data: " + xmlData);
    }
}
