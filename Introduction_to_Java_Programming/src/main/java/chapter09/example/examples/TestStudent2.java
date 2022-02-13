/*
 *  Example from  9.12 Immutable Objects and Classes
 */
package chapter09.example.examples;

/**
 *
 * @author emaph
 */
public class TestStudent2 {
    public static void main(String[] args) {
        Student2 student = new Student2(111223333, "Jown");
        java.util.Date dateCreated = student.getDateCreated();

        // passed by reference
        dateCreated.setTime(200000); // Now dateCreated field is changed!
    }
}
