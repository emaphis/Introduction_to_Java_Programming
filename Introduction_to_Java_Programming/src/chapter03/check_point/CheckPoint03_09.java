/*
 *  Check Point 3.9.
 */
package chapter03.check_point;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CheckPoint03_09 {

    // 3.9.1  Are the following two statements equivalent?
    // yes.
    static double income = 0;
    static double tax = 0;

    static void a() {
        if (income <= 10000) {
            tax = income * 0.1;
        } else if (income <= 20000) {
            tax = 1000
                    + (income - 10000) * 0.15;
        }

        System.out.println("tax a: " + tax + "\n");
    }

    static void b() {
        if (income <= 10000) {
            tax = income * 0.1;
        } else if (income > 10000
                && income <= 20000) {
            tax = 1000
                    + (income - 10000) * 0.15;
        }

        System.out.println("tax b; " + tax + "\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input income: ");
        income = input.nextDouble();
        a();
        b();
    }

}
