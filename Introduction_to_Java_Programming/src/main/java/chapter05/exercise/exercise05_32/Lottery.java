/*
 * Exercise 5.32
 *  Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a two-
 *  digit number. The two digits in the number are distinct. (Hint: Generate the first
 *  digit. Use a loop to continuously generate the second digit until it is different
 *  from the first digit.)
 */
package chapter05.exercise.exercise05_32;

import java.util.Scanner;

/**
 * A program to play the lottery
 * @author emaph
 */
public class Lottery {
    public static void main(String[] args) {
        // Generatea two digit lottery number, make sure digits are different.
        int lotteryDigit1 = (int) (Math.random() * 10);

        int lotteryDigit2;
        do {     // create digits until they are diffent
            lotteryDigit2 = (int) (Math.random() * 10);
        } while (lotteryDigit1 == lotteryDigit2);

        String lottery = String.format("%d%d", lotteryDigit1, lotteryDigit2);

        // test code
        //System.out.println("computer guess: " + lottery);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two  distinct digits): ");
        int guess = input.nextInt();

        System.out.println("your guess: " + guess);

        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println();

        // Check the guess
        if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits you win $3,000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
