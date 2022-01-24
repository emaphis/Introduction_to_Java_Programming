/*
 * Exercise 5.51
 *  (Longest common prefix) Write a program that prompts the user to enter two
 *  strings and displays the largest common prefix of the two strings. Here are some
 *  sample runs:
 */
package chapter05.exercise.exercise05_51;

import java.util.Scanner;

/**
 * Longest common prefix
 * @author emaph
 */
public class LargestCommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        // Find the shortest string
        final int length = Math.min(str1.length(), str1.length());
        int idx = 0;


        for (int i = 0; i < length; i++) {
            if (str1.charAt(idx) != str2.charAt(idx))
                break;
            idx++;
        }

        if (idx > 0) {
            System.out.println("The common prefix is " + str1.substring(0, idx));
        } else {
            System.out.println(str1 + " and  " + str2 + " have no common prefix");
        }
    }
}
