package Behavioral.TemplateMethodPattern.solution.TheConcreteMinersB;

import Behavioral.TemplateMethodPattern.solution.TheTemplateA.DataMiner;

public class CsvMiner extends DataMiner {

    @Override
    protected void extractData() {
        System.out.println("2. Extracting raw text from the CSV file.");
    }

    @Override
    protected void parseData() {
        System.out.println("3. Parsing CSV commas into a standard Java Object.");
    }
}
