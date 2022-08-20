/*
 * Exercise 10.13
 * MyTectangle@D class.
 */
package chapter10.exercise.exercise10_13;

/**
 * Geometry: the MyRectangle2D class
 * @author emaph
 */
public class MyRectangle2D {
        private double x;
        private double y;
        private double width;
        private double height;

    /** A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and
     *  1 for both width and height */
    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    /** creates a rectangle with the specified x, y, width, and height. */
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    /**  Returns the area of the rectangle */
    public double getArea() {
        return width * height;
    }

    /** Returns the perimeter of the rectangle */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    /** Returns true if the specified point (x, y) is inside this rectangle */
    public boolean contains(double x, double y) {
        return ((this.x - width) / 2 < x && x < (this.x + width) / 2) &&
                ((this.y - height) < y && y < (this.y + height) / 2);
    }

    /** Returns true if the specified rectangle is inside this rectangle */
    public boolean contains(MyRectangle2D r) {
        return ((Math.abs(x - r.x)) < width / 2) && (Math.abs(y - r.y) < height / 2);
    }

    /**  Returns true if the specified rectangle overlaps with this rectangle */
    public boolean overlaps(MyRectangle2D r) {
        return ((Math.abs(x - r.x)) < (width / 2 + r.width / 2)) &&
                (Math.abs(y - r.y) < (height / 2 + r.height / 2));
    }
}
