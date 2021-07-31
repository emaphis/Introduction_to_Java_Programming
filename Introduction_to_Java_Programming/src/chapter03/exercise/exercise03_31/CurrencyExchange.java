/*
 * Exercise 3.31
 *  (Financials: currency exchange) Write a program that prompts the user to enter
 *  the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the
 *  user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert
 *  from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S.
 *  dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respec-
 *  tively.
 */
package chapter03.exercise.exercise03_31;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int selection = input.nextInt();

        double currency;
        switch (selection) {
            case 0:
                System.out.print("Enter the dollar amount: ");
                currency = input.nextDouble();
                double yuan = currency * rate;
                System.out.println("$" + currency + " is " + yuan + " yuan");
                break;
            case 1:
                System.out.print("Enter the RMB amount: ");
                currency = input.nextDouble();
                double dollars = currency / rate;
                System.out.println(currency + " yuan is $" + dollars);
                break;
            default:
                System.out.println("Incorrect input");
        }
    }
}
