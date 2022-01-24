/*
 * Exercise 3.28
 *  (Geometry: two rectangles) Write a program that prompts the user to enter the
 *  center x-, y-coordinates, width, and height of two rectangles and determines
 *  whether the second rectangle is inside the first or overlaps with the first, as
 *  shown in Figure 3.9. Test your program to cover all cases.
 */
package chapter03.exercise.exercise03_28;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class TwoRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double ht1 = input.nextDouble();
        double wd1 = input.nextDouble();

        System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double ht2 = input.nextDouble();
        double wd2 = input.nextDouble();


        // calculate geometry of component positions
        double rt1 = x1 + wd1 / 2;
        double lf1 = x1 - wd1 / 2;
        double tp1 = y1 + ht1 / 2;
        double bt1 = y1 - ht1 / 2;

        double rt2 = x2 + wd2 / 2;
        double lf2 = x2 - wd2 / 2;
        double tp2 = y2 + ht2 / 2;
        double bt2 = y2 - ht2 / 2;


        // Check relations between components
        if (rt2 <= rt1 && lf2 >= lf1 && tp2 <= tp1 && bt2 >= bt1) {
            System.out.println("r2 is inside r1.");
        } else if (rt2 <= lf1 || lf2 >= rt1 || bt2 >= tp1 || tp2 <= bt1) {
            System.out.println("r2 does not overlap r1");
        } else {
            System.out.println("r2 overlaps r1");
        }
    }
}