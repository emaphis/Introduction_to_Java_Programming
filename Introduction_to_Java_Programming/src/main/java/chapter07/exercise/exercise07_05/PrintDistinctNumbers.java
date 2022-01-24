/*
 * Exercise 7.5
 *  (Print distinct numbers) Write a program that reads in 10 numbers and displays the
 *  number of distinct numbers and the distinct numbers in their input order and sepa-
 *  rated by exactly one space (i.e., if a number appears multiple times, it is displayed
 *  only once). (Hint: Read a number and store it to an array if it is new. If the number is
 *  already in the array, ignore it.) After the input, the array contains the distinct numbers.
 */
package chapter07.exercise.exercise07_05;

import java.util.Scanner;

/**
 * Print distinct numbers
 * @author emaph
 */
public class PrintDistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUM = 10;
        int[] numbers = new int[NUM];
        int count = 0;

        System.out.print("Enter 10 numbers ");
        for (int i = 0; i < numbers.length; i++) {
            int num = input.nextInt();

            // search and store
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == num)
                    break;
                else if (numbers[j] == 0) {
                    numbers[j] = num;
                    count++;
                    break;
                }
            }
        }

        // print
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0)
                System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
