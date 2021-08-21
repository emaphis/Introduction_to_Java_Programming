/*
 * Exercise 7.15
 *  (Eliminate duplicates) Write a method that returns a new array by eliminating the
 *  duplicate values in the array using the following method header:
 *
 *      public static int[] eliminateDuplicates(int[] list)
 *
 *  Write a test program that reads in 10 integers, invokes the method, and displays
 *  the distinct numbers separated by exactly one space.
 *  See Exercise 7.5
 */
package chapter07.exercise.exercise07_15;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class EliminateDuplicates {
    public static void main(String[] args) {
        final int SIZE = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter " + SIZE + " intgers: ");
        int[] list = getIntArray(input, SIZE);

        int[] distinct = eliminateDuplicates(list);
        print(distinct);
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] distinct = new int[list.length];
        int idx = 0;

        for (int i = 0; i < list.length; i++) {
            int num = list[i];
            if (!isDup(distinct, num)) {
                distinct[idx] = num;
                idx++;
            }
        }

        return distinct;
    }

    private static boolean isDup(int[] list, int number) {
        for (int n: list) {
            if (n == number)
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

     private static void print(int[] array){
        for (int num : array) {
            if (num != 0)
                System.out.print(num + " ");
        }
        System.out.println();
    }
}

//  1 2 3 2 1 6 3 4 5 2
//  1 2 3 6 4 5
