package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RendomInteger;
import hexlet.code.cli.Cli;

public class Even {
    public static int question() {
        final int min = 1;
        final int max = 50;
        var number = RendomInteger.get(min, max);
        System.out.println("Question: " + number);
        return number;
    }
    public static String rightAnsver(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
    public static void game() {
        var name = Cli.greeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        var allAnsversIsCorrect = true;
        final int numberOfIterations = 3;
        var rightAnsver = "rightAnsver";
        for (var i = 0; i < numberOfIterations; i++) {
            rightAnsver = Even.rightAnsver(Even.question());
            if (!Engine.ansverIsCorrect(rightAnsver)) {
                allAnsversIsCorrect = false;
                break;
            }
        }
        if (allAnsversIsCorrect) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
