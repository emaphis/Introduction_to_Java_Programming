/*
 * Exercise 8.22
 *  (Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with
 *  0s and 1s. All rows and all columns have an even number of 1s. Let the user flip
 *  one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which
 *  cell was flipped. Your program should prompt the user to enter a 6-by-6 array
 *  with 0s and 1s and find the first row r and first column c where the even number
 *  of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell
 *  is at (r, c).
 */
package chapter08.exercise.exercise08_23;

import java.util.Scanner;

/**
 * Find the flipped cell
 * @author emaph
 */
public class FindFlippedCell {
    public static void main(String[] args) {
        final int SIZE = 6;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a " + SIZE + "-by-" + SIZE + "matrix row by row");
        int[][] array = init(SIZE, input);

        int i = checkRows(array);
        int j = checkColumns(array);
        System.out.println("The flipped cell is at (" + i + ", " + j + ")");
    }


    private static int checkRows(int[][] array) {
        int i, j;
        for (i = 0; i < array.length; i++) {
            int sum = 0;
            for (j = 0; j < array[i].length; j++)
                sum += array[i][j];

            if (sum % 2 != 0)
                return i;
        }
        return -1;
    }

    private static int checkColumns(int[][] array) {
        int i, j;
        for (j = 0; j < array[0].length; j++) {
            int sum = 0;
            for (i = 0; i < array.length; i++)
                sum += array[i][j];

            if (sum % 2 != 0)
                return j;
        }
        return -1;
    }

    private static int[][] init(int SIZE, Scanner input) {
        int[][] array = new int[SIZE][SIZE];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
}
