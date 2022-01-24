/*
 * Exercise 6.29
 *  (Twin primes) Twin primes are a pair of prime numbers that differ by 2. For
 *  example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are
 *  twin primes. Write a program to find all twin primes less than 1,000. Display the
 *  output as follows:
 *
 *      (3, 5)
 *      (5, 7)
 *      ...
 */
// (3, 5), (5, 7), (11, 13), (17, 19), (29, 31), (41, 43), (59, 61), (71, 73),
// (101, 103), (107, 109), (137, 139), …
package chapter06.exercise.exercise06_29;

/**
 * Twin primes
 * @author emaph
 */
public class TwinPrimes {
    public static void main(String[] args) {
        final int END = 1000;

        for (int number = 2; number < END; number++)
            if (isTwinPrime(number))
                System.out.println("(" + number + ", " + (number + 2) + ")");
    }

    /** Check for twin primes, ie num and num+2 are prime */
    public static boolean isTwinPrime(int number) {
        return isPrime(number) && isPrime(number + 2);
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
}
