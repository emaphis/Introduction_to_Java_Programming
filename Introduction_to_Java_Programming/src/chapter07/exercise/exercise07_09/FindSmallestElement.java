/*
 * Exercise 7.9
 *  (Find the smallest element) Write a method that finds the smallest element in an
 *  array of double values using the following header:
 *
 *      public static double min(double[] array)
 *
 *  Write a test program that prompts the user to enter 10 numbers, invokes this
 *  method to return the minimum value, and displays the minimum value. Here is a
 *  sample run of the program:
 */
package chapter07.exercise.exercise07_09;

import java.util.Scanner;

/**
 * Find the smallest element
 * @author emaph
 */
public class FindSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE = 10;

        System.out.print("Enter 10 numbers: ");
        double[] array = getDoubleArray(input, SIZE);
        double min = min(array);
        System.out.println("The minimum number is " + min);
    }


    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }


    private static double[] getDoubleArray(Scanner input, int size) {
        double[] out = new double[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextDouble();
        }
        return out;
    }
}

//  1.9 2.5 3.7 2 1.5 6 3 4 5 2

