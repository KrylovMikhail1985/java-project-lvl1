package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RendomInteger;

public class Even implements Games {
    public final String textQuestion() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }
    public final int question() {
        final int min = 1;
        final int max = 50;
        var number = RendomInteger.get(min, max);
        System.out.println("Question: " + number);
        return number;
    }
    public final String rightAnsver(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
    public static void game() {
        Games game;
        game = new Even();
        Engine.ansverIsCorrect(game);
    }
}
