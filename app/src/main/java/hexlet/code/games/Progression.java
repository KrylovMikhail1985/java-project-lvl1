package hexlet.code.games;

import java.util.Arrays;

import hexlet.code.Engine;
import hexlet.code.RendomInteger;
import hexlet.code.cli.Cli;

public class Progression {
    public static int question() {
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
        var textArray = new String[countOfNumbers];
        for (var i = 0; i < array.length; i++) {
            textArray[i] = Integer.toString(array[i]);
        }
        var secretMember = RendomInteger.get(min, countOfNumbers);
        textArray[secretMember] = "...";
        System.out.println(Arrays.toString(textArray));
        return array[secretMember];
    }
    public static String rightAnsver(int number) {
        return Integer.toString(number);
    }
    public static void game() {
        var name = Cli.greeting();
        System.out.println("What number is missing in the progression?");
        if (Engine.ansverIsCorrect("Progression")) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
