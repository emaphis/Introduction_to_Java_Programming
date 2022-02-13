/*
 * Listing 9.9
 * 9.9 Data Field Encapsulation
 */
package chapter09.example.listing09_08;


/**
 * Exercise the Circle class
 * @author emaph
 */
public class TestCircleWithPrivateDataFields {
    /** Main method */
    public static void main(String[] args) {
        // Create a circle with a radius of 5.0
        Circle myCircle = new Circle(5.0);
        System.out.println("The area of the circle of radius "
             + myCircle.getRadius() + " is " + myCircle.getArea());

        // Increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius "
             + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is "
             + Circle.getNumberOfObjects());

    }
}

/*
The area of the circle of radius 5.0 is 78.53981633974483
The area of the circle of radius 5.5 is 95.03317777109125
The number of objects created is 1
*/
