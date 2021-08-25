/*
 * Listing 8.4
 * 8.4 Passing Two-Dimensional Arrays to Methods
 *  When passing a two-dimensional array to a method, the reference of the array is
 *  passed to the method.
 */
package chapter08.exercise;

import java.util.Scanner;

/**
 * Passing Two-Dimensional Arrays to Methods
 * @author emaph
 */
public class PassTwoDimenisonalArray {
    public static void main(String[] args) {
        int[][] m = getArray();  // get an array

        // Display sum of leemnts
        System.out.println("\nSum of all elements is " + sum(m));
    }

    private static int[][] getArray() {
        Scanner input = new Scanner(System.in);

        // Enter array values
        int[][] m = new int[3][4];
        System.out.println("Enter: " + m.length + " rows and "
            + m[0].length  + " columns: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextInt();

        return m;
    }

    private static int sum(int[][] m) {
        int total = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                total += m[i][j];

        return total;
    }
}
