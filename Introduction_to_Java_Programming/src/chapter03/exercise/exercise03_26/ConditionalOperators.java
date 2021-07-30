/*
 * Exercise 3.26
 *  (Use the &&, ||, and ^ operators) Write a program that prompts the user to
 *  enter an integer and determines whether it is divisible by 5 and 6, whether it is
 *  divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 */
package chapter03.exercise.exercise03_26;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        System.out.println("Is " + num + " divisible by 5 and 6? "
            + (num % 5 == 0 && num % 6 == 0));
        System.out.println("Is " + num + " divisible by 5 or 6? "
            + (num % 5 == 0 || num % 6 == 0));
        System.out.println("Is " + num + " divisible by 5 or 6 but not both? "
            + (num % 5 == 0 ^ num % 6 == 0));
    }
}
