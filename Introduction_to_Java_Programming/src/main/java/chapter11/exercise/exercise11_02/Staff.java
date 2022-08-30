/*
 * Exercise 11.2
 * Person Hierarchy
 */
package chapter11.exercise.exercise11_02;

import chapter10.exercise.exercise10_14.MyDate;

/**
 * Staff class
 * @author emaph
 */
public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAdress,
                String Office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAdress, Office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Staff: " + getName();
    }

}
