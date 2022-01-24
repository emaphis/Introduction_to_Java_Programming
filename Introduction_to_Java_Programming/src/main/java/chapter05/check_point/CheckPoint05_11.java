/*
 * CCheck Point 5.11
 * Case Studies
 */
package chapter05.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint05_11 {
    // 5.11.1 Will the program work if n1 and n2 are replaced by n1 / 2 and n2 / 2 in line 17
    //      in Listing 5.9?
    // a. yes.  -- ops no.

    // 5.11.2 In Listing 5.11, why is it wrong if you change the code (char)(hexValue +
    //        '0') to hexValue + '0' in line 21?
    // a. hexValue is an int and the calculation gets promoted to an int experssion

    // 5.11.3 In Listing 5.11, how many times the loop body is executed for a decimal number
    //        245, and how many times the loop body is executed for a decimal number 3245?
    // a. 2 times, 3 times

    // 5.11.4 What is the hex number after E? What is the hex number after F?
    // a.  E -> F,  F -> 10

    // 5.11.5 Revise line 27 in Listing 5.11 so the program displays hex number 0 if the input
    //        decimal is 0.
    // Change:
    // System.out.println("The hex number is " + hex);
    // To:
    // System.out.println("The hex number is " + (hex.length() == 0 ? "0" : hex));
}
