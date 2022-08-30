/*
 * Exercise 11.2
 * Student Hierachy.
 */
package chapter11.exercise.exercise11_02;

/**
 * Student class
 * @author emaph
 */
public class Student extends Person {
    private final String STATUS;

    // Should be an enum
    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";

    public Student(String name, String address, String phoneNumber, String emailAdress, String STATUS) {
        super(name, address, phoneNumber, emailAdress);
        this.STATUS = STATUS;
    }

    public String getStatus() {
        return STATUS;
    }

    @Override
    public String toString() {
        return "Student: " + getName();
    }

}
