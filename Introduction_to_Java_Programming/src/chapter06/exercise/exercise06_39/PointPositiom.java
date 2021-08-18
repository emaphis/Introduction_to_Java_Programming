/*
 * Exercise 6.39
 *  (Geometry: point position) Programming Exercise 3.32 shows how to test
 *  whether a point is on the left side of a directed line, on the right, or on the same
 *  line. Write the methods with the following headers:
 */
package chapter06.exercise.exercise06_39;

/**
 *
 * @author emaph
 */
public class PointPositiom {
    final static double EPSILON = 0.00001;

    /** Return true if point (x2, y2) is on the left side of the
     * directed line from (x0, y0) to (x1, y1) */
    public static boolean leftOfTheLine(double x0, double y0,
                            double x1, double y1, double x2, double y2) {
        double p = findP(x0, y0, x1, y1, x2, y2);
        return p > 0.0;
    }

    /** Return true if point (x2, y2) is on the left side of the
     * directed line from (x0, y0) to (x1, y1) */
    public static boolean rightOfTheLine(double x0, double y0,
                            double x1, double y1, double x2, double y2) {
        double p = findP(x0, y0, x1, y1, x2, y2);
        return p < 0.0;
    }

    /** Return true if point (x2, y2) is on the same
     * line from (x0, y0) to (x1, y1) */
    public static boolean onTheSameLine(double x0, double y0,
                              double x1, double y1, double x2, double y2) {
       double p = findP(x0, y0, x1, y1, x2, y2);
       return Math.abs(0) < EPSILON;
    }

    /** Return true if point (x2, y2) is on the
     * line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double x0, double y0,
                                double x1, double y1, double x2, double y2) {
        double p = findP(x0, y0, x1, y1, x2, y2);

        return (Math.abs(0) < EPSILON) &&
                (x2 > x0) && (y2 > y0) && (x2 < x1) && (y2 < y1);
    }

    /** find the position of point */
    public static double findP(double x0, double y0,
                                double x1, double y1, double x2, double y2) {
        return  (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
    }
}
