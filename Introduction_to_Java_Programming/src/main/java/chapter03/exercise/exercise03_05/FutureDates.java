/*
 * Exercise 3.5
 *  (Find future dates) Write a program that prompts the user to enter an integer for
 *  today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
 *  prompt the user to enter the number of days after today for a future day and dis-
 *  play the future day of the week.
 */
package chapter03.exercise.exercise03_05;

import java.util.Scanner;

/**
 * Print out future date given day and elapsed days
 * @author emaph
 */
public class FutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int day = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        String name = "";

        // Compute current day name.
        switch (day) {
            case 0: name = "Sunday"; break;
            case 1: name = "Monday"; break;
            case 2: name = "Tuesday"; break;
            case 3: name = "Wednsday"; break;
            case 4: name = "Thursday"; break;
            case 5: name = "Friday"; break;
            case 6: name = "Saturday";
        }

        // Calculate future day.
        int futureDay = (day + elapsed) % 7;
        String futureName = "";

        switch (futureDay) {
            case 0: futureName = "Sunday"; break;
            case 1: futureName = "Monday"; break;
            case 2: futureName = "Tuesday"; break;
            case 3: futureName = "Wednsday"; break;
            case 4: futureName = "Thursday"; break;
            case 5: futureName = "Friday"; break;
            case 6: futureName = "Saturday";
        }

        System.out.println("Today is " + name + " and the future day is "  + futureName);
    }
}
