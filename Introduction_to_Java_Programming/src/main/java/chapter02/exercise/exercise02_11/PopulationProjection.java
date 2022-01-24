/*
 * Exercise 2.11
 *    (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 *    to enter the number of years and display the population after the number of years.
 *    Use the hint in Programming Exercise 1.11 for this program.
 */
package chapter02.exercise.exercise02_11;

import java.util.Scanner;

/**
 * Calculate the population after a given number of years.
 * @author emaph
 */
public class PopulationProjection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int population =  312032486
                               + (((31536000 / 7)
                               -    (31536000 / 13)
                               +   (31536000 / 45)) * years);

        System.out.println("The population in " + years + " years is " + population);
    }

}
