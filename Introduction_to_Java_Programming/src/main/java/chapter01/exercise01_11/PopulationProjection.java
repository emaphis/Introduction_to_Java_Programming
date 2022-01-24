/*
 * Exercise 1.11
 * .(Population projection) The U.S. Census Bureau projects population based on
 *  the following assumptions:
 *
 * ■ One birth every 7 seconds
 * ■ One death every 13 seconds
 * ■ One new immigrant every 45 seconds
 *
 * Write a program to display the population for each of the next five years. Assume
 * that the current population is 312,032,486, and one year has 365 days. Hint: In Java,
 * if two integers perform division, the result is an integer. The fractional part is trun-
 * cated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accu-
 * rate result with the fractional part, one of the values involved in the division must be
 * a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */
package chapter01.exercise01_11;

/**
 * US population projection
 *
 * @author emaph
 */
public class PopulationProjection {

    public static void main(String[] args) {
        System.out.print("Year 1 projection: ");
        System.out.println(312032486
                + (((31536000 / 7)
                - (31536000 / 13)
                + (31536000 / 45)) * 1));

        System.out.print("Year 2 projection: ");
        System.out.println(312032486
                + (((31536000 / 7)
                - (31536000 / 13)
                + (31536000 / 45)) * 2));

        System.out.print("Year 3 projection: ");
        System.out.println(312032486
                + (((31536000 / 7)
                - (31536000 / 13)
                + (31536000 / 45)) * 3));

        System.out.print("Year 4 projection: ");
        System.out.println(312032486
                + (((31536000 / 7)
                - (31536000 / 13)
                + (31536000 / 45)) * 4));

        System.out.print("Year 5 projection: ");
        System.out.println(312032486
                + (((31536000 / 7)
                - (31536000 / 13)
                + (31536000 / 45)) * 5));
    }

}
