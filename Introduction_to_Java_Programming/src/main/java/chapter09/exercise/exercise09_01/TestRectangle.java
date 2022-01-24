/*
 * Exercise 9.1
 *  (The Rectangle class) Following the example of the Circle class in Section 9.2,
 *  design a class named Rectangle to represent a rectangle. The class contains:
 *
 *  ■ Two double data fields named width and height that specify the width and
 *      height of the rectangle. The default values are 1 for both width and height.
 *  ■ A no-arg constructor that creates a default rectangle.
 *  ■ A constructor that creates a rectangle with the specified width and height.
 *  ■ A method named getArea() that returns the area of this rectangle.
 *  ■ A method named getPerimeter() that returns the perimeter.
 *
 *  Draw the UML diagram for the class then implement the class. Write a test pro-
 *  gram that creates two Rectangle objects—one with width 4 and height 40, and
 *  the other with width 3.5 and height 35.9. Display the width, height, area, and
 *  perimeter of each rectangle in this order
 */
package chapter09.exercise.exercise09_01;

/**
 * Exercises the Rectangle class
 * @author emaph
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1");
        displayRectangle(rect1);
        System.out.println("Rectangle 2");
        displayRectangle(rect2);
    }

    private static void displayRectangle(Rectangle rect) {
        System.out.printf("width: %.2f\nheight: %.2f\narea: %.2f\nperimeter: %.2f\n\n",
                rect.width, rect.height, rect.getArea(), rect.getPerimeter());
    }
}
