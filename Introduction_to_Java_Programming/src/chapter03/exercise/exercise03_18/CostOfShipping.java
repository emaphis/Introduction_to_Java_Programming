/*
 * Exercise 3.18
 *  (Cost of shipping) A shipping company uses the following function to calculate
 *  the cost (in dollars) of shipping based on the weight of the package (in pounds).
 *
 *              ||  3.5, if  0 < w <=  1
 *              ||  5.5, if  1 < w <=  3
 *      c(w)  = ||  8.5, if  3 < w <= 10
 *              || 10.5, if 10 < w <= 20
 *
 *  Write a program that prompts the user to enter the weight of the package and
 *  displays the shipping cost. If the weight is negative or zero, display a message
 *  “Invalid input.” If the weight is greater than 20, display a message “The package
 *  cannot be shipped.”
 */
package chapter03.exercise.exercise03_18;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CostOfShipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the package weight (in pounds): ");
        double w = input.nextDouble();

        double cost = 0;
        String msg = "";
        if (w < 0) {
            msg = "Invalid input.";
        } else if (w <= 1) {
            cost = 3.5;
        } else if (w <= 3) {
            cost = 5.5;
        } else if (w <= 10) {
            cost = 8.5;
        } else if (w <= 20) {
            cost = 10.5;
        } else {
            msg = "The package cannot be shipped.";
        }

        if (cost != 0) {
            System.out.println("The shipping cost is " + cost);
        } else {
            System.out.println(msg);
        }
    }
}
