/*
 * .exercise 2.8
 *   Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
 *   the current time in GMT. Revise the program so it prompts the user to enter the
 *   time zone offset to GMT and displays the time in the specified time zone.
 */
package chapter02.exercise.exercise02_08;

import chapter02.examples.listing02_07.*;
import java.util.Scanner;

/**
 * Show the current time offset by time zone.
 * @author emaph
 */
public class ShowCurrentTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // Obtain the total millisoconds since midnight, Jan 1 1960
        long totalMilliseconds = System.currentTimeMillis();

        // Objtain the total seconds since midnight  Jan 1, 1970
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

        // Display results
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");
    }
}
