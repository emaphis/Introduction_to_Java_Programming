/*
 * Exercise 10.6
 *  (Display the prime numbers) Write a program that displays all the prime num-
 *  bers less than 120 in decreasing order. Use the StackOfIntegers class to
 *  store the prime numbers (e.g., 2, 3, 5, . . . ) and retrieve and display them in
 *  reverse order.
 */
package chapter10.exercise.exercise10_06;

import chapter10.example.listing10_07.StackOfIntegers;

/**
 * Display the prime numbers
 * @author emaph
 */
public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        final int NUM = 120;

        StackOfIntegers stack = getPrimeNumbers(NUM);

        while (!stack.empty()) {
            System.out.print(stack.pop() + (stack.empty() ? " " : ", "));
        }
    }

    /* find prime numbers of a given number */
    public static StackOfIntegers getPrimeNumbers(int number) {
        StackOfIntegers stack = new StackOfIntegers();
        while (number >= 2) {
            if (isPrime(number))
                stack.push(number);
            number--;
        }
        return stack;
    }

    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        double limit = Math.sqrt(number);
        for (int divisor = 2; divisor <= limit; divisor++)
            if (number % divisor == 0)    // If true, number is not prime
                return false;
        return true;   // Number is prime
    }
}
