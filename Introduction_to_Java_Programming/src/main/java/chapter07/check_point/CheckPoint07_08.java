/*
 * Check Point 7.8
 * 7.8 Case Study: Counting the Occurrences of Each Letter
 */
package chapter07.check_point;

/**
 * @author emaph
 */
public class CheckPoint07_08 {

    // 7.8.1 Show the output of the following two programs:

    // a
    // number is and numbers[0] is 3

    static void main1() {
        int number = 0;
        int[] numbers = new int[1];

        m(number, numbers);

        System.out.println("number is " + number
                + " and numbers[0] is " + numbers[0]);
    }

    public static void m(int x, int[] y) {
        x = 3;
        y[0] = 3;
    }

    // b
    //  2 3 4 5

    static void main2() {
        int[] list = {1, 2, 3, 4, 5};
        reverse(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public static void reverse(int[] list) {
        int[] newList = new int[list.length];

        for (int i = 0; i < list.length; i++)
            newList[i] = list[list.length - 1 - i];

        list = newList;
    }


    // 7.8.2 Where are the arrays stored during execution? Show the contents of the stack and
    //       heap during and after executing displayArray, countLetters, and display­
    //       Counts in Listing 7.4.

    public static void main(String[] args) {
        main2();
    }
}
