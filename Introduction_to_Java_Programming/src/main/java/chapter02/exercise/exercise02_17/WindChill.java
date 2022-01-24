/*
 * Exercise 2.17
 *  Write a program that prompts the user to enter a temperature between -58°F
 *  and 41°F and a wind speed greater than or equal to 2 then displays the wind-chill
 *  temperature. Use Math.pow(a, b) to compute v0.16.
 */
package chapter02.exercise.exercise02_17;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temp = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double speed = input.nextDouble();

        double vTo16 = Math.pow(speed, 0.16);
        double twc = 35.74 + 0.6215 * temp - 35.75 * vTo16 + 0.4275 * temp * vTo16;

        System.out.println("The wind chill index is: " + twc);
    }

}
