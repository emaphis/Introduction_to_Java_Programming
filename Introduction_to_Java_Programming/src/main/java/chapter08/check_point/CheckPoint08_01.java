/*
 * Check Point 8.2
 * .2 Two-Dimensional Array Basics
 */
package chapter08.check_point;

/**
 * Basics
 * @author emaph
 */
public class CheckPoint08_01 {

    // 8.2.1 Declare an array reference variable for a two-dimensional array of int values,
    //       create a 4-by-5 int matrix, and assign it to the variable.
    private static void array1() {
        int[][] array = new int[4][5];
    }


    // 8.2.2 Which of the following statements are valid?
    private static void arra2() {
        // int[][] r = new int[2];  // invalid, incompatible types

        // int[] x = new int[];     // invalid, incompatible types

        int[][] y = new int[3][];   // ok

        int[][] z = {{1, 2}};       // ok

        int[][] m = {{1, 2}, {2, 3}};    // ok

        // int[][] n = {{1, 2}, {2, 3}, };  // invalid
    }


    // 8.2.3 Write an expression to obtain the row size of a two-dimensional array x and an
    //       expression to obtain the size of the first row.
    private static void array3() {
        int[][] x = new int[3][4];

        System.out.println("size " + x.length);
        System.out.println("size " + x[1].length);
    }


    // 8.2.4  Can the rows in a two-dimensional array have different lengths?
    // a. yes.


    // 8.2.5  What is the output of the following code?
    // a. 2, 2
    private static void array5() {
        int[][] array = new int[5][6];
        int[] x = {1, 2};
        array[0] = x;
        System.out.println("array[0][1] is " + array[0][1]);
        System.out.println("array[0] size is " + array[0].length);
    }

    public static void main(String[] args) {
        array5();;
    }
}
