package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "0 - Exit");
        try (var number = new Scanner(System.in)) {
            int gameNumber = number.nextInt();
            if (gameNumber == 1) {
                System.out.println("Greet is not aviavle now!");
            } else if (gameNumber == 2) {
                Even.game();
            } else {
                System.out.println("Goodbye!");
            }
        }
    }
}
