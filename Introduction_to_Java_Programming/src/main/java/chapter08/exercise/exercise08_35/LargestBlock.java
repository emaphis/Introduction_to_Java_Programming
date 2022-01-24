/*
 * Exercise 8.35
 *  (Largest block) Given a square matrix with the elements 0 or 1, write a program to
 *  find a maximum square submatrix whose elements are all 1s. Your program should
 *  prompt the user to enter the number of rows in the matrix. The program then dis-
 *  plays the location of the first element in the maximum square submatrix and the
 *  number of rows in the submatrix.
 *
 *  Your program should implement and use the following method to find the max-
 *  imum square submatrix:
 *
 *      public static int[] findLargestBlock(int[][] m)
 *
 *  The return value is an array that consists of three values. The first two values are
 *  the row and column indices for the first element in the submatrix, and the third
 *  value is the number of the rows in the submatrix. For an animation of this problem,
 *  see https://liveexample.pearsoncmg.com/dsanimation/LargestBlockeBook.html.
 */
// TODO: not always get right answer..
package chapter08.exercise.exercise08_35;

import java.util.Scanner;

/**
 * Largest block
 * @author emaph
 */
public class LargestBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        final int SIZE = input.nextInt();
        System.out.println("Enter the matrix row by row: ");
        int[][] matrix = getMatrix(SIZE, input);
        int[] point = findLargestBlock(matrix);

        if (point != null)
            System.out.println("The maximum square submatrix is at (" + point[0]
                    + ", "+ point[1] + ") with size " + point[2]);
    }


    public static int[] findLargestBlock(int[][] m) {
       int max = 0;
       int x = 0, y = 0;

        boolean found = false;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                int size = getBlockSize(m, i, j);
                if (size > max) {
                    max = size;
                    x = i;
                    y = j;
                    found = true;
                }
            }
        }

        if (!found) return null;

        return new int[] { x, y, max };
    }

    /** find block size of all ones at point row,col */
    public static int getBlockSize(int[][] m, int row, int col) {
        int max = 1;
        boolean block = true;

        while (block) {
            block = false;
            for (int i = row; i <= row + max; i++) {
                for (int j = col; j <= col + max; j++) {
                    if (col + max > m.length - 1 || row + max > m[i].length - 1)
                        return max;
                    if (m[i][j] != 1)
                        return max;
                }
            }
            block = true;
            max++;
        }
        return max;

    }


    private static int[][] getMatrix(int size, Scanner input) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

}
