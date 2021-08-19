/*
 * check Point 7.7
 * Returning an Array from a Method
 */
package chapter07.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint07_07 {

    // 7.7.1 Suppose the following code is written to reverse the contents in an array, explain
    //        why it is wrong. How do you fix it
    // the whole list is iterated, so each element is swapped twice.
    // -- Swap only half the list.

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 5, 4};

        for (int i = 0, j = list.length - 1; i < list.length  / 2; i++, j--) {
            // Swap list[i] with list[j]
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }

        // output list
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
