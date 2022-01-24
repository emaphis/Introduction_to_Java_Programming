/*
 * Exercise 2.6
 *   (Sum the digits in an integer) Write a program that reads an integer between 0
 *   and 1000 and adds all the digits in the integer. For example, if an integer is 932,
 *   the sum of all its digits is 14.
 *
 *   Hint: Use the % operator to extract digits, and use the / operator to remove the
 *   extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */
package chapter02.exercise.exercise02_06;

import java.util.Scanner;

/**
 * Sum the digits of an integer of 1000 or less.
 * @author emaph
 */
public class DigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000 ");
        int digits = input.nextInt();

        int ones = digits % 10;
        digits /= 10;

        int tens = digits % 10;
        int hundreds = digits / 10;

        System.out.println("The sum of the digits is " + (ones + tens  + hundreds));
    }
}
