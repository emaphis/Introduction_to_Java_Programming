/*
 * Exercise 7.14
 *  Compute gcd) Write a method that returns the gcd of an unspecified number of
 *  integers. The method header is specified as follows:
 *
 *      public static int gcd(int... numbers)
 *
 *  Write a test program that prompts the user to enter five numbers, invokes the
 *  method to find the gcd of these numbers, and displays the gcd.
 */
package chapter07.exercise.exercise07_14;

import java.util.Scanner;

/**
 * Compute gcd
 * @author emaph
 */
public class ComputeGCD {
    public static void main(String[] args) {
        final int SIZE = 5;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter " + SIZE + " intgers to average: ");
        int[] intArray = getIntArray(input, SIZE);

        int gcd = gcd(intArray);

        System.out.println("The GCD is " + gcd);
    }


    public static int gcd(int... numbers) {
        int result = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            result = findGCD(result, numbers[i]);
        }

        return result;
    }

    public static int findGCD(int n1, int n2) {
        int gcd = 1; // Initial gcd is 1
        int k = 2; // Possible gcd

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Update gcd
            k++;
        }

        return gcd;   // Return GCD
    }


    private static int[] getIntArray(Scanner input, int size) {
        int[] out = new int[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextInt();
        }
        return out;
    }
}

//  4 6 14 34 10