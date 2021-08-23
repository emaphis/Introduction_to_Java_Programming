/*
 * Exercise 7.30
 *  (Pattern recognition: consecutive four equal numbers) Write the following method
 *  that tests whether the array has four consecutive numbers with the same value:
 *
 *      public static boolean isConsecutiveFour(int[] values)
 *
 *  Write a test program that prompts the user to enter a series of integers and dis-
 *  plays it if the series contains four consecutive numbers with the same value. Your
 *  program should first prompt the user to enter the input size—i.e., the number of
 *  values in the series.
 */
package chapter07.exercise.exercise07_30;

import java.util.Scanner;

/**
 * consecutive four equal numbers
 * @author emaph
 */
public class ConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of values: ");
        final int SIZE =  input.nextInt();

        System.out.print("Enter the values : ");
        int[] list = getIntArray(input, SIZE);

        if (isConsecutiveFour(list))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 4; i++) {
            if (values[i] == values[i + 1] && values[i] == values[i + 2]
                    && values[i] == values[i + 3])
                return true;
        }
        return false;
    }

    private static int[] getIntArray(Scanner input, int size) {
        int[] out = new int[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextInt();
        }
        return out;
    }
}
