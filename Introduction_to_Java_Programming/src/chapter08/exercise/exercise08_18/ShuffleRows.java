/*
 * Exercise 8.18
 *  (Shuffle rows) Write a method that shuffles the rows in a two-dimensional int
 *  array using the following header:
 *
 *      public static void shuffle(int[][] m)
 *
 *  Write a test program that shuffles the following matrix:
 *
 *      int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
 */
package chapter08.exercise.exercise08_18;

import java.util.Random;

/**
 *
 * @author emaph
 */
public class ShuffleRows {
    public static void main(String[] args) {
        // Array to shuffle
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        shuffle(m);

        printArray(m);
    }

    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int i1 = (int)(Math.random() * m.length);

            int[] temp = m[i];
            m[i] = m[i1];
            m[i1] = temp;
        }
    }

    public static void printArray(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println("{" + m[i][0] + ", " + m[i][1] + "}");
        }
    }
}
