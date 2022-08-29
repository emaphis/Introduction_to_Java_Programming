/*
 * Check Point 11.12
 * Useful Methods for Lists
 */
package chapter11.check_point;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CheckPoint11_12 {
    public static void main(String[] args) {
     // 11.12.1 Correct errors in the following statements:
        // int[] array1 = {3, 5, 95, 4, 15, 34, 3, 6, 5};  // wrong type
        Integer[] array1 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array1));
        System.out.println(list);

    // 11.12.2 Correct errors in the following statements:
        //int[] array2 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        List<Integer> array2 = Arrays.asList(3, 5, 95, 4, 15, 34, 3, 6, 5);
        System.out.println(java.util.Collections.max(array2));

    }
}
