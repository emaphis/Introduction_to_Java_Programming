/*
 * Exercise 11.6
 *  (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
 *  object, a Date object, a string, and a Circle object to the list, and use a loop to
 *  display all the elements in the list by invoking the object’s toString() method.
 */
package chapter11.exercise.exercise11_06;

import chapter10.example.listing10_01.Loan;
import chapter11.example.examples.Circle;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author emaph
 */
public class Exercise11_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan(10, 20, 5000.00));
        list.add(new Date());
        list.add("A string");
        list.add(new Circle(10));

        for (Object obj : list) {
            System.out.println("obj = "+ obj);
        }
    }
}
