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

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint point) {
        return distance(point.x, point.y);
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public static double distance(MyPoint point1, MyPoint point2) {
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) +
                         Math.pow(point1.y - point2.y, 2));
    }
}
