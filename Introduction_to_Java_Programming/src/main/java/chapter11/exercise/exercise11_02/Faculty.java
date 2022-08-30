/*
 * Exercise 11.2
 * Person Hierarchy.
 */
package chapter11.exercise.exercise11_02;

import chapter10.exercise.exercise10_14.MyDate;

/**
 * Faculty class
 * @author emaph
 */
public class Faculty extends Employee {
    private String officehours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAdress,
                String Office, double salary, MyDate dateHired, String officehours, String rank) {
        super(name, address, phoneNumber, emailAdress, Office, salary, dateHired);
        this.officehours = officehours;
        this.rank = rank;
    }

    public String getOfficehours() {
        return officehours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + getName();
    }



}
