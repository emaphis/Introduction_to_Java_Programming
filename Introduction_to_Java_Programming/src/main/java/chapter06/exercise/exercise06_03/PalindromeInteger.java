/*
 * Exercise 6.3
 *  Palindrome integer) Write the methods with the following headers:
 *
 *      // Return the reversal of an integer, e.g., reverse(456) returns 654
 *      public static int reverse(int number);
 *
 *      // Return true if number is a palindrome
 *      public static boolean isPalindrome(int number)
 *
 *  Use the reverse method to implement isPalindrome. A number is a palin-
 *  drome if its reversal is the same as itself. Write a test program that prompts the
 *  user to enter an integer and reports whether the integer is a palindrome.
 */
package chapter06.exercise.exercise06_03;

import java.util.Scanner;

/**
 * Palindrome integer
 * @author emaph
 */
public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (isPalindrome(number))
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");
    }


    // Return the reversal of an integer, e.g., reverse(456) returns 654
    // SEE: <https://www.geeksforgeeks.org/java-program-to-reverse-a-number/>
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

    // Return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        int reversed = reverse(number);
        return number == reversed;
    }
}
