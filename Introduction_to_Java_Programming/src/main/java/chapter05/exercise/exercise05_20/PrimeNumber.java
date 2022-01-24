/*
 * Exercise 5.20
 *  (Display prime numbers between 2 and 1,000) Modify the program given in Listing
 *  5.15 to display all the prime numbers between 2 and 1,000, inclusive. Display eight
 *  prime numbers per line. Numbers are separated by exactly one space.
 * from Listing 5.15
 */
package chapter05.exercise.exercise05_20;


/**
 * Displays the first 50 prime numbers in 5 lines, each containing 10 numbers.
 * @author emaph
 */
public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PER_LINE = 8;
        final int LIMIT_OF_PRIMES = 1000;
        int count = 0;  // Count the number of prime numbers

        System.out.printf("The prime numbers under %5d are \n", LIMIT_OF_PRIMES);

        // Repeatedly find prime numbers
        for (int number = 2; number < LIMIT_OF_PRIMES; number++) {
            // Assume the number is prime
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

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
                    System.out.printf("%4d\n", number);
                else
                    System.out.printf("%4d", number);
            }
        }
    }
}
