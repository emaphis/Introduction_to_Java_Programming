/*
 * Listing 9.7
 * 9.7 Static Variables, Constants, and Methods
 */
package chapter09.example.listing09_06;

/**
 * Exercise the Circle class with static members
 * @author emaph
 */
public class TestCircle {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " +
                 Circle.numberOfObjects);

        // Creat c1
        Circle c1 = new Circle();

        // Display c1 BEFORE c2 is created
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius +
            ") and number of Circle objects (" +
            c1.numberOfObjects + ")");

        // Create c2
        Circle c2 = new Circle(5);

        // Modify c1
        c1.radius = 9;

        // Display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius +
             ") and number of Circle objects (" +
            Circle.getNumberOfObjects() + ")");
        System.out.println("c2: radius (" + c2.radius +
             ") and number of Circle objects (" +
             Circle.getNumberOfObjects() + ")");

    }
}

/*
Before creating objects
The number of Circle objects is 0

After creating c1
c1: radius (1.0) and number of Circle objects (1)

After creating c2 and modifying c1
c1: radius (9.0) and number of Circle objects (2)
c2: radius (5.0) and number of Circle objects (2)
*/
