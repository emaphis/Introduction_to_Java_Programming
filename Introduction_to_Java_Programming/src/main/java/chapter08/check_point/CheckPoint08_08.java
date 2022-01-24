/*
 *  Check Point 8.8
 * 8.8 Multidimensional Arrays
 */
package chapter08.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint08_08 {

    // 8.8.1 Declare an array variable for a three-dimensional array, create a 4 * 6 * 5 int
    //       array, and assign its reference to the variable.
    private static int[][][] arrays1() {
        int[][][] x = new int[4][6][5];
        return x;
    }


    // 8.8.2 Assume char[][][] x = new char[12][5][2], how many elements are in
    //       the array? What are x.length, x[2].length, and x[0][0].length?
    // a. Size = 120
    // b. 12
    // c. 5
    // d. 2
    private static void arrays2() {
        char[][][] x = new char[12][5][2];

        System.out.println("Size = " + (x.length * x[0].length * x[0][0].length));
        System.out.println(x.length);
        System.out.println(x[2].length);
        System.out.println( x[0][0].length);
    }


    // 8.8.3 Show the output of the following code:
    // 1
    // 0
    private static void arrays3() {
        int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6},{7, 8}}};
        System.out.println(array[0][0][0]);
        System.out.println(array[1][1][1]);
    }


    public static void main(String[] args) {
        arrays3();
    }

}
