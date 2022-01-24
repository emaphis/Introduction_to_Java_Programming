/*
 * Exercise 7.11
 *  (Statistics: compute deviation) Programming Exercise 5.45 computes the standard
 *  deviation of numbers. This exercise uses a different but equivalent formula to
 *  compute the standard deviation of n numbers
 *
 *  To compute the standard deviation with this formula, you have to store the indi-
 *  vidual numbers using an array, so they can be used after the mean is obtained.
 *
 *  Your program should contain the following methods
 *
 *      ** Compute the deviation of double values
 *      public static double deviation(double[] x)
 *
 *      ** Compute the mean of an array of double values *
 *      public static double mean(double[] x)
 *
 *  Write a test program that prompts the user to enter 10 numbers and displays the
 *  mean and standard deviation, as presented in the following sample run:
 */

package chapter07.exercise.exercise07_11;

import java.util.Scanner;

/**
 * Compute mean and standard deviation
 * @author emaph
 */
public class ComputeStandardDeviattion {
    public static void main(String[] args) {
        final int SIZE = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        double data[] = getDoubleArray(input, SIZE);

        double mean = mean(data);
        double stdDeviation = deviation(data);

        System.out.printf("The mean is %.2f\n", mean);
        System.out.printf("The standard deviation is %.5f\n", stdDeviation);
    }

    /** Compute the deviation of double values */
    public static double deviation(double[] data) {
        double sumX = 0;
        double sumX2 = 0;    // Sum of X squared.
        int n = 0;

        // Read in LIMIT numbers to process
        for (int i = 0; i < data.length; i++) {
            double x = data[i];

            sumX += x;
            sumX2 += x * x;
            n++;
        }
        
        return Math.sqrt((sumX2 - sumX * sumX / n) / (n - 1));
    }


    /** Compute the mean of an array of double values */
    public static double mean(double[] data) {
        double sumX = 0;
        int n = 0;

        for (int i = 0; i < data.length; i++) {
            double x = data[i];

            sumX += x;
            n++;
        }

        return sumX / n;
    }


    private static double[] getDoubleArray(Scanner input, int size) {
        double[] out = new double[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextDouble();
        }
        return out;
    }
}

//  1 2 3 4.5 5.6 6 7 8 9 10
// The mean is 5.61
// The standard deviation is 2.99794

// 1.9 2.5 3.7 2 1 6 3 4 5 2
// The mean is 3.11
// The standard deviation is 1.55738
