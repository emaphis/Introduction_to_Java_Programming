/*
 * Exercise 8.14
 *  (Explore matrix) Write a program that prompts the user to enter the length of a
 *  square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
 *  finds the rows, columns, and diagonals with all 0s or 1s. Here is a sample run of
 *  the program:
 */
package chapter08.exercise.exercise08_14;

import java.util.Scanner;

/**
 * Largest row and column
 * @author emaph
 */
public class ExploreMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.print("Enter the size for the matrix: ");
        //int size = input.nextInt();
        int size = 3;

        int[][] matrix = getMatrix(size);

        printMatrix(matrix);
        System.out.println();

        checkRows(matrix);
        checkColumns(matrix);
        checkMajorDiagonal(matrix);
        checkSubDiagonal(matrix);
    }

    private static void checkRows(int[][] matrix) {
        boolean any = false;
        for (int i = 0; i < matrix.length; i++) {
            int item = matrix[i][0];
            boolean same = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (same && (item == matrix[i][j]))
                    same = true;
                else
                    same = false;
            }
            if (same) {
                any = true;
                System.out.println("All " + item + "s on row " + i);
            }
        }
        if (!any) System.out.println("No same numbers on a row");
    }


    private static  void checkColumns(int[][] matrix) {
        boolean any = false;
        for (int j = 0; j < matrix[0].length; j++) {
            int item = matrix[0][j];
            boolean same = true;
            for (int i = 0; i < matrix.length; i++) {
                if (same && (item == matrix[i][j]))
                    same = true;
                else
                    same = false;
            }

            if (same) {
                any = true;
                System.out.println("All " + item + "s on column " + j);
            }
        }

       if (!any) System.out.println("No same numbers on a column");
    }

    private static void checkMajorDiagonal(int[][] matrix) {
        boolean any = false;
        boolean same = true;
        int item = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            if (same && (item == matrix[i][i]))
                same = true;
            else
                same = false;
        }
        if (same)
            System.out.println("All " + item + "s on major diagonal");
        else
            System.out.println("No same numbers on the major diagonal");
    }


    private static void checkSubDiagonal(int[][] matrix) {
        boolean any = false;
        boolean same = true;
        int item = matrix[0][matrix.length - 1];
        for (int i = 0; i < matrix.length; i++) {
            if (same && (item == matrix[i][matrix.length - i - 1]))
                same = true;
            else
                same = false;
        }
        if (same)
            System.out.println("All " + item + "s on sub-diagonal");
        else
            System.out.println("No same numbers on the sub-diagonal");
    }


    private static int[][] getMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.random() > 0.5 ? 1 : 0;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
