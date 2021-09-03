/*
 * Exercise 8.26
 *  (Markov matrix) An n * n matrix is called a positive Markov matrix if each
 *  element is positive and the sum of the elements in each column is 1. Write the
 *  following method to check whether a matrix is a Markov matrix:
 *
 *      public static boolean isMarkovMatrix(double[][] m)
 *
 *  Write a test program that prompts the user to enter a 3 * 3 matrix of double
 *  values and tests whether it is a Markov matrix.
 */
package chapter08.exercise.exercise08_25;

import java.util.Scanner;

/**
 * Markov matrix
 * @author emaph
 */
public class MarkovMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE = 3;

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] matrix = getMatrix(SIZE, input);

        if (isMarkovMatrix(matrix))
            System.out.println("It is a Markov matrix.");
        else
            System.out.println("It is not a Markov matrix.");
    }


    public static boolean isMarkovMatrix(double[][] m) {
        double sum;
        for (int i = 0; i < m[0].length; i++) {
            sum = 0;
            for (int j = 0; j < m.length; j++) {
                double num = m[j][i];
                if (num < 0.0) return false;
                sum += num;
            }
            if (sum != 1.0)
                return false;
        }
        return true;
    }

    private static double[][] getMatrix(int size, Scanner input) {
        double[][] matrix = new double[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

}
