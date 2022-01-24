/*
 * Exercise 7.2
 *  (Reverse the numbers entered) Write a program that reads 10 integers then dis-
 *  plays them in the reverse of the order in which they were read.
 */
package chapter07.exercise.exercise07_02;

import java.util.Scanner;

/**
 * Reverse numbers
 * @author emaph
 */
public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Output
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
