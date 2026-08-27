package Behavioral.TemplateMethodPattern.solution.TheConcreteMinersB;

import Behavioral.TemplateMethodPattern.solution.TheTemplateA.DataMiner;

public class PdfMiner extends DataMiner {

    @Override
    protected void extractData() {
        System.out.println("2. Using Optical Character Recognition (OCR) to extract text from PDF.");
    }

    @Override
    protected void parseData() {
        System.out.println("3. Parsing PDF text blocks into a standard Java Object.");
    }
}
