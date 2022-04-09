package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RendomInteger;
import hexlet.code.cli.Cli;

public class Prime {
    public static int question() {
        final int min = 0;
        final int max = 50;
        var number = RendomInteger.get(min, max);
        System.out.println("Question: " + number);
        return number;
    }
    public static String rightAnsver(int number) {
        if (number == 0 || number == 1) {
            return "no";
        }
        for (var i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                return "no";
            }
            continue;
        }
        return "yes";
    }
    public static void game() {
        var name = Cli.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        if (Engine.ansverIsCorrect("Prime")) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
