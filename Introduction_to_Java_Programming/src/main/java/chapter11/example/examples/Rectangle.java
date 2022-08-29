/*
 * 11.3 Using the super keyword
 * 11.4 Overriding Methods
 */
package chapter11.example.examples;

/**
 * The Rectangle class,
 * @author emaph
 */
public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);  // 11.3 using super
        this.width = width;
        this.height = height;
    }

    /** Return width */
    public double getWidth() {
        return width;
    }

    /** Set new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Return height */
    public double getHeight() {
        return height;
    }

    /**Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    /** Return area */
    public double getArea() {
        return width * height;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Override the toString method defined in the superclass
    // 11.4 Overriding Methods
    @Override
    public String toString() {
        return super.toString() + "\nwidth is " + width +
                "\nheight is " + height;
    }

}
