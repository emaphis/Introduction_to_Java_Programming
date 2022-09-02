/*
 * Exercise 11.13
 *  (Remove duplicates) Write a method that removes the duplicate elements from
 *  an array list of integers using the following header:
 *
 *      public static void removeDuplicate(ArrayList<Integer> list)
 *
 *  Write a test program that prompts the user to enter 10 integers to a list
 *  and dis￾plays the distinct integers in their input order and separated by exactly one space.
 */
package chapter11.exercise.exercise11_13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Remove duplicates
 * @author emaph
 */
public class Exercise11_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE = 10;
        ArrayList<Integer> list = new ArrayList<>();

        // Get 10 numbers
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < SIZE; i++) {
            list.add(input.nextInt());
        }

        removeDuplicate(list);

        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            int j = i + 1;
            while (j < list.size()) {
                if (list.get(j) == num)
                    list.remove(j);
                else
                    j++;
            }
        }
    }
}
