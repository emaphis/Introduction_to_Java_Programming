/*
 * Exercise 2.13
 *  Financial application: compound value) Suppose you save $100 each month into
 *  a savings account with an annual interest rate of 5%. Thus, the monthly interest
 *  rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
 *    100 * (1 + 0.00417) = 100.417
 *
 *  After the second month, the value in the account becomes
 *   (100 + 100.417) * (1 + 0.00417) = 201.252
 *
 *  After the third month, the value in the account becomes
 *    (100 + 201.252) * (1 + 0.00417) = 302.507
 *  and so on
 *
 *  Write a program that prompts the user to enter a monthly saving amount and dis-
 *  plays the account value after the sixth month. (In Programming Exercise 5.30, you
 *  will use a loop to simplify the code and display the account value for any month.)
 */
package chapter02.exercise.exercise02_13;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double amount = input.nextDouble();
        final double RATE = 0.00417;

        // first month
        double newAmount = amount * (1 + RATE);
        // second month
        newAmount = (amount + newAmount) * (1 + RATE);
        // third month
        newAmount = (amount+ newAmount) * (1 + RATE);
        // fourth month
        newAmount = (amount + newAmount) * (1 + RATE);
        // fith month
        newAmount = (amount + newAmount) * (1 + RATE);
        // sixth month
        newAmount = (amount + newAmount) * (1 + RATE);

        System.out.println("After the sixth month, the account value is $" + newAmount);
    }
}
