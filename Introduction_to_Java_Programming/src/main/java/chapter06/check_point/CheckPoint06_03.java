/*
 * Check Point 6.3
 *  6.3   Calling a Method
 *  A program that defines a method named printGrade and invokes it to print
 *  the grade for a given score
 */
package chapter06.check_point;

/**
 * Calling a Method
 * @author emaph
 */
public class CheckPoint06_03 {

    // 6.3.1 How do you define a method? How do you invoke a method?
    // a. You define a method by creating a header with a name, parameters, a return
    //    value declaration, and a body with a return statement if needed.
    //    You invoke a method by calling it it it's parameters, if any.


    // 6.3.2 Reformat the following program according to the programming style and documen-
    //       tation guidelines proposed in Section 1.9, Programming Style and Documentation.
    //       Use the end-of-line brace style.

    /**
     * Method decrements j until it is equal to j
     */
    public static double xMethod(double i, double j) {
        while (i < j) {
            j--;
        }

        return j;
    }


    public static void main(String[] args) {
        xMethod(1, 2);
    }
}
