/*
 * Exercise 12.5
 * Circle class
 */
package chapter12.exercise.exercise12_05;

/**
 * A Circle class with exception handling
 * @author emaph
 */
public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTriangleException {
        this(1.0, 1.0, 1.0);
    }

    /** Construct a triangle with the specified sides */
    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException {
        if (checkBadSides(side1, side1, side3))
            throw new IllegalTriangleException(side1, side2, side3, "Illegal triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    /** Return the area of the triangle */
    public double getArea() {
        double s = (side1 + side2 + side3) /2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** Return perimeter of triangle */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
               " side3 = " + side3;
    }

    /** Check for legal sides */
    private boolean checkBadSides(double side1, double side2, double side3) {
        boolean ret =  (side1 + side2 < side3) ||
                       (side1 + side3 < side2) ||
                       (side2 + side3 < side1);
        return ret;
    }
}
