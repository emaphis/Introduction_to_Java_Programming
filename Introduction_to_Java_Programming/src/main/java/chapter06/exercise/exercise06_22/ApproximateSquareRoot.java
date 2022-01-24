/*
 * Exercise 6.22
 *  (Math: approximate the square root) There are several techniques for imple-
 *  menting the sqrt method in the Math class. One such technique is known as the
 *  Babylonian method. It approximates the square root of a number, n, by repeat-
 *  edly performing the calculation using the following formula:
 *
 *      nextGuess = (lastGuess + n / lastGuess) / 2
 *
 *  When nextGuess and lastGuess are almost identical, nextGuess is the
 *  approximated square root. The initial guess can be any positive value (e.g., 1).
 *  This value will be the starting value for lastGuess. If the difference between
 *  nextGuess and lastGuess is less than a very small number, such as 0.0001,
 *  you can claim that nextGuess is the approximated square root of n. If not,
 *  nextGuess becomes lastGuess and the approximation process continues.
 * Implement the following method that returns the square root of n:
 *
 *      public static double sqrt(long n)
 *
 *  Write a test program that prompts the user to enter a positive double value and
 *  displays its square root.
 */
package chapter06.exercise.exercise06_22;

import java.util.Scanner;

/**
 * Approximate the square root
 * @author emaph
 */
public class ApproximateSquareRoot {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        double root = sqrt(number);

        // Dispay square root
        System.out.println("Square root of number " + number + " is " + root);
        System.out.println("Check:  " + Math.sqrt(number));
    }


    /**  Calculate square root of a number using iteration */
    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = (lastGuess + n / lastGuess) / 2;
        final double THETA = 0.0001;

        while (Math.abs(nextGuess - lastGuess) > THETA) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }

        return nextGuess;
    }
}
