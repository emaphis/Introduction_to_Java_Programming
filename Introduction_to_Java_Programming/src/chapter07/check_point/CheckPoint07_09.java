/*
 * Exercise 7.9
 * 7.9 Variable-Length Argument Lists
 */
package chapter07.check_point;

import static chapter07.example.listing07_05.VarArgsDemo.printMax;

/**
 * @author emaph
 */
public class CheckPoint07_09 {

    // 7.9.1 What is wrong with each of the following method headers?

    // a. can hav only 1, varargs parameeter,  varargs can only be the last parameter
    // public static void print(String... strings, double... numbers) { }

    // b. varargs can only be the last parameter
    // public static void print(double... numbers, String name) { }

    // c.  no variable length return types
    // public static double... print(double d1, double d2) { }


    // 7.9.2 Can you invoke the printMax method in Listing 7.5 using the following statements?
    public static void invokePrintMax() {

        // a. yes
        printMax(1, 2, 2, 1, 4);

        // b. yes
        printMax(new double[]{1, 2, 3});

        // c. no, invoked on wrong type
        //printMax(new int[]{1, 2, 3});
    }


    public static void main(String[] args) {
        invokePrintMax();
    }
}
