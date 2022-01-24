/*
 * Check Point 5.5
 * Sentinel Value
 */
package chapter05.check_point;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CheckPoint05_05 {

    // 5.5.1 Suppose the input is 2 3 4 5 0. What is the output of the following code?
    // a. max is 5
    //    number 0
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt();
        max = number;
        while (number != 0) {
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println("max is " + max);
        System.out.println("number " + number);
    }
}
