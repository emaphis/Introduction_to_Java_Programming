/*
 * Listing 9.1
 *  9.3 Example: Defining Classes and Creating Objects
 */
package chapter09.example.listing09_01;

/**
 *
 * @author emaph
 */
public class TestCircle {
    /** Main method */
    public static void main(String[] args) {
        // Create a circle with radius of 1
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius "
            + circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius of 25
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius "
            + circle2.radius + " is " + circle2.getArea());

        // Create a circle of radius 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius "
            + circle3.radius + " is " + circle3.getArea());

        // Modify circle radius
        circle2.setRadius(100);
        System.out.println("The area of the circle of radius "
            + circle2.radius + " is " + circle2.getArea());
    }

}


/*
he area of the circle of radius 1.0 is 3.141592653589793
The area of the circle of radius 25.0 is 1963.4954084936207
The area of the circle of radius 125.0 is 49087.385212340516
The area of the circle of radius 100.0 is 31415.926535897932
*/