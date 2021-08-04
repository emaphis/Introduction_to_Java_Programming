/*
 * Exercise 4.22
 *  (Check substring) Write a program that prompts the user to enter two strings, and
 *  reports whether the second string is a substring of the first string.
 */
package chapter04.exercise.exercise04_22;

import java.util.Scanner;

/**
 * @author emaph
 */
public class CheckSubstring {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        String sub = s1.contains(s2) ? " is " : " is not ";
        System.out.println(s2 + sub +"a substring of " + s1);
    }
}
