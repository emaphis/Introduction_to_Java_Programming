/*
 * 7.12 The Arrays Class
 *  The 'java.util.Arrays' class contains useful methods for common array operations
 *  such as sorting and searching.
 */
package chapter07.example.examples;

import java.util.Arrays;

/**
 * Exercise the Array Class
 * @author emaph
 */
public class ArrayClass {
    static void tostring() {
        int[] list = {2, 4, 7, 10};
        System.out.println(Arrays.toString(list));
    }

    static void sorting() {
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers); // Sort the whole array
        Arrays.parallelSort(numbers); // Sort the whole array
        System.out.println("numbers: " + Arrays.toString(numbers));

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars, 1, 3); // Sort part of the array
        //Arrays.parallelSort(chars, 1, 3); // Sort part of the array
        System.out.println("chars: " + Arrays.toString(chars));
    }

    static void searching() {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("1. Index is " + Arrays.binarySearch(list, 11));
        System.out.println("2. Index is " + Arrays.binarySearch(list, 12));

        char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index is " + Arrays.binarySearch(chars, 'a'));
        System.out.println("4. Index is " + Arrays.binarySearch(chars, 't'));
    }

    static void equals() {
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};
        int[] list3 = {4, 2, 7, 10};
        System.out.println(java.util.Arrays.equals(list1, list2)); // true
        System.out.println(java.util.Arrays.equals(list2, list3)); // false
    }

    static void fill() {
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 7, 7, 10};
        Arrays.fill(list1, 5); // Fill 5 to the whole array
        Arrays.fill(list2, 1, 5, 8); // Fill 8 to a partial array

        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
    }


    public static void main(String[] args) {
        tostring();
        System.out.println();
        sorting();
        System.out.println();
        searching();
        System.out.println();
        equals();
        System.out.println();
        fill();
    }
}
