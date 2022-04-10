package hexlet.code.cli;

import java.util.Scanner;

public class Cli {
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        Scanner nameIn = new Scanner(System.in);
        String name = nameIn.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
