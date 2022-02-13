/*
 Example from  9.12 Immutable Objects and Classes
*/
package chapter09.example.examples;

/**
 *
 * @author emaph
 */
public class Student2 {
    private int id;
    private String name;
    private java.util.Date dateCreated;

    public Student2(int ssn, String newName) {
        id = ssn;
        name = newName;
        dateCreated = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
}
