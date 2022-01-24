/*
 * Exercise 4.17
 *  (Days of a month) Write a program that prompts the user to enter the year and the
 *  first three letters of a month name (with the first letter in uppercase) and displays
 *  the number of days in the month. If the input for month is incorrect, display a
 *  message
 * See: Exercise 3.11
 */
package chapter04.exercise.exercise04_17;

import java.util.Scanner;

/**
 * @author emaph
 */
public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();
        month = month.substring(0, 3);

        // Check for leap year. See: Listing 3.7
        boolean isLeapYear
                = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int febdays = (isLeapYear ? 29 : 28);

        String output;
        switch (month) {
            case "Jan": output = "January " + year + " has 31 days"; break;
            case "Feb": output = "February " + year + " has " + febdays + " days"; break;
            case "Mar": output = "March " + year + " has 31 days"; break;
            case "Apr": output = "April " + year + " has 30 days"; break;
            case "May": output = "May " + year + " has 31 days"; break;
            case "Jun": output = "June " + year + " has 30 days"; break;
            case "Jul": output = "July " + year + " has 31 days"; break;
            case "Aug": output = "August " + year + " has 31 days"; break;
            case "Sep": output = "September " + year + " has 30 days"; break;
            case "Oct": output = "October " + year + " has 31 days"; break;
            case "Nov": output = "November " + year + " has 30 days"; break;
            case "Dec": output = "December " + year + " has 31 days"; break;
            default: output = month + " is not a correct month name";
        }

        System.out.println(output);
    }
}
