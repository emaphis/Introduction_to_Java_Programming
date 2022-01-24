/*
 * Exercise 6.6
 *  Display patterns) Write a method to display a pattern as follows:
 *
 *                    1
 *                  2 1
 *                3 2 1
 *      ...
 *      n n–1 ... 3 2 1
 *
 *  The method header is
 *
 *      public static void displayPattern(int n)
 *
 *  Write a test program that prompts the user to enter a number n and invokes dis-
 *  playPattern(n) to display the pattern.
 */
package chapter06.exercise.exercise06_06;

import java.util.Scanner;

/**
 * Display patterns
 * @author emaph
 */
public class DisplayPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        displayPattern(num);
    }


    public static void displayPattern(int n) {

        for (int i = 1; i <= n; i++) {

            // display spaces
            for (int j = i; j <= n - 1; j++)
                System.out.print("  ");

            // dispay nimbers
            for (int j = i; j > 0 ; j--)
                System.out.print(" " + j);

            System.out.println();
        }

        // display numbers


       //System.out.println();
    }

}
