/*
 * Exercise 4.21
 *  (Check SSN) Write a program that prompts the user to enter a Social Security
 *  number in the format DDD-DD-DDDD, where D is a digit. Your program should
 *  check whether the input is valid.
 *
 */
package chapter04.exercise.exercise04_21;

import java.util.Scanner;

/**
 * Checking SSN
 * @author emaph
 */
public class CheckSSN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter SSN: ");
        String ssn = input.nextLine();

        // Ugg,  blech, yuck
        boolean valid = (ssn.length() == 11)
                && (Character.isDigit(ssn.charAt(0)))
                && (Character.isDigit(ssn.charAt(1)))
                && (Character.isDigit(ssn.charAt(2)))
                && (ssn.charAt(3) == '-')
                && (Character.isDigit(ssn.charAt(4)))
                && (Character.isDigit(ssn.charAt(5)))
                && (Character.isDigit(ssn.charAt(7)))
                && (ssn.charAt(6) == '-')
                && (Character.isDigit(ssn.charAt(8)))
                && (Character.isDigit(ssn.charAt(9)))
                && (Character.isDigit(ssn.charAt(10)));

        String result = valid ? "a valid " : "an invalid ";

        System.out.println(ssn + " is " + result + "social security number");

        // 23-23-5435
        // 232-23-5435
    }

}
