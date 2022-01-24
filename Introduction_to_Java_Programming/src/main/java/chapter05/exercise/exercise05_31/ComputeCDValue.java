/*
 * Exercise 5.31
 *  (Financial application: compute CD value) Suppose you put $10,000 into a CD
 *  with an annual percentage yield of 5.75%. After one month, the CD is worth
 *
 *      110000 + 10000 * 5.75 / 1200 = 10047.92
 *
 *  AAfter two months, the CD is worth
 *
 *      10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
 *
 *  After three months, the CD is worth
 *
 *      (10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
 *
 *  and so on.
 *
 *  Write a program that prompts the user to enter an amount (e.g., 10000), the
 *  annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) and
 *  displays a table as presented in the sample run.
 */
package chapter05.exercise.exercise05_31;

import java.util.Scanner;

/**
 * compound value
 * @author emaph
 */
public class ComputeCDValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter account informtion.
        System.out.print("Enter deposit amount: ");
        double depositAmount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter maturaty period (number of months): ");
        int numberMonths = input.nextInt();
        System.out.println();

        // Print header
        System.out.printf("%-8s%-8s", "Month", "CD Values\n");

        // calculate and print details
        double totalAmount = depositAmount;
        for (int month = 1; month <= numberMonths; month++) {
            totalAmount += totalAmount * (annualInterestRate / 1200);
            System.out.printf("%-8d%-8.2f\n",  month, totalAmount);
        }
    }
}
