/*
 * Exercise 8.27
 *  Column sorting) Implement the following method to sort the columns in a
 *  two-dimensional array. A new array is returned and the original array is intact.
 *
 *      public static double[][] sortColumns(double[][] m)
 *
 *  Write a test program that prompts the user to enter a 3 * 3 matrix of double
 *  values and displays a new column-sorted matrix.
 */
package chapter08.exercise.exercise08_27;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class ColumnSorting {
    public static void main(String[] args) {
        final int SIZE = 3;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] m = init(SIZE, input);

        double[][] m2 = sortColumns(m);
        printArray(m2);
    }

    public static double[][] sortColumns(double[][] m) {
        double[][] matrix = new double[m.length][m[0].length];
        for (int col = 0; col < m[0].length; col++) {
            double[] column = new double[m.length];
            for (int row = 0; row < m.length; row++) {
                column[row] = m[row][col];
            }

            sortColumn(column);

            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = column[row];
            }
        }
        return matrix;
    }


   private static void sortColumn(double[] col) {
        for (int i = 0; i < col.length; i++) {
            double min = col[i];
            int idx = i;
            for (int j = i + 1; j < col.length; j++) {
                if (min > col[j]) {
                    min = col[j];
                    idx = j;
                }
            }
            if (idx != i) {
                col[idx] = col[i];
                col[i] = min;
            }
        }
    }


    private static double[][] init(int size, Scanner input) {
        double[][] array = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }

    private static void printArray(double[][] m2) {
        for (double[] row : m2) {
            for (double d : row) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}
