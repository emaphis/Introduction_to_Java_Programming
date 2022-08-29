/*
 * Check Point 11.5.1
 */
package chapter11.check_point;


public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class B extends Circle {
    private double length;

    public B(double radius, double length) {
        //Circle(radius);  // Wrong
        super(radius);     // should be
        this.length = length;  // Use the this keyword.
    }

    @Override
    public double getArea() {
        //return getArea() + length;        // Wrong
        return super.getArea() + length;   // Should use super keyword
    }

}
