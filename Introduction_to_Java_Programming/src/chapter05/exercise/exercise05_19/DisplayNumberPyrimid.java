/*
 * Exercise 5.19
 *  (Display numbers in a pyramid pattern) Write a nested for loop that prints the
 *  following output:
 *                              1
 *                          1   2   1
 *                      1   2   4   2   1
 *                  1   2   4   8   4   2   1
 *              1   2   4   8  16   8   4   2   1
 *          1   2   4   8  16  32  16   8   4   2   1
 *      1   2   4   8  16  32  64  32  16   8   4   2   1
 *  1   2   4   8  16  32  64 128  64  32  16   8   4   2   1
 */
package chapter05.exercise.exercise05_19;

import java.awt.BorderLayout;

/**
 * @author emaph
 */
public class DisplayNumberPyrimid {
    public static void main(String[] args) {
        final int SIZE = 8;

        // Display number pyrimid
        for (int i = 0; i < SIZE; i++) {

            // Print the blanks
            for (int j = 0; j < SIZE - i; j++)
                System.out.print("    ");

            for (int j = 0; j <= i; j++)
                System.out.printf("%4d", (int) Math.pow(2, j));

            for (int j = i - 1; j >= 0; j--) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }

            System.out.println();
        }
    }
}
