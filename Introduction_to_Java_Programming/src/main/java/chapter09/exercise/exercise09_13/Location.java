/*
 * Exercise 9.13
 */
package chapter09.exercise.exercise09_13;

/**
 * Stores maximum location value.
 * @author emaph
 */
public class Location {
    public int row = 0;
    public int column = 0;
    public double maxValue = -9999999;

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        location.maxValue = a[0][0];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                double value = a[row][col];
                if (value > location.maxValue) {
                    location.maxValue = value;
                    location.column = col;
                    location.row = row;
                }
            }
        }
        return location;
    }

}
