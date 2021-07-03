/*
 *  Exercise 2.5
 *    (Financial application: calculate tips) Write a program that reads the subtotal
 *    and the gratuity rate, then computes the gratuity and total. For example, if the
 *    user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 *    as gratuity and $11.5 as total.
 */
package chapter02.exercise.exercise02_05;

import java.util.Scanner;

/**
 *  Calculate gratuity given subtotal and rate.
 * @author emaph
*/
public class CalculateTips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double rate = input.nextDouble();

        double gratuity = subtotal * (rate / 100);
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }

}
