/*
 * Exercise 5.38
 *  (Decimal to octal) Write a program that prompts the user to enter a decimal
 *  integer and displays its corresponding octal value. Don’t use Java’s Integer.
 *  toOctalString(int) in this program.
 */
package chapter05.exercise.exercise05_38;

import java.util.Scanner;

/**
 * Decimal to octal
 * @author emaph
 */
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer to convert: ");
        int number = input.nextInt();
        int temp = number;

        String octalStr = "";
        while (number != 0) {
            int digit = number % 8;
            octalStr = digit + octalStr;
            number /= 8;
        }

        System.out.println("My Octal:   " + octalStr);
        System.out.println("Comouter Octal: " + Integer.toOctalString(temp));
    }
}
