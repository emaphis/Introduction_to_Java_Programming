/*
 * Examples 8.3
 * Processing Two-Dimensional Arrays
 *  Nested for loops are often used to process a two-dimensional array.
 */
package chapter08.example.examples;

import java.util.Scanner;

/**
 * processing two dimensional arrays.
 * @author emaph
 */
public class Examples08_03 {

    // . Initializing arrays with input values. The following loop initializes the array with user
    //   input values:
    private static void inputValues(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
    }

    // 2. Initializing arrays with random values. The following loop initializes the array with
    //    random values between 0 and 99:
    private static void getRandoms(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * 100);
            }
        }
    }

    // 3. Printing arrays. To print a two-dimensional array, you have to print each element in the
    //    array using a loop like the following loop:
    private static void printArray(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }

            System.out.println();
        }
    }

    // 4. Summing all elements. Use a variable named total to store the sum. Initially total is
    //    0. Add each element in the array to total using a loop like this:
    public static void sumValues(int[][] matrix) {
        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++)
                total += matrix[row][column];
            System.out.println("Sum for column " + column + " is " + total);
        }
    }

    // 4. Summing all elements. Use a variable named total to store the sum. Initially total is
    //    0. Add each element in the array to total using a loop like this:
    public static int sumArray(int[][] matrix) {
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        return total;
    }

    // 6. Which row has the largest sum? Use variables maxRow and indexOfMaxRow to track
    //    the largest sum and index of the row. For each row, compute its sum and update maxRow
    //    and indexOfMaxRow if the new sum is greater.
    public static void getMax(int[][] matrix) {
        int maxRow = 0;
        int indexOfMaxRow = 0;

        // Get sum of the first row in maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }

        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++)
                totalOfThisRow += matrix[row][column];

            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
             }
        }

        System.out.println("Row " + indexOfMaxRow
                + " has the maximum sum of " + maxRow);
    }

    // 7. Random shuffling. Shuffling the elements in a one-dimensional array was introduced
    //    in Section 7.2.6. How do you shuffle all the elements in a two-dimensional array? To
    //    accomplish this, for each element matrix[i][j], randomly generate indices i1 and
    //    j1 and swap matrix[i][j] with matrix[i1][j1], as follows:
    public static void randomShuffling(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int)(Math.random() * matrix.length);
                int j1 = (int)(Math.random() * matrix[i].length);

                // Swap matrix[i][j] with matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        //inputValues(matrix);
        getRandoms(matrix);
        printArray(matrix);
        sumValues(matrix);
        int total = sumArray(matrix);
        System.out.println("total of array is " + total);
        getMax(matrix);
        randomShuffling(matrix);
        printArray(matrix);
    }
}
