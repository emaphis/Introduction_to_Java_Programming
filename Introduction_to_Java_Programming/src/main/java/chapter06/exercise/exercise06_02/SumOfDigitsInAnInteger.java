/*
 * Exercise 6.2
 *  (Sum the digits in an integer) Write a method that computes the sum of the digits
 *  in an integer. Use the following method header:
 *
 *      public static int sumDigits(long n)
 *
 *  For example, sumDigits(234) returns 9 (= 2 + 3 + 4). (Hint: Use the % op-
 *  erator to extract digits and the / operator to remove the extracted digit. For in-
 *  stance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use
 *  234 / 10 (= 23). Use a loop to repeatedly extract and remove the digit until
 *  all the digits are extracted. Write a test program that prompts the user to enter an
 *  integer then displays the sum of all its digits
 */
package chapter06.exercise.exercise06_02;

import java.util.Scanner;

/**
 * Sum the digits in an integer
 * @author emaph
 */
public class SumOfDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to sum by digits: ");
        int number = input.nextInt();

        System.out.println("Sum of digits of number " + number + " is " + sumDigits(number));
    }


    public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            long digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }
}
