package hexlet.code;

import java.util.Scanner;

import hexlet.code.cli.Cli;
import hexlet.code.games.Games;


public class Engine {
    public static void ansverIsCorrect(Games name) {
        var userName = Cli.greeting();
        var allAnsversIsCorrect = true;
        final int numberOfIterations = 3;
        var rightAnsver = "rightAnsver";
        System.out.println(name.textQuestion());
        for (var i = 0; i < numberOfIterations; i++) {
            rightAnsver = name.rightAnsver(name.question());
            System.out.print("Your answer: ");
            var ansvers = new Scanner(System.in);
            var ansver = ansvers.nextLine();
            if (ansver.equals(rightAnsver)) {
                System.out.println("Correct!");
                continue;
            }
            System.out.println("'" + ansver + "' is wrong answer ;(. Correct answer was '" + rightAnsver + "'.");
            allAnsversIsCorrect = false;
            break;
        }
        if (allAnsversIsCorrect) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
