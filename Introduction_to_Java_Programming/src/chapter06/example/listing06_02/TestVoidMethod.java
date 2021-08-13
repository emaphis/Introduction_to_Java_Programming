/*
 * Listing 6.2
 * 6.4 void vs. Value-Returning Methods
 */
package chapter06.example.listing06_02;

/**
 *
 * @author emaph
 */
public class TestVoidMethod {
    public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade(78.5);

        System.out.print("The grade is ");
        printGrade(59.5);
    }

    /**
     * Void method that prints out grad scores
     */
    private static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        }
        else if (score >= 80.0) {
            System.out.println('B');
        }
        else if (score >= 70.0) {
            System.out.println('C');
        }
        else if (score >= 60.0) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }

}
