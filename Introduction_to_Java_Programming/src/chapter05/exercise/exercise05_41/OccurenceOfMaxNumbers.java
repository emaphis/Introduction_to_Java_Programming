/*
 * Exercise 5.41
 *  (Occurrence of max numbers) Write a program that reads integers, finds the larg-
 *  est of them, and counts its occurrences. Assume the input ends with number 0.
 *  Suppose you entered 3 5 2 5 5 5 0; the program finds that the largest is 5 and
 *  the occurrence count for 5 is 4. If no input is entered, display "No numbers are
 *  entered except 0"
 *
 *  (Hint: Maintain two variables, max and count. max stores the current max
 *  number and count stores its occurrences. Initially, assign the first number to
 *  max and 1 to count. Compare each subsequent number with max. If the num-
 *  ber is greater than max, assign it to max and reset count to 1. If the number is
 *  equal to max, increment count by 1.
 */
package chapter05.exercise.exercise05_41;

import java.util.Scanner;

/**
 * Occurrence of max numbers
 * @author emaph
 */
public class OccurenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int END_VALUE = 0;
        int max = 0;
        int count = 0;  // count of max values, reset if new max
        int number;

        System.out.print("Enter numbers: ");

        do {
            number = input.nextInt();

            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        } while (number != END_VALUE);

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
