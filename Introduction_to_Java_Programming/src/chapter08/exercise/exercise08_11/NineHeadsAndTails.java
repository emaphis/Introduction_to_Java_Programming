/*
 * Exercise 8.11
 *  (Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
 *  face up and some face down. You can represent the state of the coins using a
 *  3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
 *
 *      0 0 0   1 0 1   1 1 0   1 0 1   1 0 0
 *      0 1 0   0 0 1   1 0 0   1 1 0   1 1 1
 *      0 0 0   1 0 0   0 0 1   1 0 0   1 1 0
 *
 *  Each state can also be represented using a binary number. For example, the pre-
 *  ceding matrices correspond to the numbers
 *
 *      000010000 101001100 110100001 101110100 100111110
 *
 *  There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3, . . . ,
 *  and 511 to represent all states of the matrix. Write a program that prompts the
 *  user to enter a number between 0 and 511 and displays the corresponding matrix
 *  with the characters H and T. In the following sample run, the user entered 7, which
 *  corresponds to 000000111. Since 0 stands for H and 1 for T, the output is correct.
 */
package chapter08.exercise.exercise08_11;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class NineHeadsAndTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        int[][] matrix = new int[3][3];

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                matrix[i][j] = number % 2;
                number /= 2;
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    System.out.print("T ");
                else
                    System.out.print("H ");
            }
            System.out.println();
        }
    }
}
