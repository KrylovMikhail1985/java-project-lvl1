package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class Engine {
    public static boolean ansverIsCorrect(String gameName) {
        var allAnsversIsCorrect = true;
        final int numberOfIterations = 3;
        var rightAnsver = "rightAnsver";
        for (var i = 0; i < numberOfIterations; i++) {
            if (gameName.equals("Even")) {
                rightAnsver = Even.rightAnsver(Even.question());
            } else if (gameName.equals("Calc")) {
                rightAnsver = Calc.rightAnsver(Calc.question());
            } else if (gameName.equals("GCD")) {
                rightAnsver = Gcd.rightAnsver(Gcd.question());
            } else if (gameName.equals("Progression")) {
                rightAnsver = Progression.rightAnsver(Progression.question());
            } else if (gameName.equals("Prime")) {
                rightAnsver = Prime.rightAnsver(Prime.question());
            } else {
                System.out.println("goodbye!");
            }
            var ansvers = new Scanner(System.in);
            var ansver = ansvers.nextLine();
            System.out.println("Your answer: " + ansver);
            if (ansver.equals(rightAnsver)) {
                System.out.println("Correct!");
                continue;
            }
            System.out.println("'" + ansver + "' is wrong answer ;(. Correct answer was '" + rightAnsver + "'.");
            allAnsversIsCorrect = false;
            break;
        }
        return allAnsversIsCorrect;
    }
}
