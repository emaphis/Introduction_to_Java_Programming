/*
 * Exercise 7.31
 *  Merge two sorted lists) Write the following method that merges two sorted lists
 *  into a new sorted list:
 *
 *      public static int[] merge(int[] list1, int[] list2)
 *
 *  Implement the method in a way that takes at most list1.length + list2.
 *  length comparisons. See liveexample.pearsoncmg.com/dsanimation/
 *  MergeSortNeweBook.html for an animation of the implementation. Write a test
 *  program that prompts the user to enter two sorted lists and displays the merged
 *  list. Here is a sample run. Note the first number in the input indicates the number
 *  of the elements in the list. This number is not part of the list.
 */
package chapter07.exercise.exercise07_31;

import java.util.Scanner;

/**
 * Merge two sorted lists
 * @author emaph
 */
public class MergeLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int[] list1 = getList(input);
        System.out.print("Enter list2 size and contents: ");
        int[] list2 = getList(input);

        int[] list3 = merge(list1, list2);

        System.out.print("list1 is ");
        printList(list1);
        System.out.print("list2 is ");
        printList(list2);
        System.out.print("The merged list is ");
        printList(list3);
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] list = new int[list1.length + list2.length];
        int i1 = 0;
        int i2 = 0;

        while (i1 < list1.length && i2 < list2.length) {
            if (list1[i1] <= list2[i2]) {   // sort acending
                list[i1 + i2] = list1[i1];
                i1++;
            } else {
                list[i1 + i2] = list2[i2];
                i2++;
            }
        }

        while (i1 < list1.length) {
            list[i1 + i2] = list1[i1];
            i1++;
        }

        while (i2 < list2.length) {
            list[i1 + i2] = list2[i2];
            i2++;
        }

        return list;
    }

    private static int[] getList(Scanner input) {
        int size = input.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    private static void printList(int[] list) {
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
