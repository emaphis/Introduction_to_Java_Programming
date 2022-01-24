/*
 * Exercise 3.21
 *  Science: day of the week) Zeller’s congruence is an algorithm developed by
 *  Christian Zeller to calculate the day of the week. The formula is
 *
 *    h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7
 *
 *  ■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
 *    Wednesday, 5: Thursday, and 6: Friday).
 *  ■ q is the day of the month.
 *  ■ m is the month (3: March, 4: April, ..., 12: December). January and February
 *    are counted as months 13 and 14 of the previous year
 *  ■ j is year / 100
 *  ■ k is the year of the century (i.e., year % 100).
 *
 *  Note all divisions in this exercise perform an integer division. Write a program
 *  that prompts the user to enter a year, month, and day of the month, and displays
 *  the name of the day of the week.
 */
package chapter03.exercise.exercise03_21;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int m = input.nextInt();  // Month
        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();  // Day

        int j = year / 100;
        int k = year % 100;  // Year of Century

        // if month is January or February increment by one year
        if (m == 1) {
            m = 13;
            year--;
        } else if (m == 2) {
            m = 14;
            year--;
        }

        int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        
        String day = "";
        switch (h) {
            case  0: day = "Saturday"; break;
            case  1: day = "Sunday"; break;
            case  2: day = "Monday"; break;
            case  3: day = "Tuesday"; break;
            case  4: day = "Wednesday"; break;
            case  5: day = "Thursday"; break;
            case  6: day = "Friday";
        }

        System.out.println("Day of the week is " + day);
    }
}
