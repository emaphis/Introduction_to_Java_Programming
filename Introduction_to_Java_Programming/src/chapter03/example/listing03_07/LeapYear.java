/*
 *  Listing 3.7.
 */
package chapter03.example.listing03_07;

import java.util.Scanner;

/**
 * Determining Leap Year
 * @author emaph
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year isa leap year
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + " is  a leap year? " + isLeapYear);
    }
}
