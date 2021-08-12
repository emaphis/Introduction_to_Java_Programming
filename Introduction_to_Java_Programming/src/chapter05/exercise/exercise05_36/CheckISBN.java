/*
 * Exercise 5.36
 *  (Business application: checking ISBN) Use loops to simplify Programming
 *  Exercise 3.9.
 */
package chapter05.exercise.exercise05_36;

import java.util.Scanner;

/**
 * Checking ISBN
 * @author emaph
 */
public class CheckISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number = input.nextInt();

        // Calculate the checksum.
        int remander = number;
        final int DIGITS = 9;
        int sum = 0;

        for (int i = DIGITS; i >= 1; i--) {
            int d = remander % 10;
            sum += (d * i);
            remander /= 10;
        }

        int checksum = sum % 11;

        String checklabel;
        if (checksum == 10)
            checklabel = "X";
        else
            checklabel = "" + checksum;

        System.out.println("The ISBN-10 number is 0" + number + checklabel);
    }
}
