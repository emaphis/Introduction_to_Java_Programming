/*
 * Listing 5.15
 * 5.14 Case Study: Displaying Prime Numbers
 */
package chapter05.example.listing05_15;

/**
 * Displays the first 50 prime numbers in 5 lines, each containing 10 numbers.
 * @author emaph
 */
public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;  // Count the number of prime numbers
        int number = 2; // A number tested for primesess

        System.out.println("The first 50 prime numbers are \n");

        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) {
            // Assume the number is pime
            boolean isPrime = true;     // Is the current number prime?

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {    // If true, number is not prime
                    isPrime = false;
                    break;  // Exit this loop, it's done
                }
            }

            // Display the prime number and increast the count
            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Display the number and avance to the new line
                    System.out.println(number);
                } else
                    System.out.print(number + " ");
            }

            // Check if the next number is prime
            number++;
        }
    }
}
