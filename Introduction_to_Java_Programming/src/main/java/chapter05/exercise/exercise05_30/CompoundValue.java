/*
 * Exercise 5.30
 *  (Financial application: compound value) Suppose you save $100 each month
 *  into a savings account with the annual interest rate 5%. Thus, the monthly in-
 *  terest rate is 0.05 / 12 = 0.00417. After the first month, the value in the
 *  account becomes
 *
 *      100 * (1 + 0.00417) = 100.417
 *
 *  After the second month, the value in the account becomes
 *
 *      (100 + 100.417) * (1 + 0.00417) = 201.252
 *
 *  After the third month, the value in the account becomes
 *
 *      (100 + 201.252) * (1 + 0.00417) = 302.507
 *
 *  and so on.
 *
 *  Write a program that prompts the user to enter an amount (e.g., 100), the an-
 *  nual interest rate (e.g., 5), and the number of months (e.g., 6) then displays the
 *  amount in the savings account after the given month.
 */
package chapter05.exercise.exercise05_30;

import java.util.Scanner;

/**
 * compound value
 * @author emaph
 */
public class CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter account informtion.
        System.out.print("Enter an amount: ");
        double monthlyAmount = input.nextDouble();
        System.out.print("Enter annual inteest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of months: ");
        int numberMonths = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;

        // calculate and print
        double sum = 0;
        double principle = monthlyAmount;
        for (int month = 1; month <= numberMonths; month++) {
            sum = (monthlyAmount + sum) * (1 + monthlyInterestRate);
            System.out.printf("Month %3d =  %.2f \n",  month, sum);
        }
    }
}
