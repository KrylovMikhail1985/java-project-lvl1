package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RendomInteger;

public class Progression implements Games {
    public final String textQuestion() {
        return "What number is missing in the progression?";
    }
    public final int question() {
        final int min = 1;
        final int max = 10;
        var number = RendomInteger.get(min, max);
        var plusNumber = RendomInteger.get(min, max);
        final int countOfNumbers = 7;
        var array = new int[countOfNumbers];
        array[0] = number;
        for (var i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + plusNumber;
        }
        var tA = new String[countOfNumbers];
        for (var i = 0; i < array.length; i++) {
            tA[i] = Integer.toString(array[i]);
        }
        var secretMember = RendomInteger.get(min, countOfNumbers);
        tA[secretMember] = "..";
        System.out.println(tA[0] + " " + tA[1] + " " + tA[2] + " " + tA[3] + " " + tA[4] + " " + tA[5] + " " + tA[6]);
        return array[secretMember];
    }
    public final String rightAnsver(int number) {
        return Integer.toString(number);
    }
    public static void game() {
        Games game;
        game = new Progression();
        Engine.ansverIsCorrect(game);
    }
}
