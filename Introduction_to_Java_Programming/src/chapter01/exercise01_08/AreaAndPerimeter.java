/*
 * Exercise 1.8
 * (Area and perimeter of a circle)
 *    Write a program that displays the area and pe-
 *    rimeter of a circle that has a radius of 5.5 using the following formulas:
 *
 *  perimeter = 2 * radius * p
 *
 *  area = radius * radius * p
 */
package chapter01.exercise01_08;

/**
 * Calculate area abd circumference of a circle
 *
 * @author emaph
 */
public class AreaAndPerimeter {

    public static void main(String[] args) {
        System.out.print("Perimeter = ");
        System.out.println(2 * 5.5 * 3.14159);
        System.out.print("Area = ");
        System.out.println(5.5 * 5.5 * 3.14159);
    }

}
