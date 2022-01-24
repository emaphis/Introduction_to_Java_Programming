/*
 *  Check Point 8.3
 *  8.3 Processing Two-Dimensional Arrays
 */
package chapter08.check_point;

/**
 * Check Point
 * @author emaph
 */
public class CheckPoint08_03 {

    // 3.1 Show the output of the following code:
    // a.  6 5
    //     4 3
    //     2 1
    private static void arrays1() {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }


    // 8.3.2 Show the output of the following code:
    // a.  9
    private static void arrays2() {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i][0];
        System.out.println(sum);
    }


    public static void main(String[] args) {
        arrays2();
    }
}
