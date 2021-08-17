/*
 * Exercise 6.17
 *  (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix
 *  using the following header
 *
 *      public static void printMatrix(int number)
 *
 *  hat prompts the user to enter n and displays an n-by-n matrix.
 *
 *  Each element is 0 or 1, which is generated randomly. Write a test program that
 *  prompts the user to enter n and displays an n-by-n matrix.
 */
package chapter06.exercise.exercise06_17;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class DisplayMatrixOf0s1s {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enters size of matrix: ");
        int number = input.nextInt();

        printMatrix(number);
    }

    /** Method printMatrix displays an n-by-n matrix */
    public static void printMatrix(int number) {
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                System.out.print(flip() + " ");
            }
            System.out.println();
        }
    }

    /** generate a random 1 or 0 */
    static int flip() {
        return (int) (Math.random() * 2);
    }
}
