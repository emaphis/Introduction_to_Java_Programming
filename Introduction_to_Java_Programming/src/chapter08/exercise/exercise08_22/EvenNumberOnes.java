/*
 * Exercise 8.22
 *  (Even Inumber of 1s) Write a program that generates a 6-by-6 two-dimensional
 *  matrix filled with 0s and 1s, displays the matrix, and checks if every row and
 *  every column have an even number of 1s.
 */
package chapter08.exercise.exercise08_22;

import java.util.Arrays;

/**
 * Even number of 1s
 * @author emaph
 */
public class EvenNumberOnes {
    public static void main(String[] args) {
        final int SIZE = 6;
        int[][] array = init(SIZE);
        printArray(array);

        if (checkRows(array))
            System.out.println("All rows are even");
        if (checkColumns(array))
            System.out.println("All columns are even");
    }

    private static int[][] init(int size) {
        int [][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }
        return array;
    }

    private static boolean checkRows(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++)
                sum += array[i][j];

            if (sum % 2 == 0)
                return false;
        }
        return true;
    }


    private static boolean checkColumns(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < array.length; i++)
                sum += array[i][j];

            if (sum % 2 == 0)
                return false;
        }
        return true;
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
