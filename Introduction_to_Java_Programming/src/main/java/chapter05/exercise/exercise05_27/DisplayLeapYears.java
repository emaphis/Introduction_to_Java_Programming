/*
 * Exercise 5.27
 *  (Display leap years) Write a program that displays all the leap years, 10 per line,
 *  rom 101 to 2100, separated by exactly one space. Also display the number of
 *  leap years in this period.
 */
package chapter05.exercise.exercise05_27;

/**
 * Display leap years
 * @author emaph
 */
public class DisplayLeapYears {

    public static void main(String args[]) {
        final int FIRST_YEAR = 101;
        final int LAST_YEAR = 2100;
        int count = 0;

        for (int year = FIRST_YEAR; year <= LAST_YEAR; year++) {
            // check for leap year
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeapYear) {
                System.out.printf("%4d  ", year);
                count++;

                if (count  == 10) {
                    count = 0;
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
