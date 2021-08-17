/*
 * Exercise 6.27
 *  (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
 *  whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so
 *  17 and 71 are emirps. Write a program that displays the first 100 emirps. Display
 *  10 numbers per line, separated by exactly one space, as follows:
 *
 *      13 17 31 37 71 73 79 97 107 113
 *      149 157 167 179 199 311 337 347 359 389
 */
package chapter06.exercise.exercise06_27;

/**
 *
 * @author emaph
 */
public class Emirp {

    /** Main method */
    public static void main(String args[]) {
        final int END = 100;
        int count = 1;
        int number = 10;

        while (count <= END) {
            if (isPrime(number) && isPrime(reverse(number)) && !isPalindrome(number)) {
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
