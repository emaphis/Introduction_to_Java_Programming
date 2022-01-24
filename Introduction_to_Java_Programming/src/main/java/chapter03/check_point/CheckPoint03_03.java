/*
 * Check Point 3.3
 */
package chapter03.check_point;

/**
 * If statements
 * @author emaph
 */
public class CheckPoint03_03 {

    // .3.1   Write an if statement that assigns 1 to x if y is greater than 0.
    static void ifStatement1() {
        int y = 3;
        int x = 0;

        if (y > 0) {
            x = 1;
        }

        System.out.println("x: " + x);
    }

    // 3.3.2    Write an if statement that increases pay by 3% if score is greater than 90.
    static void ifStatement2() {
        int score = 91;
        double pay = 100;

        if (score > 90) {
            pay += pay * 0.03;
        }

        System.out.println("pay: " + pay);
    }

    // 3.3.3   What is wrong in the following code?
    static void ifStatement3() {
        double radius = 30;
        double area = 0;
        final double PI = 3.14;

        if (radius >= 0)    // no ()
        {
            area = radius * radius * PI;
            System.out.println("The area for the circle of "
                    + " radius " + radius + " is " + area);
        }
    }

    public static void main(String[] args) {
        ifStatement2();
    }
}
