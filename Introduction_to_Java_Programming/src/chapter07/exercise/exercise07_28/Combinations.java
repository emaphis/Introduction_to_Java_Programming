/*
 * Exercise 7.28
 *  (Math: combinations) Write a program that prompts the user to enter 10 integers
 *  and displays all combinations of picking two numbers from the 10 numbers.
 */
package chapter07.exercise.exercise07_28;

import java.util.Scanner;

/**
 * Combinationss
 * @author emaph
 */
public class Combinations {
    public static void main(String[] args) {
        final int SIZE = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter " + SIZE + " intgers: ");
        int[] list = getIntArray(input, SIZE);

        int count = combinations(list);
        System.out.println("Number of combinations " + count);
    }

    private static int[] getIntArray(Scanner input, int size) {
        int[] out = new int[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextInt();
        }
        return out;
    }

    private static int combinations(int[] list) {
        int count = 1;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                System.out.print("(" + list[i] + ", " + list[j] + ")  ");
                if (count % 10 == 0) {
                    System.out.println();
                }
                count++;
            }
        }
        System.out.println();
        return count;
    }
}
// 1 2 3 4 5 6 7 8 9 0

