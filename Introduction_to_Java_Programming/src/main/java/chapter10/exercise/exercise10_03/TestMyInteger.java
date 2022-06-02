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

        System.out.println("Test MyInteger.isEven(), MyInteger.isOdd(), and MyInteger.isPrime()");
        for (int i = 0; i <= 20; i++) {
            MyInteger num = new MyInteger(i);
            System.out.println("num: " + num.getValue() +
                               "  is even: " + num.isEven() +
                               ", is odd: " + num.isOdd() +
                               ", is prime: " + num.isPrime());
        }

        System.out.println("\nTest static MyInteger(), isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger)");
        for (int i = 0; i <= 20; i++) {
            MyInteger num = new MyInteger(i);
            System.out.println("num: " + i +
                               "  is even: " + MyInteger.isEven(num) +
                               ", is odd: " + MyInteger.isOdd(num) +
                               ", is prime: " + MyInteger.isPrime(num));
        }

        System.out.println("\nTest static MyInteger(), isEven(i), isOdd(), isPrime(i) and getValue(i)");
        for (int i = 0; i <= 20; i++) {
            System.out.println("num: " + i +
                               "  is even: " + MyInteger.isEven(i) +
                               ", is odd: " + MyInteger.isOdd(i) +
                               ", is prime: " + MyInteger.isPrime(i));
        }

        System.out.println("\nTest parseInt and equals");
        char[] number = new char[] { '3', '5', '3', '9' };
        int num_a = MyInteger.parseInt(number);
        System.out.println(num_a);
        int  num_b = MyInteger.parseInt("3539");
        System.out.println(num_b);

        MyInteger n2 = new MyInteger(12);
        System.out.println("n1 is equal to n2? " + n2.equals(n2));
        System.out.println("n1 is equal to 5? " + n2.equals(5));
    }

}

/*
n1 is even? false
n1 is prime? true
15 is prime? false
3539
3539
n2 is odd? false
45 is odd? true
n1 is equal to n2? false
n1 is equal to 5? true
*/
