/*
 *  Listing 12.2
 *  12.2 Exception-Handling Overview
 */
package chapter12.example.listing12_01;

import java.util.Scanner;

/**
 * Guarding an integer division with if.
 * @author emaph
 */
public class QuotientWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        input.close();

        if (number2 != 0)
            System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
        else
            System.out.println("Divisor cannot be zero");
    }
}

/*
Enter two integers: 5 2
5 / 2 is 2

Enter two integers: 5 0
Divisor cannot be zero
*/
