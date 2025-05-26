/*
 * Listing 12.2
 * 12.1 Introduction
 * Using 'if' to catch errors
 */
package chapter12.example.listing12_02;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class QuotientWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number2 != 0)
            System.out.println(number1 + " / " + number2 + " is " +
                    (number1 / number2));
        else
             System.out.println("Divisor cannot be zero ");
    }
}
/*
Enter two integers: 5 2
5 / 2 is 2

Enter two integers: 5 0
Divisor cannot be zero
*/
