/*
 * Exercise 6.20
 *  (Count the letters in a string) Write a method that counts the number of letters in
 *  a string using the following header:
 *
 *      public static int countLetters(String s)
 *
 *  Write a test program that prompts the user to enter a string and displays the num-
 *  er of letters in the string.
 */
package chapter06.exercise.exercise06_20;

import java.util.Scanner;

/**
 * Count the letters in a string
 * @author emaph
 */
public class CountLettersInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();

        int count = countLetters(str);
        System.out.println("There are " + count + " letters in the string.");
    }


    /** Count the letters in a given string */
    public static int countLetters(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (Character.isLetter(chr))
                count++;
        }

        return count;
    }
}
