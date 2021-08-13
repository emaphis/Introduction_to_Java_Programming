/*
 * Check Point 6.2
 * 6.2 Defining a Method
 */
package chapter06.check_point;

/**
 * 6.2 Defining a Method
 * @author emaph
 */
public class CheckPoint06_02 {

    // 6.2.1 How do you simplify the max method in Listing 6.1 using the conditional operator?

    private static int max(int num1, int num2) {
        return (num1 > num2) ?  num1 : num2;
    }

    static void maxTest1() {
        int i = 2;
        int j = 5;
        int k = max(i, j);

        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }


    // 6.2.2 Define the terms parameter, argument, and method signature.
    // a. parameter - named unit in a list, tha passes information to the code,
    //                parameters act like variables to a program.
    //    argument - data passed to the parameter of a function
    //    signature - the complete list of types and anmes of the parameters of
    //                a method.


    public static void main(String[] args) {
        maxTest1();
    }
}
