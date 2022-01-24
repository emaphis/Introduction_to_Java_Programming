/*
 * Exercise 4.10
 *  (Decimal to hex) Write a program that prompts the user to enter an integer be-
 *  tween 0 and 15 and displays its corresponding hex number. For an incorrect
 *  input number, display invalid input.
 */
package chapter04.exercise.exercise04_11;

import java.util.Scanner;

/**
 * Convert Decimal Numbers to Hexadecimals
 * @author emaph
 */
public class DecimalToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        if (decimal >= 0 && decimal <= 9) {
            System.out.println("The hex value is " + decimal);
        } else if (decimal >= 10 && decimal <= 15) {
            char hex = (char) (decimal + 'A' - 10);
            System.out.println("The hex value is " + hex);
        } else {
            System.out.println(decimal + " is an invalid input");
        }

    }
}
