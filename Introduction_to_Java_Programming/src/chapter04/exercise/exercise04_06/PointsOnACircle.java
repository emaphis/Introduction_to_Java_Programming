/*
 * Exercise 4.6
 *  (Random points on a circle) Write a program that generates three random points
 *  on a circle centered at (0, 0) with radius 40 and displays three angles in a triangle
 *  formed by these three points, as shown in Figure 4.4a. Display the angles in
 *  degrees. (Hint: Generate a random angle a in radians between 0 and 2p, as shown
 *  in Figure 4.4b and the point determined by this angle is rxcos (a), rxsin (a).)
 */
package chapter04.exercise.exercise04_06;

/**
 * @author emaph
 */
public class PointsOnACircle {

    public static void main(String[] args) {

        // Compute random angles in radians.
        double angle1 = Math.random() * 2 * Math.PI;
        double angle2 = Math.random() * 2 * Math.PI;
        double angle3 = Math.random() * 2 * Math.PI;

        final double RADIUS = 40.0;

        // Compute s=x,y coordinate of angles at radius of 40
        double x1 = RADIUS * Math.cos(angle1);
        double y1 = RADIUS * Math.sin(angle1);

        double x2 = RADIUS * Math.cos(angle2);
        double y2 = RADIUS * Math.sin(angle2);

        double x3 = RADIUS * Math.cos(angle3);
        double y3 = RADIUS * Math.sin(angle3);

        // Compute the sides of the inscribed triangle
        double s1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double s2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double s3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // Now compute the angles of the triangle.
        double tAngle1 = Math.acos((s1 * s1 - s2 * s2 - s3 * s3)
                / (-2 * s2 * s3));
        double tAngle2 = Math.acos((s2 * s2 - s1 * s1 - s3 * s3)
                / (-2 * s1 * s3));
        double tAngle3 = Math.acos((s3 * s3 - s2 * s2 - s1 * s1)
                / (-2 * s1 * s2));

        // test code - should be close to 180
        //System.out.println("180 = "
        //        + (Math.toDegrees(tAngle1) + Math.toDegrees(tAngle2) + Math.toDegrees(tAngle3)));

        // Print out angles in degress
        System.out.println("Angle 1: " + Math.toDegrees(tAngle1) + "degs");
        System.out.println("Angle 2: " + Math.toDegrees(tAngle2) + "degs");
        System.out.println("Angle 3: " + Math.toDegrees(tAngle3) + "degs");
    }
}
