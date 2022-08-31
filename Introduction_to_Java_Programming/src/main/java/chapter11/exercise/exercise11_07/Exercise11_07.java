/*
 * Exercise 11.7
 *  11.7 (Shuffle ArrayList) Write the following method that shuffles the elements in
 *  an ArrayList of integers:
 *
 *  public static void shuffle(ArrayList<Integer> list)
 */
package chapter11.exercise.exercise11_07;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/**
 * Shuffle ArrayList
 *
 * @author emaph
 */
public class Exercise11_07 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println("Original list: " + list);
        shuffle(list);
        System.out.println("Shuffled list: " + list);
    }

    /**
     * Randomly shuffle a given list
     */
    public static void shuffle(ArrayList<Integer> list) {
        Random random = new Random();
        int size = list.size() - 1;

        for (int i = 0; i < list.size(); i++) {
            int idx =  random.nextInt(size);

            // swap
            int temp = list.get(i);
            list.set(i, list.get(idx));
            list.set(idx, temp);
        }
    }
}
