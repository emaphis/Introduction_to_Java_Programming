/*
 * Exercise 3.20
 *  (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to
 *  compute the wind-chill temperature. The formula is valid for temperatures in the
 *  range between -58°F and 41°F and wind speed greater than or equal to 2. Write
 *  a program that prompts the user to enter a temperature and a wind speed. The
 *  program displays the wind-chill temperature if the input is valid; otherwise, it dis-
 *  plays a message indicating whether the temperature and/or wind speed is invalid.
 */
package chapter03.exercise.exercise03_20;

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
        if (temp <= -58 || temp >= 41) {
            System.out.println("Temperature is invalid.");
            return;
        }

        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double speed = input.nextDouble();
        if (speed < 2) {
            System.out.println("Wind speed is invalid.");
            return;
        }

        double vTo16 = Math.pow(speed, 0.16);
        double twc = 35.74 + 0.6215 * temp - 35.75 * vTo16 + 0.4275 * temp * vTo16;

        System.out.println("The wind chill index is: " + twc);
    }
}
