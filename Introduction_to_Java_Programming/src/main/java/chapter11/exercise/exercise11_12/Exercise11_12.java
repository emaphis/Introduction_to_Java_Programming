/*
 * Exercise 11.12
 *  (Sum ArrayList) Write the following method that returns the sum of all
 *  num￾bers in an ArrayList:
 *
 *      public static double sum(ArrayList<Double> list)
 *
 *  Write a test program that prompts the user to enter five numbers, stores them in
 *  an array list, and displays their sum.
 */
package chapter11.exercise.exercise11_12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sum ArrayList
 * @author emaph
 */
public class Exercise11_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE = 5;
        ArrayList<Double> list = new ArrayList<>();

        // Get 5 numbers
        System.out.print("Enter five double values: ");
        for (int i = 0; i < SIZE; i++) {
            list.add(input.nextDouble());
        }

        double num = sum(list);
        System.out.println("The sum is " + num);
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (Double num : list) {
            sum += num;
        }
        return sum;
    }
}
