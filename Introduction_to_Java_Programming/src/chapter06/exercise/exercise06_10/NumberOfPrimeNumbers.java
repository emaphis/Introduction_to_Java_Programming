/*
 * Exercise 6.10
 *  (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
 *  isPrime(int number) method for testing whether a number is prime. Use
 *  this method to find the number of prime numbers less than 10000
 */
package chapter06.exercise.exercise06_10;

/**
 * Use the isPrime Method
 * @author emaph
 */
public class NumberOfPrimeNumbers {
    public static void main(String[] args) {
        final int END = 10000;
        int prime = 0;
        int count = 0;

        for (int i = 2; prime <= END; i++) {
            if (isPrime(i)) {
                prime = i;
                count++;
            }
        }

        System.out.println(prime + " is the " + count + " prime number");
    }


    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {    // If true, number is not prime
                return false;
            }
        }

        return true;   // Number is prime
    }
}

// 101 is the 26 prime number
// 1009 is the 169 prime number
// 10007 is the 1230 prime number
// 100003 is the 9593 prime number
