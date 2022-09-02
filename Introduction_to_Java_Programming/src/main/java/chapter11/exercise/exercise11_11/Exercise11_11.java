/*
 * Exercise 11.11
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
 *
 *      public static void sort(ArrayList<Integer> list)
 *
 * Write a test program that prompts the user to enter five numbers, stores them in
 * an array list, and displays them in increasing order.
 */
package chapter11.exercise.exercise11_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sort ArrayList
 * @author emaph
 */
public class Exercise11_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE = 5;
        ArrayList<Integer> list = new ArrayList<>();

        // Get 5 numbers
        System.out.print("Enter five integers: ");
        for (int i = 0; i < SIZE; i++) {
            list.add(input.nextInt());
        }

        sort(list);

        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }

    /** sort ArrayList using selection sort */
    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
          // Find the minimum in the list[i..list.size-1]
          int currentMin = list.get(i);
          int currentMinIndex = i;

          for (int j = i + 1; j < list.size(); j++) {
            if (currentMin > list.get(j)) {
              currentMin = list.get(j);
              currentMinIndex = j;
            }
          }

          // Swap list[i] with list[currentMinIndex] if necessary;
          if (currentMinIndex != i) {
            list.set(currentMinIndex, list.get(i));
            list.set(i, currentMin);
          }
        }
    }
}
