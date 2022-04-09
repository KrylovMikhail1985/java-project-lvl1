package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RendomInteger;
import hexlet.code.RendomOperator;
import hexlet.code.cli.Cli;

public class Calc {
    public static int question() {
        final int min = 1;
        final int max = 50;
        var numberOne = RendomInteger.get(min, max);
        var operator = RendomOperator.get();
        var numberTwo = RendomInteger.get(min, max);
        System.out.println("Question: " + numberOne + " " + operator + " " + numberTwo);
        var result = 0;
        switch (operator) {
            case '+': result =  numberOne + numberTwo;
            break;
            case '-': result =  numberOne - numberTwo;
            break;
            case '*': result =  numberOne * numberTwo;
            break;
            default: result =  numberOne / numberTwo;
            break;
        }
        return result;
    }
    public static String rightAnsver(int number) {
        return Integer.toString(number);
    }
    public static void game() {
        var name = Cli.greeting();
        System.out.println("What is the result of the expression?");
        if (Engine.ansverIsCorrect("Calc")) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
