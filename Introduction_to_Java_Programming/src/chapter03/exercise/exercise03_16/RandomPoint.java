/*
 * Exercise 3.16
 *  Random point) Write a program that displays a random coordinate in a rectan-
 *  gle. The rectangle is centered at (0, 0) with width 100 and height 200.
 */
package chapter03.exercise.exercise03_16;

/**
 * Display random point in a rectangle.
 * @author emaph
 */
public class RandomPoint {
    public static void main(String[] args) {
        // 0,0 is the center of a 100,200 rectangle

        // calcuate the point
        double x = Math.random() * 100 - 50;
        double y = Math.random() * 200 - 100;

        // display the point
        System.out.println("x = " + x + ", y = " + y);
    }
}
