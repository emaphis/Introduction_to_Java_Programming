/*
 * Exercise 5.14
 *  (Compute the greatest common divisor) Another solution for Listing 5.9 to find
 *  the greatest common divisor of two integers n1 and n2 is as follows: First find d
 *  to be the minimum of n1 and n2, then check whether d, d–1, d–2, …, 2, or 1 is
 *  a divisor for both n1 and n2 in this order. The first such common divisor is the
 *  greatest common divisor for n1 and n2. Write a program that prompts the user to
 *  enter two positive integers and displays the gcd.
 * Listing 5.9
 * 5.11.1 Case Study: Finding the Greatest Common Divisor
 */
package chapter05.exercise.exercise05_14;

import java.util.Scanner;

/**
 * Find the greatest common divisor between two numbers
 * @author emaph
 */
public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int d = Math.min(n1, n2);       // Possible gcd


        while (d > 0) {
            if (n1 % d == 0 && n2 % d == 0) {
                break;
            }

            d--;
        }

         System.out.println("The greatest common divisor for " + n1 +
                " and " + n2 + " is " + d);
    }
}
