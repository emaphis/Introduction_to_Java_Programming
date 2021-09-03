/*
 * Exercise 8.26
 *  (Row sorting) Implement the following method to sort the rows in a two-
 *  dimensional array. A new array is returned and the original array is intact.
 *
 *      public static double[][] sortRows(double[][] m)
 *
 *  Write a test program that prompts the user to enter a 3 * 3 matrix of double
 *  values and displays a new row-sorted matrix
 */
package chapter08.exercise.exercise08_26;

import java.util.Scanner;

/**
 * Row sorting
 * @author emaph
 */
public class RowSorting {
    public static void main(String[] args) {
        final int SIZE = 3;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] m = init(SIZE, input);

        double[][] m2 = sortRows(m);
        System.out.println("The row-sorted array is");
        printArray(m2);
    }


    public static double[][] sortRows(double[][] m) {
        double[][] out = new double[m.length][];
        for (int row = 0; row < m.length; row++) {
            out[row] = sortRow(m[row]);
        }
        return out;
    }

   private static double[] sortRow(double[] aRow) {
        double[] row = copy(aRow);
        for (int col = 0; col < row.length; col++) {
            double min = row[col];
            int idx = col;
            for (int j = col + 1; j < row.length; j++) {
                if (min > row[j]) {
                    min = row[j];
                    idx = j;
                }
            }
            if (idx != col) {
                row[idx] = row[col];
                row[col] = min;
            }
        }
        return row;
    }

   /** create a new array and copy array parameter to it */
   public static double[] copy(double[] arr) {
       double[] out = new double[arr.length];
       for (int i = 0; i < arr.length; i++) {
           out[i] = arr[i];
       }
       return out;
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
