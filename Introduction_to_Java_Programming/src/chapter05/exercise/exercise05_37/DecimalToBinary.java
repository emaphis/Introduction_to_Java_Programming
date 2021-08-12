/*
 * Exercise 5.37
 *  (Decimal to binary) Write a program that prompts the user to enter a decimal
 *  integer then displays its corresponding binary value. Don’t use Java’s Integer.
 *  toBinaryString(int) in this program.
 */
package chapter05.exercise.exercise05_37;

import java.util.Scanner;

/**
 * Decimal to binary
 * @author emaph
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer to convert: ");
        int number = input.nextInt();
        int temp = number;

        String binaryStr = "";
        while (number != 0) {
            int digit = number % 2;
            binaryStr = digit + binaryStr;
            number /= 2;
        }

        System.out.println("My Binary:    " + binaryStr);
        System.out.println("Comouter Binary: " + Integer.toBinaryString(temp));
    }
}
