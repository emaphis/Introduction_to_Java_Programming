/*
 * Exercise 7.8
 *  (Average an array) Write two overloaded methods that return the average of an
 *  array with the following headers:
 *
 *      public static double average(int[] array)
 *      public static double average(double[] array)
 *
 *  Write a test program that prompts the user to enter 10 integers, invokes the first
 *  method, then displays the average value; prompts the user to enter 10 double
 *  values, invokes the second method, then displays the average value.
 */
package chapter07.exercise.exercise07_08;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class AverageAnArray {

    public static void main(String[] args) {
        final int SIZE = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 intgers to average: ");
        int[] intArray = getIntArray(input, SIZE);
        double intAverage = average(intArray);
        System.out.println("Average ints is " + intAverage);

        System.out.print("Enter 10 doubles to average: ");
        double[] doubleArray = getDoubleArray(input, SIZE);
        double doubleAverage = average(doubleArray);
        System.out.println("Average of doubles is " + doubleAverage);
    }


    public static double average(int[] array) {
        double sum = 0;
        for (int i : array)
            sum += i;
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double d : array)
            sum += d;
        return sum / array.length;
    }

    private static int[] getIntArray(Scanner input, int size) {
        int[] out = new int[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextInt();
        }
        return out;
    }

    private static double[] getDoubleArray(Scanner input, int size) {
        double[] out = new double[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextDouble();
        }
        return out;
    }
}

// 1 2 3 4 5 6 7 8 9 0

// 1.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 9.0 0.0
