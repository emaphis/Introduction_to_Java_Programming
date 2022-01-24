/*
 * Exercise 6.28
 *  (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 *  in the form 2p - 1 for some positive integer p. Write a program that finds all
 *  Mersenne primes with p … 31 and displays the output as follows:
 */
package chapter06.exercise.exercise06_28;

/**
 * Mersenne Number
 * @author emaph
 */
public class MersenneNumber {
    // 3, 7, 31, 127, 8191, 131071, 524287, 2147483647,
    public static void main(String[] args) {
        // Print header
        System.out.printf("%-10s%-10s\n", "p", "2^p-1");
        System.out.println("--------------------");

        // Print details
        final long END = 31;
        long p = 2;

        while (p <= END) {
            if (isPrime(p)) {
                int mp = mersenne(p);
                if (isPrime(mp))
                    System.out.printf("%-10d%-10d\n", p, mp);
            }
            p++;
        }
        System.out.println();
    }


    /** Check whether number is prime */
    public static boolean isPrime(long number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {    // If true, number is not prime
                return false;
            }
        }

        return true;   // Number is prime
    }

    /** Mersenne formula */
    static int mersenne(long p) {
        return (int) (Math.pow(2.0, p) - 1.0);
    }

}
