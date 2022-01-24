/*
 * Check Point 7.11
 * Sorting Arrays
 */
package chapter07.check_point;

import java.util.Arrays;

/**
 * Sorting Arrays
 * @author emaph
 */
public class CheckPoint07_11 {

    // 7.11.1  Use Figure 7.11 as an example to show how to apply the selection-sort approach to
    //         sort {3.4, 5, 3, 3.5, 2.2, 1.9, 2}.

    // 1.    v                         v
    //      3.4  5   3   3.5    2.2   1.9   2

    // 2.        v                          v
    //      1.9  5   3   3.5    2.2   3.4   2

    // 3.            v           v
    //      1.9  2   3   3.5    2.2   3.4   5

    // 4.                   v     v
    //      1.9  2   2.2   3.5,   3   3.4   5

    // 5.
    //      1.9  2   2.2    3     3.5   3.4   5


    // 7.11.2 How do you modify the selectionSort method in Listing 7.8 to sort numbers in
    //        decreasing order?
    // a.
    public static void selectionSort(double[] list) {

        for (int i = 0; i < list.length - 1; i++) {
          // Find the minimum in the list[i..list.length-1]
          double currentMin = list[i];
          int currentMinIndex = i;

          for (int j = i + 1; j < list.length; j++) {
            if (currentMin < list[j]) {  // reverse logical operator
              currentMin = list[j];
              currentMinIndex = j;
            }
          }

          // Swap list[i] with list[currentMinIndex] if necessary;
          if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
          }
        }
    }

    public static void main(String[] args) {

        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        System.out.println("list: " + Arrays.toString(list));

        // list: [9.0, 6.6, 5.7, 4.5, 1.0, -4.5]
    }
}
