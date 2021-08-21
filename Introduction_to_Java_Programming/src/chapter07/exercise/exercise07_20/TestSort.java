/*
 * Exercise 7.20
 * Test Sort Application
 */
package chapter07.exercise.exercise07_20;

import java.util.Scanner;


/**
 * Test Selection sort
 * @author emaph
 */
public class TestSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE = 10;

        System.out.print("Enter " + SIZE + " numbers: ");
        double[] list = getDoubleArray(input, SIZE);

        printList(list);
        ReverseSelectionSort.reverseSelectionSort(list);
        printList(list);
    }


    public static double[] getDoubleArray(Scanner input, int size) {
        double[] out = new double[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextDouble();
        }
        return out;
    }

    private static void printList(double[] list) {
        for (double d : list) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}

// 1.0 9.0 4.5 -1.0 3.0 6.6 5.7 -4.5 0.0 15.3