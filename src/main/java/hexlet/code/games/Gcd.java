package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RendomInteger;

public class Gcd implements Games {
    public final String textQuestion() {
        return "Find the greatest common divisor of given numbers.";
    }
    public final int question() {
        final int min = 1;
        final int max = 100;
        var firstNumber = RendomInteger.get(min, max);
        var secondNumber = RendomInteger.get(min, max);
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        var ansver = 1;
        var minimum = 0;
        var maxumum = 0;
        if (firstNumber < secondNumber) {
            minimum = firstNumber;
            maxumum = secondNumber;
        } else {
            minimum = secondNumber;
            maxumum = firstNumber;
        }
        for (var i = minimum; i > 0; i--) {
            if (maxumum % i == 0 && minimum % i == 0) {
                ansver = i;
                break;
            }
        }
        return ansver;
    }
    public final String rightAnsver(int ansver) {
        return Integer.toString(ansver);
    }
    public static void game() {
        Games game;
        game = new Gcd();
        Engine.ansverIsCorrect(game);
    }
}
