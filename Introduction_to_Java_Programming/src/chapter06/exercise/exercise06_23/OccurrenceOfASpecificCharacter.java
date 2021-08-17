/*
 * Exercise 6.23
 *  (Occurrences of a specified character) Write a method that finds the number of
 *  occurrences of a specified character in a string using the following header:
 *
 *      public static int count(String str, char a)
 *
 *  For example, count("Welcome", 'e') returns 2. Write a test program that
 *  prompts the user to enter a string followed by a character then displays the
 *  number of occurrences of the character in the string.
 */
package chapter06.exercise.exercise06_23;

import java.util.Scanner;

/**
 * Occurrences of a specified character
 * @author emaph
 */
public class OccurrenceOfASpecificCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character to search: ");
        char chr = input.next().charAt(0);

        int count = count(str, chr);

        System.out.println("Char " + chr + " was found " + count + " times");
    }


    public static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == a)
                count++;

        return count;
    }
}
