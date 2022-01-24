/*
 * Exercise 7.6
 * Based on Listing 6.7, 5.15
 *  (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a num-
 *  ber n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor
 *  is found, n is not prime. A more efficient approach is to check whether any of the
 *  prime numbers less than or equal to 2n can divide n evenly. If not, n is prime.
 *  Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
 *  You need to use an array to store the prime numbers, and later use them to check
 *  whether they are possible divisors for n.
 */
package chapter07.exercise.exercise07_06;

import chapter06.example.listing06_07.*;

/**
 * Displays the first 50 prime numbers in 5 lines, each containing 10 numbers.
 * @author emaph
 */
public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;

        int[] primes = new int[NUMBER_OF_PRIMES];
        int count = 0;  // Count the number of prime numbers
        int number = 2; // A number tested for primeses

        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) {

            // Search for primes
            if (isPrime(number)) {
                primes[count] = number;
                count++;
            }

            // Increment and check if prime
            number++;
        }

        // print out primes
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        System.out.println("The first 50 prime numbers are \n");
        for (int i = 1; i <= primes.length; i++) {
            System.out.printf("%-5d", primes[i-1]);

            if (i % NUMBER_OF_PRIMES_PER_LINE == 0)
                System.out.println();
        }
        System.out.println();
    }


    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        double limit = Math.sqrt(number);
        for (int divisor = 2; divisor <= limit; divisor++) {
            if (number % divisor == 0) {    // If true, number is not prime
                return false;
            }
        }

        return true;   // Number is prime
    }
}
