/*
 * Exercise 6.4
 *  (Display an integer reversed) Write a method with the following header to dis-
 *  play an integer in reverse order:
 *
 *      public static void reverse(int number)
 *
 *  For example, reverse(3456) displays 6543. Write a test program that prompts
 *  the user to enter an integer then displays its reversal.
 */
package chapter06.exercise.exercise06_04;

import java.util.Scanner;

/**
 * Display an integer reversed
 * @author emaph
 */
public class DisplayIntegerReversed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Display the reverse of number
        reverse(number);
    }

    /** print out revers of passed integer */
    public static void reverse(int n) {
        int digit;
        while (n > 0) {
            digit = n % 10;
            System.out.print(digit);
            n /= 10;
        }

        System.out.println();
    }

}
