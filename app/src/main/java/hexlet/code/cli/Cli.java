package hexlet.code.cli;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.println("May I have your name?");
        try (Scanner nameIn = new Scanner(System.in)) {
            String name = nameIn.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }
}
