/*
 * Exercise 5.49
 *  (Count vowels and consonants) Assume that the letters A, E, I, O, and U are vow-
 *  els. Write a program that prompts the user to enter a string, and displays the
 *  number of vowels and consonants in the string.
 */
package chapter05.exercise.exercise05_49;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CountVowelsAndConsonents {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int numVowels = 0;
        int numConsonents = 0;

        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (Character.isLetter(chr)) {
                if (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U') {
                    numVowels++;
                } else {
                    numConsonents++;
                }
            }
        }

        System.out.println("The number of vowels is " + numVowels);
        System.out.println("The number of consonants is " + numConsonents);
    }
}
