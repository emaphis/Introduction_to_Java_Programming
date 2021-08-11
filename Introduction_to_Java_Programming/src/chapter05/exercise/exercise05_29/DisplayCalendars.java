/*
 * Exercise 5.29
 *  (Display calendars) Write a program that prompts the user to enter the year and
 *  first day of the year and displays the calendar table for the year on the console. For
 *  example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
 *  your program should display the calendar for each month in the year,
 */
package chapter05.exercise.exercise05_29;

import java.util.Scanner;

/**
 * Display calendars
 * @author emaph
 */
public class DisplayCalendars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter first day of year: ");
        int day = input.nextInt();
        System.out.println();

        // Check for leap year. See: Listing 3.7
        boolean isLeapYear
                = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int febdays = (isLeapYear ? 29 : 28);

        String monthName;
        int monthDays;
        //String dayName;

        for (int month = 1; month <= 12; month++) {

            switch (month) {
                case   1:
                    monthName = "January";
                    monthDays = 31;
                    break;
                case   2:
                    monthName = "February";
                    monthDays =  febdays;
                    break;
                case   3:
                    monthName = "March";
                    monthDays = 31;
                    break;
                case   4:
                    monthName = "April";
                    monthDays = 30 ;
                    break;
                case   5:
                    monthName = "May";
                    monthDays = 31;
                    break;
                case   6:
                    monthName = "June";
                    monthDays = 30;
                    break;
                case   7:
                    monthName = "July";
                    monthDays = 31;
                    break;
                case   8:
                    monthName = "August";
                    monthDays = 31;
                    break;
                case   9:
                    monthName = "September";
                    monthDays = 30;
                    break;
                case  10:
                    monthName = "October";
                    monthDays = 31;
                    break;
                case  11:
                    monthName = "November";
                    monthDays = 30;
                    break;
                case  12:
                    monthName = "December";
                    monthDays =  31;
                    break;
                default:
                    monthName = "unkown";
                    monthDays = 0;
            }


            //System.out.println(monthName + " " + "1"+ ", " + year + " is " + dayName);
            // Display a calendar for month
            System.out.printf("%10s %10s %4d \n","", monthName, year);
            System.out.println("===================================================\n");
            System.out.printf("%3s  %3s  %3s  %3s  %3s  %3s  %3s  \n",
                        "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

            // Print spaces
            for (int i = 0; i < day; i++)
                System.out.printf("%3s  ", "*");

            // Print body
            int count = day + 1;
            for (int i = 1; i <= monthDays; i++) {
                System.out.printf("%3d  ", i);
                count++;
                if (count % 8 == 0) {
                    count = 1;
                    System.out.println();
                }
            }

            System.out.println("\n");

            // Increment first day of mont.
            day = (day + monthDays) % 7;
        }

    }
}
