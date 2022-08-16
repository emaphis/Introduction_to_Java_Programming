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
public class Exercise10_06 {
    public static void main(String[] args) {
        final int LIMIT = 120;

        StackOfIntegers stack = getPrimeNumbers(LIMIT);

        while (!stack.empty()) {
            System.out.print(stack.pop() + (stack.empty() ? " " : ", "));
        }
    }

    /* find prime numbers of a given number */
    public static StackOfIntegers getPrimeNumbers(int limit) {
        StackOfIntegers stack = new StackOfIntegers();
        for (int number = 2; number <= limit; number++) {
            if (isPrime(number))
                stack.push(number);
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

// 113, 109, 107, 103, 101, 97, 89, 83, 79, 73, 71, 67, 61, 59, 53, 47, 43, 41, 37, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2
