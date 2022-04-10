package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RendomInteger;
import hexlet.code.RendomOperator;

public class Calc implements Games {
    public final String textQuestion() {
        return "What is the result of the expression?";
    }
    public final int question() {
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
            default : result =  numberOne * numberTwo;
            break;
        }
        return result;
    }
    public final String rightAnsver(int number) {
        return Integer.toString(number);
    }
    public static void game() {
        Games game;
        game = new Calc();
        Engine.ansverIsCorrect(game);
    }
}
