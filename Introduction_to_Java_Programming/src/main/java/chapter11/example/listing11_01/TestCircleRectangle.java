/*
 * Listing 11.4
 * 11.2 Superclasses and Subclasses
 */
package chapter11.example.listing11_01;

/**
 * Exercise the Circle and Rectangle classes
 * @author emaph
 */
public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}

/*
A circle created on Sun Aug 28 20:59:29 EDT 2022
color: white and filled: false
The color is white
The radius is 1.0
The area is 3.141592653589793
The diameter is 6.283185307179586

A rectangle created on Sun Aug 28 20:59:29 EDT 2022
color: white and filled: false
The area is 8.0
The perimeter is 12.0
*/