/*
 * Check Point 7.12
 * The Arrays Class
 */
package chapter07.check_point;

/**
 * The Array Class
 * @author emaph
 */
public class CheckPoint07_12 {

    // 7.12.1 What types of array can be sorted using the java.util.Arrays.sort method?
    //        Does this sort method create a new array?
    // a. All primitave types,  No, it sorts the array in place


    // 7.12.2 To apply java.util.Arrays.binarySearch(array, key), should the array
    //        be sorted in increasing order, in decreasing order, or neither?
    // a. assending orderS


    // 7.12.3 Show the output of the following code:
    // a.  [7, 7, 7, 7]
    //     [2, 4, 7. 10]
    //     false

    static void sort3() {
        int[] list1 = {2, 4, 7, 10};
        java.util.Arrays.fill(list1, 7);
        System.out.println(java.util.Arrays.toString(list1));

        int[] list2 = {2, 4, 7, 10};
        System.out.println(java.util.Arrays.toString(list2));
        System.out.print(java.util.Arrays.equals(list1, list2));

        System.out.println();
    }


    public static void main(String[] args) {
        sort3();
    }
}
