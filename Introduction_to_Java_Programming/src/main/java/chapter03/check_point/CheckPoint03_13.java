/*
 *  Check Point 3.13
 *  switch statement.
 */
package chapter03.check_point;

import java.util.Scanner;

/**
 * @author emaph
 */
public class CheckPoint03_13 {
    // 3.13.1
    // What data types are required for a switch variable?
    //   a. char, byte, short, int, String
    // If the keyword break is not used after a case is processed, what is the
    // next statement to be executed?
    //  a. the next case clause or next statement after the swithc staement.
    // Can you convert a switch statement to an equivalent if statement, or
    // vice versa?
    //  a. yes. but not all if-else complexes can be converted to switches
    // What arethe advantages of using a switch statement
    //  a. more consice expression of multiple branches for some cases. More efficiet
    //     than multiple if-elses

    // 3.13.2 What is y after the following switch statement is executed? Rewrite the code
    //        using an if-else statement.
    static void switchStatement2() {
        int x, y;

        x = 3;
        y = 3;
        switch (x + 3) {
            case 6:  y = 1;
            default: y += 1;
        }

        System.out.println("x: " + x + " y: " + y);

        // rerwrite
        x = 3;
        y = 3;
        if (x + 3 == 6) {
            y = 1;
        }
        y += 1;

        System.out.println("x: " + x + " y: " + y);
    }

    // 3.13.3
    //  What is x after the following if-else statement is executed?
    //   a. 17
    //  Use a switch state-ment to rewrite it and draw the flowchart for
    //  the new switch statement.

    static void switchStatement3() {
        int x, a;

        x = 1; a = 3;
        if (a == 1)
            x += 5;
        else if (a == 2)
            x += 10;
        else if (a == 3)
            x += 16;
        else if (a == 4)
            x += 34;

        System.out.println("x: " + x);

        // rewrite using a swtich statement.
        x = 1; a = 3;
        switch (a) {
            case 1: x +=  5; break;
            case 2: x += 10; break;
            case 3: x += 16; break;
            case 4: x += 34;
        }

        System.out.println("x: " + x);
    }

    // 3.13.4
    //  Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday,
    //  Thursday, Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, respectively
    static void switchStatement4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day as a number 0-6: ");
        int day = input.nextInt();

        switch (day) {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday");
        }
    }

    // 3.13.5
    // Rewrite Listing 3.9 using an if-else statement.
    static void switchStatement5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();

        int rem = year % 12;

        if (rem == 0)
            System.out.println("monkey");
        else if (rem == 1)
            System.out.println("rooster");
        else if (rem == 2)
            System.out.println("dog");
        else if (rem == 3)
            System.out.println("pig");
        else if (rem == 4)
            System.out.println("rat");
        else if (rem == 5)
            System.out.println("ox");
        else if (rem == 6)
            System.out.println("tiger");
        else if (rem == 7)
            System.out.println("rabbit");
        else if (rem == 8)
            System.out.println("dragon");
        else if (rem == 9)
            System.out.println("snake");
        else if (rem == 10)
            System.out.println("horse");
        else
            System.out.println("sheep");
    }


    public static void main(String[] args) {
        switchStatement5();
    }
}
