/*
 * Exercise 8.2
 *  (Sum the major diagonal in a matrix) Write a method that sums all the numbers
 *  in the major diagonal in an n * n matrix of double values using the following
 *  heade
 *
 *      public static double sumMajorDiagonal(double[][] m)
 *
 *  Write a test program that reads a 4-by-4 matrix and displays the sum of all its
 *  elements on the major diagonal.
 */
package chapter08.exercise.exercise08_02;

import java.util.Scanner;

/**
 * Sum the major diagonal in a matrix
 * @author emaph
 */
public class SumMajorDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int ROWS = 4;
        final int COLS = 4;

        System.out.println("Enter a " + ROWS +  "−by−" + COLS +  " matrix row by row:");
        double[][] matrix  = getMatrix(ROWS, COLS, input);

        double sum = sumMajorDiagonal(matrix);
        System.out.println("Sum of the elements in the major diagonal is " + sum);
    }

    /** sum the major diagonal of a square matrix */
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
            //sum += m[i][m.length - i -];
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
