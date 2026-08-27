package Structural.AdapterPattern.solution;

import Structural.AdapterPattern.solution.AdapterOrBridge.JsonToXmlAdapter;
import Structural.AdapterPattern.solution.IncompatibleNewToolB.ModernJsonApi;
import Structural.AdapterPattern.solution.TargetA.LegacyAnalyticsSystem;
import Structural.AdapterPattern.solution.TargetA.XmlAnalyticsClient;

public class Main {
    public static void main(String[] args) {

        String myOldXmlData = "<data>Hello World</data>";

        System.out.println("--- Scenario 1: Using the old system ---");
        XmlAnalyticsClient oldSystem = new LegacyAnalyticsSystem();
        oldSystem.analyzeData(myOldXmlData);

        System.out.println("\n--- Scenario 2: Upgrading using the Adapter ---");
        // We instantiate the new incompatible API
        ModernJsonApi stripeApi = new ModernJsonApi();

        // We plug the new API into the Adapter.
        // Notice the data type on the left is still XmlAnalyticsClient!
        XmlAnalyticsClient adapter = new JsonToXmlAdapter(stripeApi);

        // The rest of our application code doesn't have to change at all.
        adapter.analyzeData(myOldXmlData);
    }
}
