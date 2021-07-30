/*
 * Exercise 3.30
 *  (Current time) Revise Programming Exercise 2.8 to display the hour using a
 *  12-hour clock.
 */
package chapter03.exercise.exercise03_30;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class ShowCurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // Obtain the total millisoconds since midnight, Jan 1 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Objtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = (totalMinutes / 60) + offset;

        // Compute the current hour
        long currentHour = totalHours % 24;
        String label = currentHour >= 12 ? " PM" : " AM";
        currentHour %= 12;

        // Display results
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + label);
    }
}
