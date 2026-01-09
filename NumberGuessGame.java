package Game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secret = rand.nextInt(100) + 1; // 1–100
        int attempts = 0;
        int guess = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I chose a number between 1 and 100. Try to guess it!");

        while (guess != secret) {
            System.out.print("Enter your guess: ");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next(); // skip invalid input
                continue;
            }

            guess = sc.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Your guess must be between 1 and 100.");
            } else if (guess < secret) {
                System.out.println("Too low, try again!");
            } else if (guess > secret) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}
