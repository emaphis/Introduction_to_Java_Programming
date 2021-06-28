/*
 *  Check Point 2.3.
 */
package chapter02.check_point;

import java.util.Scanner;

/**
 * Check Point
 * @author emaph
 */
public class CheckPoint02_03 {

    // 2.3.1 How do you write a statement to let the user enter a double value from the key-
    //         board? What happens if you entered 5a when executing the following code?
    static void scan1() {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println("radius: "  + radius);
    }

    public static void main(String[] args) {
        scan1();
    }
}
