/*
 * Exercise 10.4
 * A Point class
 */
package chapter10.exercise.exercise10_04;

/**
 * A Point class
 *
 * @author emaph
 */
public class MyPoint {

    private double x;
    private double y;

    /** no-arg constructor that creates point (0,0) */
    public MyPoint() {
        this(0, 0);
    }

    /** constructor that constructs a point with specified coordinates */
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /* returns x */
    public double getX() {
        return x;
    }

    /** returns y */
    public double getY() {
        return y;
    }

    /** returns the distance from this point to a specified point of MyPoint */
    public double distance(MyPoint point) {
        return distance(point.x, point.y);
    }

    /** returns the distance form this point to another point with
     * specified x- and x- coordinates */
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    /** returns the distance from two MyPoint objects */
    public static double distance(MyPoint point1, MyPoint point2) {
        return point1.distance(point2);
    }
}
