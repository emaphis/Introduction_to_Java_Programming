/*
 * Exercise 7.22
 *  (Find the number of uppercase letters in a string) Write a program that passes a string
 *  to the command line and displays the number of uppercase letters in the string.
 */
package chapter07.exercise.exercise07_22;

/**
 * Find the number of uppercase letters in a string
 * @author emaph
 */
public class NumberOfUppercaseLetters {
    public static void main(String[] args) {
        String str = args[0];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                count++;
        }

        System.out.println("The String " + str + " has " + count + " uppercase letters");
    }
}
