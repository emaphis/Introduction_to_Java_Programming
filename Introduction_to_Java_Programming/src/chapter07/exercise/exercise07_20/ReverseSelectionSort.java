/*
 * Exercise 7.20
 *  Revise selection sort) In Listing 7.8, you used selection sort to sort an array. The
 *  selection-sort method repeatedly finds the smallest number in the current array
 *  and swaps it with the first. Rewrite this program by finding the largest number and
 *  swapping it with the last. Write a test program that reads in 10 double numbers,
 *  invokes the method, and displays the sorted numbers.
 */
package chapter07.exercise.exercise07_20;

/**
 * Selection sort
 *
 * @author emaph
 */
public class ReverseSelectionSort {

    /**
     * The method for sorting the numbers
     */
    public static void reverseSelectionSort(double[] list) {

        for (int i = list.length - 1; i >= 0; i--) {
            // Find the maximum in the list[i+1...list.length]
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMax] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
