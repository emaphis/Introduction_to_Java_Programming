/*
 * Exercise 6.7
 *  (Financial application: compute the future investment value) Write a method that
 *  computes future investment value at a given interest rate for a specified number
 *  of years. The future investment is determined using the formula in Programming
 *  Exercise 2.21.
 *
 * Use the following method header:
 *
 *      public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,int years)
 *
 *  or example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
 *
 *  Write a test program that prompts the user to enter the investment amount (e.g.,
 *  1,000) and the interest rate (e.g., 9%) and prints a table that displays future value
 *  for the years from 1 to 30
 *
 *  futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
 */
package chapter06.exercise.exercise06_07;

import java.util.Scanner;

/**
 * Calculate future value of an investment
 * @author emaph
 */
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount invested: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        // Print header
        System.out.printf("%4s %11s\n", "Year", "Future Value");

        for (int year = 1; year <= 30; year++) {
            investmentAmount = futureInvestmentValue(investmentAmount, monthlyInterestRate, 1);
            System.out.printf("%2d  %11.2f\n", year, investmentAmount);
        }

    }


    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,int years) {
        double numberOfMonths =  years * 12;
        double value = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);

        return value;
    }
}
