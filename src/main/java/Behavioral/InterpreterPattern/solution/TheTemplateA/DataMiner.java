package Behavioral.InterpreterPattern.solution.TheTemplateA;

public abstract class DataMiner {

    // 1. THE TEMPLATE METHOD
    // We make it 'final' so no child class can ever change the sequence of steps!
    public final void mineData(String filePath) {
        System.out.println("\n--- Starting Data Mining Process for: " + filePath + " ---");
        openConnection();
        extractData();     // Step left to the child
        parseData();       // Step left to the child
        analyzeData();
        saveReport();
        closeConnection();
    }

    // 2. CONCRETE METHODS (Shared by everyone. No copy-pasting needed!)
    private void openConnection() {
        System.out.println("1. Opening secure connection to the database...");
    }

    private void analyzeData() {
        System.out.println("4. Analyzing standardized data with AI models...");
    }

    private void saveReport() {
        System.out.println("5. Saving the final report to the database...");
    }

    private void closeConnection() {
        System.out.println("6. Closing connection securely to prevent memory leaks.");
    }

    // 3. ABSTRACT METHODS (The "Blanks" the child classes MUST fill in)
    protected abstract void extractData();
    protected abstract void parseData();
}
