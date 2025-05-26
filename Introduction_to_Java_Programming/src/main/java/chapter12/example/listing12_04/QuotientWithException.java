/*
 * Listing 12.4
 * 12.1 Introduction
 * Rewrite Listing 12.3 to use exceptions
 */
package chapter12.example.listing12_04;

import java.util.Scanner;

/**
 * Using a method throwing an exception.
 * @author emaph
 */
public class QuotientWithException {

    public static int quotient(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
        }
        catch(ArithmeticException ex) {
            System.out.println("Exception: an integer " +
                    "cannot be divided by zero");
        }
    }
}
/*
Enter two integers: 5 2
5 / 2 is 2

Enter two integers: 5 0
Exception: an integer cannot be divided by zero
*/
