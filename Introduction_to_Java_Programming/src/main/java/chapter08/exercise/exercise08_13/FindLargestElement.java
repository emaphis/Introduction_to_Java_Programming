/*
 * Exercise 8.13
 *  (Locate the largest element) Write the following method that returns the location
 *  of the largest element in a two-dimensional array:
 *
 *      public static int[] locateLargest(double[][] a)
 *
 *  The return value is a one-dimensional array that contains two elements. These
 *  two elements indicate the row and column indices of the largest element in the
 *  two-dimensional array. If there are more than one largest element, return the
 *  smallest row index and then the smallest column index.
 *
 *  Write a test program that prompts the user to enter a two-dimensional array and
 *  displays the location of the largest element in the array.
 */
package chapter08.exercise.exercise08_13;

import java.util.Arrays;
import java.util.Scanner;

/**
 *nLocate the largest element
 * @author emaph
 */
public class FindLargestElement {

    /**
     * Main method
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        final int ROWS = input.nextInt();
        final int COLS = input.nextInt();

        System.out.println("Enter the array:");
        double[][] matrix  = getMatrix(ROWS, COLS, input);

        int[] location = locateLargest(matrix);

        System.out.println("The location of the largest element is ar ("
                + location[0] + ", " + location[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] location = new int[2];
        double max = a[0][0];

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
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
