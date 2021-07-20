/*
 *  Check Point 3.12
 *  Case study lottery.
 */
package chapter03.check_point;

import java.util.Scanner;

/**
 * @author emaph
 */
public class CheckPoint03_12 {
    // 3.12.1  What happens if you enter an integer as 05?
    // run:
    // Enter a two digit number: 05
    // 0 5
    // seems to work.
    static void testEntry() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a two digit number: ");
        int guess  = input.nextInt();

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println(guessDigit1 + " " + guessDigit2);
    }

    public static void main(String[] args) {
        testEntry();
    }
}
