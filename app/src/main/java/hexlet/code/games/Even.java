package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public static void game() {
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        try (var nameIn = new Scanner(System.in)) {
            try (var ansver = new Scanner(System.in)) {
                String name = nameIn.nextLine();
                System.out.println("Hello, " + name + "!\n" + "Answer 'yes' if number even otherwise answer 'no'.");
                var currentNumber = 0;
                var allAnswersIsCorrect = true;
                final int numberOfIterations = 3;
                final int coefficient = 100;
                for (var i = 0; i < numberOfIterations; i++) {
                    currentNumber = (int) (Math.random() * Math.random() * coefficient);
                    System.out.println("Question: " + currentNumber);
                    String currentAnswer = ansver.nextLine();
                    if (currentNumber % 2 == 0 && currentAnswer.equals("yes")) {
                        System.out.println("Correct!");
                    } else if (currentNumber % 2 != 0 && currentAnswer.equals("no")) {
                        System.out.println("Correct!");
                    } else {
                        allAnswersIsCorrect = false;
                        break;
                    }
                }
                if (allAnswersIsCorrect) {
                    System.out.println("Congratulations, " + name + "!");
                } else {
                    System.out.println("It's not correct((\n" + "Game over.");
                }
            }
        }
    }
}
