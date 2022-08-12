/*
 * Exercise 9.9
 *  (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have
 *  the same length and all angles have the same degree (i.e., the polygon is both equi-
 *  lateral and equiangular). Design a class named RegularPolygon that contains:
 *
 *  ■ A private int data field named n that defines the number of sides in the polygon
 *    with default value 3.
 *  ■ A private double data field named side that stores the length of the side with
 *    default value 1.
 *  ■ A private double data field named x that defines the x-coordinate of the poly-
 *    gon’s center with default value 0.
 *  ■ A private double data field named y that defines the y-coordinate of the poly-
 *    gon’s center with default value 0.
 *  ■ A no-arg constructor that creates a regular polygon with default values.
 *  ■ A constructor that creates a regular polygon with the specified number of sides
 *    and length of side, centered at (0, 0).
 *  ■ A constructor that creates a regular polygon with the specified number of sides,
 *    length of side, and x- and y-coordinates.
 *  ■ The accessor and mutator methods for all data fields.
 *  ■ The method getPerimeter() that returns the perimeter of the polygon.
 *  ■ The method getArea() that returns the area of the polygon. The formula for
 *    computing the area of a regular polygon is
 *
 *      Area = (n * s * s) / (4 * tan(PI/n)
 *
 *  Draw the UML diagram for the class then implement the class. Write a test pro-
 *  gram that creates three RegularPolygon objects, created using the no-arg con-
 *  structor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4,
 *  5.6, 7.8). For each object, display its perimeter and area.
 * See: Ex 6.36, Ex 4.5
 */
package chapter09.exercise.exercise09_09;

/**
 * Exercise RegularPolygon
 * @author emaph
 */
public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6, 4);
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);

        printPolygon(poly1);
        printPolygon(poly2);
        printPolygon(poly3);
    }

    private static void printPolygon(RegularPolygon polygon) {
        System.out.printf("Perimeter: %.2f, Area: %.3f\n",
                polygon.getPerimeter(), polygon.getArea());
    }
}

/*
Perimeter: 3.00, Area: 0.433
Perimeter: 24.00, Area: 41.569
Perimeter: 40.00, Area: 123.107
*/
