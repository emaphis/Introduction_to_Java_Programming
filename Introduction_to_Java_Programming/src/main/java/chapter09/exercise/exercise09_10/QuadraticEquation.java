/*
 * Exercise 9.10
 * Quadratic equation
 */
package chapter09.exercise.exercise09_10;

/**
 * Quadratic equation
 * @author emaph
 */
public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    /*** Create a Quadratic Equation */
    public QuadraticEquation(double newA, double newB, double newC) {
        a = newA;
        b = newB;
        c = newC;
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

    /** calculate and return discriminant */
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    /** get first root */
   public double getRoot1() {
        double disc = getDiscriminant();
        if (disc >= 0)
            return (-b + Math.sqrt(disc)) / (2 * a);
        else
            return 0;
   }

   /** get second root */
   public double getRoot2() {
        double disc = getDiscriminant();
        if (disc >= 0)
            return (-b - Math.sqrt(disc)) / (2 * a);
        else
            return 0;
    }
}
