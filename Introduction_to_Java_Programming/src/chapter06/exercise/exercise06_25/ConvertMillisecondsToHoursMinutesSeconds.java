/*
 * Exercise 6.25
 *  (Convert milliseconds to hours, minutes, and seconds) Write a method that con-
 *  verts milliseconds to hours, minutes, and seconds using the following header:
 *
 *      public static String convertMillis(long millis)
 *
 *  The method returns a string as hours:minutes:seconds. For example, con-
 *  vertMillis(5500) returns a string 0:0:5, convertMillis(100000)
 *  returns a string 0:1:40, and convertMillis(555550000) returns a string
 *  154:19:10. Write a test program that prompts the user to enter a long integer
 *  for milliseconds and displays a string in the format of hours:minutes:seconds.
 */
package chapter06.exercise.exercise06_25;

import java.util.Scanner;

/**
 * Convert milliseconds to hours, minutes, and second
 * @author emaph
 */
public class ConvertMillisecondsToHoursMinutesSeconds {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter milliseconds: ");
        long millis = input.nextLong();

        String time = convertMillis(millis);
        System.out.println("HRS:MIN:SEC: " + time);
    }



    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long second = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long minute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        return String.format("%d:%02d:%02d", totalHours, minute, second);
    }

}
