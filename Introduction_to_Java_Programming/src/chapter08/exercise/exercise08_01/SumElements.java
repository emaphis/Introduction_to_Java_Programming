 /*
 * Exercise 8.1
 *  (Sum elements column by column) Write a method that returns the sum of all the
 *  elements in a specified column in a matrix using the following header:
 *
 *      public static double sumColumn(double[][] m, int columnIndex)
 *
 *  Write a test program that reads a 3-by-4 matrix and displays the sum of each
 *  column.
 */
package chapter08.exercise.exercise08_01;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class SumElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int ROWS = 3;
        final int COLS = 4;

        System.out.println("Enter a " + ROWS +  "−by−4" + COLS +  " matrix row by row:");
        double[][] matrix  = getMatrix(ROWS, COLS, input);

        for (int col = 0; col < matrix[0].length; col++) {
            double sum = sumColumn(matrix, col);
            System.out.println("Sum of the elelements at column " + col + " is " + sum);
        }
    }


    /** sum returns the sum of the elements in columnIndex */
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }

    private static double[][] getMatrix(int rows, int cols, Scanner input) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }
}
