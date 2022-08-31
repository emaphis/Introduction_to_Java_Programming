/*
 * Exercise 11.4
 *  (Maximum element in ArrayList) Write the following method that returns the
 *  maximum value in an ArrayList of integers. The method returns null if the
 *  list is null or the list size is 0.
 *
 *  public static Integer max(ArrayList<Integer> list)
 *
 *  Write a test program that prompts the user to enter a sequence of numbers ending
 *  with 0 and invokes this method to return the largest number in the input.
 */
package chapter11.exercise.exercise11_04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class Exercise11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getList();
        Integer result = max(list);
        System.out.println("max = " + result);
    }

    /** Return the max integer in an integer list */
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty())
            return 0;

        Integer max = list.get(0);

        for (Integer integer : list) {
            if (integer > max)
                max = integer;
        }

        return max;
    }

    public static ArrayList<Integer> getList() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers ending in 0: ");

        Integer num = input.nextInt();
        while (num != 0) {
            list.add(num);
            num = input.nextInt();
        }
        input.close();

        return list;
    }
}
