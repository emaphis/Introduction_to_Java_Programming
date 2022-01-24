/*
 * Exercise 5.50
 *  (Count uppercase letters) Write a program that prompts the user to enter a string
 *  and displays the number of the uppercase letters in the string.
 */
package chapter05.exercise.exercise05_50;

import java.util.Scanner;

/**
 * Count uppercase letters
 * @author emaph
 */
public class CountUppercaseLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int uppercase = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
		uppercase++;
	}

        System.out.println("Tne number of uppercase letters is " + uppercase);
    }
}
