/*
 * Exercise 5.17
 *  (Display pyramid) Write a program that prompts the user to enter an integer from
 *  1 to 15 and displays a pyramid,
 *      Example for 7
 *             1
 *           2 1 2
 *         3 2 1 2 3
 *        4 3 2 1 2 3 4
 *      5 4 3 2 1 2 3 4 5
 *    6 5 4 3 2 1 2 3 4 5 6
 *  7 6 5 4 3 2 1 2 3 4 5 6 7
 */
package chapter05.exercise.exercise05_17;

import java.util.Scanner;

/**
 * @author emaph
 */
public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of ines: ");
        final int SIZE = input.nextInt();

        for (int i = 1; i <= SIZE; i++) {

            // print out spaces
            for (int j = i; j < SIZE ; j++)
                System.out.print("  ");

            // Print first half
            for (int j  = i; j > 0; j--)
                System.out.print(j + " ");

            // Print second half
            for (int j = 2; j <= i; j++)
                 System.out.print(j + " ");

            System.out.println();
        }
    }
}
