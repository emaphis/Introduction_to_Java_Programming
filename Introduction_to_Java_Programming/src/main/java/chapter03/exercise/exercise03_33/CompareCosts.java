/*
 * Exercise 3.33
 *  (Financial: compare costs) Suppose you shop for rice in two different packages.
 *  You would like to write a program to compare the cost. The program prompts the
 *  user to enter the weight and price of each package and displays the one with the
 *  better price.
 */
package chapter03.exercise.exercise03_33;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CompareCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        double cost1 = price1 / weight1;

        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double cost2 = price2 / weight2;

        if (cost2 < cost1) {
            System.out.println("Package 2 has a better price.");
        } else if (cost1 < cost2) {
            System.out.println("Package 1 has a better price.");
        } else {
            System.out.println("Two packages have the same price.");
        }
    }
}
