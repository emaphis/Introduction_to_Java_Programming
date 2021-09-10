/*
 * Exercise 9.1
 *  (The Rectangle class) Following the example of the Circle class in Section 9.2,
 *  design a class named Rectangle to represent a rectangle. The class contains:
 *
 *  ■ Two double data fields named width and height that specify the width and
 *    height of the rectangle. The default values are 1 for both width and height.
 *
 *  ■ A no-arg constructor that creates a default rectangle.
 *
 *  ■ A constructor that creates a rectangle with the specified width and height.
 *
 *  ■ A method named getArea() that returns the area of this rectangle.
 *
 *  ■ A method named getPerimeter() that returns the perimeter.
 *
 *  Draw the UML diagram for the class then implement the class. Write a test pro-
 *  gram that creates two Rectangle objects—one with width 4 and height 40, and
 *  the other with width 3.5 and height 35.9. Display the width, height, area, and
 *  perimeter of each rectangle in this order
 */
package chapter09.exercise.exercise09_01;

/**
 * Rectangle class
 * @author emaph
 */
public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    /** return the area of the rectangle */
    public double getArea() {
        return width * height;
    }

    /** return the perimeter of the rectangle */
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

}
