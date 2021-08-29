/*
 * Exercise 816
 *  (Sort two-dimensional array) Write a method to sort a two-dimensional array
 *  using the following header:
 *
 *      public static void sort(int m[][])
 *
 *  The method performs a primary sort on rows, and a secondary sort on columns.
 *  For example, the following array
 *
 *      {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
 *
 *  will be sorted to
 *
 *      {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}
 */
package chapter08.exercise.exercise08_16;

import java.util.Arrays;

/**
 * Sort two-dimensional array
 * @author emaph
 */
public class SortTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

        sort(array);

        System.out.println(Arrays.deepToString(array));
    }

    // Good old slection sort, souped up.
    public static void sort(int m[][]) {
        for (int i = 0; i < m.length; i++) {
        double min = m[i][0];
        int minIdx = i;

        for (int j = i; j < m.length; j++) {
          if (m[j][0] < min // primary sort
              || (m[j][0] == min
                  && m[minIdx][1] > m[j][1])) {  // check secondary sort.
            min = m[j][0];
            minIdx = j;
          }
        }

        // swap if not the same element.
        if (minIdx != i) {
          int temp0 = m[minIdx][0];
          int temp1 = m[minIdx][1];

          m[minIdx][0] = m[i][0];
          m[minIdx][1] = m[i][1];

          m[i][0] = temp0;
          m[i][1] = temp1;
        }
      }
    }
}
