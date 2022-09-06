/*
 * Exercise 11.1
 *  (IllegalTriangleException) Programming Exercise 11.1 defined the
 *  Triangle class with three sides. In a triangle, the sum of any two sides is
 *  greater than the other side. The Triangle class must adhere to this rule.
 *  Create the IllegalTriangleException class, and modify the constructor
 *  of the Triangle class to throw an IllegalTriangleException object if a
 *  triangle is created with sides that violate the rule, as follows:
 *
 *      /** Construct a triangle with the specified sides *
 *      public Triangle(double side1, double side2, double side3)
 *         throws IllegalTriangleException {
 *          // Implement it
 *      }
 */
package chapter12.exercise.exercise12_05;

/**
 * Exercise the Triangle class
 * @author emaph
 */
public class Exercise12_05 {

    public static void main(String[] args) {
        testTriangle(1.5, 2, 3);
        System.out.println();
        testTriangle(1, 2, 3);
    }

    static void testTriangle(double side1, double side2, double side3) {
        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            printTriangle(triangle);
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
            System.out.printf("Side1: %.1f\nSide2: %.1f\nSide3: %.1f",
                    ex.getSide1(), ex.getSide2(), ex.getSide3());
        }
    }

    static void printTriangle(Triangle triangle) {
        System.out.println(triangle.toString());
        System.out.println("Perimeter for t1: " + triangle.getPerimeter());
        System.out.println("Area for t1: " + triangle.getArea());
    }
}

/*
riangle: side1 = 1.5 side2 = 2.0 side3 = 3.0
Perimeter for t1: 6.5
Area for t1: 1.3331705629813464

Illegal triangle
Side1: 1.0
Side2: 2.0
Side3: 3.0
*/