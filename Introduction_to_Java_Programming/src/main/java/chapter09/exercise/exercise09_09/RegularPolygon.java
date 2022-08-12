/*
 * Exercise 9.9
 */
package chapter09.exercise.exercise09_09;

/**
 * Regular Polygon
 * @author emaph
 */
public class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;

    /** create default RegularPolygon */
    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    /** create RegularPolygon with default location  */
    public RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
        x = 0;
        y = 0;
    }

    /** create custom RegularPolygon  */
    public RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    /** get number of sides */
    public int getN() {
        return n;
    }

    /** set number of side  */
    public void setN(int newN) {
        n = newN;
    }

    /** get length of side  */
    public double getSide() {
        return side;
    }

    /** set length of side */
    public void setSide(double newSide) {
        side = newSide;
    }

    /** get x coordinate  */
    public double getX() {
        return x;
    }

    /** set x coordinate  */
    public void setX(double newX) {
        x = newX;
    }

    /** get y coordinate */
    public double getY() {
        return y;
    }

    /** set y coordinate */
    public void setY(double newY) {
        y = newY;
    }

    /** Compute perimeter of regular polygon */
    public double getPerimeter() {
        return n * side;
    }

     /** Compute the area of a regular polygon  */
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
