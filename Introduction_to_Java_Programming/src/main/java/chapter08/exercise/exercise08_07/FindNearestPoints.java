/*
 * Exercise 8.7
 *  (Points nearest to each other) Listing 8.3 gives a program that finds two points in
 *  a two-dimensional space nearest to each other. Revise the program so it finds two
 *  points in a three-dimensional space nearest to each other. Use a two-dimensional
 *  array to represent the points. Test the program using the following points:
 *
 *      double[][] points = {{−1, 0, 3}, {−1, −1, −1}, {4, 1, 1},
 *          {2, 0.5, 9}, {3.5, 2, −1}, {3, 1.5, 3}, {−1.5, 4, 2},
 *          {5.5, 4, −0.5}};
 *
 *  The formula for computing the distance between two points (x1, y1, z1) and
 *  (x2, y2, z2
 *
 *      sqrt( sq(x2 - 1) + sq(y2 - y1) + (z2 - z1) )
 */
package chapter08.exercise.exercise08_07;

/**
 * Finding the Closest Pair
 * @author emaph
 */
public class FindNearestPoints {
    public static void main(String[] args) {

        // A Point is an array of 3 doubles  {n1, n2, n3}
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};

        // p1 and p2 are the indices in the points' array
        int p1 = 0, p2 = 1; // Initial two points
        double shortestDistance = distance(points[0], points[1]); // Initialize shortestDistance

        // Compute distance for every two points
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i], points[j]); // Find distance

                // Find the minimum.
                if (shortestDistance > distance) {
                    p1 = i; // Update p1
                    p2 = j; // Update p2
                    shortestDistance = distance; // Update shortestDistance
                }
            }
        }

        // Display result
        System.out.printf("The closest two points are (%.1f, %.1f, %.1f) and (%.1f, %.1f, %.1f)\n",
                            points[p1][0], points[p1][1], points[p1][2],
                            points[p2][0], points[p2][1], points[p2][2] );
    }

    /**
     * Compute the distance between two points (x1, y1) and (x2, y2)
     *  A point is an array of three elements.
     */
    public static double distance(double[] p1, double[] p2) {
        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2)
                + Math.pow(p2[2] - p1[2], 2));
    }
}
