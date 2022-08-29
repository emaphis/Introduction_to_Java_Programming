/*
 * Exercise 11.3
 * 11.4 The Triangle class
 */
package chapter11.exercise.exercise11_01;


/**
 * Geometric Classes' Base Class
 * @author emaph
 */
public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject() {
        this.dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with the specified color
     *   and filled value  */
    public GeometricObject(String color, boolean filled) {
        this.dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is a boolean
     * its getter method is names isFilled  */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

}
