/*
 *  Check Point 3.11
 */
package chapter03.check_point;

import java.util.Scanner;

/**
 * @author emaph
 */
public class CheckPoint03_11 {
    // 3.11.1  How many days in the February of a leap year? Which of the following is a leap
    //             year? 500, 1000, 2000, 2016, and 2020?
    // 29 days in February.
    // 500, 1000 not leap years
    // 2000, 2016, 2020 are leap years
    static void leapYear() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year isa leap year
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + " is  a leap year? " + isLeapYear);
    }

    public static void main(String[] args) {
        leapYear();
    }
}
