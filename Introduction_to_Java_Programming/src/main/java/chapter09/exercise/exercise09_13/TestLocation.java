/*
 * Exercise 9.13
 *  The Location class) Design a class named TestLocation for locating a maximal
 *  value and its location in a two-dimensional array. The class contains public data
 *  fields row, column, and maxValue that store the maximal value and its indices in
 *  a two-dimensional array with row and column as int types and maxValue as a
 *  double type.
 *
 *  Write the following method that returns the location of the largest element in a
 *  two-dimensional array
 *
 *      public static TestLocation locateLargest(double[][] a)
 *
 *  The return value is an instance of TestLocation. Write a test program that prompts
 *  the user to enter a two-dimensional array and displays the location of the largest
 *  element in the array.
 */
package chapter09.exercise.exercise09_13;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class TestLocation {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int col = input.nextInt();

        System.out.println("Enter the array: ");
        double[][] array = getArray(row, col, input);

        Location location = Location.locateLargest(array);
        printLocation(location);
    }


    private static double[][] getArray(int row, int col, Scanner input) {
        double[][] array = new double[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }

    private static void printLocation(Location location) {
        System.out.println("The location of the largest element is " + location.maxValue
                  + " at (" + location.row + ", " + location.column + ")");
    }
}

/*
Enter the number of rows and columns in the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The location of the largest element is 45.0 at (1, 2)
*/
