/*
 * Listing 6.17
 * Based on Listing 5.15
 * Modularizing code with methods
 */
package chapter06.example.listing06_07;

/**
 * Displays the first 50 prime numbers in 5 lines, each containing 10 numbers.
 * @author emaph
 */
public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;  // Count the number of prime numbers
        int number = 2; // A number tested for primesess

        // Repeatedly find prime numbers
        while (count < numberOfPrimes) {

            // Display the prime number and increast the count
            if (isPrime(number)) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Display the number and avance to the new line
                    System.out.printf("%-5d\n", number);
                } else
                    System.out.printf("%-5d", number);
            }

            // Check if the next number is prime
            number++;
        }
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
