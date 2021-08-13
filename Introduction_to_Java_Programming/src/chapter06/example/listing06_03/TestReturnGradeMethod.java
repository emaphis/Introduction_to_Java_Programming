/*
 * Listing 6.3
 * 6.4 void vs. Value-Returning Methods
 */
package chapter06.example.listing06_03;

import chapter06.example.listing06_02.*;

/**
 * Program to demonstrate method that returns a value
 * @author emaph
 */
public class TestReturnGradeMethod {
    public static void main(String[] args) {
        System.out.print("The grade is " + printGrade(78.5));
        System.out.print("The grade is " +  printGrade(59.5));
        System.out.println();
    }

    /**
     * Method that returns the grad scores
     */
    private static char printGrade(double score) {
        if (score >= 90.0)
            return 'A';
        else if (score >= 80.0)
            return 'B';
        else if (score >= 70.0)
            return 'C';
        else if (score >= 60.0)
            return 'D';
        else
            return 'F';
    }

}
