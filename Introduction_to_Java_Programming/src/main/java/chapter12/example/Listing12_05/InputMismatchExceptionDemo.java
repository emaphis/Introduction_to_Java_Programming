/*
 * Listing 12.5
 * \12.2 Exception-Handling Overview
 */
package chapter12.example.Listing12_05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A example that handles an InputMismatchException when reading an input.
 * Collect then print an integer.
 * @author emaph
 */
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();

                // Display the result
                System.out.println("The number entered is " + number);

                continueInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input: an integer is required");
                input.nextLine();  // Discard input
            }
        } while (continueInput);
    }
}

/*
Enter an integer: 3.5
Incorrect input: an integer is required
Enter an integer: "aa"
Incorrect input: an integer is required
Enter an integer: 4
The number entered is 4
*/
