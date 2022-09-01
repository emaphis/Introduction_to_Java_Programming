/*
 * Exercise 11.10
 *  (Implement MyStack using inheritance) In Listing 11.10, MyStack
 *  is implemented using composition. Define a new stack class that extends
 *  ArrayList.
 *
 *  Draw the UML diagram for the classes then implement MyStack. Write a test
 *  program that prompts the user to enter five strings and displays them in
 *  reverse order
 */
package chapter11.exercise.exercise11_10;

import java.util.Scanner;

/**
 * Test MyStack implementation
 * @author emaph
 */
public class Exercise11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();
        final int SIZE = 5;

        System.out.println("Enter 5 Strings for printing ");
        for (int i = 0; i < SIZE; i++) {
            String str = input.nextLine();
            stack.push(str);
        }
        input.close();

        System.out.println(stack.getSize() + " straings are: ");
        while (!stack.isEmpty()) {
            String str = (String) stack.pop();
            System.out.println(str);
        }
    }
}
