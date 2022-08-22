/*
 * Exercise 10.18
 *  (Large prime numbers) Write a program that finds five prime numbers larger
 *  than Long.MAX_VALUE.
 */
// TODO: too slow to solve.
package chapter10.exercise.exercise10_18;

import java.math.BigInteger;

/**
 * Find the first 5 prime numbers higher than Long.MAX_VALUE.
 *
 * @author emaph
 */
public class Exercise10_18 {

    /**
     * Main method
     */
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;
        while (count < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            System.out.print(".");  // liveness update
            number = number.add(BigInteger.ONE);
        }
    }

    /** Check whether BigInteger is prime */
    public static boolean isPrime(BigInteger number) {
        BigInteger limit = number.divide(BigInteger.TWO);

        BigInteger divisor = BigInteger.TWO;
        for (; divisor.compareTo(limit) <= 0; divisor = divisor.add(BigInteger.ONE)) {
            if (number.remainder(divisor).compareTo(BigInteger.ZERO) == 0)    // If true, number is not prime
                return false;
        }
        return true;   // Number is prime
    }
}










