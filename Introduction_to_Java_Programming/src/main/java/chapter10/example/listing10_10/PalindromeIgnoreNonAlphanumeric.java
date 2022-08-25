/*
 * Listing 10.10
 * 10.11 The StringBuilder and StringBuffer Classes
 */
package chapter10.example.listing10_10;

import java.util.Scanner;

/**
 * Palindrome example
 * @author emaph
 */
public class PalindromeIgnoreNonAlphanumeric {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // Display result
        System.out.println("Ignoring nonalpahnumeric characters, \nis "
            + s + " a palindrome? " + isPalindrome(s));
    }

    /** Return true if a string is a palindrome */
    public static boolean isPalindrome(String s) {
        // Create a new string by eliminating nonalphanumeric chars
        String s1 = filter(s);

        // Create a new string that is the reversal of s1
        String s2 = reverse(s1);

        // Check if the reversal is the same as the original string
        return s2.equals(s1);
    }

    /** Create a new string by eliminating non-alphanumeric chars */
    public static String filter(String s) {
        // Create a string builder
        StringBuilder stringBuilder = new StringBuilder();

        // Examine each char in the string to skip alphanumeric char
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }

        // Return a new filtered string
        return stringBuilder.toString();
    }

    /** Create a new string by reversing a specified string */
    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}

/*
Enter a string:  ab<c>cb?a
Ignoring nonalpahnumeric characters,
is ab<c>cb?a a palindrome? true

Enter a string: abcc><?cab
Ignoring nonalpahnumeric characters,
is abcc><?cab a palindrome? false
*/
