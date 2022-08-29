/*
 * 11.3 Using the super keyword
 * 11.4 Overriding Methods
 * 11.10 The Objects equals Method
 */
package chapter11.example.examples;

/**
 *The Circle class
 * @author emaph
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);  // 11.3 using super
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return radius */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Returns perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Returns diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Print the circle info */
    public void printCircle() {    // 11.3.3 calling superclass methods
        System.out.println("The circle is created " +
                super.getDateCreated() + " and the radius is " + radius);
    }

    // Override the toString method defined in the superclass
    // 11.4 Overriding Methods
    @Override
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }

    // 11.10 the equals method
    @Override
    public boolean equals(Object other) {
        if (other instanceof Circle)
            return this.radius == ((Circle)other).radius;
        else
            return false;
    }
}
