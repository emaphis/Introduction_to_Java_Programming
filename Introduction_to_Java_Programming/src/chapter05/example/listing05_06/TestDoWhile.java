/*
 * Listing 5.6
 *  The do-while loop.
 */
package chapter05.example.listing05_06;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class TestDoWhile {
    /** Main method */
    public static void main(String args[]) {
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        // Keep rading data until the input is 0
        do {
            // Read the next data
            System.out.print("Enter an inteer (thi input ends if it is 0): ");
            data = input.nextInt();

            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);
    }
}
