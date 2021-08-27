/*
 * Exercise 8.10
 *  (Largest row and column) Write a program that randomly fills in 0s and 1s into
 *  a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 *  most 1s. Here is a sample run of the program:
 */
package chapter08.exercise.exercise08_10;

/**
 * Largest row and column
 * @author emaph
 */
public class LargesrRowColumn {
    public static void main(String[] args) {
        int[][] matrix = getMatrix(4);

        printMatrix(matrix);

        int rowIdx = getMaxRow(matrix);
        int colIdx = getMaxColumn(matrix);

        System.out.println("The largese row index: " + rowIdx);
        System.out.println("The largest column index: " + colIdx);
    }

    public static int getMaxRow(int[][] matrix) {
        int rowIdx = 0;
        int maxSum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
           maxSum += matrix[0][j];
        }
        //int sum = 0;

        for (int i = 1; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                rowIdx = i;
            }
        }
        return rowIdx;
    }

    public static int getMaxColumn(int[][] matrix) {
        int colIdx = 0;
        int maxSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            maxSum += matrix[i][0];
        }

        for (int j = 1; j < matrix[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                colIdx = j;
            }
        }
        return colIdx;

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
