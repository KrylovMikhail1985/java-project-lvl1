package hexlet.code;

import java.util.Scanner;

import hexlet.code.cli.Cli;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc");
        System.out.println("4 - GCD\n" + "5 - Progression\n"  + "0 - Exit");
        try (var number = new Scanner(System.in)) {
            int gameNumber = number.nextInt();
            final var greeting = 1;
            final var even = 2;
            final var calc = 3;
            final var gcd = 4;
            final var progression = 5;
            if (gameNumber == greeting) {
                Cli.greeting();
            } else if (gameNumber == even) {
                Even.game();
            } else if (gameNumber == calc) {
                Calc.game();
            } else if (gameNumber == gcd) {
                Gcd.game();
            } else if (gameNumber == progression) {
                Progression.game();
            } else {
                System.out.println("Goodbye!");
            }
        }
    }
}
