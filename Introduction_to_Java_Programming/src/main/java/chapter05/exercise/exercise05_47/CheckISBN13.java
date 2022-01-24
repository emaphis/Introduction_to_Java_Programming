/*
 * Exercise 5.47
 *  (Business: check ISBN-13) ISBN-13 is a new standard for identifying books. It
 *  uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
 *  which is calculated from the other digits using the following formula:
 *
 *   checksum = 10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12),10
 */
package chapter05.exercise.exercise05_47;

import java.util.Scanner;

/**
 * check ISBN-13
 * @author emaph
 */
public class CheckISBN13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String number = input.nextLine();

        if (number.length() != 12) {
            System.out.println( number + " is an invalid input");
            return;
        }

        // Calculate the check sum.
        int check = 0;
        for (int idx = 0; idx < number.length(); idx++) {
            int digit = Integer.parseInt(number.charAt(idx) + "");

            if (idx % 2 == 0)
                digit *= 3;
            
            check += digit;
        }

        check = 10 - (check % 10);
        if (check == 10) check = 0;

        System.out.println("The ISBN-13 number is " + number + check);
    }
}
