/*
 * Exercise 7.32
 *  (Partition of a list) Write the following method that partitions the list using the
 *  first element, called a pivot:
 *
 *      public static int partition(int[] list
 *
 *  After the partition, the elements in the list are rearranged so all the elements before
 *  the pivot are less than or equal to the pivot, and the elements after the pivot are
 *  greater than the pivot. The method returns the index where the pivot is located in
 *  the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
 *  the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes at
 *  most list.length comparisons. See liveexample.pearsoncmg.com/dsanima-
 *  tion/QuickSortNeweBook.html for an animation of the implementation. Write a
 *  test program that prompts the user to enter the size of the list and the contents of
 *  the list and displays the list after the partition. Here is a sample run.
 */
// TODO:  Not qutie right.
package chapter07.exercise.exercise07_32;

import java.util.Scanner;

/**
 * Partition of a list
 * @author emaph
 */
public class PartitionList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list size: ");
        int size = input.nextInt();

        System.out.print("Enter list1 size and contents: ");
        int[] list = getList(input, size);

        int point = partition(list);

        System.out.print("After the partition, the list is ");
        printList(list);

    }

    public static int partition(int[] list) {
        int first = 0;
        int last = list.length - 1;

        int pivot = list[first];
        int low = first + 1;
        int high = last;

         while (low <= high) {
            while(low <= high && list[low] <= pivot)
                low++;

            while(low <= high && list[high] > pivot)
                high--;

            if (low <= high) {
                swap(list, low, high);
                //low++;
                //high--;
            }
         }

         // reposition pivot
         if (pivot > list[high]) {
             list[first] = list[high];
             list[high] = pivot;
             return high;
         } else
            return low;
    }


    private static void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }


    private static int[] getList(Scanner input, int size) {
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    private static void printList(int[] list) {
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
