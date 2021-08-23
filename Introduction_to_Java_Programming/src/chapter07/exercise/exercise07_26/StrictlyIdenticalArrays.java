/*
 * Exercise 7.26
 *  (Strictly identical arrays) The arrays list1 and list2 are strictly identical
 *  if their corresponding elements are equal. Write a method that returns true if
 *  list1 and list2 are strictly identical, using the following header:
 *
 *      public static boolean equals(int[] list1, int[] list2)
 *
 *  Write a test program that prompts the user to enter two lists of integers and displays
 *  whether the two are strictly identical. Here are the sample runs. Note the first num-
 *  ber in the input for each list indicates the number of the elements in the list. This
 *  number is not part of the list.
 */
package chapter07.exercise.exercise07_26;

import java.util.Scanner;

/**
 * Strictly identical arrays
 * @author emaph
 */
public class StrictlyIdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int[] list1 = getList(input);
        System.out.print("Enter list2 size and contents: ");
        int[] list2 = getList(input);

        if (equals(list1, list2))
            System.out.println("Two lists are strictly identical");
        else
            System.out.println("Two lists are not strictly identical");
    }

    private static int[] getList(Scanner input) {
        int size = input.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) return false;

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }

        return true;
    }
}
