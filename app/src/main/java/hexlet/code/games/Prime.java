package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RendomInteger;

public class Prime implements Games {
    public final String textQuestion() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public final int question() {
        final int min = 0;
        final int max = 200;
        var number = RendomInteger.get(min, max);
        System.out.println("Question: " + number);
        return number;
    }
    public final String rightAnsver(int number) {
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
        Games game;
        game = new Prime();
        Engine.ansverIsCorrect(game);
    }
}
