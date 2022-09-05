/*
 *  Listing 12.1
 *  12.2 Exception-Handling Overview
 */
package chapter12.example.listing12_01;

import java.util.Scanner;

/**
 * Demonstrate exception divide by 0
 * @author emaph
 */
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
    }
}

/*
Enter two integers: 5 2
5 / 2 is 2

Enter two integers: 3 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
*/
