/*
 * Exercise 7.16
 *  (Execution time) Write a program that randomly generates an array of 100,000
 *  integers and a key. Estimate the execution time of invoking the linearSearch
 *  method in Listing 7.6. Sort the array and estimate the execution time of invoking
 *  the binarySearch method in Listing 7.7. You can use the following code tem-
 *  plate to obtain the execution time:
 *
 *      long startTime = System.nanoTime();
 *      perform the task;
 *      long endTime = System.nanoTime();
 *      long executionTime = endTime − startTime;
 */
package chapter07.exercise.exercise07_16;

import java.util.Arrays;
import static chapter07.example.listing07_06.LinearSearch.linearSearch;
import static chapter07.example.listing07_07.BinarySearch.binarySearch;

/**
 *
 * @author emaph
 */
public class ExecutionTime {
    public static void main(String[] args) {
        final int SIZE = 100_000;

        int[] list = generateList(SIZE);

        long startTime, endTime;

        startTime = System.nanoTime();
        int find1 = linearSearch(list, 50_000);
        endTime = System.nanoTime();
        long executionTime1 = endTime - startTime;


        startTime = System.nanoTime();
        int find2 = binarySearch(list, 50_000);
        endTime = System.nanoTime();
        long executionTime2 = endTime - startTime;

        System.out.println("Time for linear search of " + find1 + " is " + executionTime1);
        System.out.println("Time for binary search of " + find2 + " is " + executionTime2);


        //for (int i = 0; i < 100; i++) {
        //    System.out.println("ff " + list[i]);
       // }
    }

    private static int[] generateList(int size) {
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = 1 + (int) (Math.random() * 100_000);
        }
        Arrays.sort(list);
        return list;
    }
}

// Time for linear search of -1 is 1350600
// Time for binary search of -50109 is 408100

// Time for linear search of 50072 is 1217700
// Time for binary search of 50072 is 381300

