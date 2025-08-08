package Lab01_08;

import java.io.Console;

public class Question2_lab {
    public static void main(String[] args) {
        Console console = System.console();

        if (console != null) {
            String name = console.readLine("Enter your name: ");
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Console not available. Run this in a terminal, not in IDE.");
        }
    }
} 
