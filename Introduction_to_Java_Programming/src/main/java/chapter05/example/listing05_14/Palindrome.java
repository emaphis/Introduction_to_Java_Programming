/*
 * Listing 5.14
 * 5.13 Case Study: Checking Palindromes
 */
package chapter05.example.listing05_14;

import java.util.Scanner;

/**
 * Check if given string is a palindrome
 * @author emaph
 */
public class Palindrome {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // The index of the first chracter of the string
        int low = 0;

        // The index of the last character in the string
        int high = str.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                isPalindrome = false;
                break;
            }

            low++;
            high--;
        }

        if (isPalindrome)
            System.out.println(str + " is a plainrome");
        else
            System.out.println(str + " is not a plainrome");
    }
}
