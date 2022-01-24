/*
 * Exercise 1.9
 * (Area and perimeter of a rectangle) Write a program that displays the area and
 *    perimeter of a rectangle with a width of 4.5 and a height of 7.9 using the fol-
 *    lowing formula:
 *
 *   area = width * height
 */
package chapter01.exercise01_09;

/**
 * Calculate
 * @author emaph
 */
public class AreaAndPerimeterRect {

    public static void main(String[] args) {
        System.out.print("Area = ");
        System.out.println(4.5 * 7.9);
        System.out.print("Perimeter = ");
        System.out.println((4.5 + 7.9) * 2);
    }

}
