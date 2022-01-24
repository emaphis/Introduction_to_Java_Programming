/*
 * Exercise 4.20
 *  Process a string) Write a program that prompts the user to enter a string and
 *  displays its length and its first character.
 */
package chapter04.exercise.exercise04_20;

import java.util.Scanner;

/**
 * @author emaph
 */
public class ProcessString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to process: ");
        String str = input.nextLine();

        int leng = str.length();
        char chr = '\b';
        if (leng > 0) {
            chr = str.charAt(0);
        }

        System.out.println("String " + str + " is " + leng + " chars long "
                + "and has first char of " + chr);
    }
}
