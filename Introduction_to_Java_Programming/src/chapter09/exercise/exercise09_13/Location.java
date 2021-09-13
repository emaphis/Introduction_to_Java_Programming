/*
 * Exercise 9.14
 */
package chapter09.exercise.exercise09_13;

/**
 * Stores maximum location value.
 * @author emaph
 */
public class Location {
    public int row = 0;
    public int column = 0;
    public double maxValue = 0;

    public boolean setMax(int newRow, int newColumn, double[][] array) {
        double value = array[newRow][newColumn];
        if (value > maxValue) {
            row = newRow;
            column = newColumn;
            maxValue = value;
            return true;
        }
        else
            return false;
    }

}
