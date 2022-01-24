/*
 * Check Point 7.5
 * 7.5 Copying Arrays
 */
package chapter07.check_point;

/**
 * Copying arrays
 * @author emaph
 */
public class CheckPoint07_05 {

    // 7.5.1 Use the arraycopy method to copy the following array to a target array t:
    static void arrays1() {
        int[] source = {3, 4, 5};
        int[] target = new int[source.length];

        System.arraycopy(source, 0, target, 0, source.length);

        // output for test.
        for (int i : target) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // 7.5.2 Once an array is created, its size cannot be changed. Does the following code resize
    //       the array?
    // a. No, a new array is assigned to the referecne.
    static void arrays2() {
        int[] myList;
        myList = new int[10];
        // Sometime later you want to assign a new array to myList
        myList = new int[20];
    }


    public static void main(String[] args) {
        arrays1();
    }
}
