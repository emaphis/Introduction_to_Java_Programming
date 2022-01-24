/*
 * Exercise 10.3
 *  The MyInteger class) Design a class named MyInteger. The class contains:
 *
 *  ■ An int data field named value that stores the int value represented by
 *    this object.
 *  ■ A constructor that creates a MyInteger object for the specified int value.
 *  ■ A getter method that returns the int value.
 *  ■ The methods isEven(), isOdd(), and isPrime() that return true if the
 *    value in this object is even, odd, or prime, respectively.
 *  ■ The static methods isEven(int), isOdd(int), and isPrime(int) that
 *    return true if the specified value is even, odd, or prime, respectively.
 *  ■ The static methods isEven(MyInteger), isOdd(MyInteger), and
 *    isPrime(MyInteger) that return true if the specified value is even, odd,
 *    or prime, respectively.
 *  ■ The methods equals(int) and equals(MyInteger) that return true if
 *    the value in this object is equal to the specified value.
 *  ■ A static method parseInt(char[]) that converts an array of numeric
 *    characters to an int value.
 *  ■ A static method parseInt(String) that converts a string into an int value.
 *
 *  Draw the UML diagram for the class then implement the class. Write a client
 *  program that tests all methods in the class.
 */
package chapter10.exercise.exercise10_03;

/**
 *
 * @author emaph
 */
public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger mInt = new MyInteger(123);
        System.out.println("The value of MyInteger(123) is " + mInt.getValue());
        System.out.println("MyInteger(123) is even: " + mInt.isEven());
        System.out.println("MyInteger(123) is odd: " + mInt.isOdd());
        System.out.println("MyInteger(123) is prime: " + mInt.isPrime());
        System.out.println("MyInteger(13) is prime " + new MyInteger(13).isPrime());
        System.out.println("MyInteger(123) equals 123: " + mInt.equals(123));
        System.out.println("MyInteger(123) equals MyIntger(321): " + mInt.equals(new MyInteger(321)));

        char[] number = new char[] { '1', '2', '3' };
        int num = MyInteger.parseInt(number);
        System.out.println(num);

    }

}
