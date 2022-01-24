/*
 * Exercise 2.23
 *  (Cost of driving) Write a program that prompts the user to enter the distance to
 *  drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
 *  then displays the cost of the trip.
 */
package chapter02.exercise.exercise02_23;

import java.util.Scanner;

/**
 * Calculate cost to drive given a distance, mpg, and price per gallon.
 * @author emaph
 */
public class CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double mpg = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();

        double cost =  (distance / mpg) * price;

        System.out.println("The cost of driving is $" + cost);
    }
}
