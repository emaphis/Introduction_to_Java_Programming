/*
 * Listing 5.5
 * 5.5 Controlling a Loop with User Confirmation or a Sentinel Value
 */
package chapter05.example.listing05_05;

import java.util.Scanner;

/**
 * @author emaph
 */
public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read an intial value
        System.out.print("Enter an integer (the input ends if it is 0: ");
        int data = input.nextInt();

        // Keep reading data unitl the input is 0.
        int sum = 0;
        while (data != 0) {
            sum += data;

            // Read the next data
            System.out.print("Enter an integer (the input ends if it is 0: ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}
