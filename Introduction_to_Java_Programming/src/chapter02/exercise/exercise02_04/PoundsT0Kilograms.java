/*
 * Exercise 2.4
 *   Convert pounds into kilograms) Write a program that converts pounds into ki-
 *   lograms. The program prompts the user to enter a number in pounds, converts it
 *   to kilograms, and displays the result.\
 *   One pound is 0.454 kilogram.
 */
package chapter02.exercise.exercise02_04;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class PoundsT0Kilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }

}
