/*
 * Exercise 10.13
 *  (Geometry: the MyRectangle2D class) Define the MyRectangle2D class that
 *   ontains:
 *
 * ■ Two double data fields named x and y that specify the center of the rectangle
 *    with getter and setter methods. (Assume the rectangle sides are parallel to
 *    x- or y-axis.)
 * ■ The data fields width and height with getter and setter methods.
 * ■ A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and
 *    1 for both width and height.
 * ■ A constructor that creates a rectangle with the specified x, y, width, and
 *    height.
 * ■ A method getArea() that returns the area of the rectangle.
 * ■ A method getPerimeter() that returns the perimeter of the rectangle.
 * ■ A method contains(double x, double y) that returns true if the
 *    specified point (x, y) is inside this rectangle (see Figure 10.24a).
 * ■ A method contains(MyRectangle2D r) that returns true if the specified
 *    rectangle is inside this rectangle (see Figure 10.24b).
 * ■ A method overlaps(MyRectangle2D r) that returns true if the specified
 *    rectangle overlaps with this rectangle (see Figure 10.24c).
 */

package chapter10.exercise.exercise10_13;

/**
 * Exercise the Rectangle2D class
 * @author emaph
 */
public class Exercise10_13 {
    public static void main(String[] args) {
        // Create a MyRectangle2D
        MyRectangle2D rect1 = new MyRectangle2D(2, 2, 5.5, 4.9);

        // Display tests
        System.out.println("rect1 area = " + rect1.getArea());
        System.out.println("rect1 perimeter = " + rect1.getPerimeter());
        System.out.println("rect1 contains (3,3) = " + rect1.contains(3, 3));
        MyRectangle2D rect2 = new MyRectangle2D(4, 5, 10.5, 3.2);
        System.out.println("rect1 contains rect2 = " + rect1.contains(rect2));
        MyRectangle2D rect3 = new MyRectangle2D(3, 5, 2.3, 5.4);
        System.out.println("rect1 overlaps rect3 = " + rect1.overlaps(rect3));
    }
}
