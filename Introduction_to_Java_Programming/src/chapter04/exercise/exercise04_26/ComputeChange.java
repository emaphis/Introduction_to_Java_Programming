/*
 * Exercise 4.26
 *  (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
 *  java, to fix the possible loss of accuracy when converting a float value to an int
 *  value. Read the input as a string such as "11.56". Your program should ex-
 *  tract the dollar amount before the decimal point, and the cents after the decimal
 *  amount using the indexOf and substring methods.
 */
package chapter04.exercise.exercise04_26;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class ComputeChange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        String amount = input.nextLine();

        // Find the number of one dollars
        int point = amount.indexOf(".");
        String dollarAmount = amount.substring(0, point);
        String centAmount = amount.substring(point + 1);

        int numberOfOneDollars = Integer.parseInt(dollarAmount);
        int remainingAmount = Integer.parseInt(centAmount);

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
        System.out.println("nn" + 4.0 / 25.0);
    }
}
