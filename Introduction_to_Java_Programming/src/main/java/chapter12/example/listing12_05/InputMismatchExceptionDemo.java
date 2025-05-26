/*
 * Listing 12.5
 * 12.1 Introduction
 * Catching exceptions thrown by libraries.
 */
package chapter12.example.listing12_05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Using try-catch to catch exceptions from library methods.
 * @author emaph
 */
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter and integer: ");
                int number = input.nextInt();

                // Display the result
                System.out.println("The number entered is " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                input.nextLine();
            }
        } while (continueInput);

    }
}
/*
Enter and integer: 3.5
Try again. (Incorrect input: an integer is required)
Enter and integer: 4
The number entered is 4
*/