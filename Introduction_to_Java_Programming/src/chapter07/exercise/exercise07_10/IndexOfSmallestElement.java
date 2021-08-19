/*
 * Exercise 7.10
 *  (Find the index of the smallest element) Write a method that returns the index of
 *  the smallest element in an array of integers. If the number of such elements is
 *  greater than 1, return the smallest index. Use the following header
 *
 *      public static int indexOfSmallestElement(double[] array)
 *
 *  Write a test program that prompts the user to enter 10 numbers, invokes this
 *  method to return the index of the smallest element, and displays the index.
 */
package chapter07.exercise.exercise07_10;

import java.util.Scanner;

/**
 * Find the index of the smallest element
 * @author emaph
 */
public class IndexOfSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE = 10;

        System.out.print("Enter 10 numbers: ");
        double[] array = getDoubleArray(input, SIZE);
        int index = indexOfSmallestElement(array);
        System.out.println("The index of the minimum number is " + index);
    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
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
// should be 4

