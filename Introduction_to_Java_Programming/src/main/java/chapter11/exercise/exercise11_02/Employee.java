/*
 * Exercise 11.2
 * Person Hierarchy.
 */
package chapter11.exercise.exercise11_02;

import chapter10.exercise.exercise10_14.MyDate;

/**
 * Employee class
 * @author emaph
 */
public class Employee extends Person {
    private String Office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAdress,
            String Office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAdress);
        this.Office = Office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return Office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + getName();
    }
    
}
