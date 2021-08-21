/*
 * Exercise 7.19
 *` (Sorted?) Write the following method that returns true if the list is already sorted
 *  in nondecreasing order:
 *
 *      public static boolean isSorted(int[] list)
 *
 *  Write a test program that prompts the user to enter a list and displays whether the
 *  list is sorted or not. Here is a sample run. Note that the program first prompts the
 *  user to enter the size of the list.
 */
package chapter07.exercise.exercise07_19;

import java.util.Scanner;

/**
 * Sorted?
 * @author emaph
 */
public class Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();
        System.out.print("Enter the contents of the list: ");
        int[] list = getIntArray(input, size);

        System.out.print("The list has " + size + " integers ");
        printArray(list);

        if (isSorted(list))
            System.out.println("The list is already sorted");
        else
            System.out.println("TThe list is not sorted");
    }


    public static boolean isSorted(int[] list) {
        boolean sorted = true;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }


    public static int[] getIntArray(Scanner input, int size) {
        int[] out = new int[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextInt();
        }
        return out;
    }

    public static void printArray(int[] list) {
        for (int elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
