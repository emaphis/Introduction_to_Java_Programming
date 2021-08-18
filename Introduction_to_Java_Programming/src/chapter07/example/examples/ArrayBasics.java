/*
 * 7.2 Array Basics
 */
package chapter07.example.examples;

import java.util.Scanner;

/**
 * Java Arrays
 * @author emaph
 */
public class ArrayBasics {
    public static void arrayBasics() {

        // 7.2.1  Declaring Array Variables.
        double[] myList = new double[10];

        // initalize array
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;

        // 7.2.3 Array Size and Default Values
        int length = myList.length;
        System.out.println("length " + length);

        // 7.2.4 Accessing Array Elements
        double sum = myList[0] + myList[1];
        System.out.println("sum " + sum);

        // print out myList
        for (int i = 0; i < myList.length; i++) {
            System.out.println(i +": " + myList[i]);
        }
        System.out.println();
    }

    //  7.2.5 Array Initializers
    // 1. Initializing arrays with input values:
    public static void arrayInitializers() {
        double[] myList2 = {1.9, 2.9, 3.4, 3.5};
        System.out.println("lenght " + myList2.length);
        System.out.println();
    }


    public static void arrayProcessing1() {
        double[] myList = new double[10];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + myList.length + " balues: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextInt();
        }
    }


    // 2. Initializing arrays with random values:
    public static void arrayProcessing2() {
        double[] myList = new double[10];

        for (int i = 0; i < 10; i++) {
            myList[i] = Math.random() * 100;
        }

        // 3. Displaying arrays:
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        System.out.println();

        // 4. Summing all elements:
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total: " + total);

        // 5. Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("max " + max);

        /*
        // 7. Random shuffling
        for (int i = 0; i < myList.length - 1; i++) {
            // Generate an index j randomly
            int j = (int)(Math.random() * myList.length);

            // Swap myList[i] wiht myList[j]
            double temp = myList[j];
            myList[i] = myList[j];
            myList[j] = myList[i];
        }
        */

        // 8. Shifting elements:
        double temp8 = myList[0];

        // Shift elements left
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];
        }

        // Move the first element to fill in the last position
        myList[myList.length - 1] = temp8;

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        System.out.println();
    }

    // 9. Simplifying coding:
    public static void simplifyCoding() {
        Scanner input = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        System.out.print("Enter a month number [1 to 12]: ");
        int monthNumber = input.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);
    }

    // 7.2.7 Foreach Loops
    public static void arraysForEach() {
         double[] myList = new double[10];

        for (int i = 0; i < 10; i++) {
            myList[i] = Math.random() * 100;
        }

        for (double d : myList) {
            System.out.println(d);
        }

    }


    public static void main(String[] args) {
        //arrayBasics();
        //arrayInitializers();
        //arrayProcessing2();
        //simplifyCoding();
        arraysForEach();
    }
}
