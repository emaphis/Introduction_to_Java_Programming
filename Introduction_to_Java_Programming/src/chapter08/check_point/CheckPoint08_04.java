/*
 * Check Point 8.4
 * Passing Two-Dimensional Arrays to Methods
 */
package chapter08.check_point;

/**
 * Passing Two-Dimensional Arrays to Methods
 * @author emaph
 */
public class CheckPoint08_04 {

    // 8.4.1 Show the output of the following code:
    // a.  12 4

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(m1(array)[0]);
        System.out.println(m1(array)[1]);
    }

    public static int[] m1(int[][] m) {
        int[] result = new int[2];
        result[0] = m.length;
        result[1] = m[0].length;
        return result;
    }
}
