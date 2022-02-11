/*
 * Exercise 6.38
 *  Generate random characters) Use the methods in RandomCharacter in Listing
 *  6.10 to print 100 uppercase letters then 100 single digits, printing 50 per line
 */
package chapter06.exercise.exercise06_38;

import chapter06.example.listing06_10.*;

/**
 * Generating Random Characters
 * @author emaph
 */
public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 100;
        final int CHARS_PER_LINE = 50;

        // Print random characters between 'a' and 'z', 50 chars per line
        upperCaseTable(NUMBER_OF_CHARS, CHARS_PER_LINE);
        System.out.println();
        // Print random digits
        digitsTable(NUMBER_OF_CHARS, CHARS_PER_LINE);
    }

    /** print table of uppercase chars */
    public static void upperCaseTable(int numChars, int charsPerLine) {
        for (int i = 0; i < numChars; i++) {
            char ch = RandomCharacter.getRandomUpperCaseLetter();
            if ((i + 1) % charsPerLine == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }


    /** print table of digits */
    public static void digitsTable(int numChars, int charsPerLine) {
        for (int i = 0; i < numChars; i++) {
            char ch = RandomCharacter.getRandomDigitCaseCharacter();
            if ((i + 1) % charsPerLine == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}
