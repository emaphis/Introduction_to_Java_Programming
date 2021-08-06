/*
 * Check Point 5.6
 *  The do-while Loop
 */
package chapter05.check_point;

import java.util.Scanner;

/**
 * @author emaph
 */
public class CheckPoint05_06 {

    // 5.6.1 Suppose the input is 2 3 4 5 0. What is the output of the following code?
    //  max is 5
    //  number 0
    static void test1() {
        Scanner input = new Scanner(System.in);

        int number, max;
        number = input.nextInt();
        max = number;

        do {
            number = input.nextInt();
            if (number > max)
                max = number;
        } while (number != 0);

        System.out.println("max is " + max);
        System.out.println("number " + number);
    }

    // 5.6.2 What are the differences between a while loop and a do-while loop? Convert the
    //       following while loop into a do-while loop:
    // a. do-while executes it's body at least once.
    static void test2() {
        Scanner input = new Scanner(System.in);
        /* original
        int sum = 0;
        System.out.println("Enter an integer " +
            "(the input ends if it is 0)");
        int number = input.nextInt();
        while (number != 0) {
            sum += number;
            System.out.println("Enter an integer " +
                "(the input ends if it is 0)");
            number = input.nextInt();
        }
        */

        int sum = 0;
        int number;
        do {
            System.out.println("Enter an integer " +
                "(the input ends if it is 0)");
            number = input.nextInt();
            sum += number;
        } while (number != 0);
    }


    public static void main(String[] args) {
        test2();
    }
}
