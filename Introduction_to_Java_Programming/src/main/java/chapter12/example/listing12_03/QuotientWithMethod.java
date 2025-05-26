/*
 * Listing 12.3
 * 12.1 Introduction
 * Rewrite Listing 12.2 to compute a quotient using a method
 */
package chapter12.example.listing12_03;

import java.util.Scanner;

/**
 * Using a method.
 * @author emaph
 */
public class QuotientWithMethod {

    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Divisor cannot be zero ");
            System.exit(0);
        }

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int result = quotient(number1, number2);
        System.out.println(number1 + " / " + number2 + " is " + result);
    }
}
/*
Enter two integers: 5 2
5 / 2 is 2

Enter two integers: 5 0
Divisor cannot be zero
*/
