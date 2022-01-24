/*
 * Exercise 5.45
 *  Statistics: compute mean and standard deviation) In business applications, you
 *  are often asked to compute the mean and standard deviation of data. The mean is
 *  simply the average of the numbers. The standard deviation is a statistic that tells
 *  you how tightly all the various data are clustered around the mean in a set of data.
 *  For example, what is the average age of the students in a class? How close are the
 *  ages? If all the students are the same age, the deviation is 0.
 *
 *  Write a program that prompts the user to enter 10 numbers and displays the
 *  mean and standard deviations of these numbers using the following formula:
 */
package chapter05.exercise.exercise05_45;

import java.util.Scanner;

/**
 * Compute mean and standard deviation
 * @author emaph
 */
public class ComputeMeanAndStandardDeviattion {
    public static void main(String[] args) {
        final int LIMIT = 10;
        double sumX = 0;
        double sumX2 = 0;    // Sum of X squared.
        int n = 0;

        // Read in LIMIT numbers to process
        System.out.print("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < LIMIT; i++) {
            double x = input.nextDouble();

            sumX += x;
            sumX2 += x * x;
            n++;
        }

        double mean = sumX / n;
        double stdDeviation = Math.sqrt((sumX2 - sumX * sumX / n) / (n - 1));

        System.out.printf("The mean is %.2f\n", mean);
        System.out.printf("The standard deviation is %.5f\n", stdDeviation);
    }
}
