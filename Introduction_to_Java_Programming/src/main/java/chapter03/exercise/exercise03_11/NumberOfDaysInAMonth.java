/*
 * Exercise 3.11
 *  (Find the number of days in a month) Write a program that prompts the user
 *  to enter the month and year and displays the number of days in the month. For
 *  example, if the user entered month 2 and year 2012, the program should display
 *  that February 2012 has 29 days. If the user entered month 3 and year 2015, the
 *  program should display that March 2015 has 31 days
 */
package chapter03.exercise.exercise03_11;

import java.util.Scanner;

/**
 * Find number of days in a month
 *
 * @author emaph
 */
public class NumberOfDaysInAMonth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int month = input.nextInt();

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check for leap year. See: Listing 3.7
        boolean isLeapYear
                = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int febdays = (isLeapYear ? 29 : 28);

        String output = "";
        switch (month) {
            case  1: output = "January " + year + " has 31 days"; break;
            case  2: output = "February " + year + " has " + febdays + " days"; break;
            case  3: output = "March " + year + " has 31 days"; break;
            case  4: output = "April " + year + " has 30 days"; break;
            case  5: output = "May " + year + " has 31 days"; break;
            case  6: output = "June " + year + " has 30 days"; break;
            case  7: output = "July " + year + " has 31 days"; break;
            case  8: output = "August " + year + " has 31 days"; break;
            case  9: output = "September " + year + " has 30 days"; break;
            case 10: output = "October " + year + " has 31 days"; break;
            case 11: output = "November " + year + " has 30 days"; break;
            case 12: output = "December " + year + " has 31 days";
        }

        System.out.println(output);
    }
}
