/*
 * Exercise 11.14
 *  (Combine two lists) Write a method that returns the union of two array lists of
i*c ntegers using the following header:
 *
 *      public static ArrayList<Integer> union(
 *         ArrayList<Integer> list1, ArrayList<Integer> list2)
 *
 *  For example, the addition of two array lists {2, 3, 1, 5} and {3, 4, 6} is
 *  {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
 *  each with five integers, and displays their union. The numbers are separated by
 *  exactly one space.
 */
package chapter11.exercise.exercise11_14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Combine two lists
 * @author emaph
 */
public class Exercise11_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE = 5;

        System.out.print("Enter five integers for list1: ");
        ArrayList<Integer> list1 = getList(SIZE, input);
        System.out.print("Enter five integers for list2: ");
        ArrayList<Integer> list2 = getList(SIZE, input);
        input.close();

        ArrayList<Integer> list3 = union(list1, list2);

        System.out.print("The comibned list is ");
        for (Integer num : list3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static ArrayList<Integer> getList(int size, Scanner input) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(input.nextInt());
        }
        return list;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1,
                                            ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<>();
        for (Integer num : list1) {
            list3.add(num);
        }
        for (Integer num : list2) {
            list3.add(num);
        }
        return list3;
    }
}
