/*
 * Exercise 7.18
 *  (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The
 *  bubble-sort algorithm makes several passes through the array. On each pass, suc-
 *  cessive neighboring pairs are compared. If a pair is not in order, its values are
 *  swapped; otherwise, the values remain unchanged. The technique is called a bub-
 *  ble sort or sinking sort because the smaller values gradually “bubble” their way to
 *  the top, and the larger values “sink” to the bottom. Write a test program that reads
 *  in 10 double numbers, invokes the method, and displays the sorted numbers.
 */
package chapter07.exercise.exercise07_18;

import java.util.Scanner;

/**
 * Bubble sort.
 * @author emaph
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE = 10;

        System.out.print("Enter " + SIZE + " numbers: ");
        double[] numbers = getDoubleArray(input, SIZE);

        bubbleSort(numbers);

        printArray(numbers);
    }


   static void bubbleSort(double[] list) {
       boolean sorted = false;
       while (!sorted) {
           sorted = true;
           for (int i = 0; i < list.length - 1; i++) {
               if (list[i] > list[i+1]) {
                   double temp = list[i+1];
                   list[i+1] = list[i];
                   list[i] = temp;
                   sorted = false;
               }
           }
       }
   }


    public static void printArray(double[] list) {
        for (double elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }


    private static double[] getDoubleArray(Scanner input, int size) {
        double[] out = new double[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextDouble();
        }
        return out;
    }
}

// 5 7 4 3 2 9 1 8 0 6
