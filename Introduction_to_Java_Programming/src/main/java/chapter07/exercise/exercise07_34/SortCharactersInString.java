/*
 * Exercise 7.34
 *  (Sort characters in a string) Write a method that returns a sorted string using the
 *  following header:
 *
 *      public static String sort(String s)
 *
 *      For example, sort("acb") returns abc
 *
 *  Write a test program that prompts the user to enter a string and displays the sorted
 *  string
 */
package chapter07.exercise.exercise07_34;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class SortCharactersInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a strng: ");
        String str1 = input.next();

        String str2 = sort(str1);

        System.out.println("Sorted string is: " + str2);

    }

    public static String sort(String s) {
        char[] list = new char[s.length()];

        for (int i = 0; i < s.length(); i++)
            list[i] = s.charAt(i);

        selectionSort(list);

        String out = "";
        for (int i = 0; i < list.length; i++)
            out += list[i];


        return out;
    }

    // From Listing 7.8
    public static void selectionSort(char[] list) {

        for (int i = 0; i < list.length - 1; i++) {
          // Find the minimum in the list[i..list.length-1]
          char currentMin = list[i];
          int currentMinIndex = i;

          for (int j = i + 1; j < list.length; j++) {
            if (currentMin > list[j]) {
              currentMin = list[j];
              currentMinIndex = j;
            }
          }

          // Swap list[i] with list[currentMinIndex] if necessary;
          if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
          }
        }
    }

}
