/*
 * Exercise 11.2
 * Person hierarchy.
 */
package chapter11.exercise.exercise11_02;

/**
 * Person Class - Base of the Person hierarchy
 * @author emaph
 */
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAdress;

    public Person(String name, String address, String phoneNumber, String emailAdress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }


    @Override
    public String toString() {
        return  "Person: " + name;
    }
}
