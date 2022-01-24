/*
 * Exercise 7.12
 *  (Reverse an array) The reverse method in Section 7.7 reverses an array by
 *  copying it to a new array. Rewrite the method that reverses the array passed in
 *  the argument and returns this array. Write a test program that prompts the user to
 *  enter 10 numbers, invokes the method to reverse the numbers, and displays the
 *  numbers.
 */
package chapter07.exercise.exercise07_12;

import java.util.Scanner;

/**
 * Reverse an array
 * @author emaph
 */
public class ReverseAnArray {

    public static void main(String args[]) {
        final int SIZE = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        int array[] = getIntArray(input, SIZE);
        reverse(array);
        print(array);
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }


    private static int[] getIntArray(Scanner input, int size) {
        int[] out = new int[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextInt();
        }
        return out;
    }


    private static void print(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

// 1 2 3 4 5 6 7 8 9 0
