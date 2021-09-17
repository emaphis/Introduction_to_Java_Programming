/*
 * Exercise 10.11
 * Circle2D class
 */
package chapter10.exercise.exercise10_11;

/**
 * Circle2D class
 * @author emaph
 */
public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /** return the radius of the circle */
    public double getRadius() {
        return radius;
    }

    /** return the x coordinate of the circle */
    public double getX() {
        return x;
    }

    /** return the y coordinate of the circle */
    public double getY() {
        return y;
    }

    /**  returns the area of the circle. */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** returns the perimeter of the circle. */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /** returns true if the  specified point (x, y) is inside this circle */
    public boolean contains(double x, double y) {
        return distance(this.x, x, this.y, y) <= radius;
    }

    /** returns true if the specified circle is inside this circle */
    public boolean contains(Circle2D circle) {
        double distancBetweenCenters = distance(this.x, circle.getX(), this.y, circle.getY());
        return (distancBetweenCenters + circle.getRadius()) <= this.radius;
    }

    /** returns true if the specified circle overlaps with this circle */
    public boolean overlaps(Circle2D circle) {
        double distancBetweenCenters = distance(this.x, circle.getX(), this.y, circle.getY());
        // is the distance between the two centers less than the sum of the radiuses?
        return  distancBetweenCenters <= (this.radius + circle.getRadius());
    }

    /** distance between two points utility method */
    private double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
