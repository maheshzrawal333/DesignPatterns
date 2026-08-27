package Behavioral.StatePattern.solution;

import Behavioral.StatePattern.solution.ContextB.Document;

public class Main {
    public static void main(String[] args) {

        Document myArticle = new Document();

        System.out.println("--- Click 1 ---");
        myArticle.clickPublish(); // Draft -> Review

        System.out.println("\n--- Click 2 ---");
        myArticle.clickPublish(); // Review -> Published

        System.out.println("\n--- Click 3 ---");
        myArticle.clickPublish(); // Published -> Error!
    }
}
