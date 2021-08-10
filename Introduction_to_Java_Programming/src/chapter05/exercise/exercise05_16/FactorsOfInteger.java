/*
 * Exercise 5.16
 *  (Find the factors of an integer) Write a program that reads an integer and dis-
 *  plays all its smallest factors in an increasing order. For example, if the input
 *  integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 */
package chapter05.exercise.exercise05_16;

import java.util.Scanner;

/**
 * @author emaph
 */
public class FactorsOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer to factor: ");
        int number = input.nextInt();

        int currentFactor = 2;

        while (number > 1) {
            if (number % currentFactor == 0) {
                System.out.print(currentFactor);
                number /= currentFactor;
                if (number != 1) System.out.print(", ");
            } else
                currentFactor++;  // try next number for facotization
        }
        System.out.println();
    }
}
