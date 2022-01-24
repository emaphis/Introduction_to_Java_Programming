/*
 * Exercise 4.3
 *  (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 *  check whether the letter is a vowel or consonant. For a nonletter input, display
 *  invalid input.
 */
package chapter04.exercise.exercise04_13;

import java.util.Scanner;

/**
 *  Checks of entered character is a vowel or consonant
 * @author emaph
 */
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String line = input.nextLine();
        char chr =  line.charAt(0);

        if (Character.isLetter(chr)) {
            char testchr = Character.toUpperCase(chr);
            if (testchr == 'A' || testchr == 'E' || testchr == 'I' || testchr == 'O' || testchr == 'U') {
                System.out.println(chr +  " is a vowel");
            } else {
                System.out.println(chr + " is a consonant");
            }
        } else {
            System.out.println(chr + " is an invalid input");
        }
    }
}
