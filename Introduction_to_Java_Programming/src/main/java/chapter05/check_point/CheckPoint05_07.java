/*
 * Check Point 5.7
 *  for-loop.
 */
package chapter05.check_point;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CheckPoint05_07 {

    // 5.7.1  Do the following two loops result in the same value in sum?
    // Yes, they cacluate the same thing.
    static void loop1() {
        int sum;

        // (a)
        sum = 0;
        for (int i = 0; i < 10; ++i) {
            sum += i;
        }

        System.out.println("sum: " + sum);

        // (b)
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        System.out.println("sum: " + sum);
    }

    // 5.7.2 What are the three parts of a for loop control? Write a for loop that prints the
    //       numbers from 1 to 100.
    // a. initial action, loop-continuation-condition, action-after-itineration.
    static void loop2() {
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    // 5.7.3 Suppose the input is 2 3 4 5 0. What is the output of the following code?
    // sum is 14
    // count is 5
    static void test3() {
        Scanner input = new Scanner(System.in);

        int number, sum = 0, count;
        for (count = 0; count < 5; count++) {
            number = input.nextInt();
            sum += number;
        }

        System.out.println("sum is " + sum);
        System.out.println("count is " + count);
    }

    // .7.4 What does the following statement do?
    // loops and does nothing until program is killed
    static void loop4() {
        for ( ; ; ) {
            // Do something
        }
    }

    // 5.7.5 If a variable is declared in a for loop control, can it be used
    //       after the loop exits?
    // a. no, can't be accessed. It's out of scope
    static void loop5() {
        for (int i = 0,  j = -3; i < 10; i++) {
            j += i;
            System.out.println("i: " + i);
        }

        // System.out.println("j: " + j);  // does not compiles
    }

    // 5.7.6 Convert the following for loop statement to a while loop and to a do-while loop:
    static void loop6() {
        long sum = 0;
        for (int i = 0; i < 1000; i++)
            sum = sum + i;

        System.out.println("sum: " + sum);

        // converted to a while loop.
        sum = 0;
        int j = 0;
        while (j < 1000) {
            sum = sum + j;
            j++;
        }

        System.out.println("sum: " + sum);

        // converted to do-while loop..
        sum = 0;
        int k = 0;
        do {
            sum += k++;
        } while ( k <= 1000 - 1);

        System.out.println("sum: " + sum);
        // sum: 499500
    }

    // 5.7.7 Count the number of iterations in the following loops.
    // (a) n times
    // (b) (n + 1) times
    // (c) (n-5) times
    // (d) (n-5)/3 times

    public static void main(String args[]) {
        //test3();
        loop6();
    }
}
