/*
 *  Listing 1,8
 */
package chapter02.examples.listing02_08;

import java.util.Scanner;

/**
 * Sales Tax calculation
 * @author emaph
 */
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
         double purchaseAmount = input.nextDouble();

         double tax = purchaseAmount * 0.06;
         System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
    }
}
