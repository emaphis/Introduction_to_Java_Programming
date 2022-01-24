/*
 * Exercise 8.6
 *  (Algebra: multiply two matrices) Write a method to multiply two matrices. The
 *  header of the method is:
 *
 *      public static double[][] multiplyMatrix(double[][] a, double[][] b)
 *
 *  To multiply matrix a by matrix b, the number of columns in a must be the same as
 *  the number of rows in b, and the two matrices must have elements of the same or
 *  compatible types. Let c be the result of the multiplication. Assume the column size
 *  of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + g + ain * bnj.
 *  For example, for two 3 * 3 matrices a and b,
 *
 *  Write a test program that prompts the user to enter two 3 * 3 matrices and
 *  displays their product.
 */
package chapter08.exercise.exercise08_06;


import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class MatrixMultipication {
    static final int SIZE = 3;

    public static void main(String[] fargs) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix1: ");
        double matrix1[][] = get3by3Matrix(input);
        System.out.print("Enter matrix2: ");
        double matrix2[][] = get3by3Matrix(input);
        System.out.println();

        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

        printOutput(matrix1,matrix2, matrix3);

    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[3][3];

        for (int i = 0; i < c.length; i++)
            for (int j = 0; j < c[i].length; j++)
                for (int h = 0; h < c.length; h++)
                    c[i][j] += a[i][h] * b[h][j];

        return c;
    }

    public static double[][] get3by3Matrix(Scanner input) {
        double[][] matrix = new double[SIZE][SIZE];
        for (int row = 0; row < SIZE; row++)
            for (int col = 0; col < SIZE; col++)
                matrix[row][col] = input.nextDouble();
        return matrix;
    }

    private static void printOutput(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
        for (int row = 0; row < SIZE; row++) {

            for (int i = 0; i < SIZE; i++) {
                System.out.printf("%.1f ", matrix1[row][i]);
            }

            if (row == 1)
                System.out.print("  +  ");
            else
                System.out.print("     ");

            for (int i = 0; i < SIZE; i++) {
                System.out.printf("%.1f ", matrix2[row][i]);
            }

            if (row == 1)
                System.out.print("  =  ");
            else
                System.out.print("     ");

            for (int i = 0; i < SIZE; i++) {
                System.out.printf("%.1f ", matrix3[row][i]);
            }

            System.out.println("");
        }

    }
}
