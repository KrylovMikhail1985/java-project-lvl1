package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RendomInteger;
import hexlet.code.cli.Cli;

public class Gcd {
    public static int[] question() {
        final int min = 1;
        final int max = 100;
        var firstNumber = RendomInteger.get(min, max);
        var secondNumber = RendomInteger.get(min, max);
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        int[] twoNumbers = {firstNumber, secondNumber};
        return twoNumbers;
    }
    public static String rightAnsver(int[] array) {
        var firstNumber = 0;
        var secondNumber = 0;
        if (array[0] < array[1]) {
            firstNumber = array[0];
            secondNumber = array[1];
        } else {
            firstNumber = array[1];
            secondNumber = array[0];
        }
        var ansver = 1;
        for (var i = firstNumber; i > 0; i--) {
            if (secondNumber % i == 0 && firstNumber % i == 0) {
                ansver = i;
                break;
            }
        }
        return Integer.toString(ansver);
    }
    public static void game() {
        var name = Cli.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        if (Engine.ansverIsCorrect("GCD")) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
