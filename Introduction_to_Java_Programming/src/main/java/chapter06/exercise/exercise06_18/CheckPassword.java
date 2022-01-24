/*
 * Exercise 6.18
 *  Check password) Some Websites impose certain rules for passwords. Write a
 *  method that checks whether a string is a valid password. Suppose the password
 *  rules are as follows:
 *
 *  ■ A password must have at least eight characters.
 *  ■ A password must contain only letters and digits.
 *  ■ A password must contain at least two digits.
 *
 *  Write a program that prompts the user to enter a password and displays Valid
 *  Password if the rules are followed, or Invalid Password otherwise.
 */
package chapter06.exercise.exercise06_18;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CheckPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = input.next();

        if (checkPassword(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }


    static boolean checkPassword (String password) {
        final int VALID_LENGTH = 8;
        return checkLength(password, VALID_LENGTH) &&
                checkDigitsAndLetters(password) &&
                checNumberOfDigits(password, 2);
    }

    /** check pass word is  is at least valid length */
    static boolean checkLength(String password, int length) {
        return password.length() >= length;
    }

    /** Checks for only digits and numbers */
    static boolean checkDigitsAndLetters(String password) {
        for (int i = 0; i < password.length(); i++) {
            char chr = password.charAt(i);
            if (!Character.isLetterOrDigit(chr))
                return false;
        }
        return true;
    }

    /** Check at least a certain number of digits */
    static boolean checNumberOfDigits(String password, int n) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char chr = password.charAt(i);
            if (Character.isDigit(chr))
                count++;
        }

        return count >= n;
    }
}
