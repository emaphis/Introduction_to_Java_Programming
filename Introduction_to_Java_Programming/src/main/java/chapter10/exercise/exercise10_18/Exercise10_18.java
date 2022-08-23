/*
 * Exercise 10.18
 *  (Large prime numbers) Write a program that finds five prime numbers larger
 *  than Long.MAX_VALUE.
 */
// TODO: too slow to solve for first examples.
package chapter10.exercise.exercise10_18;

import java.math.BigInteger;

/**
 * Find the first 5 prime numbers higher than Long.MAX_VALUE.
 *
 * @author emaph
 */
public class Exercise10_18 {
    final static BigInteger ZERO = BigInteger.ZERO;
    final static BigInteger ONE = BigInteger.ONE;
    final static BigInteger TWO = BigInteger.TWO;

    /**
     * Main method
     */
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "").add(ONE);
        int count = 0;
        while (count < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            //System.out.print(".");  // liveness update
            number = number.add(ONE);
        }
    }

    /** check wether a BigInteger is prime */
    private static boolean isPrime(BigInteger number) {
        for (BigInteger div = TWO;
                div.compareTo(div.divide(TWO)) <= 0;
                div = div.add(ONE)) {
            if (div.remainder(div).compareTo(ZERO) == 0) {
                return false; // Number is not a prime
            }
        }
        return true; // Number is prime
    }
}










