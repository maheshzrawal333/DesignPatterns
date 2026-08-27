package Structural.AdapterPattern.solution.AdapterOrBridge;

import Structural.AdapterPattern.solution.IncompatibleNewToolB.ModernJsonApi;
import Structural.AdapterPattern.solution.TargetA.XmlAnalyticsClient;

// 1. It implements the OLD interface so our app accepts it as a valid tool
public class JsonToXmlAdapter implements XmlAnalyticsClient {

    // 2. It HOLDS the NEW, incompatible tool
    private final ModernJsonApi modernApi;

    public JsonToXmlAdapter(ModernJsonApi modernApi) {
        this.modernApi = modernApi;
    }

    // 3. It translates the request!
    @Override
    public void analyzeData(String xmlData) {
        System.out.println("[Adapter]: Intercepted XML data...");

        // Translate XML to JSON (Fake translation for this example)
        String translatedJson = convertXmlToJson(xmlData);
        System.out.println("[Adapter]: Translated to JSON. Passing to Modern API...");

        // Hand the translated data to the modern API
        modernApi.processJson(translatedJson);
    }

    private String convertXmlToJson(String xml) {
        return "{ \"data\": \"translated_from_xml\" }";
    }
}
