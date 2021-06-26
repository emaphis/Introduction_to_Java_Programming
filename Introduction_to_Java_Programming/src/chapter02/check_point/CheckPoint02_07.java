/*
 * Check Point
 */
package chapter02.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint02_07 {
    // 2.7.1 What are the benefits of using constants?
    // You dont have to type out the value each itme,
    // If the value changes, You type it only once
    // You can give it a descriptive name
    // Declare an int constant SIZE with value 20.
    final int SIZE = 20;

    // 2.7,2 Tranlate thge following aclgorythm int Java code
    // Step 1: Declare a double variable named miles with an initial value 100.
    //Step 2: Declare a double constant named KILOMETERS_PER_MILE with value
    //1.609.
    //Step 3: Declare a double variable named kilometers, multiply miles and
    //KILOMETERS_PER_MILE, and assign the result to kilometers.
    //Step 4: Display kilometers to the console.
    //What is kilometers after Step 4? --> 16.00
    static void speed() {
        double miles = 10;
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println("kilometers = " + kilometers);
    }

    public static void main(String[] args) {
        speed();
    }

}
