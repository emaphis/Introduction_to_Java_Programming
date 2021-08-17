/*
 * Exercise 6.26
 *  (Palindromic prime) A palindromic prime is a prime number and also palin-
 *  dromic. For example, 131 is a prime and also a palindromic prime, as are 313
 *  and 757. Write a program that displays the first 100 palindromic prime numbers.
 *  Display 10 numbers per line, separated by exactly one space, as follows:
 *
 *      2 3 5 7 11 101 131 151 181 191
 *      313 353 373 383 727 757 787 797 919 929
 */
package chapter06.exercise.exercise06_26;

/**
 * Palindromic prime
 * @author emaph
 */
public class FindPalindromicPrimes {
    /** Main method */
    public static void main(String[] args) {
        final int END = 100;
        int count = 1;
        int number = 2;

        while (count <= END) {
            if (isPrime(number) && isPalindrome(number)) {
                System.out.printf("%d ", number);
                if (count % 10 == 0)
                    System.out.println();
                count++;
            }
            number++;
        }
        System.out.println();
    }

    /** Check whether number is prime */
    // SEE: Listing 6.7
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {    // If true, number is not prime
                return false;
            }
        }

        return true;   // Number is prime
    }


    /** Return true if number is a palindrome */
    // SEE: Exercise 6.3
    public static boolean isPalindrome(int n) {
        int rev = reverse(n);
        return n == rev;
    }

    /** Return the reversal of an integer, e.g., reverse(456) returns 654 */
    public static int reverse(int n) {
        int rev = 0;
        int digit;

        while (n > 0) {
            digit = n % 10;
            rev = (rev * 10) + digit;
            n /= 10;
        }

        return rev;
    }

}
