/*
 * Exercise 10.5
 *  (Display the prime factors) Write a program that prompts the user to enter a
 *  positive integer and displays all its smallest factors in decreasing order. For
 *  example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
 *  2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
 *  retrieve and display them in reverse order.
 */
package chapter10.exercise.exercise10_05;

import chapter10.example.listing10_07.StackOfIntegers;
import java.util.Scanner;

/**
 * Display the prime factors
 * @author emaph
 */
public class DisplayPrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integers: ");
        int number = input.nextInt();

        StackOfIntegers stack = getPrimeFactors(number);

        while (!stack.empty()) {
            System.out.print(stack.pop() + (stack.empty() ? " " : ", "));
        }
    }

    private static StackOfIntegers getPrimeFactors(int number) {
        StackOfIntegers stack = new StackOfIntegers();
        int guess = number;
        int fact = 2;
        while (fact < number / 2) {
            if (guess % fact == 0) {
                stack.push(fact);
                guess /= fact;
            }
            else
                fact++;
        }
        return stack;
    }

}
