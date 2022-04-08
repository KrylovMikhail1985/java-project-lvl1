package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static boolean ansverIsCorrect(String rightAnsver) {
        var ansvers = new Scanner(System.in);
        var ansver = ansvers.nextLine();
        System.out.println("Your answer: " + ansver);
        if (ansver.equals(rightAnsver)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("'" + ansver + "' is wrong answer ;(. Correct answer was '" + rightAnsver + "'.");
        return false;
    }
}
