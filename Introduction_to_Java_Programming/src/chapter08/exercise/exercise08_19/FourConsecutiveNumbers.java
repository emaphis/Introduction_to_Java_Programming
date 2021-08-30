/*
 * Exercise 8.19
 *  (Pattern recognition: four consecutive equal numbers) Write the following
 *  method that tests whether a two-dimensional array has four consecutive numbers
 *  of the same value, either horizontally, vertically, or diagonally:
 *
 *      public static boolean isConsecutiveFour(int[][] values)
 *
 *  Write a test program that prompts the user to enter the number of rows and
 *  columns of a two-dimensional array then the values in the array, and displays true
 *  if the array contains four consecutive numbers with the same value. Otherwise,
 *  the program displays false. Here are some examples of the true cases:
 */
package chapter08.exercise.exercise08_19;

/**
 *
 * @author emaph
 */
public class FourConsecutiveNumbers {
    public static void main(String[] args) {
        int[][] test1 = {
            {0, 1, 0, 3, 1, 6, 1},
            {0, 1, 6, 8, 6, 0, 1},
            {5, 6, 2, 1, 8, 2, 9},
            {6, 5, 6, 1, 1, 9, 1},
            {1, 3, 6, 1, 4, 0, 7},
            {3, 3, 3, 3, 4, 0, 7}};

        int[][] test2 = {
            {0, 1, 0, 3, 1, 6, 1},
            {0, 1, 6, 8, 6, 0, 1},
            {5, 5, 2, 1, 8, 2, 9},
            {6, 5, 6, 1, 1, 9, 1},
            {1, 5, 6, 1, 4, 0, 7},
            {3, 5, 3, 3, 4, 0, 7}};

        int[][] test3 = {
            {0, 1, 0, 3, 1, 6, 1},
            {0, 1, 6, 8, 6, 0, 1},
            {5, 6, 2, 1, 6, 2, 9},
            {6, 5, 6, 6, 1, 9, 1},
            {1, 3, 6, 1, 4, 0, 7},
            {3, 6, 3, 3, 4, 0, 7}};

        int[][] test4 = {
            {0, 1, 0, 3, 1, 6, 1},
            {0, 1, 6, 8, 6, 0, 1},
            {9, 6, 2, 1, 8, 2, 9},
            {6, 9, 6, 1, 1, 9, 1},
            {1, 3, 9, 1, 4, 0, 7},
            {3, 3, 3, 9, 4, 0, 7}};


        System.out.println(isConsecutiveFour(test2));
    }

    public static boolean isConsecutiveFour(int[][] values) {
        boolean consecutive = false;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                consecutive = checkRow(i, j, values) ||
                              checkColumn(i, j, values) ||
                              checkMajDiagonal(i, j, values) ||
                              checkSubDiagonal(i, j, values);
                if (consecutive) return true;
            }
        }
        return consecutive;
    }

    private static boolean checkRow(int i, int j, int[][] values) {
        if (j > values[i].length - 4)
            return false;
        boolean consecutive = true;
        int num = values[i][j];
        for (int k = 1; k < 4; k++) {
            consecutive &= num == values[i][j + k];
        }
        return consecutive;
    }

    private static boolean checkColumn(int i, int j, int[][] values) {
        if (i > values.length - 4)
            return false;
        boolean consecutive = true;
        int num = values[i][j];
        for (int k = 1; k < 4; k++) {
            consecutive &= num == values[i + k][j];
        }
        return consecutive;
    }

    private static boolean checkMajDiagonal(int i, int j, int[][] values) {
        if (i > values.length - 4 || j > values[i].length - 4)
                return false;
        boolean consecutive = true;
        int num = values[i][j];
        for (int k = 1; k < 4; k++) {
            consecutive &= num == values[i + k][j + k];
        }
        return consecutive;
    }

    private static boolean checkSubDiagonal(int i, int j, int[][] values) {
        if (i > values.length - 4 || j < 4)
                return false;
        boolean consecutive = true;
        int num = values[i][j];
        for (int k = 1; k < 4; k++) {
            consecutive &= num == values[i + k][j - k];
        }
        return consecutive;
    }

}
