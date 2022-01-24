/*
 * Listing 6.6
 * Based on Listing 5.9
 * 6.6  Modularizing Code
 */
package chapter06.example.listing06_06;

import java.util.Scanner;

/**
 * FModularize GCD with a method
 * @author emaph
 */
public class GreatestCommonDivisorMethod {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();


        System.out.println("The greatest common divisor for " + n1 +
            " and " + n2 + " is " + gcd(n1, n2));
    }

    /** Return the gcd of two integers */
    public static int gcd(int n1,int n2) {
        int gcd = 1; // Initial gcd is 1
        int k = 2; // Possible gcd

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Update gcd
            k++;
        }

        return gcd;   // Return GCD
    }
}
