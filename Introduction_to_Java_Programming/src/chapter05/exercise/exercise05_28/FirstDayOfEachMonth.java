/*
 * Exercise 5.28
 *  (Display the first days of each month) Write a program that prompts the user to
 *  enter the year and first day of the year, then displays the first day of each month
 *  in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
 *  January 1, 2013, your program should display the following output:
 *
 *  January 1, 2013 is Tuesday
 *      ...
 *  December 1, 2013 is Sunday
 */
package chapter05.exercise.exercise05_28;

import java.util.Scanner;

/**
 * Display the first days of each month
 * @author emaph
 */
public class FirstDayOfEachMonth {
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
        String dayName;

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


            switch (day) {
                case 0: dayName = "Sunday"; break;
                case 1: dayName = "Monday"; break;
                case 2: dayName = "Tuesday"; break;
                case 3: dayName = "Wednsday"; break;
                case 4: dayName = "Thursday"; break;
                case 5: dayName = "Friday"; break;
                case 6: dayName = "Saturday"; break;
                default: dayName = "unknown";
            }

            System.out.println(monthName + " " + "1"+ ", " + year + " is " + dayName);

            day = (day + monthDays) % 7;
        }

    }
}
