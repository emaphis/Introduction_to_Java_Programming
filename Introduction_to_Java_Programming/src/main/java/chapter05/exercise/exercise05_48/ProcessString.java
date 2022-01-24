/*
 * Exercise 5.48
 *  (Process string) Write a program that prompts the user to enter a string and dis-
 *  plays the characters at odd positions. Here is a sample run:
 */
package chapter05.exercise.exercise05_48;

import java.util.Scanner;

/**
 * Process string
 * @author emaph
 */
public class ProcessString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String out = "";

        for (int i = 0; i < str.length(); i += 2) {
            char chr = str.charAt(i);
            out += chr;
        }

        System.out.println(out);
    }
}
