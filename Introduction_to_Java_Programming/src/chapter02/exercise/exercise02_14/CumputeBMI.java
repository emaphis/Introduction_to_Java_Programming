/*
 * Exercise 2.14
 *  (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 *  health on weight. It can be calculated by taking your weight in kilograms and divid-
 *  ing, by the square of your height in meters. Write a program that prompts the user to
 *  enter a weight in pounds and height in inches and displays the BMI. Note one pound
 *  is 0.45359237 kilograms and one inch is 0.0254 meters.
 */
package chapter02.exercise.exercise02_14;

import java.util.Scanner;

/**
 * Calculate BMI given weight and height
 * @author emaph
 */
public class CumputeBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble() * 0.45359237;
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble() * 0.0254;

        double bmi = weight / (height * height);
        System.out.println("BMI is " + bmi);
    }
}
