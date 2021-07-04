/*
 * Exercise  2.7
 *   (Find the nu mber of years) Write a program that prompts the user to enter the
 *   minutes (e.g., 1 billion), and displays the maximum number of years and remain-
 *   ing days for the minutes. For simplicity, assume that a year has 365 days.
 */
package chapter02.exercise.exercise02_07;

import java.util.Scanner;

/**
 * Calculate number of years given a number of minutes
 * @author emaph
 */
public class NumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int MINUTES_PER_DAY = 24 * 60;
        int MINUTES_PER_YEAR = 365 * MINUTES_PER_DAY;

        int years = minutes / MINUTES_PER_YEAR;
        int remainingMinutes = minutes % MINUTES_PER_YEAR;
        int days = remainingMinutes / MINUTES_PER_DAY;

        System.out.println(minutes + " minutes is approcimately " + years + " years and " + days + " days" );
    }
}
