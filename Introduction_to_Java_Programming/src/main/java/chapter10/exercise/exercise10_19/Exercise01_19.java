/*
 * Exercise 10.19
 *  (Mersenne prime) A prime number is called a Mersenne prime if it can be
 *  written in the form 2p - 1 for some positive integer p. Write a program that
 *  finds all Mersenne primes with p … 100 and displays the output as shown
 *  below.
 *  (Hint: You have to use BigInteger to store the number because it is
 *  too big to be stored in long. Your program may take several hours to run.)
 *
 *         p         2^p – 1
 *       ---------------------
 *         2            3
 *         3            7
 *         5           31
 */
package chapter10.exercise.exercise10_19;

import java.math.BigInteger;

/**
 * Calculate Mersenne Primes
 *
 * @author emaph
 */
public class Exercise01_19 {
        final static BigInteger ZERO = BigInteger.ZERO;
        final static BigInteger ONE = BigInteger.ONE;
        final static BigInteger TWO = BigInteger.TWO;

    public static void main(String[] args) {
        BigInteger number;
        System.out.println("p     2^p - 1");
        System.out.println("-----------------------");
        for (int i = 2; i <= 40; i++) {
           if (isPrime(i)) {
                number = TWO.pow(i).subtract(ONE);
                if (isPrime(number))
                    System.out.printf("%-3d   %s\n", i, number.toString());
                else
                    System.out.printf("%-3d   ----\n", i);
            }
        }
    }

    /** check wether a BigInteger is prime */
    private static boolean isPrime(BigInteger number) {
        for (BigInteger div = TWO;
                div.compareTo(number.divide(TWO)) <= 0;
                div = div.add(ONE)) {
            if (number.remainder(div).compareTo(ZERO) == 0) {
                return false; // Number is not a prime
            }
        }
        return true; // Number is prime
    }

    /** Check whether integer is prime */
    public static boolean isPrime(int number) {
        double limit = Math.sqrt(number);
        for (int divisor = 2; divisor <= limit; divisor++)
            if (number % divisor == 0)    // If true, number is not prime
                return false;
        return true;   // Number is prime
    }
}

/*
// Results upto 40
p     2^p - 1
-----------------------
2     3
3     7
5     31
7     127
11    ----
13    8191
17    131071
19    524287
23    ----
29    ----
31    2147483647
37    ----
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  01:08 min

It takes too much time to calculate the merresenne prime numbers fof 61 and 89.
*/