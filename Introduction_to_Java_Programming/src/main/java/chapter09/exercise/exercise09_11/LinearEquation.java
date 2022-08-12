/*
 * Exercise 9.11
 * LinearEquation
 */
package chapter09.exercise.exercise09_11;

/**
 * Linear Equation class
 * @author emaph
 */
public class LinearEquation {

    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;

    public LinearEquation(double a1, double b1, double c1, double d1, double e1, double f1) {
        a = a1;
        b = b1;
        c = c1;
        d = d1;
        e = e1;
        f = f1;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return Math.abs(getDivisor()) > 0.000000001;
    }

    public double getX() {
        double div = getDivisor();
        return (e * d - b * f) / div;
    }

    public  double getY() {
        double div = getDivisor();
        return (a * f - e * c) / div;
    }

    private double getDivisor() {
        return a * d - b * c;
    }
}
