/*
 * 11.3 Using the super keyword
 * 11.4 Overriding Methods
 */
package chapter11.example.examples;

import chapter11.example.listing11_01.*;

/**
 * Exercise the Circle and Rectangle classes
 * @author emaph
 */
public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}

/*
A circle created on Sun Aug 28 22:29:49 EDT 2022
color: white and filled: false
radius is 1.0
The area is 3.141592653589793
The diameter is 6.283185307179586

A rectangle created on Sun Aug 28 22:29:49 EDT 2022
color: white and filled: false
width is 2.0
height is 4.0
The area is 8.0
The perimeter is 12.0
*/