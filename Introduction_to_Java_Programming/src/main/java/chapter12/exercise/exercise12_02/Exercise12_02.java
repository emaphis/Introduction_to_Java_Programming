/*
 * Exercise 12.2
 *  (InputMismatchException) Write a program that prompts the user to read
 *  two integers and displays their sum. Your program should prompt the user to
 *  read the number again if the input is incorrect.
 */
package chapter12.exercise.exercise12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * InputMismatchException
 * @author emaph
 */
public class Exercise12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer to sum: ");
        int num1 = getNumber(input);
        System.out.print("Enter another integer to sum: ");
        int num2 = getNumber(input);
        input.close();

        System.out.println("The sum is: " + (num1 + num2));
    }

    /** loop until an correct integer is entered */
    static int getNumber(Scanner input) {
        boolean loop = true;
        int num = 0;

        do {
            try {
                num = input.nextInt();
                loop = false;
            } catch (InputMismatchException ex) {
                System.out.print("Enter a correct integer: ");
                input.nextLine();  // discard incorrect input.
            }
        } while (loop);

        return num;
    }
}
