/*
 * Exercise 5.1
 *  (Count positive and negative numbers and compute the average of numbers)
 *  Write a program that reads an unspecified number of integers, determines how
 *  many positive and negative values have been read, and computes the total and av-
 *  erage of the input values (not counting zeros). Your program ends with the input
 *  0. Display the average as a floating-point number.
 */
package chapter05.exercise.exercise05_01;

import java.util.Scanner;

/**
 * Count positive and negative numbers and compute the average of numbers
 * @author emaph
 */
public class AverageNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SENTINEL = 0;     // Sentinel value
        int positiveCount = 0;      // Count of positive values
        int negativeCount = 0;      // Count of negative values
        int totalCount = 0;         // Count of values
        double total = 0;           // Running sum

        // Reed the values, stop at SENTINEL
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int num = -999;  // current value
        while (num != SENTINEL) {
            num = input.nextInt();

            if (num > 0)
                positiveCount++;
            else if (num < 0)
                negativeCount++;

            total += num;
        }

        totalCount = positiveCount + negativeCount;

        // Display results
        if (totalCount > 0) {
            System.out.println("The number of positives is " + positiveCount);
            System.out.println("The number of negatives is " + negativeCount);
            System.out.println("The total is " + total);
            System.out.println("The average is " + (total / totalCount));
        } else {
            System.out.println("No numbers are entered except " + SENTINEL);
        }
    }
}
