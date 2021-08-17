/*
 * Exercise 6.19
 *  (Triangles) Implement the following two methods:
 *
 *      // Return true if the sum of every two sides is greater than the third side
 *      public static boolean isValid(double side1, double side2, double side3)
 *
 *      // Return the area of the triangle.
 *      public static double area(double side1, double side2, double side3)
 *
 *  Write a test program that reads three sides for a triangle and uses the isValid
 *  method to test if the input is valid and uses the area method to obtain the area.
 *  The program displays the area if the input is valid. Otherwise, it displays that
 *  the input is invalid. The formula for computing the area of a triangle is given in
 *  Programming Exercise 2.19.
 */
package chapter06.exercise.exercise06_19;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of a triangel: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3)) {
            double area1 = area(side1, side2, side3);
            System.out.println("Area of triangle is " + area1);
        } else
            System.out.println("Triangle is invalid");

    }

    /** Return true if the sum of every two sides is greater than the third side */
    public static boolean isValid(double side1, double side2, double side3) {
        return side1 < (side2 + side3) && side2 < (side1 + side3) && side3 < (side1 + side2);
    }

    /** Return the area of the triangle. */
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
    }
}
