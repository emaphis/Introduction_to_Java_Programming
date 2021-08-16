/*
 * Exercise 6.16
 *  (Number of days in a year) Write a method that returns the number of days in a
 *  year using the following header:
 *
 *      public static int numberOfDaysInAYear(int year)
 *
 *  Write a test program that displays the number of days in year from 2000 to 2020.
 */
package chapter06.exercise.exercise06_16;

/**
 * Number of days in a year
 * @author emaph
 */
public class NumberOfDaysYear {
    public static void main(String[] args) {
        // Print header
        System.out.println("Year     Num. Days");

        // Print details
        for (int year = 2000; year <= 2020; year++) {
            System.out.printf("%-8d %-8d\n", year, numberOfDaysInAYear(year));
        }
    }

    /** return number of days in a year */
    public static int numberOfDaysInAYear(int year) {
        return isLeapYear(year) ? 365 : 364;
    }

    /** Return true if passed year is a leap year */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
