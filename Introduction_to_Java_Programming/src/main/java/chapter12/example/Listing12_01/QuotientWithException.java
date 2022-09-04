/*
 *  Listing 12.4
 *  12.2 Exception-Handling Overview
 */
package chapter12.example.Listing12_01;

import java.util.Scanner;

/**
 * Letting the caller deal with the error by throwing an exception
 * @author emaph
 */
public class QuotientWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        input.close();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
        }
        catch (ArithmeticException ex) {
            System.out.println("Exception: and integer cannot be divided by zero");
        }
    }

    public static int quotient(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");

        return number1 / number2;
    }
}

/*
Enter two integers: 5 3
5 / 3 is 1

Enter two integers: 5 0
Exception: and integer cannot be divided by zero
*/
