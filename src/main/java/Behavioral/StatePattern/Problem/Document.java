package Behavioral.StatePattern.Problem;

public class Document {
    private String state = "DRAFT";

    public void clickPublish() {
        if (state.equals("DRAFT")) {
            System.out.println("Moving to review...");
            state = "REVIEW";
        } else if (state.equals("REVIEW")) {
            System.out.println("Approving and publishing on website!");
            state = "PUBLISHED";
        } else if (state.equals("PUBLISHED")) {
            System.out.println("Error: It is already published.");
        }
    }
}
