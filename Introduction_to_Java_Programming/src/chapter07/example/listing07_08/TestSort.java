/*
 * Test Sort Application
 * 7.11 Sorting Arrays
 */
package chapter07.example.listing07_08;

/**
 * Test Selection sort
 * @author emaph
 */
public class TestSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        SelectionSort.selectionSort(list);
        printList(list);
    }

    private static void printList(double[] list) {
        for (double d : list) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
