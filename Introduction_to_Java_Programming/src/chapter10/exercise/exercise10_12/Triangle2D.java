/*
 * Exercise 10.12
 * Triangle2D
 */
package chapter10.exercise.exercise10_12;

import chapter10.exercise.exercise10_04.MyPoint;

/**
 * Triangle2D
 *
 * @author emaph
 */
public class Triangle2D {

    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    /**
     * creates a default triangle with the points (0, 0), (1, 1), and (2, 5).
     */
    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(double x1, double y1, double x2, double y2,  double x3, double y3) {
        this.p1 = new MyPoint(x1, y1);
        this.p2 = new MyPoint(x2, y2);
        this.p3 = new MyPoint(x3, y3);
    }

    /**
     * creates a triangle with the specified points.
     * @param p1
     * @param p2
     * @param p3
     */
    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    /**
     * Returns the area of the triangle.See Exercise 2.19
     * @return area of this triangle
     */
    public double getArea() {
        double side1 = p2.distance(p1);
        double side2 = p3.distance(p2);
        double side3 = p1.distance(p3);

        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * returns the perimeter of the triangle.
     * @return the perimeter of this triangle
     */
    public double getPerimeter() {
        double side1 = p2.distance(p1);
        double side2 = p3.distance(p2);
        double side3 = p1.distance(p3);

        return side1 + side2 + side3;
    }

    /**
     * returns true if the specified point p is inside this triangle ΔABp + ΔACp
     * + ΔBCp == ΔABC
     * @param the point to test
     * @return true if point is inside this triangle
     */
    public boolean contains(MyPoint p) {
        double area1 = new Triangle2D(p, p1, p2).getArea();
        double area2 = new Triangle2D(p, p2, p3).getArea();
        double area3 = new Triangle2D(p, p3, p1).getArea();
        //System.out.println((area1 + area2 + area3) + " : " + getArea());
        return Math.abs(area1 + area2 + area3 - getArea()) < 0.0000001;
    }

    /**
     * returns true if the specified triangle is inside this triangle
     * @param t triangle to test
     * @return true if given triangle is contained by this triangle
     */
    public boolean contains(Triangle2D t) {
        return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
    }

    /**
     * returns true if the specified triangle overlaps with this triangle
     * @param t the given triangle
     * @return true if the given triangle overlaps this triangle
     */
    public boolean overlaps(Triangle2D t) {
        return contains(t.getP1()) || contains(t.getP2()) || contains(t.getP3());
    }
}
