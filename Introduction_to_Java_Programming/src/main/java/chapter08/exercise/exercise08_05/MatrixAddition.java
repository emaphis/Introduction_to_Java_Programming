/*
 * Exercise 8.5
 *  (Algebra: add two matrices) Write a method to add two matrices. The header of
 *  the method is as follows:
 *
 *      public static double[][] addMatrix(double[][] a, double[][] b)
 *
 *  In order to be added, the two matrices must have the same dimensions and the
 *  same or compatible types of elements. Let c be the resulting matrix. Each ele-
 *  ment cij is aij + bij. For example, for two 3 * 3 matrices a and b, c
 *
 *  Write a test program that prompts the user to enter two 3 * 3 matrices and dis-
 *  plays their sum
 */
package chapter08.exercise.exercise08_05;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class MatrixAddition {
    static final int SIZE = 3;

    public static void main(String[] fargs) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix1: ");
        double matrix1[][] = get3by3Matrix(input);
        System.out.print("Enter matrix2: ");
        double matrix2[][] = get3by3Matrix(input);
        System.out.println();

        double[][] matrix3 = addMatrix(matrix1, matrix2);

        printOutput(matrix1,matrix2, matrix3);

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] out = new double[SIZE][SIZE];
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                out[row][col] = a[row][col] + b[row][col];
            }
        }
        return out;
    }

    public static double[][] get3by3Matrix(Scanner input) {
        double[][] matrix = new double[SIZE][SIZE];
        for (int row = 0; row < SIZE; row++)
            for (int col = 0; col < SIZE; col++)
                matrix[row][col] = input.nextDouble();
        return matrix;
    }

    private static void printOutput(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
        for (int row = 0; row < SIZE; row++) {

            for (int i = 0; i < SIZE; i++) {
                System.out.printf("%.1f ", matrix1[row][i]);
            }

            if (row == 1)
                System.out.print("  +  ");
            else
                System.out.print("     ");

            for (int i = 0; i < SIZE; i++) {
                System.out.printf("%.1f ", matrix2[row][i]);
            }

            if (row == 1)
                System.out.print("  =  ");
            else
                System.out.print("     ");

            for (int i = 0; i < SIZE; i++) {
                System.out.printf("%.1f ", matrix3[row][i]);
            }

            System.out.println("");
        }

    }
}
