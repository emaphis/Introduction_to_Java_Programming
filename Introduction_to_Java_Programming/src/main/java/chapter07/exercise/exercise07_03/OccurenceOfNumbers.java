/*
 * Exercise 7.3
 *  Count occurrence of numbers) Write a program that reads the integers between
 *  1 and 100 and counts the occurrences of each. Assume the input ends with 0. Here
 *  is a sample run of the program: Note that if a number occurs more than one time, the
 *  plural word “times” is used in the output. Numbers are displayed in increasing order.
 */
package chapter07.exercise.exercise07_03;

import java.util.Scanner;

/**
 * Count occurrence of numbers
 * @author emaph
 */
public class OccurenceOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[100];
        int num;

        System.out.print("Enter the integers between 1 and 100: ");
        do  {
            num = input.nextInt();

            if (num >= 1)
                numbers[num - 1]++;
        } while (num != 0);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0)
                System.out.println((i + 1) + " occurs " + numbers[i] + " times");
        }

    }
}
