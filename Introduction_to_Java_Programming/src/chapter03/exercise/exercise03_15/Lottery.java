/*
 * Exxercise 3.15
 *  (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three-
 *  digit integer. The program prompts the user to enter a three-digit integer and
 *  determines whether the user wins according to the following rules:
 *
 *  1. If the user input matches the lottery number in the exact order, the award is
 *     $10,000.
 *  2. If all digits in the user input match all digits in the lottery number, the award
 *     is $3,000.
 *  3. If one digit in the user input matches a digit in the lottery number, the award
 *     is $1,000.
 */
package chapter03.exercise.exercise03_15;

import java.util.Scanner;
// TODO: finish later.

/**
 * A program to play the lottery
 * @author emaph
 */
public class Lottery {
    public static void main(String[] args) {
        // Generatea two digit lottery number
        int lottery = (int) (Math.random() * 1000);

        // for testing
         System.out.println("number: " + lottery);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lDigit3 = lottery % 10;
        int remander = lottery / 10;
        int lDigit2 = remander % 10;
        remander /= 10;
        int lDigit1 = remander % 10;

        // Get digits from guess
        int gDigit3 = guess % 10;
        remander = guess / 10;
        int gDigit2 = remander % 10;
        remander /= 10;
        int gDigit1 = remander % 10;

        System.out.println("number: " + lottery);
        System.out.println("The lottery number is " + gDigit1 + " " + gDigit2 + " " + gDigit3);

        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if ((gDigit1 == lDigit1 || gDigit1 == lDigit2 || gDigit1 == lDigit3) &&
                 (gDigit2 == lDigit1 || gDigit2 == lDigit2 || gDigit2 == lDigit3) &&
                 (gDigit3 == lDigit1 || gDigit3 == lDigit2 || gDigit3 == lDigit3))
            System.out.println("Match all digits you win $3,000");
        else if ((gDigit1 == lDigit1 || gDigit1 == lDigit2 || gDigit1 == lDigit3) ||
                 (gDigit2 == lDigit1 || gDigit2 == lDigit2 || gDigit2 == lDigit3) ||
                 (gDigit3 == lDigit1 || gDigit3 == lDigit2 || gDigit3 == lDigit3))
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");

    }
}
