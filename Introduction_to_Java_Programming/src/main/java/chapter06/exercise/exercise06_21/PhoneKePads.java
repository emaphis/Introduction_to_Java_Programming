/*
 * Exercise 6.21
 *  Phone keypads) The international standard letter/number mapping for tele-
 *  phones is given in Programming Exercise 4.15. Write a method that returns a
 *  number, given an uppercase letter, as follows:
 *
 *      public static int getNumber(char uppercaseLetter)
 *
 *  Write a test program that prompts the user to enter a phone number as a string.
 *  The input number may contain letters. The program translates a letter (uppercase
 *  or lowercase) to a digit and leaves all other characters intact.
 */
package chapter06.exercise.exercise06_21;

import java.util.Scanner;

/**
 * Phone keypads
 * @author emaph
 */
public class PhoneKePads {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String line = input.nextLine();

        String out = translateNumber(line);
        System.out.println(out);
    }

    /** Translate a phone number with letters to a number */
    public static String translateNumber(String number) {
        String out = "";

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (Character.isLetter(ch))
                out += "" + getNumber(Character.toUpperCase(ch));
            else
                out += ch;
        }

        return out;
    }

    /** translate a letter to a number on a keypad */
    public static int getNumber(char uppercaseLetter) {
        int num;

        if (uppercaseLetter <= 'C') {
            num = 2;
        } else if (uppercaseLetter <= 'F') {
            num = 3;
        } else if (uppercaseLetter <= 'I') {
            num = 4;
        } else if (uppercaseLetter <= 'L') {
            num = 5;
        } else if (uppercaseLetter <= 'O') {
            num = 6;
        } else if (uppercaseLetter <= 'S') {
            num = 7;
        } else if (uppercaseLetter <= 'V') {
            num = 8;
        } else if (uppercaseLetter <= 'Z') {
            num = 9;
        } else {
            num = -999;
        }

        return num;
    }
}
