/*
 * Listing 5.2  - same as Listing 5.3
 * 5.3 Case Study: Guessing Numbers
 */
package chapter05.example.listing05_02;

import java.util.Scanner;

/**
 * @author emaph
 */
public class GuessNumberOneTime {
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1;
        while (guess != number) {
            // Prompt the user to guess the number
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else if ( guess < number) {
                System.out.println("Your guess is too low");
            }

        } // End of loops
    }
}
