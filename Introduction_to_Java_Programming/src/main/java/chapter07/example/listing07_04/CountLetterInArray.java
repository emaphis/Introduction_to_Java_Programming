/*
 * Listing 7.4
 * 7.8 Case Study: Counting the Occurrences of Each Letter
 *  This section presents a program to count the occurrences of each letter in an array of
 *  characters.
 */
package chapter07.example.listing07_04;

import chapter06.example.listing06_10.RandomCharacter;

/**
 *
 * @author emaph
 */
public class CountLetterInArray {
    /** Main method */
    public static void main(String[] args) {
        // Decalre and create an arra
        char [] chars = createArray();

        // Display the array
        System.out.println("The lowercase letters are:");
        displayArray(chars);

        // Count the occurences of each letter;
        int[] counts = countLetters(chars);

        // Display counts
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
        System.out.println();
    }


    /** Create an array of characters */
    public static char[] createArray() {
        // Declare an array of character and create it
        char[] chars = new char[100];

        // Create lowercase letters randomly and assign them to the array
        for (int i = 0; i < chars.length; i++)
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();

        return chars;
    }

    /** Display the array of characters */
    public static void displayArray(char[] chars) {
        // Display the characters in the array 20 on each line
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }

    public static int[] countLetters(char[] chars) {
        // Declate and create an array of 26 int
        int[] counts = new int[26];

        // For each lowercase letter in the array, count it.
        for (int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a']++;  // 'a' - 'a' == 0

        return counts;
    }

    /** Display counts */
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }

}
