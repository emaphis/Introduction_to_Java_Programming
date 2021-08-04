/*
 * Exercise 4.9
 *  (Find the Unicode of a character) Write a program that receives a character and
 *  displays its Unicode
 *
 * Test run:
 *  Enter a character: E
 *  The Unicode for the character E is 69
 */
package chapter04.exercise.exercise04_09;

import java.util.Scanner;

/**
 * @author emaph
 */
public class FindTheUnicodeCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String str = input.nextLine();
        char chr = str.charAt(0);
        int code = chr;

        System.out.println("The Unicode for the character " + chr + " is " + code);
    }
}
