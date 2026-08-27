package Behavioral.InterpreterPattern;

import Behavioral.InterpreterPattern.solution.TheConcreteMinersB.CsvMiner;
import Behavioral.InterpreterPattern.solution.TheConcreteMinersB.PdfMiner;
import Behavioral.InterpreterPattern.solution.TheTemplateA.DataMiner;

public class Main {
    public static void main(String[] args) {

        // Let's mine a CSV file
        DataMiner csvMiner = new CsvMiner();
        csvMiner.mineData("sales_report.csv");

        // Let's mine a PDF file
        DataMiner pdfMiner = new PdfMiner();
        pdfMiner.mineData("annual_tax_return.pdf");
    }
}
