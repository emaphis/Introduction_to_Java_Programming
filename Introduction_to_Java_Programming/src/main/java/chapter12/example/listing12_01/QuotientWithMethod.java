/*
 *  Listing 12.3
 *  12.2 Exception-Handling Overview
 * NOTE: The method shouldin't terminate the program, that should be up
 *       to the caller.  That's why we need exceptions
 */
package chapter12.example.listing12_01;

import java.util.Scanner;

/**
 * Moving integer division to a method.
 * @author emaph
 */
public class QuotientWithMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        input.close();

        int result = quotient(number1, number2);
        System.out.println(number1 + " / " + number2 + " is " + result);
    }

    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Divisor cannot be zero");
            System.exit(1);
        }

        return number1 / number2;
    }
}

/*
Enter two integers: 5 3
5 / 3 is 1

Enter two integers: 5 0
Divisor cannot be zero
org.apache.commons.exec.ExecuteException: Process exited with an error: 1 (Exit value: 1)
*/
