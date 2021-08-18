/*
 * Listing 7.1
 * Case Study: Analyzing Number
 *  The problem is to write a program that finds the number of items above the average of
 *  all items.
 */
package chapter07.example.listing07_01;

import java.util.Scanner;

/**
 * Analyzing Numbers
 * @author emaph
 */
public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum =  0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        // The numbers above average
        int count = 0;
        for (int i = 0; i < n; i++)
            if (numbers[i] == average)
                count++;

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
    }
}
