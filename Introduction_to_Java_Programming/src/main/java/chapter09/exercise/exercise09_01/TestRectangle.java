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
        System.out.printf("width: %.2f height: %.2f area: %.2f perimeter: %.2f\n",
                rect.width, rect.height, rect.getArea(), rect.getPerimeter());
    }
}

/*
Rectangle 1
width: 4.00 height: 40.00 area: 160.00 perimeter: 88.00
Rectangle 2
width: 3.50 height: 35.90 area: 125.65 perimeter: 78.80
*/
