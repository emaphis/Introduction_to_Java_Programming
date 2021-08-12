/*
 * Exercise 5.46
 *  (Reverse a string) Write a program that prompts the user to enter a string and
 *  displays the string in reverse order.
 */
package chapter05.exercise.exercise05_46;

import java.util.Scanner;

/**
 * Reverse a string
 * @author emaph
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String out = "";
        for (int idx = str.length() - 1;  idx >= 0; idx--) {
            char chr = str.charAt(idx);
            out += chr;
        }

        System.out.println("The reversed string is " + out);
    }
}
