/*
 * Exercise 8.28
 *  (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 *  identical if their corresponding elements are equal. Write a method that returns
 *  true if m1 and m2 are strictly identical, using the following header:
 *
 *      public static boolean equals(int[][] m1, int[][] m2)
 *
 *  Write a test program that prompts the user to enter two 3 * 3 arrays of integers
 *  and displays whether the two are strictly identical.
 */
package chapter08.exercise.exercise08_28;

import java.util.Scanner;

/**
 * Strictly identical arrays
 * @author emaph
 */
public class StrictlyIdenticalArrays {
    public static void main(String[] args) {
        final int SIZE = 3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list1: ");
        int[][] list1 = init(SIZE, input);
        System.out.print("Enter a list1: ");
        int[][] list2 = init(SIZE, input);

        if (equals(list1, list2))
            System.out.println("The two arrays are strictly identical");
        else
            System.out.println("The two arrays are not strictly identical");
    }

    private static int[][] init(int size, Scanner input) {
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length)
            return false;
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length)
                return false;
            for (int j = 0; j < m1[i].length; j++)
                if (m1[i][j] != m2[i][j])
                    return false;
        }
        return true;
    }
}
