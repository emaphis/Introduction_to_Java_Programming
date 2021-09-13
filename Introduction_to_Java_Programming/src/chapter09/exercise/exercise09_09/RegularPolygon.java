/*
 * Exercise 9.9
 */
package chapter09.exercise.exercise09_09;

/**
 * polygon
 * @author emaph
 */
public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    public int getN() {
        return n;
    }

    public void setN(int newN) {
        n = newN;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double newSide) {
        side = newSide;
    }

    public double getX() {
        return x;
    }

    public void setX(double newX) {
        x = newX;
    }

    public double getY() {
        return y;
    }

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
